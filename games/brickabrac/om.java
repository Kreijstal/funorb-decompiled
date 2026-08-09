/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class om extends mh {
    boolean field_bc;
    int field_Zb;
    static String field_rc;
    boolean field_uc;
    int field_cc;
    static int field_oc;
    int field_yc;
    mh field_Vb;
    static String field_Xb;
    mh field_sc;
    byte[] field_Tb;
    boolean field_dc;
    mh field_tc;
    int field_vc;
    static String field_pc;
    mh field_nc;
    mh field_lc;
    long field_qc;
    boolean field_ac;
    mh field_Bc;
    mh field_zc;
    String[] field_Qb;
    mh field_ic;
    boolean field_Dc;
    mh[] field_Ec;
    mh field_Cc;
    mh field_Ac;
    int field_Wb;
    String field_Fc;
    mh field_Ub;
    boolean field_Pb;
    int field_kc;
    mh field_mc;
    static jp field_fc;
    static int field_hc;
    mh field_gc;
    mh field_ec;
    mh field_Yb;
    int field_wc;
    long field_xc;
    int field_jc;
    boolean field_Rb;
    mh field_Sb;

    final boolean h(int param0) {
        int var2 = -35 / ((74 - param0) / 32);
        return !this.c(2) ? true : false;
    }

    final boolean a(om param0, boolean param1) {
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        boolean stackIn_22_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_61_0 = 0;
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        try {
          L0: {
            L1: {
              if (!this.field_Pb) {
                if (6 == this.field_Zb) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            L2: {
              var3_int = stackIn_6_0;
              if (!param0.field_Pb) {
                if (-7 == (param0.field_Zb ^ -1)) {
                  stackIn_12_0 = 1;
                  break L2;
                } else {
                  stackIn_12_0 = 0;
                  break L2;
                }
              } else {
                stackIn_12_0 = 1;
                break L2;
              }
            }
            L3: {
              var4 = stackIn_12_0;
              if (param1) {
                break L3;
              } else {
                this.e((byte) -123);
                break L3;
              }
            }
            if (var4 != var3_int) {
              stackIn_17_0 = var3_int;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L4: {
                if (var3_int == 0) {
                  if (param0.field_uc == this.field_uc) {
                    if (!this.field_uc) {
                      break L4;
                    } else {
                      if (param0.field_kc != this.field_kc) {
                        L5: {
                          if (param0.field_kc <= this.field_kc) {
                            stackIn_29_0 = 0;
                            break L5;
                          } else {
                            stackIn_29_0 = 1;
                            break L5;
                          }
                        }
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L4;
                      }
                    }
                  } else {
                    stackIn_22_0 = this.field_uc;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                if (this.field_Rb) {
                  stackIn_33_0 = 0;
                  break L6;
                } else {
                  stackIn_33_0 = 1;
                  break L6;
                }
              }
              if (stackIn_33_0 != (param0.field_Rb ? 1 : 0)) {
                if (this.field_Rb) {
                  L7: {
                    if (this.field_Dc) {
                      stackIn_49_0 = 1;
                      break L7;
                    } else {
                      if (-3 == (this.field_wc ^ -1)) {
                        stackIn_49_0 = 1;
                        break L7;
                      } else {
                        stackIn_49_0 = 0;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var5 = stackIn_49_0;
                    if (!param0.field_Dc) {
                      if (2 == param0.field_wc) {
                        stackIn_55_0 = 1;
                        break L8;
                      } else {
                        stackIn_55_0 = 0;
                        break L8;
                      }
                    } else {
                      stackIn_55_0 = 1;
                      break L8;
                    }
                  }
                  L9: {
                    var6 = stackIn_55_0;
                    stackIn_57_0 = var5;

                    if (var6 != 0) {
                      stackIn_58_0 = stackIn_57_0;
                      stackIn_58_1 = 0;
                      break L9;
                    } else {
                      stackIn_58_0 = stackIn_57_0;
                      stackIn_58_1 = 1;
                      break L9;
                    }
                  }
                  if (stackIn_58_0 == stackIn_58_1) {
                    stackIn_61_0 = var5;
                    decompiledRegionSelector0 = 5;
                    break L0;
                  } else {
                    L10: {
                      if ((this.field_qc ^ -1L) >= (param0.field_qc ^ -1L)) {
                        stackIn_65_0 = 0;
                        break L10;
                      } else {
                        stackIn_65_0 = 1;
                        break L10;
                      }
                    }
                    decompiledRegionSelector0 = 6;
                    break L0;
                  }
                } else {
                  L11: {
                    if ((param0.field_qc ^ -1L) >= (this.field_qc ^ -1L)) {
                      stackIn_42_0 = 0;
                      break L11;
                    } else {
                      stackIn_42_0 = 1;
                      break L11;
                    }
                  }
                  decompiledRegionSelector0 = 4;
                  break L0;
                }
              } else {
                L12: {
                  if (this.field_Rb) {
                    stackIn_37_0 = 0;
                    break L12;
                  } else {
                    stackIn_37_0 = 1;
                    break L12;
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var3 = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (var3);

            stackIn_68_1 = new StringBuilder().append("om.B(");

            if (param0 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L13;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L13;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_69_0), stackIn_69_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_22_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_29_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_37_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_42_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_61_0 != 0;
                  } else {
                    return stackIn_65_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(boolean param0, byte param1, int param2, boolean param3, j param4, int param5, int param6, boolean param7, ak param8) {
        int stackIn_3_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        StringBuilder stackIn_40_1 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        jp var11 = null;
        int var12_int = 0;
        jp[] var12 = null;
        int var13_int = 0;
        jp var13 = null;
        int var14_int = 0;
        String var14 = null;
        int var15_int = 0;
        Object var15 = null;
        String var15_ref = null;
        String var16_ref_String = null;
        int var16 = 0;
        jp var17 = null;
        jp var18 = null;
        try {
          L0: {
            L1: {
              if ((1 << param6 & (param8.field_g | param8.field_i | param8.field_a)) == 0) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            L2: {
              var9_int = stackIn_3_0;
              if (var9_int != 0) {
                break L2;
              } else {
                if (!param3) {
                  break L2;
                } else {
                  if ((param4.field_F ^ -1) <= -151) {
                    break L2;
                  } else {
                    L3: {
                      var10 = param4.field_F / 50;
                      var17 = ed.field_b[var10];
                      var12_int = param4.field_F + -(50 * var10);
                      var13_int = (50 - -(var12_int * 2)) * var17.field_x / 50;
                      var14_int = var17.field_z * (50 - -(var12_int * 3)) / 50;
                      var15_int = var12_int;
                      if (4 * var12_int >= 150) {
                        break L3;
                      } else {
                        var15_int = var12_int / 2;
                        break L3;
                      }
                    }
                    var17.b(param2 - -((306 + -var13_int) / 2), 300 + param5 - (var14_int / 2 + param4.field_F / 5), var13_int, var14_int, (12800 - 256 * var15_int) / 50);
                    break L2;
                  }
                }
              }
            }
            L4: {
              param2 -= 7;
              param5 -= 7;
              var10 = 445 + param5;
              lb.d(7 + param2, var10, 306, 28, 0, 96);
              nh.a(322, 482, -40, param2 + -1, cd.field_h, param5 - 1);
              nh.a(322, 44, -40, param2 + -1, cd.field_h, -7 + var10 + -1);
              param2 += 7;
              lj.a(5 + param2, param4, param8, -34, 4 + var10);
              param2 += 306;
              var18 = ef.field_e[param4.field_H];
              var11 = var18;
              var11.c(-var18.field_x + param2 + 5, 480 - var18.field_z);
              if ((param4.field_H ^ -1) != -3) {
                if (param4.field_H != 5) {
                  var12 = cn.field_e;
                  break L4;
                } else {
                  var12 = lp.field_yb;
                  break L4;
                }
              } else {
                var12 = ul.field_r;
                break L4;
              }
            }
            L5: {
              var13 = var12[kb.a(param8, param6, 87, param4)];
              var13.c(-8 + param2 - (var18.field_x - -var13.field_x) / 2, -var13.field_z + 480 + 10);
              if (param1 == -103) {
                break L5;
              } else {
                field_hc = 38;
                break L5;
              }
            }
            L6: {
              L7: {
                var14 = dh.a(ce.field_e, param8.field_f[param6], 73);
                var15 = null;
                if (!param7) {
                  break L7;
                } else {
                  if (var9_int != 0) {
                    break L7;
                  } else {
                    if (param4.field_fb != null) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
              }
              L8: {
                L9: {
                  if (!param0) {
                    break L9;
                  } else {
                    if (var9_int == 0) {
                      break L9;
                    } else {
                      if (-1 < (param4.field_V ^ -1)) {
                        var15_ref = Integer.toString(param4.field_V);
                        break L8;
                      } else {
                        var15_ref = rd.a(hh.field_e, new String[]{Integer.toString(param4.field_V)}, (byte) 103);
                        break L8;
                      }
                    }
                  }
                }
                if (!param8.field_b.field_c) {
                  var15_ref = rd.a(rm.field_e, new String[]{Integer.toString(pp.a(param4, (byte) 66, param8) + 1), Integer.toString(param8.field_b.a(-103))}, (byte) 103);
                  break L8;
                } else {
                  var15_ref = rd.a(dm.field_a, new String[]{Integer.toString(1 + pp.a(param4, (byte) 97, param8))}, (byte) 103);
                  break L8;
                }
              }
              var16_ref_String = rd.a(BrickABrac.field_H, new String[]{var14, var15_ref}, (byte) 103);
              ce.field_e.a(var16_ref_String, -var18.field_x + (param2 + -9), ce.field_e.field_F + var10, 2, -1);
              break L6;
            }
            L10: {
              L11: {
                if (!param7) {
                  break L11;
                } else {
                  if (var9_int != 0) {
                    break L11;
                  } else {
                    if (param4.field_fb != null) {
                      var16 = nn.field_g.c(param4.field_fb) + 20;
                      nh.a(var16, 24, param1 + 63, param2 + (-var18.field_x + (-9 + -var16)), qi.field_K, 2 + var10);
                      rk.field_Sb.c(param2 + -var18.field_x + -13, 6 + var10);
                      ob.field_D.b(param4.field_fb, -(var16 / 2) + param2 + (-var18.field_x - 9), 6 + (var10 + ob.field_D.field_F), 6, -1);
                      break L11;
                    } else {
                      break L10;
                    }
                  }
                }
              }
              break L10;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var9 = decompiledCaughtException;
            stackIn_37_0 = (RuntimeException) (var9);

            stackIn_37_1 = new StringBuilder().append("om.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "null";
              break L12;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackIn_38_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackIn_38_2 = "{...}";
              break L12;
            }
          }
          L13: {


            stackIn_40_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "null";
              break L13;
            } else {
              stackIn_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackIn_41_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackIn_41_2 = "{...}";
              break L13;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_38_0), stackIn_41_2 + ')');
        }
    }

    public static void d(byte param0) {
        field_rc = null;
        field_Xb = null;
        if (param0 != -32) {
            ak var2 = (ak) null;
            om.a(true, (byte) -24, 25, true, (j) null, 48, -120, false, (ak) null);
        }
        field_fc = null;
        field_pc = null;
    }

    final int e(byte param0) {
        int var2 = -51 % ((param0 - 66) / 35);
        return (int)this.e(-19451);
    }

    om(int param0) {
        super(0L, (mh) null);
        this.field_Tb = new byte[param0];
    }

    static {
        field_Xb = "Invalid name";
        field_rc = "To report a player, click on the most suitable option from the Rules of Conduct. Please do not abuse this form.";
    }
}
