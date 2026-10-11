/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends cj {
    static String field_Nb;
    private cj field_Lb;
    private cj field_Gb;
    private cj field_Hb;
    private cj field_Jb;
    private cj field_Ib;
    static String field_Mb;
    private cj field_Kb;
    private int field_Fb;

    final boolean d(boolean param0) {
        if (this.field_Jb.field_T != 0) {
          this.field_Fb = 20;
          return true;
        }
        if (this.field_Jb.field_jb == 0) {
          if (!param0) {
            return false;
          }
          this.field_Lb = (cj) null;
          return false;
        }
        if (this.field_Fb > 0) {
          this.field_Fb = this.field_Fb - 1;
        }
        if (this.field_Fb == 0) {
          this.field_Fb = 3;
          return true;
        }
        if (!param0) {
          return false;
        }
        this.field_Lb = (cj) null;
        return false;
    }

    final boolean e(byte param0) {
        if (param0 != -37) {
          return false;
        }
        if (this.field_Ib.field_T != 0) {
          this.field_Fb = 20;
          return true;
        }
        if (0 == this.field_Ib.field_jb) {
          return false;
        }
        if (this.field_Fb > 0) {
          this.field_Fb = this.field_Fb - 1;
          if (this.field_Fb == 0) {
            this.field_Fb = 3;
            return true;
          }
          return false;
        }
        if (this.field_Fb == 0) {
          this.field_Fb = 3;
          return true;
        }
        return false;
    }

    hi(long param0, cj param1, cj param2, cj param3, cj param4) {
        super(param0, (cj) null);
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        cj var9 = null;
        cj var10 = null;
        try {
          this.field_Jb = new cj(0L, param1);
          this.field_Ib = new cj(0L, param2);
          this.a((byte) 50, this.field_Jb);
          this.a((byte) 50, this.field_Ib);
          this.field_Gb = new cj(0L, (cj) null);
          this.a((byte) 50, this.field_Gb);
          this.field_Hb = new cj(0L, param3);
          this.field_Lb = new cj(0L, param3);
          var9 = this.field_Hb;
          var10 = var9;
          this.field_Lb.field_ib = true;
          var10.field_ib = true;
          this.field_Gb.a((byte) 50, this.field_Hb);
          this.field_Gb.a((byte) 50, this.field_Lb);
          this.field_Kb = new cj(0L, param4);
          this.field_Kb.field_fb = true;
          this.field_Gb.a((byte) 50, this.field_Kb);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("hi.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
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
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final int a(boolean param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var5 = 0;
        if (param1 == -66) {
          var6 = -this.field_Kb.field_z + this.field_Gb.field_z;
          if (var6 > 0) {
            var7 = this.field_Kb.field_Q;
            var8 = -param2 + param3;
            var5 = (var7 * var8 + var6 / 2) / var6;
          }
          if (!param0) {
            if (param3 - param2 < var5) {
              var5 = -param2 + param3;
            }
            if (0 <= var5) {
              return var5;
            }
            var5 = 0;
            return var5;
          }
          if (0 > var5) {
            var5 = 0;
          }
          if (var5 <= param3 - param2) {
            return var5;
          }
          var5 = param3 - param2;
          return var5;
        }
        hi.h(-114);
        var6Lifetime1 = -this.field_Kb.field_z + this.field_Gb.field_z;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = this.field_Kb.field_Q;
          var8Lifetime1 = -param2 + param3;
          var5 = (var7Lifetime1 * var8Lifetime1 + var6Lifetime1 / 2) / var6Lifetime1;
        }
        if (!param0) {
          if (param3 - param2 < var5) {
            var5 = -param2 + param3;
          }
          if (0 <= var5) {
            return var5;
          }
          var5 = 0;
          return var5;
        }
        if (0 > var5) {
          var5 = 0;
        }
        if (var5 <= param3 - param2) {
          return var5;
        }
        var5Lifetime1 = param3 - param2;
        return var5Lifetime1;
    }

    final boolean j(int param0) {
        int var2 = 116 / ((66 - param0) / 53);
        return this.field_Kb.field_jb != 0 ? true : false;
    }

    final boolean d(byte param0) {
        if (param0 != 37) {
          this.field_Hb = (cj) null;
        }
        if (this.field_Hb.field_T != 0) {
          this.field_Fb = 20;
          return true;
        }
        if (this.field_Hb.field_jb == 0) {
          return false;
        }
        if (this.field_Fb > 0) {
          this.field_Fb = this.field_Fb - 1;
        }
        if (this.field_Fb != 0) {
          return false;
        }
        if (bo.field_d >= this.field_Kb.field_mb + this.field_Kb.field_qb) {
          return false;
        }
        this.field_Fb = 3;
        return true;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var6 = 0;
        int var5 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cj var14 = null;
        cj var15 = null;
        cj var16 = null;
        cj var17 = null;
        cj var18 = null;
        cj var19 = null;
        cj var14Lifetime1;
        cj var14Lifetime2;
        cj var15Lifetime1;
        cj var15Lifetime2;
        cj var16Lifetime1;
        cj var16Lifetime2;
        cj var17Lifetime1;
        cj var17Lifetime2;
        cj var18Lifetime1;
        cj var18Lifetime2;
        cj var18Lifetime3;
        cj var19Lifetime1;
        cj var19Lifetime2;
        cj var19Lifetime3;
        cj var18Lifetime4;
        cj var19Lifetime4;
        cj var18Lifetime1Lifetime1;
        cj var19Lifetime1Lifetime1;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        if (2 * this.field_zb <= this.field_z) {
          var6 = this.field_z - this.field_zb;
          var5 = this.field_zb;
        } else {
          var6 = this.field_z / 2;
          var5 = this.field_z / 2;
        }
        int var7 = -var5 + var6;
        int var8 = var7;
        if (param0 <= 0) {
          var9 = -param3 + param0;
          var10 = var7 - var8;
          var11 = 0;
          if (var9 > 0) {
            var11 = (param1 * var10 + var9 / 2) / var9;
          }
          var12 = var8 / 2 + var11;
          var14 = this.field_Jb;
          var14.field_Q = 0;
          var14.field_z = var5;
          var14.field_zb = this.field_zb;
          var14.field_x = 0;
          var15 = this.field_Ib;
          var15.field_Q = var6;
          var15.field_zb = this.field_zb;
          var15.field_z = -var6 + this.field_z;
          var15.field_x = 0;
          var16 = this.field_Gb;
          var16.field_z = var7;
          var16.field_zb = this.field_zb;
          var16.field_Q = var5;
          var16.field_x = 0;
          var17 = this.field_Hb;
          var17.field_z = var12;
          var17.field_zb = this.field_zb;
          if (param2 <= 109) {
            hi.h(27);
            var17.field_x = 0;
            var17.field_Q = 0;
            var18 = this.field_Lb;
            var18.field_z = -var12 + var7;
            var18.field_zb = this.field_zb;
            var18.field_Q = var12;
            var18.field_x = 0;
            var19 = this.field_Kb;
            var19.field_zb = this.field_zb;
            var19.field_z = var8;
            var19.field_x = 0;
            var19.field_Q = var11;
            this.field_Gb.field_Z = param0 > param3 ? true : false;
            this.field_Ib.field_Z = param0 > param3 ? true : false;
            this.field_Jb.field_Z = param0 > param3 ? true : false;
            return;
          }
          var17.field_x = 0;
          var17.field_Q = 0;
          var18Lifetime4 = this.field_Lb;
          var18Lifetime4.field_z = -var12 + var7;
          var18Lifetime4.field_zb = this.field_zb;
          var18Lifetime4.field_Q = var12;
          var18Lifetime4.field_x = 0;
          var19Lifetime4 = this.field_Kb;
          var19Lifetime4.field_zb = this.field_zb;
          var19Lifetime4.field_z = var8;
          var19Lifetime4.field_x = 0;
          var19Lifetime4.field_Q = var11;
          this.field_Gb.field_Z = param0 > param3 ? true : false;
          this.field_Ib.field_Z = param0 > param3 ? true : false;
          this.field_Jb.field_Z = param0 > param3 ? true : false;
          return;
        }
        var8 = var8 * param3 / param0;
        if (this.field_zb > var8) {
          var8 = this.field_zb;
        }
        if (var8 <= var7) {
          var9Lifetime1 = -param3 + param0;
          var10Lifetime1 = var7 - var8;
          var11Lifetime1 = 0;
          if (var9Lifetime1 > 0) {
            var11Lifetime1 = (param1 * var10Lifetime1 + var9Lifetime1 / 2) / var9Lifetime1;
          }
          var12Lifetime1 = var8 / 2 + var11Lifetime1;
          var14Lifetime1 = this.field_Jb;
          var14Lifetime1.field_Q = 0;
          var14Lifetime1.field_z = var5;
          var14Lifetime1.field_zb = this.field_zb;
          var14Lifetime1.field_x = 0;
          var15Lifetime1 = this.field_Ib;
          var15Lifetime1.field_Q = var6;
          var15Lifetime1.field_zb = this.field_zb;
          var15Lifetime1.field_z = -var6 + this.field_z;
          var15Lifetime1.field_x = 0;
          var16Lifetime1 = this.field_Gb;
          var16Lifetime1.field_z = var7;
          var16Lifetime1.field_zb = this.field_zb;
          var16Lifetime1.field_Q = var5;
          var16Lifetime1.field_x = 0;
          var17Lifetime1 = this.field_Hb;
          var17Lifetime1.field_z = var12Lifetime1;
          var17Lifetime1.field_zb = this.field_zb;
          if (param2 > 109) {
            var17Lifetime1.field_x = 0;
            var17Lifetime1.field_Q = 0;
            var18Lifetime1 = this.field_Lb;
            var18Lifetime1.field_z = -var12Lifetime1 + var7;
            var18Lifetime1.field_zb = this.field_zb;
            var18Lifetime1.field_Q = var12Lifetime1;
            var18Lifetime1.field_x = 0;
            var19Lifetime1 = this.field_Kb;
            var19Lifetime1.field_zb = this.field_zb;
            var19Lifetime1.field_z = var8;
            var19Lifetime1.field_x = 0;
            var19Lifetime1.field_Q = var11Lifetime1;
            this.field_Gb.field_Z = param0 > param3 ? true : false;
            this.field_Ib.field_Z = param0 > param3 ? true : false;
            this.field_Jb.field_Z = param0 > param3 ? true : false;
            return;
          }
          hi.h(27);
          var17Lifetime1.field_x = 0;
          var17Lifetime1.field_Q = 0;
          var18Lifetime1Lifetime1 = this.field_Lb;
          var18Lifetime1Lifetime1.field_z = -var12Lifetime1 + var7;
          var18Lifetime1Lifetime1.field_zb = this.field_zb;
          var18Lifetime1Lifetime1.field_Q = var12Lifetime1;
          var18Lifetime1Lifetime1.field_x = 0;
          var19Lifetime1Lifetime1 = this.field_Kb;
          var19Lifetime1Lifetime1.field_zb = this.field_zb;
          var19Lifetime1Lifetime1.field_z = var8;
          var19Lifetime1Lifetime1.field_x = 0;
          var19Lifetime1Lifetime1.field_Q = var11Lifetime1;
          this.field_Gb.field_Z = param0 > param3 ? true : false;
          this.field_Ib.field_Z = param0 > param3 ? true : false;
          this.field_Jb.field_Z = param0 > param3 ? true : false;
          return;
        }
        var8 = var7;
        var9Lifetime2 = -param3 + param0;
        var10Lifetime2 = var7 - var8;
        var11Lifetime2 = 0;
        if (var9Lifetime2 > 0) {
          var11Lifetime2 = (param1 * var10Lifetime2 + var9Lifetime2 / 2) / var9Lifetime2;
        }
        var12Lifetime2 = var8 / 2 + var11Lifetime2;
        var14Lifetime2 = this.field_Jb;
        var14Lifetime2.field_Q = 0;
        var14Lifetime2.field_z = var5;
        var14Lifetime2.field_zb = this.field_zb;
        var14Lifetime2.field_x = 0;
        var15Lifetime2 = this.field_Ib;
        var15Lifetime2.field_Q = var6;
        var15Lifetime2.field_zb = this.field_zb;
        var15Lifetime2.field_z = -var6 + this.field_z;
        var15Lifetime2.field_x = 0;
        var16Lifetime2 = this.field_Gb;
        var16Lifetime2.field_z = var7;
        var16Lifetime2.field_zb = this.field_zb;
        var16Lifetime2.field_Q = var5;
        var16Lifetime2.field_x = 0;
        var17Lifetime2 = this.field_Hb;
        var17Lifetime2.field_z = var12Lifetime2;
        var17Lifetime2.field_zb = this.field_zb;
        if (param2 <= 109) {
          hi.h(27);
          var17Lifetime2.field_x = 0;
          var17Lifetime2.field_Q = 0;
          var18Lifetime2 = this.field_Lb;
          var18Lifetime2.field_z = -var12Lifetime2 + var7;
          var18Lifetime2.field_zb = this.field_zb;
          var18Lifetime2.field_Q = var12Lifetime2;
          var18Lifetime2.field_x = 0;
          var19Lifetime2 = this.field_Kb;
          var19Lifetime2.field_zb = this.field_zb;
          var19Lifetime2.field_z = var8;
          var19Lifetime2.field_x = 0;
          var19Lifetime2.field_Q = var11Lifetime2;
          this.field_Gb.field_Z = param0 > param3 ? true : false;
          this.field_Ib.field_Z = param0 > param3 ? true : false;
          this.field_Jb.field_Z = param0 > param3 ? true : false;
          return;
        }
        var17Lifetime2.field_x = 0;
        var17Lifetime2.field_Q = 0;
        var18Lifetime3 = this.field_Lb;
        var18Lifetime3.field_z = -var12Lifetime2 + var7;
        var18Lifetime3.field_zb = this.field_zb;
        var18Lifetime3.field_Q = var12Lifetime2;
        var18Lifetime3.field_x = 0;
        var19Lifetime3 = this.field_Kb;
        var19Lifetime3.field_zb = this.field_zb;
        var19Lifetime3.field_z = var8;
        var19Lifetime3.field_x = 0;
        var19Lifetime3.field_Q = var11Lifetime2;
        this.field_Gb.field_Z = param0 > param3 ? true : false;
        this.field_Ib.field_Z = param0 > param3 ? true : false;
        this.field_Jb.field_Z = param0 > param3 ? true : false;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_x = param7;
        this.field_z = param3;
        this.field_Q = param1;
        if (param4 == -1) {
          this.field_zb = param6;
          this.a(param0, param5, (byte) 119, param2);
          return;
        }
        hi.h(-9);
        this.field_zb = param6;
        this.a(param0, param5, (byte) 119, param2);
    }

    final static void h(int param0) {
        RuntimeException decompiledCaughtException = null;
        dm var1 = null;
        jh var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        dm var1Lifetime1;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var1 = (dm) (cg.field_i.c(param0 ^ 120));
          while (var1 != null) {
            if (0 < var1.field_bc) {
              var1.field_bc = var1.field_bc - 1;
              if (0 == var1.field_bc) {
                var1.field_Fb = 0;
                if (var1.c((byte) 15)) {
                  var1.a(true);
                }
              }
            }
            var1 = (dm) (cg.field_i.b(6));
          }
          var1_ref = (jh) (tn.field_C.c(97));
          while (var1_ref != null) {
            if (var1_ref.field_Jb > 0) {
              var1_ref.field_Jb = var1_ref.field_Jb - 1;
              if (var1_ref.field_Jb != 0) {
                var1_ref = (jh) (tn.field_C.b(6));
                continue;
              }
              var1_ref.field_Vb = 0;
              if (var1_ref.j(2)) {
                var1_ref.a(true);
              }
            }
            var1_ref = (jh) (tn.field_C.b(6));
          }
          var1Lifetime1 = (dm) (nh.field_g.c(65));
          if (param0 != 2) {
            return;
          }
          while (var1Lifetime1 != null) {
            if (0 < var1Lifetime1.field_bc) {
              var1Lifetime1.field_bc = var1Lifetime1.field_bc - 1;
              if (var1Lifetime1.field_bc == 0) {
                var1Lifetime1.field_Fb = 0;
                if (var1Lifetime1.c((byte) 15)) {
                  var1Lifetime1.a(true);
                }
              }
            }
            var1Lifetime1 = (dm) (nh.field_g.b(6));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref2), "hi.AA(" + param0 + ')');
        }
    }

    final boolean i(int param0) {
        if (~this.field_Lb.field_T != param0) {
          this.field_Fb = 20;
          return true;
        }
        if (0 == this.field_Lb.field_jb) {
          return false;
        }
        if (this.field_Fb > 0) {
          this.field_Fb = this.field_Fb - 1;
        }
        if (this.field_Fb != 0) {
          return false;
        }
        if (bo.field_d < this.field_Kb.field_I + (this.field_Kb.field_z + this.field_Kb.field_qb + this.field_Kb.field_mb)) {
          return false;
        }
        this.field_Fb = 3;
        return true;
    }

    hi(long param0, hi param1) {
        this(param0, param1.field_Jb, param1.field_Ib, param1.field_Hb, param1.field_Kb);
    }

    public static void c(byte param0) {
        field_Mb = null;
        field_Nb = null;
        if (param0 <= -23) {
          return;
        }
        field_Mb = (String) null;
    }

    static {
        field_Nb = "Disguise one of your zombies as a harmless human.";
        field_Mb = "Don't mind";
    }
}
