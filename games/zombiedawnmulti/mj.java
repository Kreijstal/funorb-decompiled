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
          this.b(param2, param1, param3, 126);
          return;
        }
    }

    private final int b(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var5 = 0;
          var6 = -((mj) this).field_Lb.field_z + ((mj) this).field_Gb.field_z;
          if ((var6 ^ -1) < -1) {
            var7 = ((mj) this).field_Lb.field_Q;
            var8 = param0 - param2;
            var5 = (var6 / 2 + var8 * var7) / var6;
            break L0;
          } else {
            break L0;
          }
        }
        if (!param1) {
          L1: {
            if (param0 + -param2 >= var5) {
              break L1;
            } else {
              var5 = param0 - param2;
              break L1;
            }
          }
          if (0 > var5) {
            var5 = 0;
            if (param3 != -10596) {
              return -51;
            } else {
              return var5;
            }
          } else {
            if (param3 != -10596) {
              return -51;
            } else {
              return var5;
            }
          }
        } else {
          L2: {
            if ((var5 ^ -1) <= -1) {
              break L2;
            } else {
              var5 = 0;
              break L2;
            }
          }
          if (var5 > -param2 + param0) {
            var5 = param0 - param2;
            if (param3 != -10596) {
              return -51;
            } else {
              return var5;
            }
          } else {
            if (param3 != -10596) {
              return -51;
            } else {
              return var5;
            }
          }
        }
    }

    final boolean k(int param0) {
        if (0 == ((mj) this).field_Tb.field_T) {
          if (param0 == 20) {
            if (-1 != (((mj) this).field_Tb.field_jb ^ -1)) {
              if ((((mj) this).field_Kb ^ -1) >= -1) {
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

    public static void i(int param0) {
        field_Fb = null;
        field_Ob = null;
        field_Mb = null;
        field_Hb = null;
        field_Ib = null;
        field_Sb = null;
        if (param0 != 22767) {
            field_Hb = null;
        }
    }

    final boolean h(int param0) {
        if (((mj) this).field_Nb.field_T != 0) {
          ((mj) this).field_Kb = 20;
          return true;
        } else {
          if (param0 == 4690) {
            if (((mj) this).field_Nb.field_jb != -1) {
              if (0 >= ((mj) this).field_Kb) {
                if (-1 != (((mj) this).field_Kb ^ -1)) {
                  return false;
                } else {
                  ((mj) this).field_Kb = 3;
                  return true;
                }
              } else {
                ((mj) this).field_Kb = ((mj) this).field_Kb - 1;
                if (-1 == ((mj) this).field_Kb) {
                  ((mj) this).field_Kb = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            int discarded$1 = ((mj) this).a(14, 117, 55);
            if (((mj) this).field_Nb.field_jb != -1) {
              if (0 < ((mj) this).field_Kb) {
                ((mj) this).field_Kb = ((mj) this).field_Kb - 1;
                if (-1 != (((mj) this).field_Kb ^ -1)) {
                  return false;
                } else {
                  ((mj) this).field_Kb = 3;
                  return true;
                }
              } else {
                if (-1 != ((mj) this).field_Kb) {
                  return false;
                } else {
                  ((mj) this).field_Kb = 3;
                  return true;
                }
              }
            } else {
              return false;
            }
          }
        }
    }

    final int a(int param0, int param1, int param2) {
        if (param2 == -18367) {
          if (((mj) this).field_Jb) {
            return this.b(param0, false, param1, -10596);
          } else {
            return this.a(param0, false, 69, param1);
          }
        } else {
          boolean discarded$6 = ((mj) this).k(33);
          if (((mj) this).field_Jb) {
            return this.b(param0, false, param1, -10596);
          } else {
            return this.a(param0, false, 69, param1);
          }
        }
    }

    final boolean c(byte param0) {
        if (((mj) this).field_Qb.field_T == 0) {
          if (param0 <= -64) {
            if (((mj) this).field_Qb.field_jb != 0) {
              if ((((mj) this).field_Kb ^ -1) >= -1) {
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

    private final void b(int param0, int param1, int param2, int param3) {
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
        cj stackIn_12_0 = null;
        cj stackIn_12_1 = null;
        cj stackIn_12_2 = null;
        cj stackIn_13_0 = null;
        cj stackIn_13_1 = null;
        cj stackIn_13_2 = null;
        cj stackIn_14_0 = null;
        cj stackIn_14_1 = null;
        cj stackIn_14_2 = null;
        int stackIn_14_3 = 0;
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
        cj stackIn_26_0 = null;
        cj stackIn_26_1 = null;
        cj stackIn_26_2 = null;
        cj stackIn_27_0 = null;
        cj stackIn_27_1 = null;
        cj stackIn_27_2 = null;
        cj stackIn_28_0 = null;
        cj stackIn_28_1 = null;
        cj stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        cj stackIn_33_0 = null;
        cj stackIn_33_1 = null;
        cj stackIn_33_2 = null;
        cj stackIn_34_0 = null;
        cj stackIn_34_1 = null;
        cj stackIn_34_2 = null;
        cj stackIn_35_0 = null;
        cj stackIn_35_1 = null;
        cj stackIn_35_2 = null;
        int stackIn_35_3 = 0;
        cj stackIn_37_0 = null;
        cj stackIn_37_1 = null;
        cj stackIn_37_2 = null;
        cj stackIn_38_0 = null;
        cj stackIn_38_1 = null;
        cj stackIn_38_2 = null;
        cj stackIn_39_0 = null;
        cj stackIn_39_1 = null;
        cj stackIn_39_2 = null;
        int stackIn_39_3 = 0;
        cj stackOut_36_0 = null;
        cj stackOut_36_1 = null;
        cj stackOut_36_2 = null;
        cj stackOut_38_0 = null;
        cj stackOut_38_1 = null;
        cj stackOut_38_2 = null;
        int stackOut_38_3 = 0;
        cj stackOut_37_0 = null;
        cj stackOut_37_1 = null;
        cj stackOut_37_2 = null;
        int stackOut_37_3 = 0;
        cj stackOut_32_0 = null;
        cj stackOut_32_1 = null;
        cj stackOut_32_2 = null;
        cj stackOut_34_0 = null;
        cj stackOut_34_1 = null;
        cj stackOut_34_2 = null;
        int stackOut_34_3 = 0;
        cj stackOut_33_0 = null;
        cj stackOut_33_1 = null;
        cj stackOut_33_2 = null;
        int stackOut_33_3 = 0;
        cj stackOut_25_0 = null;
        cj stackOut_25_1 = null;
        cj stackOut_25_2 = null;
        cj stackOut_27_0 = null;
        cj stackOut_27_1 = null;
        cj stackOut_27_2 = null;
        int stackOut_27_3 = 0;
        cj stackOut_26_0 = null;
        cj stackOut_26_1 = null;
        cj stackOut_26_2 = null;
        int stackOut_26_3 = 0;
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
        cj stackOut_11_0 = null;
        cj stackOut_11_1 = null;
        cj stackOut_11_2 = null;
        cj stackOut_13_0 = null;
        cj stackOut_13_1 = null;
        cj stackOut_13_2 = null;
        int stackOut_13_3 = 0;
        cj stackOut_12_0 = null;
        cj stackOut_12_1 = null;
        cj stackOut_12_2 = null;
        int stackOut_12_3 = 0;
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
              if ((var9 ^ -1) >= -1) {
                break L2;
              } else {
                var11 = (param2 * var10 + var9 / 2) / var9;
                break L2;
              }
            }
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
            if (param3 > 120) {
              L3: {
                var19 = ((mj) this).field_Qb;
                var19.field_Q = 0;
                var19.field_x = var12;
                var19.field_zb = var7 + -var12;
                var19.field_z = ((mj) this).field_z;
                var20 = ((mj) this).field_Lb;
                var20.field_z = ((mj) this).field_z;
                stackOut_36_0 = ((mj) this).field_Tb;
                stackOut_36_1 = ((mj) this).field_Nb;
                stackOut_36_2 = ((mj) this).field_Gb;
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_38_2 = stackOut_36_2;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                stackIn_37_2 = stackOut_36_2;
                if (param1 >= param0) {
                  stackOut_38_0 = (cj) (Object) stackIn_38_0;
                  stackOut_38_1 = (cj) (Object) stackIn_38_1;
                  stackOut_38_2 = (cj) (Object) stackIn_38_2;
                  stackOut_38_3 = 0;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  stackIn_39_3 = stackOut_38_3;
                  break L3;
                } else {
                  stackOut_37_0 = (cj) (Object) stackIn_37_0;
                  stackOut_37_1 = (cj) (Object) stackIn_37_1;
                  stackOut_37_2 = (cj) (Object) stackIn_37_2;
                  stackOut_37_3 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  stackIn_39_3 = stackOut_37_3;
                  break L3;
                }
              }
              stackIn_39_2.field_Z = stackIn_39_3 != 0;
              stackIn_39_1.field_Z = stackIn_39_3 != 0;
              stackIn_39_0.field_Z = stackIn_39_3 != 0;
              var20.field_x = var11;
              var20.field_zb = var8;
              var20.field_Q = 0;
              return;
            } else {
              L4: {
                ((mj) this).field_Jb = false;
                var19 = ((mj) this).field_Qb;
                var19.field_Q = 0;
                var19.field_x = var12;
                var19.field_zb = var7 + -var12;
                var19.field_z = ((mj) this).field_z;
                var20 = ((mj) this).field_Lb;
                var20.field_z = ((mj) this).field_z;
                stackOut_32_0 = ((mj) this).field_Tb;
                stackOut_32_1 = ((mj) this).field_Nb;
                stackOut_32_2 = ((mj) this).field_Gb;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_34_2 = stackOut_32_2;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                stackIn_33_2 = stackOut_32_2;
                if (param1 >= param0) {
                  stackOut_34_0 = (cj) (Object) stackIn_34_0;
                  stackOut_34_1 = (cj) (Object) stackIn_34_1;
                  stackOut_34_2 = (cj) (Object) stackIn_34_2;
                  stackOut_34_3 = 0;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  stackIn_35_2 = stackOut_34_2;
                  stackIn_35_3 = stackOut_34_3;
                  break L4;
                } else {
                  stackOut_33_0 = (cj) (Object) stackIn_33_0;
                  stackOut_33_1 = (cj) (Object) stackIn_33_1;
                  stackOut_33_2 = (cj) (Object) stackIn_33_2;
                  stackOut_33_3 = 1;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  stackIn_35_3 = stackOut_33_3;
                  break L4;
                }
              }
              stackIn_35_2.field_Z = stackIn_35_3 != 0;
              stackIn_35_1.field_Z = stackIn_35_3 != 0;
              stackIn_35_0.field_Z = stackIn_35_3 != 0;
              var20.field_x = var11;
              var20.field_zb = var8;
              var20.field_Q = 0;
              return;
            }
          } else {
            L5: {
              var9 = param0 + -param1;
              var10 = -var8 + var7;
              var11 = 0;
              if ((var9 ^ -1) >= -1) {
                break L5;
              } else {
                var11 = (param2 * var10 + var9 / 2) / var9;
                break L5;
              }
            }
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
            if (param3 <= 120) {
              L6: {
                ((mj) this).field_Jb = false;
                var19 = ((mj) this).field_Qb;
                var19.field_Q = 0;
                var19.field_x = var12;
                var19.field_zb = var7 + -var12;
                var19.field_z = ((mj) this).field_z;
                var20 = ((mj) this).field_Lb;
                var20.field_z = ((mj) this).field_z;
                stackOut_25_0 = ((mj) this).field_Tb;
                stackOut_25_1 = ((mj) this).field_Nb;
                stackOut_25_2 = ((mj) this).field_Gb;
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_27_2 = stackOut_25_2;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                stackIn_26_2 = stackOut_25_2;
                if (param1 >= param0) {
                  stackOut_27_0 = (cj) (Object) stackIn_27_0;
                  stackOut_27_1 = (cj) (Object) stackIn_27_1;
                  stackOut_27_2 = (cj) (Object) stackIn_27_2;
                  stackOut_27_3 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  stackIn_28_2 = stackOut_27_2;
                  stackIn_28_3 = stackOut_27_3;
                  break L6;
                } else {
                  stackOut_26_0 = (cj) (Object) stackIn_26_0;
                  stackOut_26_1 = (cj) (Object) stackIn_26_1;
                  stackOut_26_2 = (cj) (Object) stackIn_26_2;
                  stackOut_26_3 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  stackIn_28_3 = stackOut_26_3;
                  break L6;
                }
              }
              stackIn_28_2.field_Z = stackIn_28_3 != 0;
              stackIn_28_1.field_Z = stackIn_28_3 != 0;
              stackIn_28_0.field_Z = stackIn_28_3 != 0;
              var20.field_x = var11;
              var20.field_zb = var8;
              var20.field_Q = 0;
              return;
            } else {
              L7: {
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
                  break L7;
                } else {
                  stackOut_22_0 = (cj) (Object) stackIn_22_0;
                  stackOut_22_1 = (cj) (Object) stackIn_22_1;
                  stackOut_22_2 = (cj) (Object) stackIn_22_2;
                  stackOut_22_3 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  stackIn_24_3 = stackOut_22_3;
                  break L7;
                }
              }
              stackIn_24_2.field_Z = stackIn_24_3 != 0;
              stackIn_24_1.field_Z = stackIn_24_3 != 0;
              stackIn_24_0.field_Z = stackIn_24_3 != 0;
              var20.field_x = var11;
              var20.field_zb = var8;
              var20.field_Q = 0;
              return;
            }
          }
        } else {
          L8: {
            var7 = 0;
            var9 = param0 + -param1;
            var10 = -var8 + var7;
            var11 = 0;
            if ((var9 ^ -1) >= -1) {
              break L8;
            } else {
              var11 = (param2 * var10 + var9 / 2) / var9;
              break L8;
            }
          }
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
          if (param3 > 120) {
            L9: {
              var19 = ((mj) this).field_Qb;
              var19.field_Q = 0;
              var19.field_x = var12;
              var19.field_zb = var7 + -var12;
              var19.field_z = ((mj) this).field_z;
              var20 = ((mj) this).field_Lb;
              var20.field_z = ((mj) this).field_z;
              stackOut_11_0 = ((mj) this).field_Tb;
              stackOut_11_1 = ((mj) this).field_Nb;
              stackOut_11_2 = ((mj) this).field_Gb;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              if (param1 >= param0) {
                stackOut_13_0 = (cj) (Object) stackIn_13_0;
                stackOut_13_1 = (cj) (Object) stackIn_13_1;
                stackOut_13_2 = (cj) (Object) stackIn_13_2;
                stackOut_13_3 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                stackIn_14_3 = stackOut_13_3;
                break L9;
              } else {
                stackOut_12_0 = (cj) (Object) stackIn_12_0;
                stackOut_12_1 = (cj) (Object) stackIn_12_1;
                stackOut_12_2 = (cj) (Object) stackIn_12_2;
                stackOut_12_3 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_14_3 = stackOut_12_3;
                break L9;
              }
            }
            stackIn_14_2.field_Z = stackIn_14_3 != 0;
            stackIn_14_1.field_Z = stackIn_14_3 != 0;
            stackIn_14_0.field_Z = stackIn_14_3 != 0;
            var20.field_x = var11;
            var20.field_zb = var8;
            var20.field_Q = 0;
            return;
          } else {
            L10: {
              ((mj) this).field_Jb = false;
              var19 = ((mj) this).field_Qb;
              var19.field_Q = 0;
              var19.field_x = var12;
              var19.field_zb = var7 + -var12;
              var19.field_z = ((mj) this).field_z;
              var20 = ((mj) this).field_Lb;
              var20.field_z = ((mj) this).field_z;
              stackOut_7_0 = ((mj) this).field_Tb;
              stackOut_7_1 = ((mj) this).field_Nb;
              stackOut_7_2 = ((mj) this).field_Gb;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              if (param1 >= param0) {
                stackOut_9_0 = (cj) (Object) stackIn_9_0;
                stackOut_9_1 = (cj) (Object) stackIn_9_1;
                stackOut_9_2 = (cj) (Object) stackIn_9_2;
                stackOut_9_3 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                break L10;
              } else {
                stackOut_8_0 = (cj) (Object) stackIn_8_0;
                stackOut_8_1 = (cj) (Object) stackIn_8_1;
                stackOut_8_2 = (cj) (Object) stackIn_8_2;
                stackOut_8_3 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                break L10;
              }
            }
            stackIn_10_2.field_Z = stackIn_10_3 != 0;
            stackIn_10_1.field_Z = stackIn_10_3 != 0;
            stackIn_10_0.field_Z = stackIn_10_3 != 0;
            var20.field_x = var11;
            var20.field_zb = var8;
            var20.field_Q = 0;
            return;
          }
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
            if (param0 < var9) {
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
            if (param0 < var9) {
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
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var5 = 0;
          var6 = ((mj) this).field_Gb.field_zb + -((mj) this).field_Lb.field_zb;
          var7 = -86 % ((18 - param2) / 38);
          if ((var6 ^ -1) >= -1) {
            break L0;
          } else {
            var8 = ((mj) this).field_Lb.field_x;
            var9 = param0 + -param3;
            var5 = (var6 / 2 + var9 * var8) / var6;
            break L0;
          }
        }
        if (param1) {
          L1: {
            if ((var5 ^ -1) > -1) {
              var5 = 0;
              break L1;
            } else {
              break L1;
            }
          }
          if (var5 <= param0 - param3) {
            return var5;
          } else {
            var5 = -param3 + param0;
            return var5;
          }
        } else {
          L2: {
            if (var5 > -param3 + param0) {
              var5 = -param3 + param0;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if ((var5 ^ -1) <= -1) {
              break L3;
            } else {
              var5 = 0;
              break L3;
            }
          }
          return var5;
        }
    }

    mj(long param0, cj param1, ja param2, ja param3, cj param4, cj param5, boolean param6) {
        this(param0, param1, param1, param4, param5, param6);
        ((mj) this).field_Tb.field_rb = param2;
        ((mj) this).field_Nb.field_rb = param3;
    }

    final boolean j(int param0) {
        if (param0 >= 53) {
          if (((mj) this).field_Pb.field_T == 0) {
            if (0 != ((mj) this).field_Pb.field_jb) {
              if ((((mj) this).field_Kb ^ -1) >= -1) {
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
              if ((((mj) this).field_Kb ^ -1) < -1) {
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
        ((mj) this).field_Jb = param5 ? true : false;
        ((mj) this).field_Tb = new cj(0L, param1);
        ((mj) this).field_Nb = new cj(0L, param2);
        ((mj) this).a((byte) 50, ((mj) this).field_Tb);
        ((mj) this).a((byte) 50, ((mj) this).field_Nb);
        ((mj) this).field_Gb = new cj(0L, (cj) null);
        ((mj) this).a((byte) 50, ((mj) this).field_Gb);
        ((mj) this).field_Pb = new cj(0L, param3);
        ((mj) this).field_Qb = new cj(0L, param3);
        cj var10 = ((mj) this).field_Pb;
        cj var11 = var10;
        ((mj) this).field_Qb.field_ib = true;
        var11.field_ib = true;
        ((mj) this).field_Gb.a((byte) 50, ((mj) this).field_Pb);
        ((mj) this).field_Gb.a((byte) 50, ((mj) this).field_Qb);
        ((mj) this).field_Lb = new cj(0L, param4);
        ((mj) this).field_Lb.field_fb = true;
        ((mj) this).field_Gb.a((byte) 50, ((mj) this).field_Lb);
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
