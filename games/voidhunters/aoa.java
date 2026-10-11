/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class aoa implements ntb {
    private anb field_a;
    private int field_d;
    private int field_b;
    private int field_e;
    static int[] field_c;
    private int field_f;

    private final int a(ml[] param0, int param1, int param2) {
        int var5 = 0;
        int var4_int = 0;
        ml var6 = null;
        int var7 = 0;
        int var9 = 0;
        int stackIn_26_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var8 = 0;
        var9 = VoidHunters.field_G;
        try {
          var4_int = 0;
          for (var5 = 0; var5 < param2; var5++) {
            var6 = param0[var5];
            var7 = var6.field_c.field_c;
            if (!var6.k((byte) 86) &&
              2 != var7 &&
              var7 != 8 &&
              9 != var7 &&
              var7 != 10) {
              var8 = var6.field_c.a((byte) 24).j(118);
              if (var8 > var4_int) {
                var4_int = var8;
              }
            }
          }
          if (param1 > -1) {
            aoa.a(true);
          }
          stackIn_26_0 = var4_int << 3;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_29_0 = var4;
          stackIn_29_1 = new StringBuilder().append("aoa.I(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final void a(sg param0, int param1, lta param2, pe param3) {
        try {
          int var5_int = -5 / ((-71 - param1) / 50);
          c.a(param2.b(true, param0.field_e + this.field_d), param2.a(param0.field_d + this.field_e, (byte) 124), param2.a(param0.field_d, (byte) 127), param2.b(true, param0.field_e), -16777216, 16776960);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "aoa.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, sg param1, pe param2) {
        int var9 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        crb[] var6 = null;
        int var7 = 0;
        crb[] var8 = null;
        crb var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = VoidHunters.field_G;
        try {
          var4_int = 0;
          var5 = param0;
          var6 = param2.a(true);
          var7 = param1.g(-101);
          var8 = var6;
          for (var9 = 0; var9 < var8.length; var9++) {
            var10 = var8[var9];
            if (var10 != null) {
              var11 = var10.g(-42) + var7 >> 6;
              var12 = var10.field_d - param1.field_d;
              var13 = var10.field_e - param1.field_e;
              var14 = ar.a(var12, (byte) 122, var13) >> 9;
              if (var14 <= var11 / 2) {
                if (var14 <= 0) {
                  var14 = 1;
                }
                var15 = ecb.a(-var13, (byte) -77, -var12);
                var4_int = var4_int + fc.a(var15, (byte) -106) * var11 / (var14 * var14);
                var5 = var5 + var11 * eu.a(var15, 40) / (var14 * var14);
              }
            }
          }
          this.field_d = this.field_d + var5;
          this.field_e = this.field_e + var4_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_18_0 = var4;
          stackIn_18_1 = new StringBuilder().append("aoa.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public final void a(tv param0, int param1) {
        aoa var3 = (aoa) (param0);
        int var4 = 0;
        if (var3.field_b != this.field_b) {
          var4 = 1;
          System.out.println("int parent_player has changed. before=" + var3.field_b + ", now=" + this.field_b);
        }
        if (param1 >= -19) {
          return;
        }
        try {
          if (var4 != 0) {
            System.out.println("This instance of ShipAI has changed");
          }
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "aoa.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, int param1, sg param2, pe param3) {
        int var5_int = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          this.field_d = 0;
          if (param0) {
            field_c = (int[]) null;
          }
          this.field_a = null;
          this.field_e = 0;
          this.field_f = 0;
          this.a(param3, (byte) -89, param2, param1);
          if (!param2.g(param0)) {
            var5_int = param2.field_k.l(-8913);
            if (var5_int > 0) {
              this.a(0, param2, param3);
              this.a(param3, (byte) -103, param2);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("aoa.J(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          if (param1) {
            pe var4 = (pe) null;
            this.a((sg) null, 11, (lta) null, (pe) null);
          }
          this.field_b = param0.i(0, 4);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "aoa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        aoa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = (aoa) (param1);
          var4 = -12 % ((param0 - 22) / 59);
          stackIn_3_0 = (var3.field_b != this.field_b);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("aoa.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_c = null;
    }

    final boolean a(sg param0, byte param1, pe param2) {
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_94_2 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_97_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Random var9_ref_Random = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        ij var16_ref_ij = null;
        int var17 = 0;
        Object var18_ref = null;
        int var18 = 0;
        tj var18_ref_tj = null;
        ml var19_ref_ml = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        tv var24 = null;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var22Lifetime1;
        int var17Lifetime2;
        int var20Lifetime2;
        int var21Lifetime2;
        var18_ref = null;
        var23 = VoidHunters.field_G;
        try {
          if (param1 != -73) {
            var24 = (tv) null;
            this.b((byte) -82, (tv) null);
          }
          var4_int = param0.field_f;
          var5 = param0.field_h;
          var6 = param0.field_n;
          var7 = param0.field_k.b(127, 0);
          var8 = this.a(lcb.field_q, -18, var7);
          if (var8 > cab.field_p) {
            var8 = cab.field_p;
          }
          if (param0.g(false)) {
            var9_ref_Random = new Random((long)(param0.field_l * th.field_o));
            var10 = 1000;
            if (this.field_a == null) {
              var10 = 4000;
            }
            if (hob.a(var9_ref_Random, var10, 125) == 0) {
              fnb.a(50, param0.field_e, param0.field_d, false, 94, 512);
            }
          }
          this.a(false, var8, param0, param2);
          var9 = 0;
          var10Lifetime1 = 0;
          var11 = 0;
          if (this.field_a != null) {
            var10Lifetime1 = this.field_a.field_k.field_r;
            var11 = this.field_a.field_k.field_n;
            var12 = -param0.field_d + var10Lifetime1;
            var13 = var11 - param0.field_e;
            var14 = ar.a(var12, (byte) 109, var13);
            var15 = ecb.a(var13, (byte) -77, var12);
            if (16384 + var8 >= var14) {
              var16 = 0;
              var17 = 2147483647;
              for (var18 = 0; var18 < var7; var18++) {
                var19_ref_ml = lcb.field_q[var18];
                var20 = var19_ref_ml.field_c.field_c;
                if (!var19_ref_ml.k((byte) 48) &&
                  var20 != 2 &&
                  var20 != 8 &&
                  9 != var20 &&
                  var20 != 10 &&
                  var8 >> 3 <= var19_ref_ml.field_c.a((byte) 24).j(127)) {
                  var21 = var19_ref_ml.g((byte) -127);
                  var22 = rrb.a(param1 + 22506, var15 - var21);
                  if (var17 > Math.abs(var22)) {
                    var17 = Math.abs(var22);
                    var16 = var22;
                  }
                }
              }
              if (var17 < 2147483647) {
                this.field_f = var16 << 8;
              }
              if (di.field_p == 0) {
                param0.a(8, var11, var10Lifetime1);
              }
              var9 = var9 | 16;
            } else {
              if (0 != this.field_e &&
                this.field_d != 0) {
                var16 = ecb.a(this.field_d, (byte) -77, this.field_e);
                this.field_f = rrb.a(22433, var16 - param0.e(param1 ^ -73)) << 8;
              }
            }
            if (cab.field_p > var14) {
              param0.a(-73, 2, param2, var11, var10Lifetime1);
              param0.a(-126, 6, param2, var11, var10Lifetime1);
              if (!param0.n(31390)) {
                param0.a(param1 ^ 30, 3, param2, var11, var10Lifetime1);
              }
            }
            if (param0.field_k.b((byte) 70, 7)) {
              var16_ref_ij = param2.c(true);
              var17Lifetime2 = 0;
              var18_ref_tj = (tj) (var16_ref_ij.d(0));
              while (true) {
                boolean decompiledFrameRemainder0 = true;
                if (var18_ref_tj != null) {
                  if (var18_ref_tj.g((byte) -104) == 6 &&
                    var18_ref_tj.d((byte) -119) == param0.field_l) {
                    var19 = var18_ref_tj.field_d - param0.field_d;
                    var20Lifetime2 = var18_ref_tj.field_e - param0.field_e;
                    var21Lifetime2 = ar.a(var19, (byte) 115, var20Lifetime2);
                    if (var21Lifetime2 < bpa.field_a) {
                      var17Lifetime2 = 1;
                      decompiledFrameRemainder0 = false;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    var18_ref_tj = (tj) (var16_ref_ij.a((byte) 55));
                    continue;
                  }
                }
                if (var17Lifetime2 == 0) {
                  break;
                }
                param0.a(-111, 7, param2, var11, var10Lifetime1);
                break;
              }
            }
          }
          var12Lifetime1 = 1024;
          var13Lifetime1 = 1024;
          var14Lifetime1 = this.field_e - var4_int;
          var15Lifetime1 = -var5 + this.field_d;
          var16Lifetime1 = this.field_f - var6;
          if (var14Lifetime1 != 0 ||
            var15Lifetime1 != 0 ||
            var16Lifetime1 != 0) {
            if (Math.abs(var16Lifetime1) > var12Lifetime1) {
              if (var16Lifetime1 <= 0) {
                if (var16Lifetime1 < 0) {
                  var9 = var9 | 4;
                }
              } else {
                var9 = var9 | 8;
              }
            }
            if (var14Lifetime1 != 0 ||
              var15Lifetime1 != 0) {
              var17Lifetime1 = ecb.a(var15Lifetime1, (byte) -77, var14Lifetime1);
              var18Lifetime1 = param0.e(0);
              var19Lifetime1 = rrb.a(22433, var17Lifetime1 - var18Lifetime1);
              var20Lifetime1 = rrb.a(22433, -4096 - (var18Lifetime1 - var17Lifetime1));
              var21Lifetime1 = rrb.a(22433, 2048 - (var18Lifetime1 - var17Lifetime1));
              var22Lifetime1 = rrb.a(param1 + 22506, var17Lifetime1 - var18Lifetime1 - 2048);
              if (Math.abs(var19Lifetime1) < var13Lifetime1) {
                var9 = var9 | 1;
              }
              if (var13Lifetime1 > Math.abs(var20Lifetime1)) {
                var9 = var9 | 2;
              }
              if (var13Lifetime1 > Math.abs(var21Lifetime1)) {
                var9 = var9 | 32;
              }
              if (Math.abs(var22Lifetime1) < var13Lifetime1) {
                var9 = var9 | 64;
              }
            }
          }
          if (var9 == 0) {
            return false;
          }
          param0.a(param2, var9, false, var10Lifetime1, var11);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_93_0 = var4;
          stackIn_93_1 = new StringBuilder().append("aoa.O(");
          if (param0 == null) {
            stackIn_94_2 = "null";
          } else {
            stackIn_94_2 = "{...}";
          }
          stackIn_96_1 = ((StringBuilder) (Object) stackIn_93_1).append(stackIn_94_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_97_2 = "null";
          } else {
            stackIn_97_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_93_0), ((StringBuilder) (Object) stackIn_96_1).append(stackIn_97_2).append(')').toString());
        }
    }

    final int a(byte param0) {
        int var2 = -17 / ((param0 + 52) / 54);
        return -1 + this.field_b;
    }

    private final void a(pe param0, byte param1, sg param2) {
        int var9 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        sg[] var7 = null;
        sg[] var8 = null;
        sg var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = VoidHunters.field_G;
        try {
          var4_int = 0;
          var5 = 0;
          if (param1 != -103) {
            return;
          }
          var6 = param2.g(-100);
          var7 = param0.d(1000);
          var8 = var7;
          for (var9 = 0; var8.length > var9; var9++) {
            var10 = var8[var9];
            if (var10 != null &&
              param2 != var10 &&
              var10.q((byte) 70) == param2.q((byte) 97)) {
              var11 = var6 + var10.g(-86) >> 6;
              var12 = -param2.field_d + var10.field_d;
              var13 = var10.field_e - param2.field_e;
              var14 = ar.a(var12, (byte) 109, var13) >> 9;
              if (256 >= var14) {
                if (var14 <= 0) {
                  var14 = 1;
                }
                var15 = ecb.a(-var13, (byte) -77, -var12);
                var4_int = var4_int + var11 * fc.a(var15, (byte) 85) / (var14 * var14);
                var5 = var5 + eu.a(var15, 107) * var11 / (var14 * var14);
              }
            }
          }
          this.field_d = this.field_d + var5;
          this.field_e = this.field_e + var4_int;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("aoa.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    private final void a(pe param0, byte param1, sg param2, int param3) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
        int var15 = 0;
        sg var16 = null;
        try {
          var16 = gca.a(param0, (byte) 63, this.a((byte) 70), param2);
          if (var16 != null) {
            var6 = var16.field_k.field_r;
            var7 = var16.field_k.field_n;
            var8 = ecb.a(param2.field_e - var7, (byte) -77, -var6 + param2.field_d);
            var9 = param3;
            var10 = var6 + (fc.a(var8, (byte) 38) >> 8) * (var9 >> 8);
            var11 = (var9 >> 8) * (eu.a(var8, 127) >> 8) + var7;
            var12 = 256;
            var13 = -param2.field_d + var10;
            var14 = var11 - param2.field_e;
            var15 = ar.a(var13, (byte) 120, var14);
            if (var12 < var15) {
              var13 = var12 * var13 / (var15 >> 4);
              var14 = var14 * var12 / (var15 >> 4);
            }
            this.field_d = var14;
            this.field_a = (anb) ((Object) var16);
            this.field_e = var13;
          }
          if (param1 >= -76) {
            this.field_a = (anb) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("aoa.M(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        this.field_b = param0 + 1;
        if (!param1) {
          field_c = (int[]) null;
        }
    }

    public final void b(byte param0, tv param1) {
        aoa var6 = null;
        aoa var7 = null;
        try {
          var6 = (aoa) (param1);
          var7 = var6;
          if (param0 < 54) {
            tv var4 = (tv) null;
            this.a((byte) -32, (tv) null);
          }
          var7.field_b = this.field_b;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "aoa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
          return;
        }
        try {
          param0.a(-632, this.field_b, 4);
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "aoa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = new int[8192];
    }
}
