/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class uq extends sna {
    private sna field_wb;
    private sna field_Fb;
    private int field_vb;
    private sna field_yb;
    long field_Eb;
    private daa field_Db;
    static kv[] field_zb;
    private sna[] field_Bb;
    private sna field_Gb;
    private sna field_Ab;
    private sna field_xb;
    private StringBuilder field_Cb;

    final int a(boolean param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        daa stackIn_6_0 = null;
        daa stackIn_7_0 = null;
        daa stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        sna stackIn_14_0 = null;
        sna stackIn_15_0 = null;
        sna stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        daa stackOut_5_0 = null;
        daa stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        daa stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        sna stackOut_13_0 = null;
        sna stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        sna stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          this.a(19842, param0);
          if (this.field_yb != null) {
            L1: {
              this.field_yb.field_Z = this.field_Cb.toString();
              this.field_yb.field_kb = (this.field_sb - this.field_yb.field_jb.a(this.field_yb.field_Z)) / 2;
              this.field_yb.field_sb = this.field_sb + -this.field_yb.field_kb;
              if (this.field_Db != null) {
                if (-1 == (this.field_Db.field_R ^ -1)) {
                  break L1;
                } else {
                  L2: {
                    stackOut_5_0 = this.field_Db;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (this.field_Db.field_t) {
                      stackOut_7_0 = (daa) ((Object) stackIn_7_0);
                      stackOut_7_1 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      break L2;
                    } else {
                      stackOut_6_0 = (daa) ((Object) stackIn_6_0);
                      stackOut_6_1 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      break L2;
                    }
                  }
                  stackIn_8_0.field_t = stackIn_8_1 != 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L3: while (true) {
              if (cja.field_v <= var3) {
                break L0;
              } else {
                if (this.field_Bb[var3] != null) {
                  L4: {
                    stackOut_13_0 = this.field_Bb[var3];
                    stackIn_15_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (-1 <= (this.field_Cb.length() ^ -1)) {
                      stackOut_15_0 = (sna) ((Object) stackIn_15_0);
                      stackOut_15_1 = 0;
                      stackIn_16_0 = stackOut_15_0;
                      stackIn_16_1 = stackOut_15_1;
                      break L4;
                    } else {
                      stackOut_14_0 = (sna) ((Object) stackIn_14_0);
                      stackOut_14_1 = 1;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      break L4;
                    }
                  }
                  stackIn_16_0.field_u = stackIn_16_1 != 0;
                  if (this.field_Bb[var3].field_u) {
                    if (this.field_Bb[var3].field_R != 0) {
                      return var3;
                    } else {
                      var3++;
                      continue L3;
                    }
                  } else {
                    var3++;
                    continue L3;
                  }
                } else {
                  var3++;
                  continue L3;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L5: {
          if (param1) {
            break L5;
          } else {
            this.field_wb = (sna) null;
            break L5;
          }
        }
        if (this.field_Fb.field_R == 0) {
          L6: {
            if (!param0) {
              break L6;
            } else {
              if (lf.field_c == 0) {
                break L6;
              } else {
                if (0 == this.field_R) {
                  return -1;
                } else {
                  break L6;
                }
              }
            }
          }
          return this.field_vb;
        } else {
          return -1;
        }
    }

    private final int a(int param0, sna param1, byte param2, String param3, sna param4, int param5) {
        sna var7 = null;
        RuntimeException var7_ref = null;
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
              if (param2 < -44) {
                break L1;
              } else {
                field_zb = (kv[]) null;
                break L1;
              }
            }
            var7 = new sna(0L, param4, 0, param5, param0, 24, param3);
            param5 += 32;
            param1.a(-1, var7);
            stackOut_2_0 = param5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var7_ref);
            stackOut_4_1 = new StringBuilder().append("uq.AA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param4 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param5 + ')');
        }
        return stackIn_3_0;
    }

    private final int a(int param0, int param1, sna param2, int param3, sna param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            param0 += 8;
            var6_int = param2.field_jb.a(param2.field_Z, -(2 * param2.field_L) + param1, param2.field_B);
            param2.a(var6_int, param3 + 44810, param1, 0, param0);
            if (param3 == -13403) {
              param0 = param0 + (0 + var6_int);
              param4.a(-1, param2);
              stackOut_3_0 = param0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 89;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var6);
            stackOut_5_1 = new StringBuilder().append("uq.DA(").append(param0).append(',').append(param1).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final String h(byte param0) {
        if (param0 != 82) {
            return (String) null;
        }
        return this.field_Cb.toString();
    }

    final static void h(int param0) {
        baa.e(17035);
        hba.a(true, wha.field_a);
        gs.field_f = null;
        int var1 = 3;
        int var2 = 0;
        int var3 = 2;
        int var4 = 1;
        int var5 = 3;
        String[] var6 = new String[]{gaa.field_l};
        if (param0 != -28716) {
            uq.h(-43);
        }
        int var7 = 0;
        op var8 = new op(var1, var2, var3, var4, var5, var6);
        eaa var9 = mg.field_m.field_e.field_m;
        rk[] var10 = new rk[var9.g(param0 + 28716)];
        int discarded$0 = var9.a((byte) 88, var10);
        gj var11 = new gj(var8, var7, var10, false);
        hp.field_c = 0;
        dj.field_c = var11;
        hia.c((byte) -124);
        qi.a((byte) 78);
        kaa.field_m = -1;
        sia.field_h = true;
        dh.a((byte) 58, var2);
    }

    public static void f(int param0) {
        if (param0 < 7) {
            return;
        }
        field_zb = null;
    }

    final boolean f(byte param0) {
        String discarded$0 = null;
        if (!((this.field_vb ^ -1) == 1)) {
            return false;
        }
        if (gf.field_k == 13) {
            this.field_vb = -1;
        }
        if (param0 >= -101) {
            discarded$0 = this.h((byte) -125);
            return true;
        }
        return true;
    }

    uq(int param0, int param1, int param2, int param3, int param4, sna param5, sna param6, sna param7, sna param8, daa param9, sna param10, String param11, long param12) {
        super(0L, param5);
        StringBuilder discarded$1 = null;
        RuntimeException var15 = null;
        int var15_int = 0;
        sna[] var15_array = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        sna[] var28 = null;
        Object stackIn_5_0 = null;
        daa stackIn_5_1 = null;
        daa stackIn_5_2 = null;
        long stackIn_5_3 = 0L;
        daa stackIn_5_4 = null;
        Object stackIn_6_0 = null;
        daa stackIn_6_1 = null;
        daa stackIn_6_2 = null;
        long stackIn_6_3 = 0L;
        daa stackIn_6_4 = null;
        Object stackIn_7_0 = null;
        daa stackIn_7_1 = null;
        daa stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        daa stackIn_7_4 = null;
        Object stackIn_8_0 = null;
        daa stackIn_8_1 = null;
        daa stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        daa stackIn_8_4 = null;
        String stackIn_8_5 = null;
        sna stackIn_13_0 = null;
        sna stackIn_14_0 = null;
        sna stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_52_2 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_58_2 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        String stackIn_64_2 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_67_2 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        daa stackOut_4_1 = null;
        daa stackOut_4_2 = null;
        long stackOut_4_3 = 0L;
        daa stackOut_4_4 = null;
        Object stackOut_5_0 = null;
        daa stackOut_5_1 = null;
        daa stackOut_5_2 = null;
        long stackOut_5_3 = 0L;
        daa stackOut_5_4 = null;
        Object stackOut_7_0 = null;
        daa stackOut_7_1 = null;
        daa stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        daa stackOut_7_4 = null;
        String stackOut_7_5 = null;
        Object stackOut_6_0 = null;
        daa stackOut_6_1 = null;
        daa stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        daa stackOut_6_4 = null;
        String stackOut_6_5 = null;
        sna stackOut_12_0 = null;
        sna stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        sna stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        String stackOut_50_2 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        String stackOut_57_2 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        String stackOut_63_2 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        this.field_vb = -2;
        try {
          L0: {
            L1: {
              this.field_Eb = param12;
              this.field_Gb = new sna(0L, param6, dka.field_D.toUpperCase());
              this.field_Gb.field_N = 1;
              this.a(-1, this.field_Gb);
              this.field_Fb = new sna(0L, param7);
              this.field_Gb.a(-1, this.field_Fb);
              this.field_Ab = new sna(0L, (sna) null);
              this.a(-1, this.field_Ab);
              if (param11 == null) {
                this.field_wb = new sna(0L, param8, eha.field_r);
                this.field_wb.field_gb = 11184810;
                this.field_wb.field_N = 1;
                this.field_Ab.a(-1, this.field_wb);
                var15_int = 226;
                var16 = 10;
                var17 = this.field_wb.field_jb.b(this.field_wb.field_Z, var15_int);
                this.field_wb.a(var17 * rg.field_h, 31407, var15_int, 13, var16);
                var16 = var16 + var17 * rg.field_h;
                this.field_Ab.a(var16 + 10, 31407, 26 + var15_int, 0, 24);
                this.field_Ab.field_eb = mu.a(11579568, 3, this.field_Ab.field_p, 8421504, 2105376, (byte) 17);
                var18 = 13 + var15_int + 13;
                var19 = 34 + var16;
                var20 = oi.a(param2, var18, param0, -21264);
                var21 = nga.a(var19, param1, (byte) 124, param3);
                this.a(var19, 31407, var18, var20, var21);
                break L1;
              } else {
                L2: {
                  L3: {
                    this.field_wb = new sna(0L, param8, dia.field_D);
                    this.field_wb.field_N = 1;
                    this.field_wb.field_gb = 11184810;
                    this.field_Ab.a(-1, this.field_wb);
                    this.field_xb = new sna(0L, param8, vj.field_q);
                    this.field_xb.field_gb = 11184810;
                    this.field_xb.field_N = 1;
                    this.field_Ab.a(-1, this.field_xb);
                    this.field_yb = new sna(0L, param8);
                    this.field_yb.field_gb = 16764006;
                    this.field_Ab.a(-1, this.field_yb);
                    this.field_yb.field_pb = "|";
                    if (hka.field_i >= 5) {
                      break L3;
                    } else {
                      if (-3 < (hea.field_r ^ -1)) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      stackOut_4_0 = this;
                      stackOut_4_1 = null;
                      stackOut_4_2 = null;
                      stackOut_4_3 = 0L;
                      stackOut_4_4 = (daa) (param9);
                      stackIn_6_0 = stackOut_4_0;
                      stackIn_6_1 = stackOut_4_1;
                      stackIn_6_2 = stackOut_4_2;
                      stackIn_6_3 = stackOut_4_3;
                      stackIn_6_4 = stackOut_4_4;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      stackIn_5_2 = stackOut_4_2;
                      stackIn_5_3 = stackOut_4_3;
                      stackIn_5_4 = stackOut_4_4;
                      if (7 <= hka.field_i) {
                        break L5;
                      } else {
                        stackOut_5_0 = this;
                        stackOut_5_1 = null;
                        stackOut_5_2 = null;
                        stackOut_5_3 = stackIn_5_3;
                        stackOut_5_4 = (daa) ((Object) stackIn_5_4);
                        stackIn_7_0 = stackOut_5_0;
                        stackIn_7_1 = stackOut_5_1;
                        stackIn_7_2 = stackOut_5_2;
                        stackIn_7_3 = stackOut_5_3;
                        stackIn_7_4 = stackOut_5_4;
                        stackIn_6_0 = stackOut_5_0;
                        stackIn_6_1 = stackOut_5_1;
                        stackIn_6_2 = stackOut_5_2;
                        stackIn_6_3 = stackOut_5_3;
                        stackIn_6_4 = stackOut_5_4;
                        if (hea.field_r < 2) {
                          stackOut_7_0 = this;
                          stackOut_7_1 = null;
                          stackOut_7_2 = null;
                          stackOut_7_3 = stackIn_7_3;
                          stackOut_7_4 = (daa) ((Object) stackIn_7_4);
                          stackOut_7_5 = lq.field_z;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          stackIn_8_2 = stackOut_7_2;
                          stackIn_8_3 = stackOut_7_3;
                          stackIn_8_4 = stackOut_7_4;
                          stackIn_8_5 = stackOut_7_5;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    stackOut_6_0 = this;
                    stackOut_6_1 = null;
                    stackOut_6_2 = null;
                    stackOut_6_3 = stackIn_6_3;
                    stackOut_6_4 = (daa) ((Object) stackIn_6_4);
                    stackOut_6_5 = nw.field_r;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    stackIn_8_2 = stackOut_6_2;
                    stackIn_8_3 = stackOut_6_3;
                    stackIn_8_4 = stackOut_6_4;
                    stackIn_8_5 = stackOut_6_5;
                    break L4;
                  }
                  ((uq) (this)).field_Db = new daa(stackIn_8_3, stackIn_8_4, stackIn_8_5);
                  this.field_Ab.a(-1, this.field_Db);
                  break L2;
                }
                var28 = new sna[3];
                var15_array = var28;
                var28[0] = new sna(0L, (sna) null);
                this.field_Ab.a(-1, var28[0]);
                var28[1] = new sna(0L, (sna) null);
                this.field_Ab.a(-1, var28[1]);
                var28[2] = new sna(0L, (sna) null);
                this.field_Ab.a(-1, var28[2]);
                this.field_Bb = new sna[cja.field_v];
                var16 = 0;
                L6: while (true) {
                  if (var16 >= cja.field_v) {
                    L7: {
                      this.field_Cb = new StringBuilder(12);
                      if (param11 == null) {
                        break L7;
                      } else {
                        discarded$1 = this.field_Cb.append(param11);
                        break L7;
                      }
                    }
                    L8: {
                      var16 = 0;
                      var17 = param6.field_jb.a(oe.field_a);
                      if (var17 <= var16) {
                        break L8;
                      } else {
                        var16 = var17;
                        break L8;
                      }
                    }
                    L9: {
                      var17 = param6.field_jb.a(nr.field_y);
                      if (var16 >= var17) {
                        break L9;
                      } else {
                        var16 = var17;
                        break L9;
                      }
                    }
                    L10: {
                      var17 = param6.field_jb.a(ur.field_p);
                      if (var17 <= var16) {
                        break L10;
                      } else {
                        var16 = var17;
                        break L10;
                      }
                    }
                    var17 = 0;
                    L11: while (true) {
                      if (cja.field_v <= var17) {
                        L12: {
                          if (-141 <= (var16 ^ -1)) {
                            break L12;
                          } else {
                            var16 = 140;
                            break L12;
                          }
                        }
                        L13: {
                          var17 = 0;
                          var18 = 0;
                          var18 = 0;
                          var18 = this.a(var16, var28[0], (byte) -57, oe.field_a, param6, var18);
                          var18 = this.a(var18, var16, this.field_Bb[6], -13403, var28[0]);
                          var18 = this.a(var18, var16, this.field_Bb[9], -13403, var28[0]);
                          var18 = this.a(var18, var16, this.field_Bb[5], -13403, var28[0]);
                          var18 = this.a(var18, var16, this.field_Bb[7], -13403, var28[0]);
                          var18 = this.a(var18, var16, this.field_Bb[15], -13403, var28[0]);
                          var18 = this.a(var18, var16, this.field_Bb[4], -13403, var28[0]);
                          if (var17 >= var18) {
                            break L13;
                          } else {
                            var17 = var18;
                            break L13;
                          }
                        }
                        L14: {
                          var18 = 0;
                          var18 = this.a(var16, var28[1], (byte) -75, nr.field_y, param6, var18);
                          var18 = this.a(var18, var16, this.field_Bb[16], -13403, var28[1]);
                          var18 = this.a(var18, var16, this.field_Bb[17], -13403, var28[1]);
                          var18 = this.a(var18, var16, this.field_Bb[18], -13403, var28[1]);
                          var18 = this.a(var18, var16, this.field_Bb[19], -13403, var28[1]);
                          var18 = this.a(var18, var16, this.field_Bb[20], -13403, var28[1]);
                          if (var18 <= var17) {
                            break L14;
                          } else {
                            var17 = var18;
                            break L14;
                          }
                        }
                        L15: {
                          var18 = 0;
                          var18 = this.a(var16, var28[2], (byte) -117, ur.field_p, param6, var18);
                          var18 = this.a(var18, var16, this.field_Bb[13], -13403, var28[2]);
                          var18 = this.a(var18, var16, this.field_Bb[21], -13403, var28[2]);
                          var18 = this.a(var18, var16, this.field_Bb[11], -13403, var28[2]);
                          if (var17 >= var18) {
                            break L15;
                          } else {
                            var17 = var18;
                            break L15;
                          }
                        }
                        L16: {
                          var19 = 26 + var16 * 3;
                          var20 = this.field_Gb.e(-1);
                          if (var19 >= var20) {
                            break L16;
                          } else {
                            var19 = var20;
                            break L16;
                          }
                        }
                        L17: {
                          if (this.field_Db == null) {
                            break L17;
                          } else {
                            var20 = this.field_Db.a((byte) -108, 4);
                            if (var20 <= var19) {
                              break L17;
                            } else {
                              var19 = var20;
                              break L17;
                            }
                          }
                        }
                        L18: {
                          this.field_Gb.a(24, 31407, var19 + 26, 0, 0);
                          this.field_Fb.a(15, 31407, 15, this.field_Gb.field_sb - 20, 5);
                          var21 = 10;
                          this.field_wb.a(rg.field_h * 2, 31407, var19, 13, var21);
                          var21 = var21 + 2 * rg.field_h;
                          this.field_xb.a(2 * rg.field_h, 31407, var19, 13, var21);
                          var21 = var21 + (10 + rg.field_h * 2);
                          this.field_yb.a(rg.field_h, 31407, 0, 0, var21);
                          var21 = var21 + (rg.field_h - -10);
                          if (null == this.field_Db) {
                            break L18;
                          } else {
                            var20 = this.field_Db.a((byte) -118, 4);
                            this.field_Db.a((byte) -42, rg.field_h, 13 - -((var19 + -var20) / 2), 4, var20, var21);
                            var21 = var21 + (10 + rg.field_h);
                            break L18;
                          }
                        }
                        var28[0].a(var17, 31407, var16, 13, var21);
                        var28[1].a(var17, 31407, var16, 13 - (-var16 + -13), var21);
                        var28[2].a(var17, 31407, var16, 13 - -(var16 * 2) - -26, var21);
                        var22 = var21;
                        this.field_Ab.a(var22 + (var17 + 10), 31407, 13 + (13 + var19), 0, 24);
                        this.field_Ab.field_eb = mu.a(11579568, 3, this.field_Ab.field_p, 8421504, 2105376, (byte) 17);
                        var23 = var19 + 13 + 13;
                        var24 = 10 + (24 - -var22 + var17);
                        var25 = oi.a(param2, var23, param0, -21264);
                        var26 = nga.a(var24, param1, (byte) 127, param3);
                        this.a(var24, 31407, var23, var25, var26);
                        break L1;
                      } else {
                        L19: {
                          if (null == this.field_Bb[var17]) {
                            break L19;
                          } else {
                            var18 = this.field_Bb[var17].e(-1);
                            if (var16 >= var18) {
                              break L19;
                            } else {
                              var16 = var18;
                              break L19;
                            }
                          }
                        }
                        var17++;
                        continue L11;
                      }
                    }
                  } else {
                    L20: {
                      if (null == lw.field_k[var16]) {
                        break L20;
                      } else {
                        L21: {
                          this.field_Bb[var16] = new sna(0L, param10, lw.field_k[var16]);
                          this.field_Bb[var16].field_N = 0;
                          stackOut_12_0 = this.field_Bb[var16];
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_13_0 = stackOut_12_0;
                          if (param11 == null) {
                            stackOut_14_0 = (sna) ((Object) stackIn_14_0);
                            stackOut_14_1 = 0;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            break L21;
                          } else {
                            stackOut_13_0 = (sna) ((Object) stackIn_13_0);
                            stackOut_13_1 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            break L21;
                          }
                        }
                        stackIn_15_0.field_u = stackIn_15_1 != 0;
                        this.field_Ab.a(-1, this.field_Bb[var16]);
                        break L20;
                      }
                    }
                    var16++;
                    continue L6;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L22: {
            var15 = decompiledCaughtException;
            stackOut_49_0 = (RuntimeException) (var15);
            stackOut_49_1 = new StringBuilder().append("uq.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_51_0 = stackOut_49_0;
            stackIn_51_1 = stackOut_49_1;
            stackIn_50_0 = stackOut_49_0;
            stackIn_50_1 = stackOut_49_1;
            if (param5 == null) {
              stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
              stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
              stackOut_51_2 = "null";
              stackIn_52_0 = stackOut_51_0;
              stackIn_52_1 = stackOut_51_1;
              stackIn_52_2 = stackOut_51_2;
              break L22;
            } else {
              stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
              stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
              stackOut_50_2 = "{...}";
              stackIn_52_0 = stackOut_50_0;
              stackIn_52_1 = stackOut_50_1;
              stackIn_52_2 = stackOut_50_2;
              break L22;
            }
          }
          L23: {
            stackOut_52_0 = (RuntimeException) ((Object) stackIn_52_0);
            stackOut_52_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',');
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param6 == null) {
              stackOut_54_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackOut_54_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L23;
            } else {
              stackOut_53_0 = (RuntimeException) ((Object) stackIn_53_0);
              stackOut_53_1 = (StringBuilder) ((Object) stackIn_53_1);
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L23;
            }
          }
          L24: {
            stackOut_55_0 = (RuntimeException) ((Object) stackIn_55_0);
            stackOut_55_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');
            stackIn_57_0 = stackOut_55_0;
            stackIn_57_1 = stackOut_55_1;
            stackIn_56_0 = stackOut_55_0;
            stackIn_56_1 = stackOut_55_1;
            if (param7 == null) {
              stackOut_57_0 = (RuntimeException) ((Object) stackIn_57_0);
              stackOut_57_1 = (StringBuilder) ((Object) stackIn_57_1);
              stackOut_57_2 = "null";
              stackIn_58_0 = stackOut_57_0;
              stackIn_58_1 = stackOut_57_1;
              stackIn_58_2 = stackOut_57_2;
              break L24;
            } else {
              stackOut_56_0 = (RuntimeException) ((Object) stackIn_56_0);
              stackOut_56_1 = (StringBuilder) ((Object) stackIn_56_1);
              stackOut_56_2 = "{...}";
              stackIn_58_0 = stackOut_56_0;
              stackIn_58_1 = stackOut_56_1;
              stackIn_58_2 = stackOut_56_2;
              break L24;
            }
          }
          L25: {
            stackOut_58_0 = (RuntimeException) ((Object) stackIn_58_0);
            stackOut_58_1 = ((StringBuilder) (Object) stackIn_58_1).append(stackIn_58_2).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param8 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L25;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L25;
            }
          }
          L26: {
            stackOut_61_0 = (RuntimeException) ((Object) stackIn_61_0);
            stackOut_61_1 = ((StringBuilder) (Object) stackIn_61_1).append(stackIn_61_2).append(',');
            stackIn_63_0 = stackOut_61_0;
            stackIn_63_1 = stackOut_61_1;
            stackIn_62_0 = stackOut_61_0;
            stackIn_62_1 = stackOut_61_1;
            if (param9 == null) {
              stackOut_63_0 = (RuntimeException) ((Object) stackIn_63_0);
              stackOut_63_1 = (StringBuilder) ((Object) stackIn_63_1);
              stackOut_63_2 = "null";
              stackIn_64_0 = stackOut_63_0;
              stackIn_64_1 = stackOut_63_1;
              stackIn_64_2 = stackOut_63_2;
              break L26;
            } else {
              stackOut_62_0 = (RuntimeException) ((Object) stackIn_62_0);
              stackOut_62_1 = (StringBuilder) ((Object) stackIn_62_1);
              stackOut_62_2 = "{...}";
              stackIn_64_0 = stackOut_62_0;
              stackIn_64_1 = stackOut_62_1;
              stackIn_64_2 = stackOut_62_2;
              break L26;
            }
          }
          L27: {
            stackOut_64_0 = (RuntimeException) ((Object) stackIn_64_0);
            stackOut_64_1 = ((StringBuilder) (Object) stackIn_64_1).append(stackIn_64_2).append(',');
            stackIn_66_0 = stackOut_64_0;
            stackIn_66_1 = stackOut_64_1;
            stackIn_65_0 = stackOut_64_0;
            stackIn_65_1 = stackOut_64_1;
            if (param10 == null) {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "null";
              stackIn_67_0 = stackOut_66_0;
              stackIn_67_1 = stackOut_66_1;
              stackIn_67_2 = stackOut_66_2;
              break L27;
            } else {
              stackOut_65_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackOut_65_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackOut_65_2 = "{...}";
              stackIn_67_0 = stackOut_65_0;
              stackIn_67_1 = stackOut_65_1;
              stackIn_67_2 = stackOut_65_2;
              break L27;
            }
          }
          L28: {
            stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
            stackOut_67_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
            stackIn_69_0 = stackOut_67_0;
            stackIn_69_1 = stackOut_67_1;
            stackIn_68_0 = stackOut_67_0;
            stackIn_68_1 = stackOut_67_1;
            if (param11 == null) {
              stackOut_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackOut_69_1 = (StringBuilder) ((Object) stackIn_69_1);
              stackOut_69_2 = "null";
              stackIn_70_0 = stackOut_69_0;
              stackIn_70_1 = stackOut_69_1;
              stackIn_70_2 = stackOut_69_2;
              break L28;
            } else {
              stackOut_68_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackOut_68_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackOut_68_2 = "{...}";
              stackIn_70_0 = stackOut_68_0;
              stackIn_70_1 = stackOut_68_1;
              stackIn_70_2 = stackOut_68_2;
              break L28;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_70_0), stackIn_70_2 + ',' + param12 + ')');
        }
    }

    final static void g(byte param0) {
        mg.field_m = new mu();
        Random discarded$0 = new Random();
        int var1 = 63 % ((-7 - param0) / 47);
    }

    final boolean g(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (null == this.field_Db) {
                break L1;
              } else {
                if (!this.field_Db.field_t) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    static {
    }
}
