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
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        ml var6 = null;
        int var7 = 0;
        int var9 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            L1: while (true) {
              if (var5 >= param2) {
                stackOut_8_0 = var4_int << 3;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                L2: {
                  var6 = param0[var5];
                  var7 = var6.field_c.field_c;
                  if (var6.k((byte) 86)) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("aoa.I(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + -18 + ',' + param2 + ')');
        }
        return stackIn_9_0;
    }

    final void a(sg param0, int param1, lta param2, pe param3) {
        try {
            int var5_int = -5 / ((-71 - param1) / 50);
            c.a(param2.b(true, param0.field_e - -((aoa) this).field_d), param2.a(param0.field_d - -((aoa) this).field_e, (byte) 124), param2.a(param0.field_d, (byte) 127), param2.b(true, param0.field_e), -16777216, 16776960);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "aoa.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, sg param1, pe param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        crb[] var6 = null;
        int var7 = 0;
        crb[] var8 = null;
        int var9 = 0;
        crb var10 = null;
        int var16 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = param2.a(true);
            var7 = param1.g(-101);
            var8 = var6;
            var9 = 0;
            L1: while (true) {
              if (var9 >= var8.length) {
                ((aoa) this).field_d = ((aoa) this).field_d + var5;
                ((aoa) this).field_e = ((aoa) this).field_e + var4_int;
                break L0;
              } else {
                L2: {
                  var10 = var8[var9];
                  if (var10 == null) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("aoa.G(").append(0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    public final void a(tv param0, int param1) {
        RuntimeException runtimeException = null;
        aoa var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var3 = (aoa) (Object) param0;
              var4 = 0;
              if (var3.field_b == var3.field_b) {
                break L1;
              } else {
                var4 = 1;
                System.out.println("int parent_player has changed. before=" + var3.field_b + ", now=" + var3.field_b);
                break L1;
              }
            }
            if (param1 < -19) {
              L2: {
                if (var4 == 0) {
                  break L2;
                } else {
                  System.out.println("This instance of ShipAI has changed");
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("aoa.F(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ',' + param1 + ')');
        }
    }

    private final void a(boolean param0, int param1, sg param2, pe param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              ((aoa) this).field_d = 0;
              ((aoa) this).field_a = null;
              ((aoa) this).field_e = 0;
              ((aoa) this).field_f = 0;
              this.a(param3, (byte) -89, param2, param1);
              if (!param2.g(false)) {
                var5_int = param2.field_k.l(-8913);
                if (var5_int <= 0) {
                  break L1;
                } else {
                  this.a(0, param2, param3);
                  this.a(param3, (byte) -103, param2);
                  break L1;
                }
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("aoa.J(").append(false).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ')');
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            if (param1) {
                Object var4 = null;
                ((aoa) this).a((sg) null, 11, (lta) null, (pe) null);
            }
            ((aoa) this).field_b = param0.i(0, 4);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "aoa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        aoa var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = (aoa) (Object) param1;
              var4 = -12 % ((param0 - 22) / 59);
              if (var3.field_b == var3.field_b) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("aoa.C(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    public static void a() {
        field_c = null;
    }

    final boolean a(sg param0, byte param1, pe param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Random var9_ref_Random = null;
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
        Object var24 = null;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        var18_ref = null;
        var23 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 == -73) {
                break L1;
              } else {
                var24 = null;
                ((aoa) this).b((byte) -82, (tv) null);
                break L1;
              }
            }
            L2: {
              var4_int = param0.field_f;
              var5 = param0.field_h;
              var6 = param0.field_n;
              var7 = param0.field_k.b(127, 0);
              var8 = this.a(lcb.field_q, -18, var7);
              if (var8 <= cab.field_p) {
                break L2;
              } else {
                var8 = cab.field_p;
                break L2;
              }
            }
            L3: {
              if (!param0.g(false)) {
                break L3;
              } else {
                L4: {
                  var9_ref_Random = new Random((long)(param0.field_l * th.field_o));
                  var10 = 1000;
                  if (((aoa) this).field_a == null) {
                    var10 = 4000;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (hob.a(var9_ref_Random, var10, 125) != 0) {
                  break L3;
                } else {
                  fnb.a(50, param0.field_e, param0.field_d, false, 94, 512);
                  break L3;
                }
              }
            }
            L5: {
              this.a(false, var8, param0, param2);
              var9 = 0;
              var10 = 0;
              var11 = 0;
              if (((aoa) this).field_a != null) {
                L6: {
                  var10 = ((aoa) this).field_a.field_k.field_r;
                  var11 = ((aoa) this).field_a.field_k.field_n;
                  var12 = -param0.field_d + var10;
                  var13 = var11 + -param0.field_e;
                  var14 = ar.a(var12, (byte) 109, var13);
                  var15 = ecb.a(var13, (byte) -77, var12);
                  if (16384 + var8 < var14) {
                    if (0 == ((aoa) this).field_e) {
                      break L6;
                    } else {
                      if (((aoa) this).field_d == 0) {
                        break L6;
                      } else {
                        var16 = ecb.a(((aoa) this).field_d, (byte) -77, ((aoa) this).field_e);
                        ((aoa) this).field_f = rrb.a(22433, var16 + -param0.e(param1 ^ -73)) << 8;
                        break L6;
                      }
                    }
                  } else {
                    var16 = 0;
                    var17 = 2147483647;
                    var18 = 0;
                    L7: while (true) {
                      if (var18 >= var7) {
                        L8: {
                          if (var17 < 2147483647) {
                            ((aoa) this).field_f = var16 << 8;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (di.field_p == 0) {
                            int discarded$1 = param0.a(8, var11, var10);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                        var9 = var9 | 16;
                        break L6;
                      } else {
                        L10: {
                          var19_ref_ml = lcb.field_q[var18];
                          var20 = var19_ref_ml.field_c.field_c;
                          if (var19_ref_ml.k((byte) 48)) {
                            break L10;
                          } else {
                            if (var20 == 2) {
                              break L10;
                            } else {
                              if (var20 == 8) {
                                break L10;
                              } else {
                                if (9 == var20) {
                                  break L10;
                                } else {
                                  if (var20 == 10) {
                                    break L10;
                                  } else {
                                    if (var8 >> 3 <= var19_ref_ml.field_c.a((byte) 24).j(127)) {
                                      var21 = var19_ref_ml.g((byte) -127);
                                      var22 = rrb.a(param1 + 22506, var15 - var21);
                                      if (var17 > Math.abs(var22)) {
                                        var17 = Math.abs(var22);
                                        var16 = var22;
                                        break L10;
                                      } else {
                                        break L10;
                                      }
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var18++;
                        continue L7;
                      }
                    }
                  }
                }
                L11: {
                  if (~cab.field_p >= ~var14) {
                    break L11;
                  } else {
                    param0.a(-73, 2, param2, var11, var10);
                    param0.a(-126, 6, param2, var11, var10);
                    if (param0.n(31390)) {
                      break L11;
                    } else {
                      param0.a(param1 ^ 30, 3, param2, var11, var10);
                      break L11;
                    }
                  }
                }
                if (!param0.field_k.b((byte) 70, 7)) {
                  break L5;
                } else {
                  var16_ref_ij = param2.c(true);
                  var17 = 0;
                  var18_ref_tj = (tj) (Object) var16_ref_ij.d(0);
                  L12: while (true) {
                    L13: {
                      if (var18_ref_tj == null) {
                        break L13;
                      } else {
                        L14: {
                          if (var18_ref_tj.g((byte) -104) != 6) {
                            break L14;
                          } else {
                            if (~var18_ref_tj.d((byte) -119) == ~param0.field_l) {
                              var19 = var18_ref_tj.field_d - param0.field_d;
                              var20 = var18_ref_tj.field_e + -param0.field_e;
                              var21 = ar.a(var19, (byte) 115, var20);
                              if (var21 < bpa.field_a) {
                                var17 = 1;
                                break L13;
                              } else {
                                break L14;
                              }
                            } else {
                              break L14;
                            }
                          }
                        }
                        var18_ref_tj = (tj) (Object) var16_ref_ij.a((byte) 55);
                        continue L12;
                      }
                    }
                    if (var17 != 0) {
                      param0.a(-111, 7, param2, var11, var10);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                }
              } else {
                break L5;
              }
            }
            L15: {
              L16: {
                var12 = 1024;
                var13 = 1024;
                var14 = ((aoa) this).field_e - var4_int;
                var15 = -var5 + ((aoa) this).field_d;
                var16 = ((aoa) this).field_f - var6;
                if (var14 != 0) {
                  break L16;
                } else {
                  if (var15 != 0) {
                    break L16;
                  } else {
                    if (var16 == 0) {
                      break L15;
                    } else {
                      break L16;
                    }
                  }
                }
              }
              L17: {
                if (~Math.abs(var16) < ~var12) {
                  if (var16 <= 0) {
                    if (var16 < 0) {
                      var9 = var9 | 4;
                      break L17;
                    } else {
                      break L17;
                    }
                  } else {
                    var9 = var9 | 8;
                    break L17;
                  }
                } else {
                  break L17;
                }
              }
              L18: {
                if (var14 != 0) {
                  break L18;
                } else {
                  if (var15 != 0) {
                    break L18;
                  } else {
                    break L15;
                  }
                }
              }
              L19: {
                var17 = ecb.a(var15, (byte) -77, var14);
                var18 = param0.e(0);
                var19 = rrb.a(22433, var17 - var18);
                var20 = rrb.a(22433, -4096 - (var18 - var17));
                var21 = rrb.a(22433, 2048 - (var18 - var17));
                var22 = rrb.a(param1 + 22506, var17 - var18 - 2048);
                if (~Math.abs(var19) <= ~var13) {
                  break L19;
                } else {
                  var9 = var9 | 1;
                  break L19;
                }
              }
              L20: {
                if (var13 > Math.abs(var20)) {
                  var9 = var9 | 2;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (var13 <= Math.abs(var21)) {
                  break L21;
                } else {
                  var9 = var9 | 32;
                  break L21;
                }
              }
              if (Math.abs(var22) >= var13) {
                break L15;
              } else {
                var9 = var9 | 64;
                break L15;
              }
            }
            if (var9 == 0) {
              stackOut_79_0 = 0;
              stackIn_80_0 = stackOut_79_0;
              break L0;
            } else {
              param0.a(param2, var9, false, var10, var11);
              stackOut_77_0 = 1;
              stackIn_78_0 = stackOut_77_0;
              return stackIn_78_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var4 = decompiledCaughtException;
            stackOut_81_0 = (RuntimeException) var4;
            stackOut_81_1 = new StringBuilder().append("aoa.O(");
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param0 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L22;
            } else {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L22;
            }
          }
          L23: {
            stackOut_84_0 = (RuntimeException) (Object) stackIn_84_0;
            stackOut_84_1 = ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',').append(param1).append(',');
            stackIn_86_0 = stackOut_84_0;
            stackIn_86_1 = stackOut_84_1;
            stackIn_85_0 = stackOut_84_0;
            stackIn_85_1 = stackOut_84_1;
            if (param2 == null) {
              stackOut_86_0 = (RuntimeException) (Object) stackIn_86_0;
              stackOut_86_1 = (StringBuilder) (Object) stackIn_86_1;
              stackOut_86_2 = "null";
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              stackIn_87_2 = stackOut_86_2;
              break L23;
            } else {
              stackOut_85_0 = (RuntimeException) (Object) stackIn_85_0;
              stackOut_85_1 = (StringBuilder) (Object) stackIn_85_1;
              stackOut_85_2 = "{...}";
              stackIn_87_0 = stackOut_85_0;
              stackIn_87_1 = stackOut_85_1;
              stackIn_87_2 = stackOut_85_2;
              break L23;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_87_0, stackIn_87_2 + ')');
        }
        return stackIn_80_0 != 0;
    }

    final int a(byte param0) {
        int var2 = -17 / ((param0 - -52) / 54);
        return -1 + ((aoa) this).field_b;
    }

    private final void a(pe param0, byte param1, sg param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        sg[] var7 = null;
        sg[] var8 = null;
        int var9 = 0;
        sg var10 = null;
        int var16 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var16 = VoidHunters.field_G;
        try {
          L0: {
            var4_int = 0;
            var5 = 0;
            var6 = param2.g(-100);
            var7 = param0.d(1000);
            var8 = var7;
            var9 = 0;
            L1: while (true) {
              if (var8.length <= var9) {
                ((aoa) this).field_d = ((aoa) this).field_d + var5;
                ((aoa) this).field_e = ((aoa) this).field_e + var4_int;
                break L0;
              } else {
                L2: {
                  var10 = var8[var9];
                  if (var10 == null) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var9++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("aoa.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(-103).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
        }
    }

    private final void a(pe param0, byte param1, sg param2, int param3) {
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
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var16 = gca.a(param0, (byte) 63, ((aoa) this).a((byte) 70), param2);
              if (var16 != null) {
                L2: {
                  var6 = var16.field_k.field_r;
                  var7 = var16.field_k.field_n;
                  var8 = ecb.a(param2.field_e + -var7, (byte) -77, -var6 + param2.field_d);
                  var9 = param3;
                  var10 = var6 - -((fc.a(var8, (byte) 38) >> 8) * (var9 >> 8));
                  var11 = (var9 >> 8) * (eu.a(var8, 127) >> 8) + var7;
                  var12 = 256;
                  var13 = -param2.field_d + var10;
                  var14 = var11 + -param2.field_e;
                  var15 = ar.a(var13, (byte) 120, var14);
                  if (var12 >= var15) {
                    break L2;
                  } else {
                    var13 = var12 * var13 / (var15 >> 4);
                    var14 = var14 * var12 / (var15 >> 4);
                    break L2;
                  }
                }
                ((aoa) this).field_d = var14;
                ((aoa) this).field_a = (anb) (Object) var16;
                ((aoa) this).field_e = var13;
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("aoa.M(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          L4: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(-89).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, boolean param1) {
        ((aoa) this).field_b = param0 - -1;
        if (!param1) {
            field_c = null;
        }
    }

    public final void b(byte param0, tv param1) {
        aoa var6 = null;
        aoa var7 = null;
        try {
            var6 = (aoa) (Object) param1;
            var7 = var6;
            if (param0 < 54) {
                Object var4 = null;
                boolean discarded$0 = ((aoa) this).a((byte) -32, (tv) null);
            }
            var7.field_b = ((aoa) this).field_b;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "aoa.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
            return;
        }
        try {
            param0.a(-632, ((aoa) this).field_b, 4);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "aoa.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
