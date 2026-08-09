/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends kc {
    kc field_Cb;
    kc field_Gb;
    int field_Vb;
    int field_Eb;
    kc field_Fb;
    static eh field_Wb;
    kc field_Ub;
    int field_Bb;
    int field_Mb;
    boolean field_Kb;
    kc field_Hb;
    long field_Nb;
    static int field_Lb;
    long field_Ob;
    boolean field_Jb;
    String field_Tb;
    static String field_Rb;
    int field_Sb;
    static qb field_Ib;
    int field_Pb;
    boolean field_Db;
    String field_Qb;

    final void a(String param0, String param1, int param2) {
        CharSequence var5 = null;
        try {
            int var4_int = 41 / ((param2 - -52) / 53);
            this.field_Qb = param1;
            this.field_Tb = param0;
            var5 = (CharSequence) ((Object) this.field_Tb);
            gk.a(var5, -13);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "cg.F(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0, uj param1, uj param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2.field_g >= param1.field_g) {
              L1: {
                if (param0 == -111) {
                  break L1;
                } else {
                  cg.f(-126);
                  break L1;
                }
              }
              if (param1.field_g != param2.field_g) {
                stackIn_11_0 = 0;
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                if (param1.field_e > param2.field_e) {
                  stackIn_9_0 = 1;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return false;
                }
              }
            } else {
              stackIn_2_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("cg.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_11_0 != 0;
          }
        }
    }

    final static void f(int param0) {
        int var1_int = 0;
        int[] var2 = null;
        int var3 = 0;
        vg var4_ref_vg = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        double var10 = 0.0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        int var19 = 0;
        int[] var20 = null;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        vg var17 = null;
        int var18 = 0;
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            an.field_e = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
            var1_int = oo.field_u.length;
            var21 = new int[var1_int];
            var20 = var21;
            var2 = var20;
            var3 = 0;
            L1: while (true) {
              if (var1_int <= var3) {
                L2: {
                  var3 = an.field_e[9] >> 351390088;
                  var4 = an.field_e[10] >> 1217747432;
                  var5 = an.field_e[11] >> 605730280;
                  var6 = gi.field_a << 2144533828;
                  var7 = 0;
                  var8 = of.a(param0 + -252566934, var6) >> 1983485064;
                  var9 = j.a(var6, -108) >> -381690808;
                  if (an.field_g == -1) {
                    break L2;
                  } else {
                    if (0 == (me.field_I ^ -1)) {
                      break L2;
                    } else {
                      var7 = -320 + an.field_g;
                      var9 = -128;
                      var8 = 240 + -me.field_I;
                      break L2;
                    }
                  }
                }
                L3: {
                  var10 = 256.0 / Math.sqrt((double)(var8 * var8 + (var7 * var7 + var9 * var9)));
                  var9 = (int)((double)var9 * var10);
                  var8 = (int)((double)var8 * var10);
                  var7 = (int)((double)var7 * var10);
                  var12 = -var3 + var7;
                  var13 = -var4 + var8;
                  var14 = -var5 + var9;
                  if (param0 == 252566882) {
                    break L3;
                  } else {
                    cg.e(false);
                    break L3;
                  }
                }
                var10 = 256.0 / Math.sqrt((double)(var14 * var14 + var12 * var12 - -(var13 * var13)));
                var13 = (int)((double)var13 * var10);
                var14 = (int)((double)var14 * var10);
                var12 = (int)((double)var12 * var10);
                var15 = 0;
                L4: while (true) {
                  if (oo.field_u.length <= var15) {
                    break L0;
                  } else {
                    var16 = 0;
                    var17_int = 1;
                    L5: while (true) {
                      if (oo.field_u.length <= var17_int) {
                        var21[var16] = -2147483648;
                        var17 = oo.field_u[var16];
                        sc.b(var16, param0 ^ 252570192);
                        var18 = 0;
                        L6: while (true) {
                          if ((var18 ^ -1) <= -4) {
                            to.a((byte) -61, an.field_e, tn.field_Gb, true, var17, false, false);
                            cj.a(var8, var13, var12, 20133, var17, var9, var7, var14);
                            var15++;
                            continue L4;
                          } else {
                            tn.field_Gb[var18] = tn.field_Gb[var18] + gn.field_g[var15][var18];
                            var18++;
                            continue L6;
                          }
                        }
                      } else {
                        if (var21[var17_int] > var21[var16]) {
                          var16 = var17_int;
                          var17_int++;
                          continue L5;
                        } else {
                          var17_int++;
                          continue L5;
                        }
                      }
                    }
                  }
                }
              } else {
                var4_ref_vg = oo.field_u[var3];
                var4_ref_vg.b((byte) 62);
                sc.b(var3, 14130);
                var5 = var4_ref_vg.field_k + var4_ref_vg.field_i >> 183874081;
                var6 = var4_ref_vg.field_v + var4_ref_vg.field_R >> -609165919;
                var7 = var4_ref_vg.field_N + var4_ref_vg.field_P >> 1067775105;
                var8 = an.field_e[9] >> -921206142;
                var9 = an.field_e[10] >> 95407906;
                var10_int = an.field_e[11] >> 252566882;
                var11 = var9 * tn.field_Gb[4] + (var8 * tn.field_Gb[3] + tn.field_Gb[5] * var10_int) >> -1159767634;
                var12 = var10_int * tn.field_Gb[8] + tn.field_Gb[6] * var8 - -(tn.field_Gb[7] * var9) >> -1623403634;
                var13 = var10_int * tn.field_Gb[11] + var8 * tn.field_Gb[9] + tn.field_Gb[10] * var9 >> -1892105426;
                var2[var3] = var13 * var7 + (var6 * var12 + var11 * var5) >> 1435692816;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "cg.A(" + param0 + ')');
        }
    }

    public static void e(boolean param0) {
        field_Rb = null;
        if (!param0) {
            return;
        }
        field_Wb = null;
        field_Ib = null;
    }

    cg(String param0, String param1, long param2) {
        super(0L, (kc) null);
        CharSequence var6 = null;
        try {
            this.field_Nb = param2;
            this.field_Qb = param1;
            this.field_Tb = param0;
            var6 = (CharSequence) ((Object) this.field_Tb);
            gk.a(var6, -13);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "cg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean a(byte param0, cg param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_5_0 = false;
        int stackIn_11_0 = 0;
        int stackIn_14_1 = 0;
        boolean stackIn_16_0 = false;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1.field_Kb) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            if (stackIn_3_0 != (this.field_Kb ? 1 : 0)) {
              L2: {
                if (param0 == 121) {
                  break L2;
                } else {
                  this.field_Sb = 21;
                  break L2;
                }
              }
              L3: {
                if (this.field_Db) {
                  stackIn_11_0 = 0;
                  break L3;
                } else {
                  stackIn_11_0 = 1;
                  break L3;
                }
              }
              L4: {


                if (param1.field_Db) {

                  stackIn_14_1 = 0;
                  break L4;
                } else {

                  stackIn_14_1 = 1;
                  break L4;
                }
              }
              if (stackIn_11_0 == stackIn_14_1) {
                L5: {
                  if ((this.field_Ob ^ -1L) <= (param1.field_Ob ^ -1L)) {
                    stackIn_20_0 = 0;
                    break L5;
                  } else {
                    stackIn_20_0 = 1;
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_16_0 = this.field_Db;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_5_0 = this.field_Kb;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var3);

            stackIn_23_1 = new StringBuilder().append("cg.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            return stackIn_20_0 != 0;
          }
        }
    }

    final static qb a(String param0, byte param1, eg param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        qb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 >= 102) {
                break L1;
              } else {
                field_Lb = 88;
                break L1;
              }
            }
            var4_int = param2.c(param3, -79);
            var5 = param2.a(param0, (byte) 54, var4_int);
            stackIn_3_0 = hj.a(var4_int, param2, var5, (byte) -10);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("cg.E(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final boolean e(int param0) {
        if (param0 != 183874081) {
            String var3 = (String) null;
            this.a((String) null, (String) null, 2);
        }
        return !this.d((byte) -17) ? true : false;
    }

    static {
        field_Rb = "You have not yet unlocked this option for use.";
        field_Wb = new eh();
    }
}
