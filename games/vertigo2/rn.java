/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rn extends jg {
    int field_D;
    static String[] field_w;
    int field_E;
    private boolean field_C;
    int field_v;
    int field_B;
    static int[] field_z;
    int field_x;
    static String field_y;
    int field_t;
    static r field_u;
    int field_A;

    private final void d(int param0) {
        int var3 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (-5 != ((rn) this).field_A) {
          if (((rn) this).field_A != 2) {
            if (-4 == ((rn) this).field_A) {
              ((rn) this).field_v = 3;
              return;
            } else {
              ((rn) this).field_v = 1;
              return;
            }
          } else {
            ((rn) this).field_v = 3;
            return;
          }
        } else {
          ((rn) this).field_v = 5;
          return;
        }
    }

    public static void e(int param0) {
        field_z = null;
        field_y = null;
        field_w = null;
        field_u = null;
        int var1 = 0;
    }

    final void a(boolean param0, int[] param1, boolean param2, boolean param3) {
        if (param0) {
            return;
        }
        try {
            ((rn) this).a(-30, param1, param2, (byte[]) null, param3);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "rn.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    rn(int param0, int param1, int param2, int param3, int param4, int param5) {
        super(param0, param1, param2, param3);
        ((rn) this).field_A = param4;
        ((rn) this).field_C = true;
        ((rn) this).field_t = param5;
        this.d(-23269);
    }

    final void a(rn param0, int param1) {
        try {
            super.a((jg) (Object) param0, -39);
            ((rn) this).field_x = param0.field_x;
            ((rn) this).field_t = param0.field_t;
            ((rn) this).field_B = param0.field_B;
            ((rn) this).field_v = param0.field_v;
            ((rn) this).field_E = param0.field_E;
            if (param1 > -3) {
                Object var4 = null;
                this.a((mi) null, -11);
            }
            ((rn) this).field_A = param0.field_A;
            ((rn) this).field_D = param0.field_D;
            ((rn) this).field_C = param0.field_C;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "rn.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int[] param1, boolean param2, byte[] param3, boolean param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        fc var8 = null;
        fc var9 = null;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        fc var15 = null;
        int stackIn_8_0 = 0;
        fc[][] stackIn_29_0 = null;
        fc[][] stackIn_30_0 = null;
        fc[][] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        fc[][] stackIn_36_0 = null;
        fc[][] stackIn_37_0 = null;
        fc[][] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        fc[][] stackOut_35_0 = null;
        fc[][] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        fc[][] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        fc[][] stackOut_28_0 = null;
        fc[][] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        fc[][] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_48_0 = null;
        StringBuilder stackOut_48_1 = null;
        String stackOut_48_2 = null;
        var11 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = ((rn) this).field_p;
              if (22 != var6_int) {
                break L1;
              } else {
                if (((rn) this).field_k % 20 < 10) {
                  var6_int = 8;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!param4) {
                stackOut_7_0 = pl.field_n;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = pn.field_L;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            L3: {
              var7 = stackIn_8_0;
              if (param0 == -30) {
                break L3;
              } else {
                ((rn) this).field_A = -31;
                break L3;
              }
            }
            var8 = wi.field_j[var6_int][var7];
            if (var8 == null) {
              return;
            } else {
              L4: {
                vq.field_q[2] = ((rn) this).field_g - -64;
                vq.field_q[0] = 64 + ((rn) this).field_l;
                if (((rn) this).field_C) {
                  break L4;
                } else {
                  L5: {
                    if (param3 == null) {
                      break L5;
                    } else {
                      if (~bj.field_i[0] >= ~param3[0]) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  param3 = bj.field_i;
                  break L4;
                }
              }
              L6: {
                vq.field_q[1] = ((rn) this).field_s;
                if (((rn) this).field_p != 23) {
                  break L6;
                } else {
                  if ((((rn) this).field_s + (((rn) this).field_l - -((rn) this).field_g) & 15) == 0) {
                    vq.field_q[0] = vq.field_q[0] + (-4 + be.a(9, (byte) 83));
                    vq.field_q[1] = vq.field_q[1] + (be.a(9, (byte) 83) - 4);
                    vq.field_q[2] = vq.field_q[2] + (-4 + be.a(9, (byte) 83));
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                L8: {
                  if (var6_int == 10) {
                    break L8;
                  } else {
                    if (var6_int == 5) {
                      break L8;
                    } else {
                      if (((rn) this).field_i) {
                        break L8;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                L9: {
                  if (var6_int == 10) {
                    L10: {
                      stackOut_35_0 = wi.field_j;
                      stackIn_37_0 = stackOut_35_0;
                      stackIn_36_0 = stackOut_35_0;
                      if (param2) {
                        stackOut_37_0 = (fc[][]) (Object) stackIn_37_0;
                        stackOut_37_1 = 27;
                        stackIn_38_0 = stackOut_37_0;
                        stackIn_38_1 = stackOut_37_1;
                        break L10;
                      } else {
                        stackOut_36_0 = (fc[][]) (Object) stackIn_36_0;
                        stackOut_36_1 = 3;
                        stackIn_38_0 = stackOut_36_0;
                        stackIn_38_1 = stackOut_36_1;
                        break L10;
                      }
                    }
                    var9 = stackIn_38_0[stackIn_38_1][var7];
                    break L9;
                  } else {
                    if (var6_int != 5) {
                      if (((rn) this).field_i) {
                        var9 = wi.field_j[27][var7];
                        break L9;
                      } else {
                        var9 = null;
                        break L9;
                      }
                    } else {
                      L11: {
                        stackOut_28_0 = wi.field_j;
                        stackIn_30_0 = stackOut_28_0;
                        stackIn_29_0 = stackOut_28_0;
                        if (!param2) {
                          stackOut_30_0 = (fc[][]) (Object) stackIn_30_0;
                          stackOut_30_1 = 4;
                          stackIn_31_0 = stackOut_30_0;
                          stackIn_31_1 = stackOut_30_1;
                          break L11;
                        } else {
                          stackOut_29_0 = (fc[][]) (Object) stackIn_29_0;
                          stackOut_29_1 = 27;
                          stackIn_31_0 = stackOut_29_0;
                          stackIn_31_1 = stackOut_29_1;
                          break L11;
                        }
                      }
                      var9 = stackIn_31_0[stackIn_31_1][var7];
                      break L9;
                    }
                  }
                }
                var12 = var9.field_R;
                var9.field_R = param3;
                var9.a(param1, vq.field_q);
                var9.field_R = var12;
                break L7;
              }
              L12: {
                if (((rn) this).field_f < 0) {
                  var14 = var8.field_R;
                  var8.field_R = param3;
                  var8.a(param1, vq.field_q);
                  var8.field_R = var14;
                  break L12;
                } else {
                  var15 = (fc) (Object) ((rn) this).field_n.a(true, true, false, (bn) (Object) var8);
                  var13 = var15.field_R;
                  var8.field_R = param3;
                  var15.a(param1, vq.field_q);
                  var15.field_R = var13;
                  break L12;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var6 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var6;
            stackOut_44_1 = new StringBuilder().append("rn.L(").append(param0).append(',');
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L13;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L13;
            }
          }
          L14: {
            stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
            stackOut_47_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param2).append(',');
            stackIn_49_0 = stackOut_47_0;
            stackIn_49_1 = stackOut_47_1;
            stackIn_48_0 = stackOut_47_0;
            stackIn_48_1 = stackOut_47_1;
            if (param3 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L14;
            } else {
              stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
              stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
              stackOut_48_2 = "{...}";
              stackIn_50_0 = stackOut_48_0;
              stackIn_50_1 = stackOut_48_1;
              stackIn_50_2 = stackOut_48_2;
              break L14;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_50_0, stackIn_50_2 + ',' + param4 + ')');
        }
    }

    rn(rn param0) {
        super((jg) (Object) param0);
        try {
            ((rn) this).a(param0, -127);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "rn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 == 0) {
          if (((rn) this).field_C) {
            if (!super.b(param0, param1, param2, param3, param4, 0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ((rn) this).a(43, false);
          if (((rn) this).field_C) {
            if (!super.b(param0, param1, param2, param3, param4, 0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final void a(int param0, boolean param1) {
        int var3 = 0;
        var3 = ((rn) this).field_k;
        if (!param1) {
          return;
        } else {
          L0: {
            ((rn) this).a((byte) -80, param0);
            if (((rn) this).field_A != 5) {
              break L0;
            } else {
              ((rn) this).field_k = (short) var3;
              break L0;
            }
          }
          return;
        }
    }

    rn(mi param0) {
        super(1, 0, 0, 0);
        int var2_int = 0;
        try {
            this.a(param0, 12);
            var2_int = ((rn) this).field_k;
            ((rn) this).a((byte) -55, ((rn) this).field_p);
            ((rn) this).field_k = (short) var2_int;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "rn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean b(byte param0) {
        int var2 = 94 % ((-11 - param0) / 36);
        return ((rn) this).field_C;
    }

    final boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        Object stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        Object stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        Object stackIn_78_0 = null;
        Object stackIn_79_0 = null;
        Object stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        Object stackIn_87_0 = null;
        Object stackIn_88_0 = null;
        Object stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        Object stackIn_95_0 = null;
        Object stackIn_96_0 = null;
        Object stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        Object stackIn_103_0 = null;
        Object stackIn_104_0 = null;
        Object stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        Object stackIn_110_0 = null;
        Object stackIn_111_0 = null;
        Object stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        Object stackOut_86_0 = null;
        Object stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        Object stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        Object stackOut_109_0 = null;
        Object stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        Object stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        Object stackOut_102_0 = null;
        Object stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        Object stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        Object stackOut_94_0 = null;
        Object stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        Object stackOut_95_0 = null;
        int stackOut_95_1 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_77_0 = null;
        Object stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        Object stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        Object stackOut_68_0 = null;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        Object stackOut_60_0 = null;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_42_0 = null;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_33_0 = null;
        Object stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var3 = Vertigo2.field_L ? 1 : 0;
        var2 = super.b(param0) ? 1 : 0;
        if (-3 == ((rn) this).field_A) {
          L0: {
            if (0 >= ((rn) this).field_v) {
              break L0;
            } else {
              if (((rn) this).field_B > ((rn) this).field_l) {
                break L0;
              } else {
                L1: {
                  ((rn) this).field_v = ((rn) this).field_v * -1;
                  ((rn) this).field_l = ((rn) this).field_B;
                  ((rn) this).field_l = ((rn) this).field_l + ((rn) this).field_v;
                  if (((rn) this).field_A != 5) {
                    break L1;
                  } else {
                    if (((rn) this).field_k < ((rn) this).field_t) {
                      break L1;
                    } else {
                      L2: {
                        ((rn) this).field_k = (short) 0;
                        stackOut_86_0 = this;
                        stackIn_88_0 = stackOut_86_0;
                        stackIn_87_0 = stackOut_86_0;
                        if (((rn) this).field_C) {
                          stackOut_88_0 = this;
                          stackOut_88_1 = 0;
                          stackIn_89_0 = stackOut_88_0;
                          stackIn_89_1 = stackOut_88_1;
                          break L2;
                        } else {
                          stackOut_87_0 = this;
                          stackOut_87_1 = 1;
                          stackIn_89_0 = stackOut_87_0;
                          stackIn_89_1 = stackOut_87_1;
                          break L2;
                        }
                      }
                      ((rn) this).field_C = stackIn_89_1 != 0;
                      break L1;
                    }
                  }
                }
                return var2 != 0;
              }
            }
          }
          if (0 > ((rn) this).field_v) {
            if (((rn) this).field_l > ((rn) this).field_x) {
              L3: {
                ((rn) this).field_l = ((rn) this).field_l + ((rn) this).field_v;
                if (((rn) this).field_A != 5) {
                  break L3;
                } else {
                  if (((rn) this).field_k < ((rn) this).field_t) {
                    break L3;
                  } else {
                    L4: {
                      ((rn) this).field_k = (short) 0;
                      stackOut_109_0 = this;
                      stackIn_111_0 = stackOut_109_0;
                      stackIn_110_0 = stackOut_109_0;
                      if (((rn) this).field_C) {
                        stackOut_111_0 = this;
                        stackOut_111_1 = 0;
                        stackIn_112_0 = stackOut_111_0;
                        stackIn_112_1 = stackOut_111_1;
                        break L4;
                      } else {
                        stackOut_110_0 = this;
                        stackOut_110_1 = 1;
                        stackIn_112_0 = stackOut_110_0;
                        stackIn_112_1 = stackOut_110_1;
                        break L4;
                      }
                    }
                    ((rn) this).field_C = stackIn_112_1 != 0;
                    break L3;
                  }
                }
              }
              return var2 != 0;
            } else {
              L5: {
                ((rn) this).field_l = ((rn) this).field_x;
                ((rn) this).field_v = ((rn) this).field_v * -1;
                ((rn) this).field_l = ((rn) this).field_l + ((rn) this).field_v;
                if (((rn) this).field_A != 5) {
                  break L5;
                } else {
                  if (((rn) this).field_k < ((rn) this).field_t) {
                    break L5;
                  } else {
                    L6: {
                      ((rn) this).field_k = (short) 0;
                      stackOut_102_0 = this;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_103_0 = stackOut_102_0;
                      if (((rn) this).field_C) {
                        stackOut_104_0 = this;
                        stackOut_104_1 = 0;
                        stackIn_105_0 = stackOut_104_0;
                        stackIn_105_1 = stackOut_104_1;
                        break L6;
                      } else {
                        stackOut_103_0 = this;
                        stackOut_103_1 = 1;
                        stackIn_105_0 = stackOut_103_0;
                        stackIn_105_1 = stackOut_103_1;
                        break L6;
                      }
                    }
                    ((rn) this).field_C = stackIn_105_1 != 0;
                    break L5;
                  }
                }
              }
              return var2 != 0;
            }
          } else {
            L7: {
              ((rn) this).field_l = ((rn) this).field_l + ((rn) this).field_v;
              if (((rn) this).field_A != 5) {
                break L7;
              } else {
                if (((rn) this).field_k < ((rn) this).field_t) {
                  break L7;
                } else {
                  L8: {
                    ((rn) this).field_k = (short) 0;
                    stackOut_94_0 = this;
                    stackIn_96_0 = stackOut_94_0;
                    stackIn_95_0 = stackOut_94_0;
                    if (((rn) this).field_C) {
                      stackOut_96_0 = this;
                      stackOut_96_1 = 0;
                      stackIn_97_0 = stackOut_96_0;
                      stackIn_97_1 = stackOut_96_1;
                      break L8;
                    } else {
                      stackOut_95_0 = this;
                      stackOut_95_1 = 1;
                      stackIn_97_0 = stackOut_95_0;
                      stackIn_97_1 = stackOut_95_1;
                      break L8;
                    }
                  }
                  ((rn) this).field_C = stackIn_97_1 != 0;
                  break L7;
                }
              }
            }
            return var2 != 0;
          }
        } else {
          if (((rn) this).field_A != 3) {
            if (((rn) this).field_A == 4) {
              L9: {
                if (((rn) this).field_v <= 0) {
                  break L9;
                } else {
                  if (((rn) this).field_s < ((rn) this).field_B) {
                    break L9;
                  } else {
                    L10: {
                      ((rn) this).field_v = ((rn) this).field_v * -1;
                      ((rn) this).field_s = ((rn) this).field_B;
                      ((rn) this).field_s = ((rn) this).field_s + ((rn) this).field_v;
                      if (((rn) this).field_A != 5) {
                        break L10;
                      } else {
                        if (((rn) this).field_k < ((rn) this).field_t) {
                          break L10;
                        } else {
                          L11: {
                            ((rn) this).field_k = (short) 0;
                            stackOut_51_0 = this;
                            stackIn_53_0 = stackOut_51_0;
                            stackIn_52_0 = stackOut_51_0;
                            if (((rn) this).field_C) {
                              stackOut_53_0 = this;
                              stackOut_53_1 = 0;
                              stackIn_54_0 = stackOut_53_0;
                              stackIn_54_1 = stackOut_53_1;
                              break L11;
                            } else {
                              stackOut_52_0 = this;
                              stackOut_52_1 = 1;
                              stackIn_54_0 = stackOut_52_0;
                              stackIn_54_1 = stackOut_52_1;
                              break L11;
                            }
                          }
                          ((rn) this).field_C = stackIn_54_1 != 0;
                          break L10;
                        }
                      }
                    }
                    return var2 != 0;
                  }
                }
              }
              if (((rn) this).field_v < 0) {
                if (((rn) this).field_x >= ((rn) this).field_s) {
                  ((rn) this).field_s = ((rn) this).field_x;
                  ((rn) this).field_v = ((rn) this).field_v * -1;
                  L12: {
                    ((rn) this).field_s = ((rn) this).field_s + ((rn) this).field_v;
                    if (((rn) this).field_A != 5) {
                      break L12;
                    } else {
                      if (((rn) this).field_k < ((rn) this).field_t) {
                        break L12;
                      } else {
                        L13: {
                          ((rn) this).field_k = (short) 0;
                          stackOut_77_0 = this;
                          stackIn_79_0 = stackOut_77_0;
                          stackIn_78_0 = stackOut_77_0;
                          if (((rn) this).field_C) {
                            stackOut_79_0 = this;
                            stackOut_79_1 = 0;
                            stackIn_80_0 = stackOut_79_0;
                            stackIn_80_1 = stackOut_79_1;
                            break L13;
                          } else {
                            stackOut_78_0 = this;
                            stackOut_78_1 = 1;
                            stackIn_80_0 = stackOut_78_0;
                            stackIn_80_1 = stackOut_78_1;
                            break L13;
                          }
                        }
                        ((rn) this).field_C = stackIn_80_1 != 0;
                        break L12;
                      }
                    }
                  }
                  return var2 != 0;
                } else {
                  L14: {
                    ((rn) this).field_s = ((rn) this).field_s + ((rn) this).field_v;
                    if (((rn) this).field_A != 5) {
                      break L14;
                    } else {
                      if (((rn) this).field_k < ((rn) this).field_t) {
                        break L14;
                      } else {
                        L15: {
                          ((rn) this).field_k = (short) 0;
                          stackOut_68_0 = this;
                          stackIn_70_0 = stackOut_68_0;
                          stackIn_69_0 = stackOut_68_0;
                          if (((rn) this).field_C) {
                            stackOut_70_0 = this;
                            stackOut_70_1 = 0;
                            stackIn_71_0 = stackOut_70_0;
                            stackIn_71_1 = stackOut_70_1;
                            break L15;
                          } else {
                            stackOut_69_0 = this;
                            stackOut_69_1 = 1;
                            stackIn_71_0 = stackOut_69_0;
                            stackIn_71_1 = stackOut_69_1;
                            break L15;
                          }
                        }
                        ((rn) this).field_C = stackIn_71_1 != 0;
                        break L14;
                      }
                    }
                  }
                  return var2 != 0;
                }
              } else {
                L16: {
                  ((rn) this).field_s = ((rn) this).field_s + ((rn) this).field_v;
                  if (((rn) this).field_A != 5) {
                    break L16;
                  } else {
                    if (((rn) this).field_k < ((rn) this).field_t) {
                      break L16;
                    } else {
                      L17: {
                        ((rn) this).field_k = (short) 0;
                        stackOut_60_0 = this;
                        stackIn_62_0 = stackOut_60_0;
                        stackIn_61_0 = stackOut_60_0;
                        if (((rn) this).field_C) {
                          stackOut_62_0 = this;
                          stackOut_62_1 = 0;
                          stackIn_63_0 = stackOut_62_0;
                          stackIn_63_1 = stackOut_62_1;
                          break L17;
                        } else {
                          stackOut_61_0 = this;
                          stackOut_61_1 = 1;
                          stackIn_63_0 = stackOut_61_0;
                          stackIn_63_1 = stackOut_61_1;
                          break L17;
                        }
                      }
                      ((rn) this).field_C = stackIn_63_1 != 0;
                      break L16;
                    }
                  }
                }
                return var2 != 0;
              }
            } else {
              L18: {
                if (((rn) this).field_A != 5) {
                  break L18;
                } else {
                  if (((rn) this).field_k < ((rn) this).field_t) {
                    break L18;
                  } else {
                    L19: {
                      ((rn) this).field_k = (short) 0;
                      stackOut_42_0 = this;
                      stackIn_44_0 = stackOut_42_0;
                      stackIn_43_0 = stackOut_42_0;
                      if (((rn) this).field_C) {
                        stackOut_44_0 = this;
                        stackOut_44_1 = 0;
                        stackIn_45_0 = stackOut_44_0;
                        stackIn_45_1 = stackOut_44_1;
                        break L19;
                      } else {
                        stackOut_43_0 = this;
                        stackOut_43_1 = 1;
                        stackIn_45_0 = stackOut_43_0;
                        stackIn_45_1 = stackOut_43_1;
                        break L19;
                      }
                    }
                    ((rn) this).field_C = stackIn_45_1 != 0;
                    break L18;
                  }
                }
              }
              return var2 != 0;
            }
          } else {
            L20: {
              if (-1 >= ((rn) this).field_v) {
                break L20;
              } else {
                if (((rn) this).field_B > ((rn) this).field_g) {
                  break L20;
                } else {
                  ((rn) this).field_v = ((rn) this).field_v * -1;
                  ((rn) this).field_g = ((rn) this).field_B;
                  L21: {
                    ((rn) this).field_g = ((rn) this).field_g + ((rn) this).field_v;
                    if (((rn) this).field_A != 5) {
                      break L21;
                    } else {
                      if (((rn) this).field_k < ((rn) this).field_t) {
                        break L21;
                      } else {
                        L22: {
                          ((rn) this).field_k = (short) 0;
                          stackOut_7_0 = this;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          if (((rn) this).field_C) {
                            stackOut_9_0 = this;
                            stackOut_9_1 = 0;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            break L22;
                          } else {
                            stackOut_8_0 = this;
                            stackOut_8_1 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            break L22;
                          }
                        }
                        ((rn) this).field_C = stackIn_10_1 != 0;
                        break L21;
                      }
                    }
                  }
                  return var2 != 0;
                }
              }
            }
            if (0 > ((rn) this).field_v) {
              if (1 + ((rn) this).field_x < ((rn) this).field_g) {
                L23: {
                  ((rn) this).field_g = ((rn) this).field_g + ((rn) this).field_v;
                  if (((rn) this).field_A != 5) {
                    break L23;
                  } else {
                    if (((rn) this).field_k < ((rn) this).field_t) {
                      break L23;
                    } else {
                      L24: {
                        ((rn) this).field_k = (short) 0;
                        stackOut_33_0 = this;
                        stackIn_35_0 = stackOut_33_0;
                        stackIn_34_0 = stackOut_33_0;
                        if (((rn) this).field_C) {
                          stackOut_35_0 = this;
                          stackOut_35_1 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          stackIn_36_1 = stackOut_35_1;
                          break L24;
                        } else {
                          stackOut_34_0 = this;
                          stackOut_34_1 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          stackIn_36_1 = stackOut_34_1;
                          break L24;
                        }
                      }
                      ((rn) this).field_C = stackIn_36_1 != 0;
                      break L23;
                    }
                  }
                }
                return var2 != 0;
              } else {
                ((rn) this).field_v = ((rn) this).field_v * -1;
                ((rn) this).field_g = ((rn) this).field_x;
                L25: {
                  ((rn) this).field_g = ((rn) this).field_g + ((rn) this).field_v;
                  if (((rn) this).field_A != 5) {
                    break L25;
                  } else {
                    if (((rn) this).field_k < ((rn) this).field_t) {
                      break L25;
                    } else {
                      L26: {
                        ((rn) this).field_k = (short) 0;
                        stackOut_26_0 = this;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_27_0 = stackOut_26_0;
                        if (((rn) this).field_C) {
                          stackOut_28_0 = this;
                          stackOut_28_1 = 0;
                          stackIn_29_0 = stackOut_28_0;
                          stackIn_29_1 = stackOut_28_1;
                          break L26;
                        } else {
                          stackOut_27_0 = this;
                          stackOut_27_1 = 1;
                          stackIn_29_0 = stackOut_27_0;
                          stackIn_29_1 = stackOut_27_1;
                          break L26;
                        }
                      }
                      ((rn) this).field_C = stackIn_29_1 != 0;
                      break L25;
                    }
                  }
                }
                return var2 != 0;
              }
            } else {
              L27: {
                ((rn) this).field_g = ((rn) this).field_g + ((rn) this).field_v;
                if (((rn) this).field_A != 5) {
                  break L27;
                } else {
                  if (((rn) this).field_k < ((rn) this).field_t) {
                    break L27;
                  } else {
                    L28: {
                      ((rn) this).field_k = (short) 0;
                      stackOut_16_0 = this;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (((rn) this).field_C) {
                        stackOut_18_0 = this;
                        stackOut_18_1 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        break L28;
                      } else {
                        stackOut_17_0 = this;
                        stackOut_17_1 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        break L28;
                      }
                    }
                    ((rn) this).field_C = stackIn_19_1 != 0;
                    break L27;
                  }
                }
              }
              return var2 != 0;
            }
          }
        }
    }

    final static void a(int param0, si param1) {
        try {
            if (param0 <= 33) {
                Object var3 = null;
                rn.a(9, (si) null);
            }
            bm.a(param1, true, 4);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "rn.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(wo param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -((rn) this).field_l + (-64 + param0.field_E);
                var4 = -53 % ((38 - param1) / 37);
                var5 = -64 + (-((rn) this).field_g + param0.field_y);
                var6 = -((rn) this).field_s + param0.field_k;
                if (var3_int * var3_int >= 4096) {
                  break L2;
                } else {
                  if (var5 * var5 <= -4097) {
                    break L2;
                  } else {
                    if (-31 <= var6) {
                      break L2;
                    } else {
                      stackOut_3_0 = 1;
                      stackIn_5_0 = stackOut_3_0;
                      break L1;
                    }
                  }
                }
              }
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("rn.H(");
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
          throw wn.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final void a(int param0, byte param1) {
        int var3 = 0;
        var3 = ((rn) this).field_k;
        ((rn) this).a((byte) -72, param0);
        if (param1 <= -121) {
          if (((rn) this).field_A != 5) {
            if (28 == param0) {
              return;
            } else {
              ((rn) this).field_k = (short) var3;
              return;
            }
          } else {
            return;
          }
        } else {
          ((rn) this).field_t = -19;
          if (((rn) this).field_A != 5) {
            if (28 == param0) {
              return;
            } else {
              ((rn) this).field_k = (short) var3;
              return;
            }
          } else {
            return;
          }
        }
    }

    private final void a(mi param0, int param1) {
        try {
            ((rn) this).field_p = param0.c((byte) -119, 5);
            ((rn) this).field_A = param0.c((byte) -97, 3);
            ((rn) this).field_t = param0.c((byte) -102, 9);
            ((rn) this).field_k = (short)param0.c((byte) -125, 8);
            ((rn) this).field_l = param0.c((byte) -95, 10);
            ((rn) this).field_g = param0.c((byte) -114, 10);
            ((rn) this).field_s = param0.c((byte) -116, param1) + -193;
            ((rn) this).field_h = param0.c((byte) -121, 3);
            ((rn) this).field_r = param0.c((byte) -96, 3);
            ((rn) this).field_o = param0.c((byte) -113, 4);
            ((rn) this).field_C = 1 == param0.c((byte) -105, 1) ? true : false;
            ((rn) this).field_v = -5 + param0.c((byte) -106, 4);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "rn.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new String[16];
        field_y = "The game options are not all set.";
    }
}
