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
        if (-1 == (this.field_Jb.field_T ^ -1)) {
          if (this.field_Jb.field_jb != 0) {
            L0: {
              if ((this.field_Fb ^ -1) < -1) {
                this.field_Fb = this.field_Fb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (this.field_Fb != 0) {
              if (param0) {
                this.field_Lb = (cj) null;
                return false;
              } else {
                return false;
              }
            } else {
              this.field_Fb = 3;
              return true;
            }
          } else {
            if (param0) {
              this.field_Lb = (cj) null;
              return false;
            } else {
              return false;
            }
          }
        } else {
          this.field_Fb = 20;
          return true;
        }
    }

    final boolean e(byte param0) {
        if (param0 == -37) {
          if (this.field_Ib.field_T != 0) {
            this.field_Fb = 20;
            return true;
          } else {
            if (0 != this.field_Ib.field_jb) {
              if ((this.field_Fb ^ -1) >= -1) {
                if (-1 != (this.field_Fb ^ -1)) {
                  return false;
                } else {
                  this.field_Fb = 3;
                  return true;
                }
              } else {
                this.field_Fb = this.field_Fb - 1;
                if (-1 != (this.field_Fb ^ -1)) {
                  return false;
                } else {
                  this.field_Fb = 3;
                  return true;
                }
              }
            } else {
              return false;
            }
          }
        } else {
          return false;
        }
    }

    hi(long param0, cj param1, cj param2, cj param3, cj param4) {
        super(param0, (cj) null);
        RuntimeException var7 = null;
        cj var9 = null;
        cj var10 = null;
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
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var7);
            stackOut_3_1 = new StringBuilder().append("hi.<init>(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param4 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    final int a(boolean param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var5 = 0;
        if (param1 == -66) {
          L0: {
            var6 = -this.field_Kb.field_z + this.field_Gb.field_z;
            if (var6 <= 0) {
              break L0;
            } else {
              var7 = this.field_Kb.field_Q;
              var8 = -param2 + param3;
              var5 = (var7 * var8 + var6 / 2) / var6;
              break L0;
            }
          }
          L1: {
            if (!param0) {
              break L1;
            } else {
              L2: {
                if (0 <= var5) {
                  break L2;
                } else {
                  var5 = 0;
                  break L2;
                }
              }
              if (var5 > param3 + -param2) {
                var5 = param3 + -param2;
                if (ZombieDawnMulti.field_E) {
                  break L1;
                } else {
                  return var5;
                }
              } else {
                return var5;
              }
            }
          }
          L3: {
            if (param3 - param2 >= var5) {
              break L3;
            } else {
              var5 = -param2 + param3;
              break L3;
            }
          }
          if (0 <= var5) {
            return var5;
          } else {
            var5 = 0;
            return var5;
          }
        } else {
          L4: {
            hi.h(-114);
            var6 = -this.field_Kb.field_z + this.field_Gb.field_z;
            if (var6 <= 0) {
              break L4;
            } else {
              var7 = this.field_Kb.field_Q;
              var8 = -param2 + param3;
              var5 = (var7 * var8 + var6 / 2) / var6;
              break L4;
            }
          }
          if (param0) {
            L5: {
              if (0 <= var5) {
                break L5;
              } else {
                var5 = 0;
                break L5;
              }
            }
            if (var5 > param3 + -param2) {
              var5 = param3 + -param2;
              if (ZombieDawnMulti.field_E) {
                L6: {
                  if (param3 - param2 >= var5) {
                    break L6;
                  } else {
                    var5 = -param2 + param3;
                    break L6;
                  }
                }
                if (0 <= var5) {
                  return var5;
                } else {
                  var5 = 0;
                  return var5;
                }
              } else {
                return var5;
              }
            } else {
              return var5;
            }
          } else {
            L7: {
              if (param3 - param2 >= var5) {
                break L7;
              } else {
                var5 = -param2 + param3;
                break L7;
              }
            }
            if (0 <= var5) {
              return var5;
            } else {
              var5 = 0;
              return var5;
            }
          }
        }
    }

    final boolean j(int param0) {
        int var2 = 116 / ((66 - param0) / 53);
        return -1 != (this.field_Kb.field_jb ^ -1) ? true : false;
    }

    final boolean d(byte param0) {
        if (param0 == 37) {
          if (this.field_Hb.field_T == 0) {
            if (this.field_Hb.field_jb != 0) {
              if ((this.field_Fb ^ -1) >= -1) {
                if (-1 == (this.field_Fb ^ -1)) {
                  if (bo.field_d >= this.field_Kb.field_mb + this.field_Kb.field_qb) {
                    return false;
                  } else {
                    this.field_Fb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                this.field_Fb = this.field_Fb - 1;
                if (-1 == (this.field_Fb ^ -1)) {
                  if (bo.field_d >= this.field_Kb.field_mb + this.field_Kb.field_qb) {
                    return false;
                  } else {
                    this.field_Fb = 3;
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
            this.field_Fb = 20;
            return true;
          }
        } else {
          this.field_Hb = (cj) null;
          if (this.field_Hb.field_T == 0) {
            if (this.field_Hb.field_jb != 0) {
              if ((this.field_Fb ^ -1) < -1) {
                this.field_Fb = this.field_Fb - 1;
                if (-1 == (this.field_Fb ^ -1)) {
                  if (bo.field_d >= this.field_Kb.field_mb + this.field_Kb.field_qb) {
                    return false;
                  } else {
                    this.field_Fb = 3;
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                if (-1 == (this.field_Fb ^ -1)) {
                  if (bo.field_d >= this.field_Kb.field_mb + this.field_Kb.field_qb) {
                    return false;
                  } else {
                    this.field_Fb = 3;
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
            this.field_Fb = 20;
            return true;
          }
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
          L1: {
            if (2 * this.field_zb > this.field_z) {
              break L1;
            } else {
              var6 = this.field_z - this.field_zb;
              var5 = this.field_zb;
              if (!ZombieDawnMulti.field_E) {
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
        if ((param0 ^ -1) < -1) {
          L2: {
            var8 = var8 * param3 / param0;
            if (this.field_zb <= var8) {
              break L2;
            } else {
              var8 = this.field_zb;
              break L2;
            }
          }
          if (var8 > var7) {
            L3: {
              var8 = var7;
              var9 = -param3 + param0;
              var10 = var7 + -var8;
              var11 = 0;
              if (var9 <= 0) {
                break L3;
              } else {
                var11 = (param1 * var10 - -(var9 / 2)) / var9;
                break L3;
              }
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
            if (param2 > 109) {
              L4: {
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
                stackOut_36_0 = this.field_Jb;
                stackOut_36_1 = this.field_Ib;
                stackOut_36_2 = this.field_Gb;
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                stackIn_38_2 = stackOut_36_2;
                stackIn_37_0 = stackOut_36_0;
                stackIn_37_1 = stackOut_36_1;
                stackIn_37_2 = stackOut_36_2;
                if (param0 <= param3) {
                  stackOut_38_0 = (cj) ((Object) stackIn_38_0);
                  stackOut_38_1 = (cj) ((Object) stackIn_38_1);
                  stackOut_38_2 = (cj) ((Object) stackIn_38_2);
                  stackOut_38_3 = 0;
                  stackIn_39_0 = stackOut_38_0;
                  stackIn_39_1 = stackOut_38_1;
                  stackIn_39_2 = stackOut_38_2;
                  stackIn_39_3 = stackOut_38_3;
                  break L4;
                } else {
                  stackOut_37_0 = (cj) ((Object) stackIn_37_0);
                  stackOut_37_1 = (cj) ((Object) stackIn_37_1);
                  stackOut_37_2 = (cj) ((Object) stackIn_37_2);
                  stackOut_37_3 = 1;
                  stackIn_39_0 = stackOut_37_0;
                  stackIn_39_1 = stackOut_37_1;
                  stackIn_39_2 = stackOut_37_2;
                  stackIn_39_3 = stackOut_37_3;
                  break L4;
                }
              }
              stackIn_39_2.field_Z = stackIn_39_3 != 0;
              stackIn_39_1.field_Z = stackIn_39_3 != 0;
              stackIn_39_0.field_Z = stackIn_39_3 != 0;
              return;
            } else {
              L5: {
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
                stackOut_32_0 = this.field_Jb;
                stackOut_32_1 = this.field_Ib;
                stackOut_32_2 = this.field_Gb;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                stackIn_34_2 = stackOut_32_2;
                stackIn_33_0 = stackOut_32_0;
                stackIn_33_1 = stackOut_32_1;
                stackIn_33_2 = stackOut_32_2;
                if (param0 <= param3) {
                  stackOut_34_0 = (cj) ((Object) stackIn_34_0);
                  stackOut_34_1 = (cj) ((Object) stackIn_34_1);
                  stackOut_34_2 = (cj) ((Object) stackIn_34_2);
                  stackOut_34_3 = 0;
                  stackIn_35_0 = stackOut_34_0;
                  stackIn_35_1 = stackOut_34_1;
                  stackIn_35_2 = stackOut_34_2;
                  stackIn_35_3 = stackOut_34_3;
                  break L5;
                } else {
                  stackOut_33_0 = (cj) ((Object) stackIn_33_0);
                  stackOut_33_1 = (cj) ((Object) stackIn_33_1);
                  stackOut_33_2 = (cj) ((Object) stackIn_33_2);
                  stackOut_33_3 = 1;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  stackIn_35_3 = stackOut_33_3;
                  break L5;
                }
              }
              stackIn_35_2.field_Z = stackIn_35_3 != 0;
              stackIn_35_1.field_Z = stackIn_35_3 != 0;
              stackIn_35_0.field_Z = stackIn_35_3 != 0;
              return;
            }
          } else {
            L6: {
              var9 = -param3 + param0;
              var10 = var7 + -var8;
              var11 = 0;
              if (var9 <= 0) {
                break L6;
              } else {
                var11 = (param1 * var10 - -(var9 / 2)) / var9;
                break L6;
              }
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
              L7: {
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
                stackOut_25_0 = this.field_Jb;
                stackOut_25_1 = this.field_Ib;
                stackOut_25_2 = this.field_Gb;
                stackIn_27_0 = stackOut_25_0;
                stackIn_27_1 = stackOut_25_1;
                stackIn_27_2 = stackOut_25_2;
                stackIn_26_0 = stackOut_25_0;
                stackIn_26_1 = stackOut_25_1;
                stackIn_26_2 = stackOut_25_2;
                if (param0 <= param3) {
                  stackOut_27_0 = (cj) ((Object) stackIn_27_0);
                  stackOut_27_1 = (cj) ((Object) stackIn_27_1);
                  stackOut_27_2 = (cj) ((Object) stackIn_27_2);
                  stackOut_27_3 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  stackIn_28_1 = stackOut_27_1;
                  stackIn_28_2 = stackOut_27_2;
                  stackIn_28_3 = stackOut_27_3;
                  break L7;
                } else {
                  stackOut_26_0 = (cj) ((Object) stackIn_26_0);
                  stackOut_26_1 = (cj) ((Object) stackIn_26_1);
                  stackOut_26_2 = (cj) ((Object) stackIn_26_2);
                  stackOut_26_3 = 1;
                  stackIn_28_0 = stackOut_26_0;
                  stackIn_28_1 = stackOut_26_1;
                  stackIn_28_2 = stackOut_26_2;
                  stackIn_28_3 = stackOut_26_3;
                  break L7;
                }
              }
              stackIn_28_2.field_Z = stackIn_28_3 != 0;
              stackIn_28_1.field_Z = stackIn_28_3 != 0;
              stackIn_28_0.field_Z = stackIn_28_3 != 0;
              return;
            } else {
              L8: {
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
                stackOut_21_0 = this.field_Jb;
                stackOut_21_1 = this.field_Ib;
                stackOut_21_2 = this.field_Gb;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                stackIn_23_2 = stackOut_21_2;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                stackIn_22_2 = stackOut_21_2;
                if (param0 <= param3) {
                  stackOut_23_0 = (cj) ((Object) stackIn_23_0);
                  stackOut_23_1 = (cj) ((Object) stackIn_23_1);
                  stackOut_23_2 = (cj) ((Object) stackIn_23_2);
                  stackOut_23_3 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  stackIn_24_3 = stackOut_23_3;
                  break L8;
                } else {
                  stackOut_22_0 = (cj) ((Object) stackIn_22_0);
                  stackOut_22_1 = (cj) ((Object) stackIn_22_1);
                  stackOut_22_2 = (cj) ((Object) stackIn_22_2);
                  stackOut_22_3 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  stackIn_24_3 = stackOut_22_3;
                  break L8;
                }
              }
              stackIn_24_2.field_Z = stackIn_24_3 != 0;
              stackIn_24_1.field_Z = stackIn_24_3 != 0;
              stackIn_24_0.field_Z = stackIn_24_3 != 0;
              return;
            }
          }
        } else {
          L9: {
            var9 = -param3 + param0;
            var10 = var7 + -var8;
            var11 = 0;
            if (var9 <= 0) {
              break L9;
            } else {
              var11 = (param1 * var10 - -(var9 / 2)) / var9;
              break L9;
            }
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
          if (param2 > 109) {
            L10: {
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
              stackOut_11_0 = this.field_Jb;
              stackOut_11_1 = this.field_Ib;
              stackOut_11_2 = this.field_Gb;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              if (param0 <= param3) {
                stackOut_13_0 = (cj) ((Object) stackIn_13_0);
                stackOut_13_1 = (cj) ((Object) stackIn_13_1);
                stackOut_13_2 = (cj) ((Object) stackIn_13_2);
                stackOut_13_3 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                stackIn_14_2 = stackOut_13_2;
                stackIn_14_3 = stackOut_13_3;
                break L10;
              } else {
                stackOut_12_0 = (cj) ((Object) stackIn_12_0);
                stackOut_12_1 = (cj) ((Object) stackIn_12_1);
                stackOut_12_2 = (cj) ((Object) stackIn_12_2);
                stackOut_12_3 = 1;
                stackIn_14_0 = stackOut_12_0;
                stackIn_14_1 = stackOut_12_1;
                stackIn_14_2 = stackOut_12_2;
                stackIn_14_3 = stackOut_12_3;
                break L10;
              }
            }
            stackIn_14_2.field_Z = stackIn_14_3 != 0;
            stackIn_14_1.field_Z = stackIn_14_3 != 0;
            stackIn_14_0.field_Z = stackIn_14_3 != 0;
            return;
          } else {
            L11: {
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
              stackOut_7_0 = this.field_Jb;
              stackOut_7_1 = this.field_Ib;
              stackOut_7_2 = this.field_Gb;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              if (param0 <= param3) {
                stackOut_9_0 = (cj) ((Object) stackIn_9_0);
                stackOut_9_1 = (cj) ((Object) stackIn_9_1);
                stackOut_9_2 = (cj) ((Object) stackIn_9_2);
                stackOut_9_3 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                break L11;
              } else {
                stackOut_8_0 = (cj) ((Object) stackIn_8_0);
                stackOut_8_1 = (cj) ((Object) stackIn_8_1);
                stackOut_8_2 = (cj) ((Object) stackIn_8_2);
                stackOut_8_3 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                break L11;
              }
            }
            stackIn_10_2.field_Z = stackIn_10_3 != 0;
            stackIn_10_1.field_Z = stackIn_10_3 != 0;
            stackIn_10_0.field_Z = stackIn_10_3 != 0;
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this.field_x = param7;
        this.field_z = param3;
        this.field_Q = param1;
        if (param4 != -1) {
          hi.h(-9);
          this.field_zb = param6;
          this.a(param0, param5, (byte) 119, param2);
          return;
        } else {
          this.field_zb = param6;
          this.a(param0, param5, (byte) 119, param2);
          return;
        }
    }

    final static void h(int param0) {
        RuntimeException var1 = null;
        dm var1_ref = null;
        jh var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        jh stackIn_16_0 = null;
        Object stackIn_24_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jh stackOut_15_0 = null;
        br stackOut_23_0 = null;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_ref = (dm) ((Object) cg.field_i.c(param0 ^ 120));
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var1_ref == null) {
                      break L4;
                    } else {
                      var4 = var1_ref.field_bc;
                      var3 = 0;
                      if (var2 != 0) {
                        if (var3 == var4) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          if (var3 >= var4) {
                            break L5;
                          } else {
                            var1_ref.field_bc = var1_ref.field_bc - 1;
                            if (0 != var1_ref.field_bc) {
                              break L5;
                            } else {
                              var1_ref.field_Fb = 0;
                              if (var1_ref.c((byte) 15)) {
                                var1_ref.a(true);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var1_ref = (dm) ((Object) cg.field_i.b(6));
                        if (var2 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var1_ref2 = (jh) ((Object) tn.field_C.c(97));
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var1_ref2 == null) {
                          break L8;
                        } else {
                          stackOut_15_0 = (jh) (var1_ref2);
                          stackIn_24_0 = stackOut_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          if (var2 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (stackIn_16_0.field_Jb > 0) {
                                var1_ref2.field_Jb = var1_ref2.field_Jb - 1;
                                if (var1_ref2.field_Jb == 0) {
                                  var1_ref2.field_Vb = 0;
                                  if (!var1_ref2.j(2)) {
                                    break L9;
                                  } else {
                                    var1_ref2.a(true);
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              } else {
                                break L9;
                              }
                            }
                            var1_ref2 = (jh) ((Object) tn.field_C.b(6));
                            if (var2 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      stackOut_23_0 = nh.field_g.c(65);
                      stackIn_24_0 = stackOut_23_0;
                      break L7;
                    }
                    var1_ref = (dm) ((Object) stackIn_24_0);
                    if (param0 == 2) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                decompiledRegionSelector0 = 0;
                break L0;
              }
              L10: while (true) {
                if (var1_ref == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  if (var2 == 0) {
                    L11: {
                      if (0 >= var1_ref.field_bc) {
                        break L11;
                      } else {
                        var1_ref.field_bc = var1_ref.field_bc - 1;
                        if (-1 != (var1_ref.field_bc ^ -1)) {
                          break L11;
                        } else {
                          var1_ref.field_Fb = 0;
                          if (!var1_ref.c((byte) 15)) {
                            break L11;
                          } else {
                            var1_ref.a(true);
                            break L11;
                          }
                        }
                      }
                    }
                    var1_ref = (dm) ((Object) nh.field_g.b(6));
                    continue L10;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "hi.AA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final boolean i(int param0) {
        if ((this.field_Lb.field_T ^ -1) == param0) {
          if (0 != this.field_Lb.field_jb) {
            L0: {
              if (-1 > (this.field_Fb ^ -1)) {
                this.field_Fb = this.field_Fb - 1;
                break L0;
              } else {
                break L0;
              }
            }
            if (-1 == (this.field_Fb ^ -1)) {
              if (bo.field_d >= this.field_Kb.field_I + (this.field_Kb.field_z + this.field_Kb.field_qb + this.field_Kb.field_mb)) {
                this.field_Fb = 3;
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          this.field_Fb = 20;
          return true;
        }
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
