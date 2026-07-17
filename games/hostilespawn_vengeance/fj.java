/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fj extends le {
    static long field_Rb;
    private le field_Fb;
    private le field_Gb;
    static rc field_Tb;
    private le field_Qb;
    static String field_Sb;
    static int field_Lb;
    private int field_Hb;
    private le field_Nb;
    static int field_Jb;
    static bd[] field_Kb;
    private le field_Ib;
    static double field_Pb;
    private le field_Mb;
    static int field_Ob;

    fj(long param0, le param1, le param2, le param3, le param4) {
        super(param0, (le) null);
        RuntimeException var7 = null;
        le var9 = null;
        le var10 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
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
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            ((fj) this).field_Fb = new le(0L, param1);
            ((fj) this).field_Gb = new le(0L, param2);
            ((fj) this).a(false, ((fj) this).field_Fb);
            ((fj) this).a(false, ((fj) this).field_Gb);
            ((fj) this).field_Qb = new le(0L, (le) null);
            ((fj) this).a(false, ((fj) this).field_Qb);
            ((fj) this).field_Nb = new le(0L, param3);
            ((fj) this).field_Ib = new le(0L, param3);
            ((fj) this).field_Ib.field_B = true;
            var9 = ((fj) this).field_Nb;
            var10 = var9;
            var10.field_B = true;
            ((fj) this).field_Qb.a(false, ((fj) this).field_Nb);
            ((fj) this).field_Qb.a(false, ((fj) this).field_Ib);
            ((fj) this).field_Mb = new le(0L, param4);
            ((fj) this).field_Mb.field_Db = true;
            ((fj) this).field_Qb.a(false, ((fj) this).field_Mb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("fj.<init>(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    final static Boolean k(int param0) {
        Boolean var1 = ii.field_h;
        ii.field_h = null;
        return var1;
    }

    public static void i(int param0) {
        field_Sb = null;
        field_Tb = null;
        field_Kb = null;
    }

    final boolean h(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -24467) {
          L0: {
            field_Tb = null;
            if (((fj) this).field_Mb.field_W == 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((fj) this).field_Mb.field_W == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        le var14 = null;
        le var15 = null;
        le var16 = null;
        le var17 = null;
        le var18 = null;
        le var19 = null;
        le stackIn_12_0 = null;
        le stackIn_12_1 = null;
        le stackIn_12_2 = null;
        le stackIn_13_0 = null;
        le stackIn_13_1 = null;
        le stackIn_13_2 = null;
        le stackIn_14_0 = null;
        le stackIn_14_1 = null;
        le stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        le stackIn_19_0 = null;
        le stackIn_19_1 = null;
        le stackIn_19_2 = null;
        le stackIn_20_0 = null;
        le stackIn_20_1 = null;
        le stackIn_20_2 = null;
        le stackIn_21_0 = null;
        le stackIn_21_1 = null;
        le stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        le stackOut_18_0 = null;
        le stackOut_18_1 = null;
        le stackOut_18_2 = null;
        le stackOut_20_0 = null;
        le stackOut_20_1 = null;
        le stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        le stackOut_19_0 = null;
        le stackOut_19_1 = null;
        le stackOut_19_2 = null;
        int stackOut_19_3 = 0;
        le stackOut_11_0 = null;
        le stackOut_11_1 = null;
        le stackOut_11_2 = null;
        le stackOut_13_0 = null;
        le stackOut_13_1 = null;
        le stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        le stackOut_12_0 = null;
        le stackOut_12_1 = null;
        le stackOut_12_2 = null;
        int stackOut_12_3 = 0;
        L0: {
          if (((fj) this).field_qb * 2 > ((fj) this).field_sb) {
            var6 = ((fj) this).field_sb / 2;
            var5 = ((fj) this).field_sb / 2;
            break L0;
          } else {
            var5 = ((fj) this).field_qb;
            var6 = -((fj) this).field_qb + ((fj) this).field_sb;
            break L0;
          }
        }
        var7 = var6 + -var5;
        var8 = var7;
        if (param0 <= 0) {
          L1: {
            var9 = param0 + -param2;
            var10 = var7 + -var8;
            var11 = 0;
            if (0 < var9) {
              var11 = (var9 / 2 + param3 * var10) / var9;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            var12 = var11 + var8 / 2;
            var14 = ((fj) this).field_Fb;
            var14.field_sb = var5;
            var14.field_qb = ((fj) this).field_qb;
            var14.field_zb = 0;
            var14.field_tb = 0;
            var15 = ((fj) this).field_Gb;
            var15.field_zb = var6;
            var15.field_qb = ((fj) this).field_qb;
            var15.field_tb = param1;
            var15.field_sb = -var6 + ((fj) this).field_sb;
            var16 = ((fj) this).field_Qb;
            var16.field_qb = ((fj) this).field_qb;
            var16.field_tb = 0;
            var16.field_zb = var5;
            var16.field_sb = var7;
            var17 = ((fj) this).field_Nb;
            var17.field_zb = 0;
            var17.field_sb = var12;
            var17.field_tb = 0;
            var17.field_qb = ((fj) this).field_qb;
            var18 = ((fj) this).field_Ib;
            var18.field_tb = 0;
            var18.field_zb = var12;
            var18.field_qb = ((fj) this).field_qb;
            var18.field_sb = -var12 + var7;
            var19 = ((fj) this).field_Mb;
            var19.field_tb = 0;
            var19.field_sb = var8;
            var19.field_zb = var11;
            stackOut_18_0 = ((fj) this).field_Fb;
            stackOut_18_1 = ((fj) this).field_Gb;
            stackOut_18_2 = ((fj) this).field_Qb;
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_20_2 = stackOut_18_2;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            stackIn_19_2 = stackOut_18_2;
            if (param2 >= param0) {
              stackOut_20_0 = (le) (Object) stackIn_20_0;
              stackOut_20_1 = (le) (Object) stackIn_20_1;
              stackOut_20_2 = (le) (Object) stackIn_20_2;
              stackOut_20_3 = 0;
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              stackIn_21_3 = stackOut_20_3;
              break L2;
            } else {
              stackOut_19_0 = (le) (Object) stackIn_19_0;
              stackOut_19_1 = (le) (Object) stackIn_19_1;
              stackOut_19_2 = (le) (Object) stackIn_19_2;
              stackOut_19_3 = 1;
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              stackIn_21_3 = stackOut_19_3;
              break L2;
            }
          }
          stackIn_21_2.field_jb = stackIn_21_3 != 0;
          stackIn_21_1.field_jb = stackIn_21_3 != 0;
          stackIn_21_0.field_jb = stackIn_21_3 != 0;
          var19.field_qb = ((fj) this).field_qb;
          return;
        } else {
          L3: {
            var8 = var8 * param2 / param0;
            if (var8 >= ((fj) this).field_qb) {
              break L3;
            } else {
              var8 = ((fj) this).field_qb;
              break L3;
            }
          }
          L4: {
            if (var8 <= var7) {
              break L4;
            } else {
              var8 = var7;
              break L4;
            }
          }
          L5: {
            var9 = param0 + -param2;
            var10 = var7 + -var8;
            var11 = 0;
            if (0 < var9) {
              var11 = (var9 / 2 + param3 * var10) / var9;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            var12 = var11 + var8 / 2;
            var14 = ((fj) this).field_Fb;
            var14.field_sb = var5;
            var14.field_qb = ((fj) this).field_qb;
            var14.field_zb = 0;
            var14.field_tb = 0;
            var15 = ((fj) this).field_Gb;
            var15.field_zb = var6;
            var15.field_qb = ((fj) this).field_qb;
            var15.field_tb = param1;
            var15.field_sb = -var6 + ((fj) this).field_sb;
            var16 = ((fj) this).field_Qb;
            var16.field_qb = ((fj) this).field_qb;
            var16.field_tb = 0;
            var16.field_zb = var5;
            var16.field_sb = var7;
            var17 = ((fj) this).field_Nb;
            var17.field_zb = 0;
            var17.field_sb = var12;
            var17.field_tb = 0;
            var17.field_qb = ((fj) this).field_qb;
            var18 = ((fj) this).field_Ib;
            var18.field_tb = 0;
            var18.field_zb = var12;
            var18.field_qb = ((fj) this).field_qb;
            var18.field_sb = -var12 + var7;
            var19 = ((fj) this).field_Mb;
            var19.field_tb = 0;
            var19.field_sb = var8;
            var19.field_zb = var11;
            stackOut_11_0 = ((fj) this).field_Fb;
            stackOut_11_1 = ((fj) this).field_Gb;
            stackOut_11_2 = ((fj) this).field_Qb;
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_13_2 = stackOut_11_2;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            if (param2 >= param0) {
              stackOut_13_0 = (le) (Object) stackIn_13_0;
              stackOut_13_1 = (le) (Object) stackIn_13_1;
              stackOut_13_2 = (le) (Object) stackIn_13_2;
              stackOut_13_3 = 0;
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              stackIn_14_3 = stackOut_13_3;
              break L6;
            } else {
              stackOut_12_0 = (le) (Object) stackIn_12_0;
              stackOut_12_1 = (le) (Object) stackIn_12_1;
              stackOut_12_2 = (le) (Object) stackIn_12_2;
              stackOut_12_3 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              stackIn_14_3 = stackOut_12_3;
              break L6;
            }
          }
          stackIn_14_2.field_jb = stackIn_14_3 != 0;
          stackIn_14_1.field_jb = stackIn_14_3 != 0;
          stackIn_14_0.field_jb = stackIn_14_3 != 0;
          var19.field_qb = ((fj) this).field_qb;
          return;
        }
    }

    final boolean f(int param0) {
        if (param0 == 2) {
          if (0 == ((fj) this).field_Fb.field_Q) {
            if (((fj) this).field_Fb.field_W != 0) {
              L0: {
                if (((fj) this).field_Hb > 0) {
                  ((fj) this).field_Hb = ((fj) this).field_Hb - 1;
                  break L0;
                } else {
                  break L0;
                }
              }
              if (((fj) this).field_Hb != 0) {
                return false;
              } else {
                ((fj) this).field_Hb = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            ((fj) this).field_Hb = 20;
            return true;
          }
        } else {
          ((fj) this).field_Mb = null;
          if (0 == ((fj) this).field_Fb.field_Q) {
            if (((fj) this).field_Fb.field_W != 0) {
              L1: {
                if (((fj) this).field_Hb > 0) {
                  ((fj) this).field_Hb = ((fj) this).field_Hb - 1;
                  break L1;
                } else {
                  break L1;
                }
              }
              if (((fj) this).field_Hb != 0) {
                return false;
              } else {
                ((fj) this).field_Hb = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            ((fj) this).field_Hb = 20;
            return true;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        Object var10 = null;
        ((fj) this).field_qb = param1;
        ((fj) this).field_zb = param4;
        if (param3 != 20) {
          var10 = null;
          int discarded$2 = fj.a((String) null, 31, false, (String) null, -42, (byte) 83, (String) null);
          ((fj) this).field_sb = param5;
          ((fj) this).field_tb = param0;
          ((fj) this).a(param7, 0, param6, param2);
          return;
        } else {
          ((fj) this).field_sb = param5;
          ((fj) this).field_tb = param0;
          ((fj) this).a(param7, 0, param6, param2);
          return;
        }
    }

    final static int a(String param0, int param1, boolean param2, String param3, int param4, byte param5, String param6) {
        s var7 = null;
        RuntimeException var7_ref = null;
        s var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              var7 = new s(param6);
              if (param5 == -8) {
                break L1;
              } else {
                field_Kb = null;
                break L1;
              }
            }
            var8 = new s(param0);
            stackOut_2_0 = lb.a(param1, (byte) 124, var7, param2, var8, param3, param4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var7_ref;
            stackOut_4_1 = new StringBuilder().append("fj.F(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
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
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param4).append(44).append(param5).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param6 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, m param1, boolean param2) {
        en var5 = null;
        int var4 = 0;
        try {
            var5 = s.field_b;
            en var3 = var5;
            var5.i(19319, param0);
            var5.field_i = var5.field_i + 1;
            var4 = var5.field_i;
            var5.d(106, 1);
            if (param1.field_i != null) {
                var5.d(114, param1.field_i.length);
                var5.a(param1.field_i.length, param1.field_i, true, 0);
            } else {
                var5.d(80, 0);
            }
            int discarded$0 = var5.f(var4, -90);
            var5.field_i = var5.field_i - 4;
            param1.field_o = var5.d(8195);
            var5.a(var5.field_i + -var4, -19720);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "fj.S(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + 1 + 41);
        }
    }

    private final int a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var5 = 0;
        var6 = ((fj) this).field_Qb.field_sb + -((fj) this).field_Mb.field_sb;
        if (param2 <= -22) {
          L0: {
            if (var6 > 0) {
              var7 = ((fj) this).field_Mb.field_zb;
              var8 = -param3 + param0;
              var5 = (var8 * var7 + var6 / 2) / var6;
              break L0;
            } else {
              break L0;
            }
          }
          if (!param1) {
            L1: {
              if (var5 <= param0 - param3) {
                break L1;
              } else {
                var5 = param0 + -param3;
                break L1;
              }
            }
            if (var5 >= 0) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          } else {
            L2: {
              if (0 <= var5) {
                break L2;
              } else {
                var5 = 0;
                break L2;
              }
            }
            if (-param3 + param0 >= var5) {
              return var5;
            } else {
              var5 = -param3 + param0;
              return var5;
            }
          }
        } else {
          L3: {
            ((fj) this).a(-95, -63, 115, -27);
            if (var6 > 0) {
              var7 = ((fj) this).field_Mb.field_zb;
              var8 = -param3 + param0;
              var5 = (var8 * var7 + var6 / 2) / var6;
              break L3;
            } else {
              break L3;
            }
          }
          if (!param1) {
            L4: {
              if (var5 <= param0 - param3) {
                break L4;
              } else {
                var5 = param0 + -param3;
                break L4;
              }
            }
            if (var5 >= 0) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          } else {
            L5: {
              if (0 <= var5) {
                break L5;
              } else {
                var5 = 0;
                break L5;
              }
            }
            if (-param3 + param0 >= var5) {
              return var5;
            } else {
              var5 = -param3 + param0;
              return var5;
            }
          }
        }
    }

    final boolean j(int param0) {
        if (((fj) this).field_Gb.field_Q != 0) {
            ((fj) this).field_Hb = 20;
            return true;
        }
        if (param0 != 0) {
            boolean discarded$4 = ((fj) this).g(-49);
            if (((fj) this).field_Gb.field_W == 0) {
                return false;
            }
            if (((fj) this).field_Hb <= 0) {
                if (((fj) this).field_Hb == 0) {
                    ((fj) this).field_Hb = 3;
                    return true;
                }
                return false;
            }
            ((fj) this).field_Hb = ((fj) this).field_Hb - 1;
            if (((fj) this).field_Hb == 0) {
                ((fj) this).field_Hb = 3;
                return true;
            }
            return false;
        }
        if (((fj) this).field_Gb.field_W == 0) {
            return false;
        }
        if (((fj) this).field_Hb > 0) {
            ((fj) this).field_Hb = ((fj) this).field_Hb - 1;
            if (((fj) this).field_Hb == 0) {
                ((fj) this).field_Hb = 3;
                return true;
            }
            return false;
        }
        if (((fj) this).field_Hb != 0) {
            return false;
        }
        ((fj) this).field_Hb = 3;
        return true;
    }

    final boolean g(int param0) {
        if (((fj) this).field_Nb.field_Q == 0) {
          if (~((fj) this).field_Nb.field_W != param0) {
            L0: {
              if (((fj) this).field_Hb > 0) {
                ((fj) this).field_Hb = ((fj) this).field_Hb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (((fj) this).field_Hb == 0) {
              if (((fj) this).field_Mb.field_mb + ((fj) this).field_Mb.field_z <= rb.field_m) {
                return false;
              } else {
                ((fj) this).field_Hb = 3;
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((fj) this).field_Hb = 20;
          return true;
        }
    }

    final static void a(byte[] param0, int param1, int param2, File param3) throws IOException {
        FileOutputStream var4 = null;
        try {
            if (param1 != 15445) {
                field_Ob = 85;
            }
            var4 = new FileOutputStream(param3);
            var4.write(param0, 0, param2);
            var4.close();
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "fj.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    final boolean c(boolean param0) {
        if (((fj) this).field_Ib.field_Q != 0) {
            ((fj) this).field_Hb = 20;
            return true;
        }
        if (param0) {
            return false;
        }
        if (((fj) this).field_Ib.field_W == 0) {
            return false;
        }
        if (!(((fj) this).field_Hb <= 0)) {
            ((fj) this).field_Hb = ((fj) this).field_Hb - 1;
        }
        if (((fj) this).field_Hb != 0) {
            return false;
        }
        if (((fj) this).field_Mb.field_N + ((fj) this).field_Mb.field_sb + (((fj) this).field_Mb.field_z + ((fj) this).field_Mb.field_mb) > rb.field_m) {
            return false;
        }
        ((fj) this).field_Hb = 3;
        return true;
    }

    final int a(int param0, byte param1, int param2) {
        if (param1 != 126) {
          field_Jb = -105;
          return this.a(param0, false, -110, param2);
        } else {
          return this.a(param0, false, -110, param2);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Pb = 0.0;
    }
}
