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
        int var5;
        var5 = 23 % ((-22 - param0) / 57);
        if (this.field_Jb) {
          this.c(0, param1, param3, param2);
          if (ZombieDawnMulti.field_E) {
            this.b(param2, param1, param3, 126);
            return;
          } else {
            return;
          }
        } else {
          this.b(param2, param1, param3, 126);
          return;
        }
    }

    private final int b(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var5 = 0;
          var6 = -this.field_Lb.field_z + this.field_Gb.field_z;
          if ((var6 ^ -1) < -1) {
            var7 = this.field_Lb.field_Q;
            var8 = param0 - param2;
            var5 = (var6 / 2 + var8 * var7) / var6;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          L2: {
            if (!param1) {
              break L2;
            } else {
              L3: {
                if ((var5 ^ -1) <= -1) {
                  break L3;
                } else {
                  var5 = 0;
                  break L3;
                }
              }
              if (var5 > -param2 + param0) {
                var5 = param0 - param2;
                if (!ZombieDawnMulti.field_E) {
                  break L1;
                } else {
                  break L2;
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
          L4: {
            if (param0 + -param2 >= var5) {
              break L4;
            } else {
              var5 = param0 - param2;
              break L4;
            }
          }
          if (0 > var5) {
            var5 = 0;
            break L1;
          } else {
            if (param3 != -10596) {
              return -51;
            } else {
              return var5;
            }
          }
        }
        if (param3 != -10596) {
          return -51;
        } else {
          return var5;
        }
    }

    final boolean k(int param0) {
        if (0 == this.field_Tb.field_T) {
          if (param0 == 20) {
            if (-1 != (this.field_Tb.field_jb ^ -1)) {
              if ((this.field_Kb ^ -1) >= -1) {
                if (this.field_Kb != 0) {
                  return false;
                } else {
                  this.field_Kb = 3;
                  return true;
                }
              } else {
                this.field_Kb = this.field_Kb - 1;
                if (this.field_Kb != 0) {
                  return false;
                } else {
                  this.field_Kb = 3;
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
          this.field_Kb = 20;
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
            field_Hb = (nc[]) null;
        }
    }

    final boolean h(int param0) {
        if (this.field_Nb.field_T != 0) {
          this.field_Kb = 20;
          return true;
        } else {
          if (param0 == 4690) {
            if (this.field_Nb.field_jb != 0) {
              if (0 >= this.field_Kb) {
                if (-1 != (this.field_Kb ^ -1)) {
                  return false;
                } else {
                  this.field_Kb = 3;
                  return true;
                }
              } else {
                this.field_Kb = this.field_Kb - 1;
                if (-1 == (this.field_Kb ^ -1)) {
                  this.field_Kb = 3;
                  return true;
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            this.a(14, 117, 55);
            if (this.field_Nb.field_jb != 0) {
              if (0 < this.field_Kb) {
                this.field_Kb = this.field_Kb - 1;
                if (-1 != (this.field_Kb ^ -1)) {
                  return false;
                } else {
                  this.field_Kb = 3;
                  return true;
                }
              } else {
                if (-1 != (this.field_Kb ^ -1)) {
                  return false;
                } else {
                  this.field_Kb = 3;
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
          if (this.field_Jb) {
            return this.b(param0, false, param1, -10596);
          } else {
            return this.a(param0, false, 69, param1);
          }
        } else {
          this.k(33);
          if (this.field_Jb) {
            return this.b(param0, false, param1, -10596);
          } else {
            return this.a(param0, false, 69, param1);
          }
        }
    }

    final boolean c(byte param0) {
        if (this.field_Qb.field_T == 0) {
          if (param0 <= -64) {
            if (this.field_Qb.field_jb != 0) {
              if ((this.field_Kb ^ -1) >= -1) {
                if (0 == this.field_Kb) {
                  if (this.field_Lb.field_mb + this.field_Lb.field_qb + (this.field_Lb.field_z + this.field_Lb.field_I) > bo.field_d) {
                    return false;
                  } else {
                    this.field_Kb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_Kb = this.field_Kb - 1;
                if (0 == this.field_Kb) {
                  if (this.field_Lb.field_mb + this.field_Lb.field_qb + (this.field_Lb.field_z + this.field_Lb.field_I) <= bo.field_d) {
                    this.field_Kb = 3;
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
          this.field_Kb = 20;
          return true;
        }
    }

    private final void b(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        cj var15;
        cj var16;
        cj var17;
        cj var18;
        cj var19;
        cj var20;
        cj stackIn_13_0 = null;
        cj stackIn_13_1 = null;
        cj stackIn_13_2 = null;
        cj stackIn_14_0 = null;
        cj stackIn_14_1 = null;
        cj stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        cj stackIn_17_0 = null;
        cj stackIn_17_1 = null;
        cj stackIn_17_2 = null;
        cj stackIn_18_0 = null;
        cj stackIn_18_1 = null;
        cj stackIn_18_2 = null;
        int stackIn_18_3 = 0;
        cj stackIn_25_0 = null;
        cj stackIn_25_1 = null;
        cj stackIn_25_2 = null;
        cj stackIn_26_0 = null;
        cj stackIn_26_1 = null;
        cj stackIn_26_2 = null;
        int stackIn_26_3 = 0;
        cj stackIn_29_0 = null;
        cj stackIn_29_1 = null;
        cj stackIn_29_2 = null;
        cj stackIn_30_0 = null;
        cj stackIn_30_1 = null;
        cj stackIn_30_2 = null;
        int stackIn_30_3 = 0;
        L0: {
          L1: {
            var14 = ZombieDawnMulti.field_E ? 1 : 0;
            if (this.field_zb < 2 * this.field_z) {
              break L1;
            } else {
              var6 = this.field_zb + -this.field_z;
              var5 = this.field_z;
              if (var14 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var6 = this.field_zb / 2;
          var5 = this.field_zb / 2;
          break L0;
        }
        L2: {
          L3: {
            var7 = var6 - var5;
            var8 = var7;
            if (param1 < param0) {
              break L3;
            } else {
              var7 = 0;
              if (var14 == 0) {
                break L2;
              } else {
                break L3;
              }
            }
          }
          L4: {
            var8 = var8 * param1 / param0;
            if (this.field_z <= var8) {
              break L4;
            } else {
              var8 = this.field_z;
              break L4;
            }
          }
          if (var8 > var7) {
            var8 = var7;
            break L2;
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
            var15 = this.field_Tb;
            var15.field_Q = 0;
            var15.field_zb = var5;
            var15.field_z = this.field_z;
            var15.field_x = 0;
            var16 = this.field_Nb;
            var16.field_Q = 0;
            var16.field_z = this.field_z;
            var16.field_zb = this.field_zb - var6;
            var16.field_x = var6;
            var17 = this.field_Gb;
            var17.field_z = this.field_z;
            var17.field_zb = var7;
            var17.field_x = var5;
            var17.field_Q = 0;
            var18 = this.field_Pb;
            var18.field_zb = var12;
            var18.field_x = 0;
            var18.field_Q = 0;
            var18.field_z = this.field_z;
            if (param3 <= 120) {
              L6: {
                this.field_Jb = false;
                var19 = this.field_Qb;
                var19.field_Q = 0;
                var19.field_x = var12;
                var19.field_zb = var7 + -var12;
                var19.field_z = this.field_z;
                var20 = this.field_Lb;
                var20.field_z = this.field_z;
                stackIn_17_0 = this.field_Tb;

                stackIn_17_1 = this.field_Nb;

                stackIn_17_2 = this.field_Gb;

                if (param1 >= param0) {
                  stackIn_18_0 = (cj) ((Object) stackIn_17_0);
                  stackIn_18_1 = (cj) ((Object) stackIn_17_1);
                  stackIn_18_2 = (cj) ((Object) stackIn_17_2);
                  stackIn_18_3 = 0;
                  break L6;
                } else {
                  stackIn_18_0 = (cj) ((Object) stackIn_17_0);
                  stackIn_18_1 = (cj) ((Object) stackIn_17_1);
                  stackIn_18_2 = (cj) ((Object) stackIn_17_2);
                  stackIn_18_3 = 1;
                  break L6;
                }
              }
              stackIn_18_2.field_Z = stackIn_18_3 != 0;
              stackIn_18_1.field_Z = stackIn_18_3 != 0;
              stackIn_18_0.field_Z = stackIn_18_3 != 0;
              var20.field_x = var11;
              var20.field_zb = var8;
              var20.field_Q = 0;
              return;
            } else {
              L7: {
                var19 = this.field_Qb;
                var19.field_Q = 0;
                var19.field_x = var12;
                var19.field_zb = var7 + -var12;
                var19.field_z = this.field_z;
                var20 = this.field_Lb;
                var20.field_z = this.field_z;
                stackIn_13_0 = this.field_Tb;

                stackIn_13_1 = this.field_Nb;

                stackIn_13_2 = this.field_Gb;

                if (param1 >= param0) {
                  stackIn_14_0 = (cj) ((Object) stackIn_13_0);
                  stackIn_14_1 = (cj) ((Object) stackIn_13_1);
                  stackIn_14_2 = (cj) ((Object) stackIn_13_2);
                  stackIn_14_3 = 0;
                  break L7;
                } else {
                  stackIn_14_0 = (cj) ((Object) stackIn_13_0);
                  stackIn_14_1 = (cj) ((Object) stackIn_13_1);
                  stackIn_14_2 = (cj) ((Object) stackIn_13_2);
                  stackIn_14_3 = 1;
                  break L7;
                }
              }
              stackIn_14_2.field_Z = stackIn_14_3 != 0;
              stackIn_14_1.field_Z = stackIn_14_3 != 0;
              stackIn_14_0.field_Z = stackIn_14_3 != 0;
              var20.field_x = var11;
              var20.field_zb = var8;
              var20.field_Q = 0;
              return;
            }
          }
        }
        L8: {
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
        var15 = this.field_Tb;
        var15.field_Q = 0;
        var15.field_zb = var5;
        var15.field_z = this.field_z;
        var15.field_x = 0;
        var16 = this.field_Nb;
        var16.field_Q = 0;
        var16.field_z = this.field_z;
        var16.field_zb = this.field_zb - var6;
        var16.field_x = var6;
        var17 = this.field_Gb;
        var17.field_z = this.field_z;
        var17.field_zb = var7;
        var17.field_x = var5;
        var17.field_Q = 0;
        var18 = this.field_Pb;
        var18.field_zb = var12;
        var18.field_x = 0;
        var18.field_Q = 0;
        var18.field_z = this.field_z;
        if (param3 > 120) {
          L9: {
            var19 = this.field_Qb;
            var19.field_Q = 0;
            var19.field_x = var12;
            var19.field_zb = var7 + -var12;
            var19.field_z = this.field_z;
            var20 = this.field_Lb;
            var20.field_z = this.field_z;
            stackIn_29_0 = this.field_Tb;

            stackIn_29_1 = this.field_Nb;

            stackIn_29_2 = this.field_Gb;

            if (param1 >= param0) {
              stackIn_30_0 = (cj) ((Object) stackIn_29_0);
              stackIn_30_1 = (cj) ((Object) stackIn_29_1);
              stackIn_30_2 = (cj) ((Object) stackIn_29_2);
              stackIn_30_3 = 0;
              break L9;
            } else {
              stackIn_30_0 = (cj) ((Object) stackIn_29_0);
              stackIn_30_1 = (cj) ((Object) stackIn_29_1);
              stackIn_30_2 = (cj) ((Object) stackIn_29_2);
              stackIn_30_3 = 1;
              break L9;
            }
          }
          stackIn_30_2.field_Z = stackIn_30_3 != 0;
          stackIn_30_1.field_Z = stackIn_30_3 != 0;
          stackIn_30_0.field_Z = stackIn_30_3 != 0;
          var20.field_x = var11;
          var20.field_zb = var8;
          var20.field_Q = 0;
          return;
        } else {
          L10: {
            this.field_Jb = false;
            var19 = this.field_Qb;
            var19.field_Q = 0;
            var19.field_x = var12;
            var19.field_zb = var7 + -var12;
            var19.field_z = this.field_z;
            var20 = this.field_Lb;
            var20.field_z = this.field_z;
            stackIn_25_0 = this.field_Tb;

            stackIn_25_1 = this.field_Nb;

            stackIn_25_2 = this.field_Gb;

            if (param1 >= param0) {
              stackIn_26_0 = (cj) ((Object) stackIn_25_0);
              stackIn_26_1 = (cj) ((Object) stackIn_25_1);
              stackIn_26_2 = (cj) ((Object) stackIn_25_2);
              stackIn_26_3 = 0;
              break L10;
            } else {
              stackIn_26_0 = (cj) ((Object) stackIn_25_0);
              stackIn_26_1 = (cj) ((Object) stackIn_25_1);
              stackIn_26_2 = (cj) ((Object) stackIn_25_2);
              stackIn_26_3 = 1;
              break L10;
            }
          }
          stackIn_26_2.field_Z = stackIn_26_3 != 0;
          stackIn_26_1.field_Z = stackIn_26_3 != 0;
          stackIn_26_0.field_Z = stackIn_26_3 != 0;
          var20.field_x = var11;
          var20.field_zb = var8;
          var20.field_Q = 0;
          return;
        }
    }

    private final void c(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var14;
        cj var15;
        cj var16;
        cj var17;
        cj var18;
        cj var19;
        cj var20;
        cj stackIn_14_0 = null;
        cj stackIn_14_1 = null;
        cj stackIn_14_2 = null;
        cj stackIn_15_0 = null;
        cj stackIn_15_1 = null;
        cj stackIn_15_2 = null;
        int stackIn_15_3 = 0;
        cj stackIn_27_0 = null;
        cj stackIn_27_1 = null;
        cj stackIn_27_2 = null;
        cj stackIn_28_0 = null;
        cj stackIn_28_1 = null;
        cj stackIn_28_2 = null;
        int stackIn_28_3 = 0;
        cj stackIn_34_0 = null;
        cj stackIn_34_1 = null;
        cj stackIn_34_2 = null;
        cj stackIn_35_0 = null;
        cj stackIn_35_1 = null;
        cj stackIn_35_2 = null;
        int stackIn_35_3 = 0;
        L0: {
          L1: {
            var14 = ZombieDawnMulti.field_E ? 1 : 0;
            if (2 * this.field_zb > this.field_z) {
              break L1;
            } else {
              var5 = this.field_zb;
              var6 = -this.field_zb + this.field_z;
              if (var14 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          var6 = this.field_z / 2;
          var5 = this.field_z / 2;
          break L0;
        }
        var7 = -var5 + var6;
        var8 = var7;
        if (param1 >= param3) {
          var7 = 0;
          if (var14 == 0) {
            L2: {
              var9 = -param1 + param3;
              var10 = -var8 + var7;
              var11 = 0;
              if (param0 < var9) {
                var11 = (var9 / 2 + param2 * var10) / var9;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var12 = var8 / 2 + var11;
              var15 = this.field_Tb;
              var15.field_z = var5;
              var15.field_zb = this.field_zb;
              var15.field_Q = 0;
              var15.field_x = 0;
              var16 = this.field_Nb;
              var16.field_x = 0;
              var16.field_zb = this.field_zb;
              var16.field_Q = var6;
              var16.field_z = this.field_z - var6;
              var17 = this.field_Gb;
              var17.field_zb = this.field_zb;
              var17.field_z = var7;
              var17.field_x = 0;
              var17.field_Q = var5;
              var18 = this.field_Pb;
              var18.field_x = 0;
              var18.field_z = var12;
              var18.field_Q = 0;
              var18.field_zb = this.field_zb;
              var19 = this.field_Qb;
              var19.field_Q = var12;
              var19.field_z = -var12 + var7;
              var19.field_x = 0;
              var19.field_zb = this.field_zb;
              var20 = this.field_Lb;
              var20.field_Q = var11;
              var20.field_z = var8;
              var20.field_zb = this.field_zb;
              var20.field_x = 0;
              stackIn_34_0 = this.field_Tb;

              stackIn_34_1 = this.field_Nb;

              stackIn_34_2 = this.field_Gb;

              if (param1 >= param3) {
                stackIn_35_0 = (cj) ((Object) stackIn_34_0);
                stackIn_35_1 = (cj) ((Object) stackIn_34_1);
                stackIn_35_2 = (cj) ((Object) stackIn_34_2);
                stackIn_35_3 = 0;
                break L3;
              } else {
                stackIn_35_0 = (cj) ((Object) stackIn_34_0);
                stackIn_35_1 = (cj) ((Object) stackIn_34_1);
                stackIn_35_2 = (cj) ((Object) stackIn_34_2);
                stackIn_35_3 = 1;
                break L3;
              }
            }
            stackIn_35_2.field_Z = stackIn_35_3 != 0;
            stackIn_35_1.field_Z = stackIn_35_3 != 0;
            stackIn_35_0.field_Z = stackIn_35_3 != 0;
            return;
          } else {
            L4: {
              var8 = var8 * param1 / param3;
              if (var8 < this.field_zb) {
                var8 = this.field_zb;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var7 >= var8) {
                break L5;
              } else {
                var8 = var7;
                break L5;
              }
            }
            L6: {
              var9 = -param1 + param3;
              var10 = -var8 + var7;
              var11 = 0;
              if (param0 < var9) {
                var11 = (var9 / 2 + param2 * var10) / var9;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              var12 = var8 / 2 + var11;
              var15 = this.field_Tb;
              var15.field_z = var5;
              var15.field_zb = this.field_zb;
              var15.field_Q = 0;
              var15.field_x = 0;
              var16 = this.field_Nb;
              var16.field_x = 0;
              var16.field_zb = this.field_zb;
              var16.field_Q = var6;
              var16.field_z = this.field_z - var6;
              var17 = this.field_Gb;
              var17.field_zb = this.field_zb;
              var17.field_z = var7;
              var17.field_x = 0;
              var17.field_Q = var5;
              var18 = this.field_Pb;
              var18.field_x = 0;
              var18.field_z = var12;
              var18.field_Q = 0;
              var18.field_zb = this.field_zb;
              var19 = this.field_Qb;
              var19.field_Q = var12;
              var19.field_z = -var12 + var7;
              var19.field_x = 0;
              var19.field_zb = this.field_zb;
              var20 = this.field_Lb;
              var20.field_Q = var11;
              var20.field_z = var8;
              var20.field_zb = this.field_zb;
              var20.field_x = 0;
              stackIn_27_0 = this.field_Tb;

              stackIn_27_1 = this.field_Nb;

              stackIn_27_2 = this.field_Gb;

              if (param1 >= param3) {
                stackIn_28_0 = (cj) ((Object) stackIn_27_0);
                stackIn_28_1 = (cj) ((Object) stackIn_27_1);
                stackIn_28_2 = (cj) ((Object) stackIn_27_2);
                stackIn_28_3 = 0;
                break L7;
              } else {
                stackIn_28_0 = (cj) ((Object) stackIn_27_0);
                stackIn_28_1 = (cj) ((Object) stackIn_27_1);
                stackIn_28_2 = (cj) ((Object) stackIn_27_2);
                stackIn_28_3 = 1;
                break L7;
              }
            }
            stackIn_28_2.field_Z = stackIn_28_3 != 0;
            stackIn_28_1.field_Z = stackIn_28_3 != 0;
            stackIn_28_0.field_Z = stackIn_28_3 != 0;
            return;
          }
        } else {
          L8: {
            var8 = var8 * param1 / param3;
            if (var8 < this.field_zb) {
              var8 = this.field_zb;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (var7 >= var8) {
              break L9;
            } else {
              var8 = var7;
              break L9;
            }
          }
          L10: {
            var9 = -param1 + param3;
            var10 = -var8 + var7;
            var11 = 0;
            if (param0 < var9) {
              var11 = (var9 / 2 + param2 * var10) / var9;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            var12 = var8 / 2 + var11;
            var15 = this.field_Tb;
            var15.field_z = var5;
            var15.field_zb = this.field_zb;
            var15.field_Q = 0;
            var15.field_x = 0;
            var16 = this.field_Nb;
            var16.field_x = 0;
            var16.field_zb = this.field_zb;
            var16.field_Q = var6;
            var16.field_z = this.field_z - var6;
            var17 = this.field_Gb;
            var17.field_zb = this.field_zb;
            var17.field_z = var7;
            var17.field_x = 0;
            var17.field_Q = var5;
            var18 = this.field_Pb;
            var18.field_x = 0;
            var18.field_z = var12;
            var18.field_Q = 0;
            var18.field_zb = this.field_zb;
            var19 = this.field_Qb;
            var19.field_Q = var12;
            var19.field_z = -var12 + var7;
            var19.field_x = 0;
            var19.field_zb = this.field_zb;
            var20 = this.field_Lb;
            var20.field_Q = var11;
            var20.field_z = var8;
            var20.field_zb = this.field_zb;
            var20.field_x = 0;
            stackIn_14_0 = this.field_Tb;

            stackIn_14_1 = this.field_Nb;

            stackIn_14_2 = this.field_Gb;

            if (param1 >= param3) {
              stackIn_15_0 = (cj) ((Object) stackIn_14_0);
              stackIn_15_1 = (cj) ((Object) stackIn_14_1);
              stackIn_15_2 = (cj) ((Object) stackIn_14_2);
              stackIn_15_3 = 0;
              break L11;
            } else {
              stackIn_15_0 = (cj) ((Object) stackIn_14_0);
              stackIn_15_1 = (cj) ((Object) stackIn_14_1);
              stackIn_15_2 = (cj) ((Object) stackIn_14_2);
              stackIn_15_3 = 1;
              break L11;
            }
          }
          stackIn_15_2.field_Z = stackIn_15_3 != 0;
          stackIn_15_1.field_Z = stackIn_15_3 != 0;
          stackIn_15_0.field_Z = stackIn_15_3 != 0;
          return;
        }
    }

    private final int a(int param0, boolean param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        L0: {
          var5 = 0;
          var6 = this.field_Gb.field_zb + -this.field_Lb.field_zb;
          var7 = -86 % ((18 - param2) / 38);
          if ((var6 ^ -1) >= -1) {
            break L0;
          } else {
            var8 = this.field_Lb.field_x;
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
          if (var5 > param0 - param3) {
            var5 = -param3 + param0;
            if (ZombieDawnMulti.field_E) {
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
            } else {
              return var5;
            }
          } else {
            return var5;
          }
        } else {
          L4: {
            if (var5 > -param3 + param0) {
              var5 = -param3 + param0;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if ((var5 ^ -1) <= -1) {
              break L5;
            } else {
              var5 = 0;
              break L5;
            }
          }
          return var5;
        }
    }

    mj(long param0, cj param1, ja param2, ja param3, cj param4, cj param5, boolean param6) {
        this(param0, param1, param1, param4, param5, param6);
        try {
            this.field_Tb.field_rb = param2;
            this.field_Nb.field_rb = param3;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "mj.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final boolean j(int param0) {
        if (param0 >= 53) {
          if (this.field_Pb.field_T == 0) {
            if (0 != this.field_Pb.field_jb) {
              if ((this.field_Kb ^ -1) >= -1) {
                if (this.field_Kb == 0) {
                  if (bo.field_d < this.field_Lb.field_mb + this.field_Lb.field_qb) {
                    this.field_Kb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_Kb = this.field_Kb - 1;
                if (this.field_Kb == 0) {
                  if (bo.field_d < this.field_Lb.field_mb + this.field_Lb.field_qb) {
                    this.field_Kb = 3;
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
            this.field_Kb = 20;
            return true;
          }
        } else {
          this.j(-8);
          if (this.field_Pb.field_T == 0) {
            if (0 != this.field_Pb.field_jb) {
              if ((this.field_Kb ^ -1) < -1) {
                this.field_Kb = this.field_Kb - 1;
                if (this.field_Kb == 0) {
                  if (bo.field_d < this.field_Lb.field_mb + this.field_Lb.field_qb) {
                    this.field_Kb = 3;
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return false;
                }
              } else {
                if (this.field_Kb == 0) {
                  if (bo.field_d >= this.field_Lb.field_mb + this.field_Lb.field_qb) {
                    return false;
                  } else {
                    this.field_Kb = 3;
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
            this.field_Kb = 20;
            return true;
          }
        }
    }

    private mj(long param0, cj param1, cj param2, cj param3, cj param4, boolean param5) {
        super(param0, (cj) null);
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        cj var10 = null;
        cj var11 = null;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param5) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            ((mj) (this)).field_Jb = stackIn_4_1 != 0;
            this.field_Tb = new cj(0L, param1);
            this.field_Nb = new cj(0L, param2);
            this.a((byte) 50, this.field_Tb);
            this.a((byte) 50, this.field_Nb);
            this.field_Gb = new cj(0L, (cj) null);
            this.a((byte) 50, this.field_Gb);
            this.field_Pb = new cj(0L, param3);
            this.field_Qb = new cj(0L, param3);
            var10 = this.field_Pb;
            var11 = var10;
            this.field_Qb.field_ib = true;
            var11.field_ib = true;
            this.field_Gb.a((byte) 50, this.field_Pb);
            this.field_Gb.a((byte) 50, this.field_Qb);
            this.field_Lb = new cj(0L, param4);
            this.field_Lb.field_fb = true;
            this.field_Gb.a((byte) 50, this.field_Lb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var8);

            stackIn_8_1 = new StringBuilder().append("mj.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param4 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_9_0), stackIn_18_2 + ',' + param5 + ')');
        }
    }

    static {
        field_Ob = "<%0> might change the options - wait and see.";
        field_Rb = false;
        field_Hb = new nc[16];
        field_Fb = new int[4];
        field_Sb = "Select an enemy zombie!";
    }
}
