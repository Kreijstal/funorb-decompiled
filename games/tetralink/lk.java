/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class lk extends ml implements dm {
    static int field_sb;
    private boolean field_ob;
    private boolean field_rb;
    static int field_wb;
    private boolean field_qb;
    private boolean field_vb;
    private jb field_ub;
    static String field_pb;
    private lg field_tb;
    static String field_nb;

    public static void f(byte param0) {
        int var1 = -101 / ((-67 - param0) / 47);
        field_nb = null;
        field_pb = null;
    }

    final static le a(int param0, hl param1, hl param2, hl param3, int[] param4) {
        int var5 = 0;
        String[] var6 = null;
        char[] var7 = null;
        le[] var8 = null;
        int var9 = 0;
        int var10_int = 0;
        Exception var10 = null;
        j var11 = null;
        int var12 = 0;
        Object var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          var12 = TetraLink.field_J;
          var5 = param4.length;
          if (param0 <= -26) {
            break L0;
          } else {
            var13 = null;
            le discarded$2 = lk.a(90, (hl) null, (hl) null, (hl) null, (int[]) null);
            break L0;
          }
        }
        var6 = new String[var5];
        var15 = new char[var5];
        var14 = var15;
        var7 = var14;
        var8 = new le[var5];
        var9 = 49;
        try {
          L1: {
            var10_int = 0;
            L2: while (true) {
              if (var10_int >= var5) {
                break L1;
              } else {
                var11 = eh.field_p.a(param4[var10_int], -128);
                var6[var10_int] = var11.h(-107);
                var9 = (char)(var9 + 1);
                var7[var10_int] = (char)var9;
                var8[var10_int] = null;
                var10_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = (Exception) (Object) decompiledCaughtException;
          return null;
        }
        return new le(0L, param3, param2, param1, var8, param4, var6, var15);
    }

    lk(pk param0, jb param1, String param2, boolean param3, boolean param4) {
        super(param0, (na) (Object) new ba((lk) null, param1, param2), 77, 10, 10);
        ((lk) this).field_ob = false;
        ((lk) this).field_qb = false;
        ((lk) this).field_ub = param1;
        ((lk) this).field_rb = param4 ? true : false;
        ((lk) this).field_vb = param3 ? true : false;
        ((lk) this).field_tb = new lg(13, 50, 274, 30, 15, 2113632, 4210752);
        ((lk) this).field_tb.field_K = true;
        ((lk) this).c((na) (Object) ((lk) this).field_tb, 10);
    }

    final boolean a(int param0, char param1, int param2, na param3) {
        if (param2 != 1) {
            java.applet.Applet discarded$0 = lk.q(108);
        }
        if (!(-14 != (param0 ^ -1))) {
            ((lk) this).r(-125);
            return true;
        }
        return super.a(param0, param1, 1, param3);
    }

    final void p(int param0) {
        if (param0 != 128) {
            Object var3 = null;
            lk.a(false, (byte) -124, 39, (el) null, -11, -14, 32, -111);
        }
        ((lk) this).field_tb.b(param0 ^ 248, 2121792, 4210752);
        ba var2 = new ba((lk) this, ((lk) this).field_ub, oa.field_t);
        var2.a(lm.field_l, 15, param0 ^ -256);
        ((lk) this).e((na) (Object) var2, -27667);
    }

    final static java.applet.Applet q(int param0) {
        if (param0 != 13) {
            field_sb = 60;
        }
        if (!(null == ik.field_c)) {
            return ik.field_c;
        }
        return (java.applet.Applet) (Object) lc.field_a;
    }

    final void r(int param0) {
        if (((lk) this).field_K) {
          L0: {
            ((lk) this).field_K = false;
            if (((lk) this).field_vb) {
              gg.c(-8);
              break L0;
            } else {
              if (((lk) this).field_rb) {
                aa.d((byte) 116);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (param0 < -122) {
              break L1;
            } else {
              ((lk) this).r(122);
              break L1;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        if (!(sj.a(3010, param0))) {
            return false;
        }
        if (param2 == null) {
            return false;
        }
        int var3 = param2.length();
        if (param1 != -1) {
            return true;
        }
        if (!(12 > var3)) {
            return false;
        }
        if (tk.a((byte) 81, param0)) {
            if (var3 != 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    final static void a(boolean param0, byte param1, int param2, el param3, int param4, int param5, int param6, int param7) {
        int var8_int = 0;
        nh[] var8 = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        nh var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        nh[] var17 = null;
        int[] var18 = null;
        nh[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        nh[][] stackIn_36_0 = null;
        nh[][] stackIn_37_0 = null;
        nh[][] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_80_0 = 0;
        nh[][] stackOut_35_0 = null;
        nh[][] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        nh[][] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        L0: {
          var15 = TetraLink.field_J;
          if (param1 < -111) {
            break L0;
          } else {
            var16 = null;
            lk.a(true, (byte) -16, 61, (el) null, -105, 77, -74, -96);
            break L0;
          }
        }
        L1: {
          if (param6 > param2) {
            L2: {
              stackOut_35_0 = cn.field_e;
              stackIn_37_0 = stackOut_35_0;
              stackIn_36_0 = stackOut_35_0;
              if (-1 == param2) {
                stackOut_37_0 = (nh[][]) (Object) stackIn_37_0;
                stackOut_37_1 = 1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                break L2;
              } else {
                stackOut_36_0 = (nh[][]) (Object) stackIn_36_0;
                stackOut_36_1 = param2 + 4;
                stackIn_38_0 = stackOut_36_0;
                stackIn_38_1 = stackOut_36_1;
                break L2;
              }
            }
            L3: {
              var17 = stackIn_38_0[stackIn_38_1];
              var19 = var17;
              var8 = var19;
              var9 = 1;
              if (!param0) {
                break L3;
              } else {
                if (0 == (param2 ^ -1)) {
                  var10 = 0;
                  L4: while (true) {
                    if (cl.field_f.length <= var10) {
                      break L3;
                    } else {
                      if (0 == (km.field_o[var10 / 8] & 1 << (7 & var10))) {
                        var10++;
                        continue L4;
                      } else {
                        var9 = 0;
                        break L3;
                      }
                    }
                  }
                } else {
                  var10 = 0;
                  L5: while (true) {
                    L6: {
                      if (var10 >= -1 + var17.length) {
                        break L6;
                      } else {
                        if (-1 != (lo.field_a[(param4 - -var10) / 8] & 1 << (7 & param4 + var10) ^ -1)) {
                          var9 = 0;
                          break L6;
                        } else {
                          var10++;
                          continue L5;
                        }
                      }
                    }
                    param4 = param4 + (255 & nn.field_Y[param2]);
                    break L3;
                  }
                }
              }
            }
            var10 = 0;
            var11 = 0;
            L7: while (true) {
              L8: {
                if (0 != (param2 ^ -1)) {
                  var19 = var8;
                  stackOut_55_0 = var19.length + -1;
                  stackIn_56_0 = stackOut_55_0;
                  break L8;
                } else {
                  stackOut_54_0 = cl.field_f.length;
                  stackIn_56_0 = stackOut_54_0;
                  break L8;
                }
              }
              if (stackIn_56_0 <= var11) {
                if (var10 == 0) {
                  var11 = 0;
                  L9: while (true) {
                    if (-1 + var19.length <= var11) {
                      break L1;
                    } else {
                      L10: {
                        if (0 == (param2 ^ -1)) {
                          param5 = var11;
                          break L10;
                        } else {
                          eg.field_K[param2] = (byte)var11;
                          break L10;
                        }
                      }
                      lk.a(param0, (byte) -118, param2 + 1, param3, param4, param5, param6, param7);
                      if (nn.field_R) {
                        return;
                      } else {
                        var11++;
                        continue L9;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              } else {
                L11: {
                  if (-1 == param2) {
                    param5 = var11;
                    break L11;
                  } else {
                    eg.field_K[param2] = (byte)var11;
                    break L11;
                  }
                }
                L12: {
                  L13: {
                    if (param2 != -1) {
                      break L13;
                    } else {
                      if (cl.field_f.length != 1) {
                        break L13;
                      } else {
                        var12 = 1;
                        break L12;
                      }
                    }
                  }
                  var13 = var8[var11 + 1];
                  if (param0) {
                    L14: {
                      if (!var13.field_zb) {
                        if (var9 != 0) {
                          if (var13.field_S) {
                            stackOut_78_0 = 1;
                            stackIn_80_0 = stackOut_78_0;
                            break L14;
                          } else {
                            stackOut_77_0 = 0;
                            stackIn_80_0 = stackOut_77_0;
                            break L14;
                          }
                        } else {
                          stackOut_75_0 = 0;
                          stackIn_80_0 = stackOut_75_0;
                          break L14;
                        }
                      } else {
                        stackOut_73_0 = 1;
                        stackIn_80_0 = stackOut_73_0;
                        break L14;
                      }
                    }
                    var12 = stackIn_80_0;
                    break L12;
                  } else {
                    if (0 == (param2 ^ -1)) {
                      L15: {
                        if (cl.field_f[var11] != qb.field_N.field_rc) {
                          stackOut_70_0 = 0;
                          stackIn_71_0 = stackOut_70_0;
                          break L15;
                        } else {
                          stackOut_69_0 = 1;
                          stackIn_71_0 = stackOut_69_0;
                          break L15;
                        }
                      }
                      var12 = stackIn_71_0;
                      break L12;
                    } else {
                      if (var11 != (255 & qb.field_N.field_sc[param2])) {
                        var12 = 0;
                        break L12;
                      } else {
                        var12 = 1;
                        break L12;
                      }
                    }
                  }
                }
                L16: {
                  if (var12 != 0) {
                    lk.a(param0, (byte) -120, param2 - -1, param3, param4, param5, param6, param7);
                    var10 = 1;
                    break L16;
                  } else {
                    break L16;
                  }
                }
                if (nn.field_R) {
                  return;
                } else {
                  var11++;
                  continue L7;
                }
              }
            }
          } else {
            var8_int = 1;
            var9 = 0;
            L17: while (true) {
              if (var9 >= uj.field_s.length) {
                if (var8_int != 0) {
                  nn.field_R = true;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var22 = uj.field_s[var9];
                var21 = var22;
                var20 = var21;
                var18 = var20;
                var10_ref_int__ = var18;
                var11 = 0;
                var12 = 0;
                L18: while (true) {
                  if (var12 >= var22.length) {
                    L19: {
                      if (var11 != 0) {
                        break L19;
                      } else {
                        if (hg.field_k == param2) {
                          break L19;
                        } else {
                          var9++;
                          continue L17;
                        }
                      }
                    }
                    var8_int = 0;
                    var12 = 0;
                    L20: while (true) {
                      if (var12 < var22.length) {
                        var13_int = var22[var12];
                        if (0 != (var13_int ^ -1)) {
                          if (param2 > var13_int) {
                            rh.field_G[var13_int] = true;
                            var12 += 2;
                            continue L20;
                          } else {
                            var12 += 2;
                            continue L20;
                          }
                        } else {
                          n.field_P = true;
                          var12 += 2;
                          continue L20;
                        }
                      } else {
                        var9++;
                        continue L17;
                      }
                    }
                  } else {
                    L21: {
                      var13_int = var22[var12];
                      var14 = var10_ref_int__[1 + var12];
                      if (-1 == var13_int) {
                        if (cl.field_f[param5] != var14) {
                          break L21;
                        } else {
                          var12 += 2;
                          continue L18;
                        }
                      } else {
                        L22: {
                          if (param2 != var13_int) {
                            break L22;
                          } else {
                            if (param7 != var14) {
                              break L22;
                            } else {
                              var11 = 1;
                              var12 += 2;
                              continue L18;
                            }
                          }
                        }
                        if (var13_int < param2) {
                          if ((255 & eg.field_K[var13_int]) != var14) {
                            break L21;
                          } else {
                            var12 += 2;
                            continue L18;
                          }
                        } else {
                          var9++;
                          continue L17;
                        }
                      }
                    }
                    var12 = var12;
                    var9++;
                    continue L17;
                  }
                }
              }
            }
          }
        }
    }

    final void a(String param0, int param1, int param2) {
        int var5 = 0;
        ba var6 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        ba stackIn_11_0 = null;
        ba stackIn_12_0 = null;
        ba stackIn_13_0 = null;
        String stackIn_13_1 = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ba stackOut_10_0 = null;
        ba stackOut_12_0 = null;
        String stackOut_12_1 = null;
        ba stackOut_11_0 = null;
        String stackOut_11_1 = null;
        var5 = TetraLink.field_J;
        if (!((lk) this).field_qb) {
          L0: {
            stackOut_2_0 = this;
            stackIn_4_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if ((param1 ^ -1) != -257) {
              stackOut_4_0 = this;
              stackOut_4_1 = 0;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              break L0;
            } else {
              stackOut_3_0 = this;
              stackOut_3_1 = 1;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              break L0;
            }
          }
          L1: {
            ((lk) this).field_ob = stackIn_5_1 != 0;
            ((lk) this).field_qb = true;
            ((lk) this).field_tb.b(-32, 8405024, 4210752);
            if (param2 == 17) {
              break L1;
            } else {
              ((lk) this).r(0);
              break L1;
            }
          }
          L2: {
            var6 = new ba((lk) this, ((lk) this).field_ub, param0);
            if (5 != param1) {
              if (-257 == (param1 ^ -1)) {
                ae discarded$2 = var6.a((dn) this, param2 ^ -44, mb.field_v);
                break L2;
              } else {
                L3: {
                  stackOut_10_0 = (ba) var6;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (!((lk) this).field_vb) {
                    stackOut_12_0 = (ba) (Object) stackIn_12_0;
                    stackOut_12_1 = nb.field_T;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    break L3;
                  } else {
                    stackOut_11_0 = (ba) (Object) stackIn_11_0;
                    stackOut_11_1 = mb.field_v;
                    stackIn_13_0 = stackOut_11_0;
                    stackIn_13_1 = stackOut_11_1;
                    break L3;
                  }
                }
                ((ba) (Object) stackIn_13_0).a(stackIn_13_1, -1, param2 ^ 103);
                break L2;
              }
            } else {
              var6.a(ml.field_hb, 11, 94);
              var6.a(uh.field_a, 17, 91);
              break L2;
            }
          }
          L4: {
            L5: {
              if (-4 == (param1 ^ -1)) {
                var6.a(hl.field_C, 7, param2 ^ 108);
                break L5;
              } else {
                if (-5 == (param1 ^ -1)) {
                  var6.a(u.field_d, 8, 97);
                  break L5;
                } else {
                  if (6 == param1) {
                    var6.a(em.field_c, 9, 81);
                    break L5;
                  } else {
                    if (9 == param1) {
                      ae discarded$3 = var6.a((dn) this, 40, jm.field_d);
                      break L5;
                    } else {
                      ((lk) this).e((na) (Object) var6, -27667);
                      break L4;
                    }
                  }
                }
              }
            }
            ((lk) this).e((na) (Object) var6, -27667);
            break L4;
          }
          return;
        } else {
          return;
        }
    }

    public void a(byte param0, ae param1, int param2, int param3, int param4) {
        if (param0 > 0) {
            ((lk) this).field_rb = false;
        }
        if (!((lk) this).field_ob) {
            ha.a(-92, "tochangedisplayname.ws", lk.q(13));
        } else {
            t.a(3, 0);
            ((lk) this).r(-124);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_sb = -1;
        field_nb = "Remove <%0> from ignore list";
        field_pb = "Start Game";
    }
}
