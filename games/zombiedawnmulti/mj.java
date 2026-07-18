/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends cj {
    private cj field_Gb;
    static boolean field_Rb;
    private int field_Kb;
    static String field_Ob;
    static String field_Sb;
    private cj field_Pb;
    private cj field_Tb;
    static int[] field_Fb;
    static nc[] field_Hb;
    static ld field_Ib;
    private cj field_Nb;
    private cj field_Qb;
    static int field_Ub;
    private boolean field_Jb;
    static cj field_Mb;
    private cj field_Lb;

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        var5 = 23 % ((-22 - param0) / 57);
        if (((mj) this).field_Jb) {
          this.c(0, param1, param3, param2);
          return;
        } else {
          int discarded$2 = 126;
          this.b(param2, param1, param3);
          return;
        }
    }

    private final int b(int param0, boolean param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var6 = -((mj) this).field_Lb.field_z + ((mj) this).field_Gb.field_z;
        if (!(var6 <= 0)) {
            var7 = ((mj) this).field_Lb.field_Q;
            var8 = param0 - param2;
            var5 = (var6 / 2 + var8 * var7) / var6;
        }
        if (param0 + -param2 < var5) {
            var5 = param0 - param2;
        }
        if (!(0 <= var5)) {
            var5 = 0;
        }
        return var5;
    }

    final boolean k(int param0) {
        if (0 == ((mj) this).field_Tb.field_T) {
          if (param0 == 20) {
            if (((mj) this).field_Tb.field_jb != 0) {
              if (((mj) this).field_Kb <= 0) {
                if (((mj) this).field_Kb != 0) {
                  return false;
                } else {
                  ((mj) this).field_Kb = 3;
                  return true;
                }
              } else {
                ((mj) this).field_Kb = ((mj) this).field_Kb - 1;
                if (((mj) this).field_Kb != 0) {
                  return false;
                } else {
                  ((mj) this).field_Kb = 3;
                  return true;
                }
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          ((mj) this).field_Kb = 20;
          return true;
        }
    }

    public static void i() {
        field_Fb = null;
        field_Ob = null;
        field_Mb = null;
        field_Hb = null;
        field_Ib = null;
        field_Sb = null;
    }

    final boolean h(int param0) {
        if (!(((mj) this).field_Nb.field_T == 0)) {
            ((mj) this).field_Kb = 20;
            return true;
        }
        if (param0 != 4690) {
            int discarded$6 = ((mj) this).a(14, 117, 55);
            if (((mj) this).field_Nb.field_jb == 0) {
                return false;
            }
            if (0 >= ((mj) this).field_Kb) {
                if (((mj) this).field_Kb != 0) {
                    return false;
                }
                ((mj) this).field_Kb = 3;
                return true;
            }
            ((mj) this).field_Kb = ((mj) this).field_Kb - 1;
            if (((mj) this).field_Kb != 0) {
                return false;
            }
            ((mj) this).field_Kb = 3;
            return true;
        }
        if (((mj) this).field_Nb.field_jb == 0) {
            return false;
        }
        if (0 < ((mj) this).field_Kb) {
            ((mj) this).field_Kb = ((mj) this).field_Kb - 1;
            if (!(((mj) this).field_Kb != 0)) {
                ((mj) this).field_Kb = 3;
                return true;
            }
            return false;
        }
        if (((mj) this).field_Kb != 0) {
            return false;
        }
        ((mj) this).field_Kb = 3;
        return true;
    }

    final int a(int param0, int param1, int param2) {
        if (param2 == -18367) {
          if (((mj) this).field_Jb) {
            int discarded$10 = -10596;
            return this.b(param0, false, param1);
          } else {
            return this.a(param0, false, 69, param1);
          }
        } else {
          boolean discarded$11 = ((mj) this).k(33);
          if (((mj) this).field_Jb) {
            int discarded$12 = -10596;
            return this.b(param0, false, param1);
          } else {
            return this.a(param0, false, 69, param1);
          }
        }
    }

    final boolean c(byte param0) {
        if (((mj) this).field_Qb.field_T == 0) {
          if (param0 <= -64) {
            if (((mj) this).field_Qb.field_jb != 0) {
              if (((mj) this).field_Kb <= 0) {
                if (0 == ((mj) this).field_Kb) {
                  if (((mj) this).field_Lb.field_mb + ((mj) this).field_Lb.field_qb + (((mj) this).field_Lb.field_z + ((mj) this).field_Lb.field_I) > bo.field_d) {
                    return false;
                  } else {
                    ((mj) this).field_Kb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                ((mj) this).field_Kb = ((mj) this).field_Kb - 1;
                if (0 == ((mj) this).field_Kb) {
                  if (((mj) this).field_Lb.field_mb + ((mj) this).field_Lb.field_qb + (((mj) this).field_Lb.field_z + ((mj) this).field_Lb.field_I) <= bo.field_d) {
                    ((mj) this).field_Kb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          ((mj) this).field_Kb = 20;
          return true;
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        cj var15 = null;
        cj var16 = null;
        cj var17 = null;
        cj var18 = null;
        cj var19 = null;
        cj var20 = null;
        cj stackIn_7_0 = null;
        cj stackIn_7_1 = null;
        cj stackIn_7_2 = null;
        cj stackIn_8_0 = null;
        cj stackIn_8_1 = null;
        cj stackIn_8_2 = null;
        cj stackIn_9_0 = null;
        cj stackIn_9_1 = null;
        cj stackIn_9_2 = null;
        int stackIn_9_3 = 0;
        cj stackIn_16_0 = null;
        cj stackIn_16_1 = null;
        cj stackIn_16_2 = null;
        cj stackIn_17_0 = null;
        cj stackIn_17_1 = null;
        cj stackIn_17_2 = null;
        cj stackIn_18_0 = null;
        cj stackIn_18_1 = null;
        cj stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        cj stackIn_22_0 = null;
        cj stackIn_22_1 = null;
        cj stackIn_22_2 = null;
        cj stackIn_23_0 = null;
        cj stackIn_23_1 = null;
        cj stackIn_23_2 = null;
        cj stackIn_24_0 = null;
        cj stackIn_24_1 = null;
        cj stackIn_24_2 = null;
        int stackIn_24_3 = 0;
        cj stackOut_21_0 = null;
        cj stackOut_21_1 = null;
        cj stackOut_21_2 = null;
        cj stackOut_23_0 = null;
        cj stackOut_23_1 = null;
        cj stackOut_23_2 = null;
        int stackOut_23_3 = 0;
        cj stackOut_22_0 = null;
        cj stackOut_22_1 = null;
        cj stackOut_22_2 = null;
        int stackOut_22_3 = 0;
        cj stackOut_15_0 = null;
        cj stackOut_15_1 = null;
        cj stackOut_15_2 = null;
        cj stackOut_17_0 = null;
        cj stackOut_17_1 = null;
        cj stackOut_17_2 = null;
        int stackOut_17_3 = 0;
        cj stackOut_16_0 = null;
        cj stackOut_16_1 = null;
        cj stackOut_16_2 = null;
        int stackOut_16_3 = 0;
        cj stackOut_6_0 = null;
        cj stackOut_6_1 = null;
        cj stackOut_6_2 = null;
        cj stackOut_8_0 = null;
        cj stackOut_8_1 = null;
        cj stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        cj stackOut_7_0 = null;
        cj stackOut_7_1 = null;
        cj stackOut_7_2 = null;
        int stackOut_7_3 = 0;
        L0: {
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          if (((mj) this).field_zb < 2 * ((mj) this).field_z) {
            var6 = ((mj) this).field_zb / 2;
            var5 = ((mj) this).field_zb / 2;
            break L0;
          } else {
            var6 = ((mj) this).field_zb + -((mj) this).field_z;
            var5 = ((mj) this).field_z;
            break L0;
          }
        }
        var7 = var6 - var5;
        var8 = var7;
        if (param1 < param0) {
          L1: {
            var8 = var8 * param1 / param0;
            if (((mj) this).field_z <= var8) {
              break L1;
            } else {
              var8 = ((mj) this).field_z;
              break L1;
            }
          }
          if (var8 > var7) {
            L2: {
              var8 = var7;
              var9 = param0 + -param1;
              var10 = -var8 + var7;
              var11 = 0;
              if (var9 <= 0) {
                break L2;
              } else {
                var11 = (param2 * var10 + var9 / 2) / var9;
                break L2;
              }
            }
            L3: {
              var12 = var8 / 2 + var11;
              var15 = ((mj) this).field_Tb;
              var15.field_Q = 0;
              var15.field_zb = var5;
              var15.field_z = ((mj) this).field_z;
              var15.field_x = 0;
              var16 = ((mj) this).field_Nb;
              var16.field_Q = 0;
              var16.field_z = ((mj) this).field_z;
              var16.field_zb = ((mj) this).field_zb - var6;
              var16.field_x = var6;
              var17 = ((mj) this).field_Gb;
              var17.field_z = ((mj) this).field_z;
              var17.field_zb = var7;
              var17.field_x = var5;
              var17.field_Q = 0;
              var18 = ((mj) this).field_Pb;
              var18.field_zb = var12;
              var18.field_x = 0;
              var18.field_Q = 0;
              var18.field_z = ((mj) this).field_z;
              var19 = ((mj) this).field_Qb;
              var19.field_Q = 0;
              var19.field_x = var12;
              var19.field_zb = var7 + -var12;
              var19.field_z = ((mj) this).field_z;
              var20 = ((mj) this).field_Lb;
              var20.field_z = ((mj) this).field_z;
              stackOut_21_0 = ((mj) this).field_Tb;
              stackOut_21_1 = ((mj) this).field_Nb;
              stackOut_21_2 = ((mj) this).field_Gb;
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              if (param1 >= param0) {
                stackOut_23_0 = (cj) (Object) stackIn_23_0;
                stackOut_23_1 = (cj) (Object) stackIn_23_1;
                stackOut_23_2 = (cj) (Object) stackIn_23_2;
                stackOut_23_3 = 0;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                stackIn_24_2 = stackOut_23_2;
                stackIn_24_3 = stackOut_23_3;
                break L3;
              } else {
                stackOut_22_0 = (cj) (Object) stackIn_22_0;
                stackOut_22_1 = (cj) (Object) stackIn_22_1;
                stackOut_22_2 = (cj) (Object) stackIn_22_2;
                stackOut_22_3 = 1;
                stackIn_24_0 = stackOut_22_0;
                stackIn_24_1 = stackOut_22_1;
                stackIn_24_2 = stackOut_22_2;
                stackIn_24_3 = stackOut_22_3;
                break L3;
              }
            }
            stackIn_24_2.field_Z = stackIn_24_3 != 0;
            stackIn_24_1.field_Z = stackIn_24_3 != 0;
            stackIn_24_0.field_Z = stackIn_24_3 != 0;
            var20.field_x = var11;
            var20.field_zb = var8;
            var20.field_Q = 0;
            return;
          } else {
            L4: {
              var9 = param0 + -param1;
              var10 = -var8 + var7;
              var11 = 0;
              if (var9 <= 0) {
                break L4;
              } else {
                var11 = (param2 * var10 + var9 / 2) / var9;
                break L4;
              }
            }
            L5: {
              var12 = var8 / 2 + var11;
              var15 = ((mj) this).field_Tb;
              var15.field_Q = 0;
              var15.field_zb = var5;
              var15.field_z = ((mj) this).field_z;
              var15.field_x = 0;
              var16 = ((mj) this).field_Nb;
              var16.field_Q = 0;
              var16.field_z = ((mj) this).field_z;
              var16.field_zb = ((mj) this).field_zb - var6;
              var16.field_x = var6;
              var17 = ((mj) this).field_Gb;
              var17.field_z = ((mj) this).field_z;
              var17.field_zb = var7;
              var17.field_x = var5;
              var17.field_Q = 0;
              var18 = ((mj) this).field_Pb;
              var18.field_zb = var12;
              var18.field_x = 0;
              var18.field_Q = 0;
              var18.field_z = ((mj) this).field_z;
              var19 = ((mj) this).field_Qb;
              var19.field_Q = 0;
              var19.field_x = var12;
              var19.field_zb = var7 + -var12;
              var19.field_z = ((mj) this).field_z;
              var20 = ((mj) this).field_Lb;
              var20.field_z = ((mj) this).field_z;
              stackOut_15_0 = ((mj) this).field_Tb;
              stackOut_15_1 = ((mj) this).field_Nb;
              stackOut_15_2 = ((mj) this).field_Gb;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (param1 >= param0) {
                stackOut_17_0 = (cj) (Object) stackIn_17_0;
                stackOut_17_1 = (cj) (Object) stackIn_17_1;
                stackOut_17_2 = (cj) (Object) stackIn_17_2;
                stackOut_17_3 = 0;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L5;
              } else {
                stackOut_16_0 = (cj) (Object) stackIn_16_0;
                stackOut_16_1 = (cj) (Object) stackIn_16_1;
                stackOut_16_2 = (cj) (Object) stackIn_16_2;
                stackOut_16_3 = 1;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L5;
              }
            }
            stackIn_18_2.field_Z = stackIn_18_3 != 0;
            stackIn_18_1.field_Z = stackIn_18_3 != 0;
            stackIn_18_0.field_Z = stackIn_18_3 != 0;
            var20.field_x = var11;
            var20.field_zb = var8;
            var20.field_Q = 0;
            return;
          }
        } else {
          L6: {
            var7 = 0;
            var9 = param0 + -param1;
            var10 = -var8 + var7;
            var11 = 0;
            if (var9 <= 0) {
              break L6;
            } else {
              var11 = (param2 * var10 + var9 / 2) / var9;
              break L6;
            }
          }
          L7: {
            var12 = var8 / 2 + var11;
            var15 = ((mj) this).field_Tb;
            var15.field_Q = 0;
            var15.field_zb = var5;
            var15.field_z = ((mj) this).field_z;
            var15.field_x = 0;
            var16 = ((mj) this).field_Nb;
            var16.field_Q = 0;
            var16.field_z = ((mj) this).field_z;
            var16.field_zb = ((mj) this).field_zb - var6;
            var16.field_x = var6;
            var17 = ((mj) this).field_Gb;
            var17.field_z = ((mj) this).field_z;
            var17.field_zb = var7;
            var17.field_x = var5;
            var17.field_Q = 0;
            var18 = ((mj) this).field_Pb;
            var18.field_zb = var12;
            var18.field_x = 0;
            var18.field_Q = 0;
            var18.field_z = ((mj) this).field_z;
            var19 = ((mj) this).field_Qb;
            var19.field_Q = 0;
            var19.field_x = var12;
            var19.field_zb = var7 + -var12;
            var19.field_z = ((mj) this).field_z;
            var20 = ((mj) this).field_Lb;
            var20.field_z = ((mj) this).field_z;
            stackOut_6_0 = ((mj) this).field_Tb;
            stackOut_6_1 = ((mj) this).field_Nb;
            stackOut_6_2 = ((mj) this).field_Gb;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_8_2 = stackOut_6_2;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            stackIn_7_2 = stackOut_6_2;
            if (param1 >= param0) {
              stackOut_8_0 = (cj) (Object) stackIn_8_0;
              stackOut_8_1 = (cj) (Object) stackIn_8_1;
              stackOut_8_2 = (cj) (Object) stackIn_8_2;
              stackOut_8_3 = 0;
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              stackIn_9_3 = stackOut_8_3;
              break L7;
            } else {
              stackOut_7_0 = (cj) (Object) stackIn_7_0;
              stackOut_7_1 = (cj) (Object) stackIn_7_1;
              stackOut_7_2 = (cj) (Object) stackIn_7_2;
              stackOut_7_3 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_9_3 = stackOut_7_3;
              break L7;
            }
          }
          stackIn_9_2.field_Z = stackIn_9_3 != 0;
          stackIn_9_1.field_Z = stackIn_9_3 != 0;
          stackIn_9_0.field_Z = stackIn_9_3 != 0;
          var20.field_x = var11;
          var20.field_zb = var8;
          var20.field_Q = 0;
          return;
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var14 = 0;
        cj var15 = null;
        cj var16 = null;
        cj var17 = null;
        cj var18 = null;
        cj var19 = null;
        cj var20 = null;
        cj stackIn_8_0 = null;
        cj stackIn_8_1 = null;
        cj stackIn_8_2 = null;
        cj stackIn_9_0 = null;
        cj stackIn_9_1 = null;
        cj stackIn_9_2 = null;
        cj stackIn_10_0 = null;
        cj stackIn_10_1 = null;
        cj stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        cj stackIn_20_0 = null;
        cj stackIn_20_1 = null;
        cj stackIn_20_2 = null;
        cj stackIn_21_0 = null;
        cj stackIn_21_1 = null;
        cj stackIn_21_2 = null;
        cj stackIn_22_0 = null;
        cj stackIn_22_1 = null;
        cj stackIn_22_2 = null;
        int stackIn_22_3 = 0;
        cj stackOut_19_0 = null;
        cj stackOut_19_1 = null;
        cj stackOut_19_2 = null;
        cj stackOut_21_0 = null;
        cj stackOut_21_1 = null;
        cj stackOut_21_2 = null;
        int stackOut_21_3 = 0;
        cj stackOut_20_0 = null;
        cj stackOut_20_1 = null;
        cj stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        cj stackOut_7_0 = null;
        cj stackOut_7_1 = null;
        cj stackOut_7_2 = null;
        cj stackOut_9_0 = null;
        cj stackOut_9_1 = null;
        cj stackOut_9_2 = null;
        int stackOut_9_3 = 0;
        cj stackOut_8_0 = null;
        cj stackOut_8_1 = null;
        cj stackOut_8_2 = null;
        int stackOut_8_3 = 0;
        L0: {
          var14 = ZombieDawnMulti.field_E ? 1 : 0;
          if (2 * ((mj) this).field_zb > ((mj) this).field_z) {
            var6 = ((mj) this).field_z / 2;
            var5 = ((mj) this).field_z / 2;
            break L0;
          } else {
            var5 = ((mj) this).field_zb;
            var6 = -((mj) this).field_zb + ((mj) this).field_z;
            break L0;
          }
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (param1 < param3) {
          L1: {
            var8 = var8 * param1 / param3;
            if (var8 < ((mj) this).field_zb) {
              var8 = ((mj) this).field_zb;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var7 >= var8) {
              break L2;
            } else {
              var8 = var7;
              break L2;
            }
          }
          L3: {
            var9 = -param1 + param3;
            var10 = -var8 + var7;
            var11 = 0;
            if (0 < var9) {
              var11 = (var9 / 2 + param2 * var10) / var9;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            var12 = var8 / 2 + var11;
            var15 = ((mj) this).field_Tb;
            var15.field_z = var5;
            var15.field_zb = ((mj) this).field_zb;
            var15.field_Q = 0;
            var15.field_x = 0;
            var16 = ((mj) this).field_Nb;
            var16.field_x = 0;
            var16.field_zb = ((mj) this).field_zb;
            var16.field_Q = var6;
            var16.field_z = ((mj) this).field_z - var6;
            var17 = ((mj) this).field_Gb;
            var17.field_zb = ((mj) this).field_zb;
            var17.field_z = var7;
            var17.field_x = 0;
            var17.field_Q = var5;
            var18 = ((mj) this).field_Pb;
            var18.field_x = 0;
            var18.field_z = var12;
            var18.field_Q = 0;
            var18.field_zb = ((mj) this).field_zb;
            var19 = ((mj) this).field_Qb;
            var19.field_Q = var12;
            var19.field_z = -var12 + var7;
            var19.field_x = 0;
            var19.field_zb = ((mj) this).field_zb;
            var20 = ((mj) this).field_Lb;
            var20.field_Q = var11;
            var20.field_z = var8;
            var20.field_zb = ((mj) this).field_zb;
            var20.field_x = 0;
            stackOut_19_0 = ((mj) this).field_Tb;
            stackOut_19_1 = ((mj) this).field_Nb;
            stackOut_19_2 = ((mj) this).field_Gb;
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_21_2 = stackOut_19_2;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            stackIn_20_2 = stackOut_19_2;
            if (param1 >= param3) {
              stackOut_21_0 = (cj) (Object) stackIn_21_0;
              stackOut_21_1 = (cj) (Object) stackIn_21_1;
              stackOut_21_2 = (cj) (Object) stackIn_21_2;
              stackOut_21_3 = 0;
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              stackIn_22_3 = stackOut_21_3;
              break L4;
            } else {
              stackOut_20_0 = (cj) (Object) stackIn_20_0;
              stackOut_20_1 = (cj) (Object) stackIn_20_1;
              stackOut_20_2 = (cj) (Object) stackIn_20_2;
              stackOut_20_3 = 1;
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              stackIn_22_3 = stackOut_20_3;
              break L4;
            }
          }
          stackIn_22_2.field_Z = stackIn_22_3 != 0;
          stackIn_22_1.field_Z = stackIn_22_3 != 0;
          stackIn_22_0.field_Z = stackIn_22_3 != 0;
          return;
        } else {
          L5: {
            var7 = 0;
            var9 = -param1 + param3;
            var10 = -var8 + var7;
            var11 = 0;
            if (0 < var9) {
              var11 = (var9 / 2 + param2 * var10) / var9;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            var12 = var8 / 2 + var11;
            var15 = ((mj) this).field_Tb;
            var15.field_z = var5;
            var15.field_zb = ((mj) this).field_zb;
            var15.field_Q = 0;
            var15.field_x = 0;
            var16 = ((mj) this).field_Nb;
            var16.field_x = 0;
            var16.field_zb = ((mj) this).field_zb;
            var16.field_Q = var6;
            var16.field_z = ((mj) this).field_z - var6;
            var17 = ((mj) this).field_Gb;
            var17.field_zb = ((mj) this).field_zb;
            var17.field_z = var7;
            var17.field_x = 0;
            var17.field_Q = var5;
            var18 = ((mj) this).field_Pb;
            var18.field_x = 0;
            var18.field_z = var12;
            var18.field_Q = 0;
            var18.field_zb = ((mj) this).field_zb;
            var19 = ((mj) this).field_Qb;
            var19.field_Q = var12;
            var19.field_z = -var12 + var7;
            var19.field_x = 0;
            var19.field_zb = ((mj) this).field_zb;
            var20 = ((mj) this).field_Lb;
            var20.field_Q = var11;
            var20.field_z = var8;
            var20.field_zb = ((mj) this).field_zb;
            var20.field_x = 0;
            stackOut_7_0 = ((mj) this).field_Tb;
            stackOut_7_1 = ((mj) this).field_Nb;
            stackOut_7_2 = ((mj) this).field_Gb;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            stackIn_8_2 = stackOut_7_2;
            if (param1 >= param3) {
              stackOut_9_0 = (cj) (Object) stackIn_9_0;
              stackOut_9_1 = (cj) (Object) stackIn_9_1;
              stackOut_9_2 = (cj) (Object) stackIn_9_2;
              stackOut_9_3 = 0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              stackIn_10_3 = stackOut_9_3;
              break L6;
            } else {
              stackOut_8_0 = (cj) (Object) stackIn_8_0;
              stackOut_8_1 = (cj) (Object) stackIn_8_1;
              stackOut_8_2 = (cj) (Object) stackIn_8_2;
              stackOut_8_3 = 1;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              stackIn_10_3 = stackOut_8_3;
              break L6;
            }
          }
          stackIn_10_2.field_Z = stackIn_10_3 != 0;
          stackIn_10_1.field_Z = stackIn_10_3 != 0;
          stackIn_10_0.field_Z = stackIn_10_3 != 0;
          return;
        }
    }

    private final int a(int param0, boolean param1, int param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        int var5 = 0;
        int var6 = ((mj) this).field_Gb.field_zb + -((mj) this).field_Lb.field_zb;
        int var7 = 0;
        if (var6 > 0) {
            var8 = ((mj) this).field_Lb.field_x;
            var9 = param0 + -param3;
            var5 = (var6 / 2 + var9 * var8) / var6;
        }
        if (!(var5 <= -param3 + param0)) {
            var5 = -param3 + param0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        return var5;
    }

    mj(long param0, cj param1, ja param2, ja param3, cj param4, cj param5, boolean param6) {
        this(param0, param1, param1, param4, param5, param6);
        try {
            ((mj) this).field_Tb.field_rb = param2;
            ((mj) this).field_Nb.field_rb = param3;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "mj.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final boolean j(int param0) {
        if (param0 >= 53) {
          if (((mj) this).field_Pb.field_T == 0) {
            if (0 != ((mj) this).field_Pb.field_jb) {
              if (((mj) this).field_Kb <= 0) {
                if (((mj) this).field_Kb == 0) {
                  if (bo.field_d < ((mj) this).field_Lb.field_mb + ((mj) this).field_Lb.field_qb) {
                    ((mj) this).field_Kb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                ((mj) this).field_Kb = ((mj) this).field_Kb - 1;
                if (((mj) this).field_Kb == 0) {
                  if (bo.field_d < ((mj) this).field_Lb.field_mb + ((mj) this).field_Lb.field_qb) {
                    ((mj) this).field_Kb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            ((mj) this).field_Kb = 20;
            return true;
          }
        } else {
          boolean discarded$1 = ((mj) this).j(-8);
          if (((mj) this).field_Pb.field_T == 0) {
            if (0 != ((mj) this).field_Pb.field_jb) {
              if (((mj) this).field_Kb > 0) {
                ((mj) this).field_Kb = ((mj) this).field_Kb - 1;
                if (((mj) this).field_Kb == 0) {
                  if (bo.field_d < ((mj) this).field_Lb.field_mb + ((mj) this).field_Lb.field_qb) {
                    ((mj) this).field_Kb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (((mj) this).field_Kb == 0) {
                  if (bo.field_d >= ((mj) this).field_Lb.field_mb + ((mj) this).field_Lb.field_qb) {
                    return false;
                  } else {
                    ((mj) this).field_Kb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            ((mj) this).field_Kb = 20;
            return true;
          }
        }
    }

    private mj(long param0, cj param1, cj param2, cj param3, cj param4, boolean param5) {
        super(param0, (cj) null);
        RuntimeException var8 = null;
        cj var10 = null;
        cj var11 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
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
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param5) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            ((mj) this).field_Jb = stackIn_4_1 != 0;
            ((mj) this).field_Tb = new cj(0L, param1);
            ((mj) this).field_Nb = new cj(0L, param2);
            ((mj) this).a((byte) 50, ((mj) this).field_Tb);
            ((mj) this).a((byte) 50, ((mj) this).field_Nb);
            ((mj) this).field_Gb = new cj(0L, (cj) null);
            ((mj) this).a((byte) 50, ((mj) this).field_Gb);
            ((mj) this).field_Pb = new cj(0L, param3);
            ((mj) this).field_Qb = new cj(0L, param3);
            var10 = ((mj) this).field_Pb;
            var11 = var10;
            ((mj) this).field_Qb.field_ib = true;
            var11.field_ib = true;
            ((mj) this).field_Gb.a((byte) 50, ((mj) this).field_Pb);
            ((mj) this).field_Gb.a((byte) 50, ((mj) this).field_Qb);
            ((mj) this).field_Lb = new cj(0L, param4);
            ((mj) this).field_Lb.field_fb = true;
            ((mj) this).field_Gb.a((byte) 50, ((mj) this).field_Lb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var8;
            stackOut_6_1 = new StringBuilder().append("mj.<init>(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
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
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
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
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param3 == null) {
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
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Ob = "<%0> might change the options - wait and see.";
        field_Rb = false;
        field_Hb = new nc[16];
        field_Fb = new int[4];
        field_Sb = "Select an enemy zombie!";
    }
}
