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
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (((hi) this).field_Jb.field_T == 0) {
              L1: {
                if (((hi) this).field_Jb.field_jb != 0) {
                  L2: {
                    if (((hi) this).field_Fb > 0) {
                      ((hi) this).field_Fb = ((hi) this).field_Fb - 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (((hi) this).field_Fb == 0) {
                    ((hi) this).field_Fb = 3;
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    return stackIn_14_0 != 0;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L3: {
                if (!param0) {
                  break L3;
                } else {
                  ((hi) this).field_Lb = null;
                  break L3;
                }
              }
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L0;
            } else {
              ((hi) this).field_Fb = 20;
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "hi.CA(" + param0 + ')');
        }
        return stackIn_19_0 != 0;
    }

    final boolean e(byte param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (param0 == -37) {
              if (((hi) this).field_Ib.field_T != 0) {
                ((hi) this).field_Fb = 20;
                stackOut_6_0 = 1;
                stackIn_7_0 = stackOut_6_0;
                return stackIn_7_0 != 0;
              } else {
                L1: {
                  if (0 != ((hi) this).field_Ib.field_jb) {
                    L2: {
                      if (((hi) this).field_Fb <= 0) {
                        break L2;
                      } else {
                        ((hi) this).field_Fb = ((hi) this).field_Fb - 1;
                        break L2;
                      }
                    }
                    if (((hi) this).field_Fb == 0) {
                      ((hi) this).field_Fb = 3;
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      return stackIn_18_0 != 0;
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                }
                stackOut_19_0 = 0;
                stackIn_20_0 = stackOut_19_0;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "hi.EA(" + param0 + ')');
        }
        return stackIn_20_0 != 0;
    }

    hi(long param0, cj param1, cj param2, cj param3, cj param4) {
        super(param0, (cj) null);
        RuntimeException var7 = null;
        cj var7_ref = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          L0: {
            ((hi) this).field_Jb = new cj(0L, param1);
            ((hi) this).field_Ib = new cj(0L, param2);
            ((hi) this).a((byte) 50, ((hi) this).field_Jb);
            ((hi) this).a((byte) 50, ((hi) this).field_Ib);
            ((hi) this).field_Gb = new cj(0L, (cj) null);
            ((hi) this).a((byte) 50, ((hi) this).field_Gb);
            ((hi) this).field_Hb = new cj(0L, param3);
            ((hi) this).field_Lb = new cj(0L, param3);
            var7_ref = ((hi) this).field_Hb;
            ((hi) this).field_Lb.field_ib = true;
            var7_ref.field_ib = true;
            ((hi) this).field_Gb.a((byte) 50, ((hi) this).field_Hb);
            ((hi) this).field_Gb.a((byte) 50, ((hi) this).field_Lb);
            ((hi) this).field_Kb = new cj(0L, param4);
            ((hi) this).field_Kb.field_fb = true;
            ((hi) this).field_Gb.a((byte) 50, ((hi) this).field_Kb);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var7;
            stackOut_3_1 = new StringBuilder().append("hi.<init>(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L1;
            }
          }
          L2: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L4;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final int a(boolean param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param1 == -66) {
                break L1;
              } else {
                hi.h(-114);
                break L1;
              }
            }
            L2: {
              var6 = -((hi) this).field_Kb.field_z + ((hi) this).field_Gb.field_z;
              if (var6 <= 0) {
                break L2;
              } else {
                var7 = ((hi) this).field_Kb.field_Q;
                var8 = -param2 + param3;
                var5_int = (var7 * var8 + var6 / 2) / var6;
                break L2;
              }
            }
            L3: {
              L4: {
                if (!param0) {
                  break L4;
                } else {
                  L5: {
                    if (0 <= var5_int) {
                      break L5;
                    } else {
                      var5_int = 0;
                      break L5;
                    }
                  }
                  if (var5_int > param3 + -param2) {
                    var5_int = param3 + -param2;
                    if (!ZombieDawnMulti.field_E) {
                      break L3;
                    } else {
                      break L4;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L6: {
                if (param3 - param2 >= var5_int) {
                  break L6;
                } else {
                  var5_int = -param2 + param3;
                  break L6;
                }
              }
              if (0 > var5_int) {
                var5_int = 0;
                break L3;
              } else {
                break L3;
              }
            }
            stackOut_22_0 = var5_int;
            stackIn_23_0 = stackOut_22_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var5, "hi.BA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_23_0;
    }

    final boolean j(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            L1: {
              var2_int = 116 / ((66 - param0) / 53);
              if (((hi) this).field_Kb.field_jb == 0) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = 1;
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "hi.DA(" + param0 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final boolean d(byte param0) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 37) {
                break L1;
              } else {
                ((hi) this).field_Hb = null;
                break L1;
              }
            }
            if (((hi) this).field_Hb.field_T == 0) {
              L2: {
                if (((hi) this).field_Hb.field_jb == 0) {
                  break L2;
                } else {
                  L3: {
                    if (((hi) this).field_Fb <= 0) {
                      break L3;
                    } else {
                      ((hi) this).field_Fb = ((hi) this).field_Fb - 1;
                      break L3;
                    }
                  }
                  if (((hi) this).field_Fb != 0) {
                    break L2;
                  } else {
                    if (bo.field_d < ((hi) this).field_Kb.field_mb + ((hi) this).field_Kb.field_qb) {
                      ((hi) this).field_Fb = 3;
                      stackOut_18_0 = 1;
                      stackIn_19_0 = stackOut_18_0;
                      return stackIn_19_0 != 0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            } else {
              ((hi) this).field_Fb = 20;
              stackOut_4_0 = 1;
              stackIn_5_0 = stackOut_4_0;
              return stackIn_5_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "hi.FA(" + param0 + ')');
        }
        return stackIn_21_0 != 0;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        cj var13 = null;
        cj stackIn_18_0 = null;
        cj stackIn_18_1 = null;
        cj stackIn_18_2 = null;
        cj stackIn_20_0 = null;
        cj stackIn_20_1 = null;
        cj stackIn_20_2 = null;
        cj stackIn_21_0 = null;
        cj stackIn_21_1 = null;
        cj stackIn_21_2 = null;
        int stackIn_21_3 = 0;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_17_0 = null;
        cj stackOut_17_1 = null;
        cj stackOut_17_2 = null;
        cj stackOut_20_0 = null;
        cj stackOut_20_1 = null;
        cj stackOut_20_2 = null;
        int stackOut_20_3 = 0;
        cj stackOut_18_0 = null;
        cj stackOut_18_1 = null;
        cj stackOut_18_2 = null;
        int stackOut_18_3 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (2 * ((hi) this).field_zb > ((hi) this).field_z) {
                  break L2;
                } else {
                  var6 = ((hi) this).field_z - ((hi) this).field_zb;
                  var5_int = ((hi) this).field_zb;
                  if (!ZombieDawnMulti.field_E) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var6 = ((hi) this).field_z / 2;
              var5_int = ((hi) this).field_z / 2;
              break L1;
            }
            L3: {
              var7 = -var5_int + var6;
              var8 = var7;
              if (param0 > 0) {
                L4: {
                  var8 = var8 * param3 / param0;
                  if (~((hi) this).field_zb >= ~var8) {
                    break L4;
                  } else {
                    var8 = ((hi) this).field_zb;
                    break L4;
                  }
                }
                if (~var8 < ~var7) {
                  var8 = var7;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                break L3;
              }
            }
            L5: {
              var9 = -param3 + param0;
              var10 = var7 + -var8;
              var11 = 0;
              if (var9 <= 0) {
                break L5;
              } else {
                var11 = (param1 * var10 - -(var9 / 2)) / var9;
                break L5;
              }
            }
            L6: {
              var12 = var8 / 2 + var11;
              var13 = ((hi) this).field_Jb;
              var13.field_Q = 0;
              var13.field_z = var5_int;
              var13.field_zb = ((hi) this).field_zb;
              var13.field_x = 0;
              var13 = ((hi) this).field_Ib;
              var13.field_Q = var6;
              var13.field_zb = ((hi) this).field_zb;
              var13.field_z = -var6 + ((hi) this).field_z;
              var13.field_x = 0;
              var13 = ((hi) this).field_Gb;
              var13.field_z = var7;
              var13.field_zb = ((hi) this).field_zb;
              var13.field_Q = var5_int;
              var13.field_x = 0;
              var13 = ((hi) this).field_Hb;
              var13.field_z = var12;
              var13.field_zb = ((hi) this).field_zb;
              if (param2 > 109) {
                break L6;
              } else {
                hi.h(27);
                break L6;
              }
            }
            L7: {
              var13.field_x = 0;
              var13.field_Q = 0;
              var13 = ((hi) this).field_Lb;
              var13.field_z = -var12 + var7;
              var13.field_zb = ((hi) this).field_zb;
              var13.field_Q = var12;
              var13.field_x = 0;
              var13 = ((hi) this).field_Kb;
              var13.field_zb = ((hi) this).field_zb;
              var13.field_z = var8;
              var13.field_x = 0;
              var13.field_Q = var11;
              stackOut_17_0 = ((hi) this).field_Jb;
              stackOut_17_1 = ((hi) this).field_Ib;
              stackOut_17_2 = ((hi) this).field_Gb;
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              if (param0 <= param3) {
                stackOut_20_0 = (cj) (Object) stackIn_20_0;
                stackOut_20_1 = (cj) (Object) stackIn_20_1;
                stackOut_20_2 = (cj) (Object) stackIn_20_2;
                stackOut_20_3 = 0;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                stackIn_21_2 = stackOut_20_2;
                stackIn_21_3 = stackOut_20_3;
                break L7;
              } else {
                stackOut_18_0 = (cj) (Object) stackIn_18_0;
                stackOut_18_1 = (cj) (Object) stackIn_18_1;
                stackOut_18_2 = (cj) (Object) stackIn_18_2;
                stackOut_18_3 = 1;
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                stackIn_21_2 = stackOut_18_2;
                stackIn_21_3 = stackOut_18_3;
                break L7;
              }
            }
            stackIn_21_2.field_Z = stackIn_21_3 != 0;
            stackIn_21_1.field_Z = stackIn_21_3 != 0;
            stackIn_21_0.field_Z = stackIn_21_3 != 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var5, "hi.IA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        RuntimeException var9 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((hi) this).field_x = param7;
              ((hi) this).field_z = param3;
              ((hi) this).field_Q = param1;
              if (param4 == -1) {
                break L1;
              } else {
                hi.h(-9);
                break L1;
              }
            }
            ((hi) this).field_zb = param6;
            ((hi) this).a(param0, param5, (byte) 119, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var9, "hi.GA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    final static void h(int param0) {
        RuntimeException var1 = null;
        dm var1_ref = null;
        jh var1_ref2 = null;
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        jh stackIn_20_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        jh stackOut_19_0 = null;
        br stackOut_32_0 = null;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            var1_ref = (dm) (Object) cg.field_i.c(param0 ^ 120);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var1_ref) {
                    break L3;
                  } else {
                    stackOut_3_0 = 0;
                    stackOut_3_1 = var1_ref.field_bc;
                    stackIn_34_0 = stackOut_3_0;
                    stackIn_34_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var2 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 >= stackIn_4_1) {
                          break L4;
                        } else {
                          var1_ref.field_bc = var1_ref.field_bc - 1;
                          if (0 != var1_ref.field_bc) {
                            break L4;
                          } else {
                            var1_ref.field_Fb = 0;
                            if (var1_ref.c((byte) 15)) {
                              var1_ref.a(true);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var1_ref = (dm) (Object) cg.field_i.b(6);
                      if (var2 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var1_ref2 = (jh) (Object) tn.field_C.c(97);
                L5: while (true) {
                  L6: {
                    L7: {
                      if (null == var1_ref2) {
                        break L7;
                      } else {
                        stackOut_19_0 = (jh) var1_ref2;
                        stackIn_33_0 = (Object) (Object) stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var2 != 0) {
                          break L6;
                        } else {
                          L8: {
                            if (stackIn_20_0.field_Jb > 0) {
                              var1_ref2.field_Jb = var1_ref2.field_Jb - 1;
                              if (var1_ref2.field_Jb == 0) {
                                var1_ref2.field_Vb = 0;
                                if (!var1_ref2.j(2)) {
                                  break L8;
                                } else {
                                  var1_ref2.a(true);
                                  break L8;
                                }
                              } else {
                                break L8;
                              }
                            } else {
                              break L8;
                            }
                          }
                          var1_ref2 = (jh) (Object) tn.field_C.b(6);
                          if (var2 == 0) {
                            continue L5;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    stackOut_32_0 = nh.field_g.c(65);
                    stackIn_33_0 = (Object) (Object) stackOut_32_0;
                    break L6;
                  }
                  var1_ref = (dm) (Object) stackIn_33_0;
                  stackOut_33_0 = param0;
                  stackOut_33_1 = 2;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  break L2;
                }
              }
              if (stackIn_34_0 == stackIn_34_1) {
                L9: while (true) {
                  L10: {
                    L11: {
                      if (null == var1_ref) {
                        break L11;
                      } else {
                        if (var2 != 0) {
                          break L10;
                        } else {
                          L12: {
                            if (0 >= var1_ref.field_bc) {
                              break L12;
                            } else {
                              var1_ref.field_bc = var1_ref.field_bc - 1;
                              if (var1_ref.field_bc != 0) {
                                break L12;
                              } else {
                                var1_ref.field_Fb = 0;
                                if (!var1_ref.c((byte) 15)) {
                                  break L12;
                                } else {
                                  var1_ref.a(true);
                                  break L12;
                                }
                              }
                            }
                          }
                          var1_ref = (dm) (Object) nh.field_g.b(6);
                          if (var2 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    break L10;
                  }
                  break L0;
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var1, "hi.AA(" + param0 + ')');
        }
    }

    final boolean i(int param0) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_1_0 = 0;
        try {
          L0: {
            if (~((hi) this).field_Lb.field_T == param0) {
              L1: {
                if (0 == ((hi) this).field_Lb.field_jb) {
                  break L1;
                } else {
                  L2: {
                    if (((hi) this).field_Fb > 0) {
                      ((hi) this).field_Fb = ((hi) this).field_Fb - 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (((hi) this).field_Fb != 0) {
                    break L1;
                  } else {
                    if (~bo.field_d > ~(((hi) this).field_Kb.field_I + (((hi) this).field_Kb.field_z + ((hi) this).field_Kb.field_qb + ((hi) this).field_Kb.field_mb))) {
                      break L1;
                    } else {
                      ((hi) this).field_Fb = 3;
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0 != 0;
                    }
                  }
                }
              }
              stackOut_16_0 = 0;
              stackIn_17_0 = stackOut_16_0;
              break L0;
            } else {
              ((hi) this).field_Fb = 20;
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var2, "hi.JA(" + param0 + ')');
        }
        return stackIn_17_0 != 0;
    }

    hi(long param0, hi param1) {
        this(param0, param1.field_Jb, param1.field_Ib, param1.field_Hb, param1.field_Kb);
    }

    public static void c(byte param0) {
        try {
            field_Mb = null;
            field_Nb = null;
            if (param0 > -23) {
                field_Mb = null;
            }
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "hi.HA(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Nb = "Disguise one of your zombies as a harmless human.";
        field_Mb = "Don't mind";
    }
}
