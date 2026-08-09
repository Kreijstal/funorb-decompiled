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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        cj var9 = null;
        cj var10 = null;
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
            stackIn_5_0 = (RuntimeException) (var7);

            stackIn_5_1 = new StringBuilder().append("hi.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_8_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param2 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param3 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param4 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_6_0), stackIn_15_2 + ')');
        }
    }

    final int a(boolean param0, byte param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        int var8;
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
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        cj var14;
        cj var15;
        cj var16;
        cj var17;
        cj var18;
        cj var19;
        cj stackIn_9_0 = null;
        cj stackIn_9_1 = null;
        cj stackIn_9_2 = null;
        cj stackIn_10_0 = null;
        cj stackIn_10_1 = null;
        cj stackIn_10_2 = null;
        int stackIn_10_3 = 0;
        cj stackIn_13_0 = null;
        cj stackIn_13_1 = null;
        cj stackIn_13_2 = null;
        cj stackIn_14_0 = null;
        cj stackIn_14_1 = null;
        cj stackIn_14_2 = null;
        int stackIn_14_3 = 0;
        cj stackIn_23_0 = null;
        cj stackIn_23_1 = null;
        cj stackIn_23_2 = null;
        cj stackIn_24_0 = null;
        cj stackIn_24_1 = null;
        cj stackIn_24_2 = null;
        int stackIn_24_3 = 0;
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
        cj stackIn_38_0 = null;
        cj stackIn_38_1 = null;
        cj stackIn_38_2 = null;
        cj stackIn_39_0 = null;
        cj stackIn_39_1 = null;
        cj stackIn_39_2 = null;
        int stackIn_39_3 = 0;
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
                stackIn_38_0 = this.field_Jb;

                stackIn_38_1 = this.field_Ib;

                stackIn_38_2 = this.field_Gb;

                if (param0 <= param3) {
                  stackIn_39_0 = (cj) ((Object) stackIn_38_0);
                  stackIn_39_1 = (cj) ((Object) stackIn_38_1);
                  stackIn_39_2 = (cj) ((Object) stackIn_38_2);
                  stackIn_39_3 = 0;
                  break L4;
                } else {
                  stackIn_39_0 = (cj) ((Object) stackIn_38_0);
                  stackIn_39_1 = (cj) ((Object) stackIn_38_1);
                  stackIn_39_2 = (cj) ((Object) stackIn_38_2);
                  stackIn_39_3 = 1;
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
                stackIn_34_0 = this.field_Jb;

                stackIn_34_1 = this.field_Ib;

                stackIn_34_2 = this.field_Gb;

                if (param0 <= param3) {
                  stackIn_35_0 = (cj) ((Object) stackIn_34_0);
                  stackIn_35_1 = (cj) ((Object) stackIn_34_1);
                  stackIn_35_2 = (cj) ((Object) stackIn_34_2);
                  stackIn_35_3 = 0;
                  break L5;
                } else {
                  stackIn_35_0 = (cj) ((Object) stackIn_34_0);
                  stackIn_35_1 = (cj) ((Object) stackIn_34_1);
                  stackIn_35_2 = (cj) ((Object) stackIn_34_2);
                  stackIn_35_3 = 1;
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
                stackIn_27_0 = this.field_Jb;

                stackIn_27_1 = this.field_Ib;

                stackIn_27_2 = this.field_Gb;

                if (param0 <= param3) {
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
                stackIn_23_0 = this.field_Jb;

                stackIn_23_1 = this.field_Ib;

                stackIn_23_2 = this.field_Gb;

                if (param0 <= param3) {
                  stackIn_24_0 = (cj) ((Object) stackIn_23_0);
                  stackIn_24_1 = (cj) ((Object) stackIn_23_1);
                  stackIn_24_2 = (cj) ((Object) stackIn_23_2);
                  stackIn_24_3 = 0;
                  break L8;
                } else {
                  stackIn_24_0 = (cj) ((Object) stackIn_23_0);
                  stackIn_24_1 = (cj) ((Object) stackIn_23_1);
                  stackIn_24_2 = (cj) ((Object) stackIn_23_2);
                  stackIn_24_3 = 1;
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
              stackIn_13_0 = this.field_Jb;

              stackIn_13_1 = this.field_Ib;

              stackIn_13_2 = this.field_Gb;

              if (param0 <= param3) {
                stackIn_14_0 = (cj) ((Object) stackIn_13_0);
                stackIn_14_1 = (cj) ((Object) stackIn_13_1);
                stackIn_14_2 = (cj) ((Object) stackIn_13_2);
                stackIn_14_3 = 0;
                break L10;
              } else {
                stackIn_14_0 = (cj) ((Object) stackIn_13_0);
                stackIn_14_1 = (cj) ((Object) stackIn_13_1);
                stackIn_14_2 = (cj) ((Object) stackIn_13_2);
                stackIn_14_3 = 1;
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
              stackIn_9_0 = this.field_Jb;

              stackIn_9_1 = this.field_Ib;

              stackIn_9_2 = this.field_Gb;

              if (param0 <= param3) {
                stackIn_10_0 = (cj) ((Object) stackIn_9_0);
                stackIn_10_1 = (cj) ((Object) stackIn_9_1);
                stackIn_10_2 = (cj) ((Object) stackIn_9_2);
                stackIn_10_3 = 0;
                break L11;
              } else {
                stackIn_10_0 = (cj) ((Object) stackIn_9_0);
                stackIn_10_1 = (cj) ((Object) stackIn_9_1);
                stackIn_10_2 = (cj) ((Object) stackIn_9_2);
                stackIn_10_3 = 1;
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
        jh stackIn_16_0 = null;
        Object stackIn_24_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jh stackOut_15_0;
        dm var1 = null;
        jh var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1 = (dm) ((Object) cg.field_i.c(param0 ^ 120));
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var1 == null) {
                      break L4;
                    } else {
                      var4 = var1.field_bc;
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
                            var1.field_bc = var1.field_bc - 1;
                            if (0 != var1.field_bc) {
                              break L5;
                            } else {
                              var1.field_Fb = 0;
                              if (var1.c((byte) 15)) {
                                var1.a(true);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                        var1 = (dm) ((Object) cg.field_i.b(6));
                        if (var2 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var1_ref = (jh) ((Object) tn.field_C.c(97));
                  L6: while (true) {
                    L7: {
                      L8: {
                        if (var1_ref == null) {
                          break L8;
                        } else {
                          stackOut_15_0 = (jh) (var1_ref);
                          stackIn_24_0 = stackOut_15_0;
                          stackIn_16_0 = stackOut_15_0;
                          if (var2 != 0) {
                            break L7;
                          } else {
                            L9: {
                              if (stackIn_16_0.field_Jb > 0) {
                                var1_ref.field_Jb = var1_ref.field_Jb - 1;
                                if (var1_ref.field_Jb == 0) {
                                  var1_ref.field_Vb = 0;
                                  if (!var1_ref.j(2)) {
                                    break L9;
                                  } else {
                                    var1_ref.a(true);
                                    break L9;
                                  }
                                } else {
                                  break L9;
                                }
                              } else {
                                break L9;
                              }
                            }
                            var1_ref = (jh) ((Object) tn.field_C.b(6));
                            if (var2 == 0) {
                              continue L6;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                      stackIn_24_0 = nh.field_g.c(65);
                      break L7;
                    }
                    var1 = (dm) ((Object) stackIn_24_0);
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
                L11: {
                  if (var1 == null) {
                    break L11;
                  } else {
                    if (var2 == 0) {
                      L12: {
                        if (0 >= var1.field_bc) {
                          break L12;
                        } else {
                          var1.field_bc = var1.field_bc - 1;
                          if (-1 != (var1.field_bc ^ -1)) {
                            break L12;
                          } else {
                            var1.field_Fb = 0;
                            if (!var1.c((byte) 15)) {
                              break L12;
                            } else {
                              var1.a(true);
                              break L12;
                            }
                          }
                        }
                      }
                      var1 = (dm) ((Object) nh.field_g.b(6));
                      if (var2 == 0) {
                        continue L10;
                      } else {
                        break L11;
                      }
                    } else {
                      return;
                    }
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1_ref2), "hi.AA(" + param0 + ')');
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
