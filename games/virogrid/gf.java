/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class gf extends fi implements ja {
    fi[] field_E;
    static String field_B;
    static String field_C;
    static lc field_z;
    static String field_D;
    static String field_A;
    static String field_y;
    static String field_x;

    private final boolean b(fi param0, int param1) {
        if (param1 != -1) {
            ((gf) this).c(46);
        }
        return this.a(param0, 1, (byte) -29);
    }

    final boolean f(boolean param0) {
        if (!param0) {
            return true;
        }
        return this.a(16711935) != null ? true : false;
    }

    final static hm g(boolean param0) {
        if (!param0) {
            field_x = null;
        }
        return (hm) (Object) new mf();
    }

    abstract void c(byte param0);

    final boolean a(fi param0, char param1, int param2, int param3) {
        fi[] var5_ref_fi__ = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        fi var8 = null;
        int var9 = 0;
        fi[] var10 = null;
        boolean stackIn_17_0 = false;
        boolean stackOut_16_0 = false;
        boolean stackOut_15_0 = false;
        var9 = Virogrid.field_F ? 1 : 0;
        if (null != ((gf) this).field_E) {
          var6 = 54 / ((param3 - -75) / 36);
          var10 = ((gf) this).field_E;
          var5_ref_fi__ = var10;
          var7 = 0;
          L0: while (true) {
            if (var7 >= var10.length) {
              var5 = param2;
              if (80 == var5) {
                L1: {
                  if (dc.field_Y[81]) {
                    stackOut_16_0 = this.b(param0, -1);
                    stackIn_17_0 = stackOut_16_0;
                    break L1;
                  } else {
                    stackOut_15_0 = this.c(param0, 65793);
                    stackIn_17_0 = stackOut_15_0;
                    break L1;
                  }
                }
                return stackIn_17_0;
              } else {
                return false;
              }
            } else {
              var8 = var10[var7];
              if (var8 != null) {
                if (var8.f(true)) {
                  if (var8.a(param0, param1, param2, 88)) {
                    return true;
                  } else {
                    var7++;
                    continue L0;
                  }
                } else {
                  var7++;
                  continue L0;
                }
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return false;
        }
    }

    final static void a(String param0, int param1, boolean param2, String param3, int param4, String param5) {
        if (param2) {
            Object var7 = null;
            gf.a((String) null, -123, false, (String) null, -113, (String) null);
        }
        cj var6 = new cj(param4, param0, param1, param5, param3);
        ln.a(var6, 112);
    }

    void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        fi var6 = null;
        int var7 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          if (param3 != 0) {
            break L0;
          } else {
            if (((gf) this).field_w == null) {
              break L0;
            } else {
              ((gf) this).field_w.a(param1, (fi) this, true, param2, -23294);
              break L0;
            }
          }
        }
        if (param0 == 37) {
          L1: {
            if (null == ((gf) this).field_E) {
              break L1;
            } else {
              var5 = ((gf) this).field_E.length + -1;
              L2: while (true) {
                if (-1 < (var5 ^ -1)) {
                  break L1;
                } else {
                  var6 = ((gf) this).field_E[var5];
                  if (var6 != null) {
                    var6.a((byte) 37, param1 - -((gf) this).field_l, ((gf) this).field_u + param2, param3);
                    var5--;
                    continue L2;
                  } else {
                    var5--;
                    continue L2;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final boolean a(fi param0, int param1) {
        fi[] var3 = null;
        int var4 = 0;
        fi var5 = null;
        int var6 = 0;
        fi[] var7 = null;
        L0: {
          var6 = Virogrid.field_F ? 1 : 0;
          var7 = ((gf) this).field_E;
          var3 = var7;
          if (param1 == -8515) {
            break L0;
          } else {
            ((gf) this).field_E = null;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (var7.length <= var4) {
            return false;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              if (var5.a(param0, -8515)) {
                return true;
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final boolean a(fi param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        fi[] var8 = null;
        int var9 = 0;
        fi var10 = null;
        int var11 = 0;
        Object var12 = null;
        fi[] var13 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        if (((gf) this).field_E != null) {
          L0: {
            if (!param2) {
              break L0;
            } else {
              var12 = null;
              this.a(121, (Hashtable) null, 48, (StringBuilder) null);
              break L0;
            }
          }
          var13 = ((gf) this).field_E;
          var8 = var13;
          var9 = 0;
          L1: while (true) {
            if (var13.length <= var9) {
              return false;
            } else {
              var10 = var13[var9];
              if (var10 != null) {
                if (var10.a(param0, param1, false, ((gf) this).field_l + param3, param4, param5 - -((gf) this).field_u, param6)) {
                  return true;
                } else {
                  var9++;
                  continue L1;
                }
              } else {
                var9++;
                continue L1;
              }
            }
          }
        } else {
          return false;
        }
    }

    final int b(byte param0) {
        int var2 = 0;
        fi[] var3 = null;
        int var4 = 0;
        fi var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        var2 = 0;
        if (param0 == -39) {
          var3 = ((gf) this).field_E;
          var4 = 0;
          L0: while (true) {
            if (var4 >= var3.length) {
              return var2;
            } else {
              var5 = var3[var4];
              if (var5 != null) {
                var6 = var5.b((byte) -39);
                if (var2 < var6) {
                  var2 = var6;
                  var4++;
                  continue L0;
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        } else {
          return 27;
        }
    }

    private final void a(int param0, Hashtable param1, int param2, StringBuilder param3) {
        int var6 = 0;
        fi var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        fi[] var11 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        if (((gf) this).field_E != null) {
          var11 = ((gf) this).field_E;
          var6 = 0;
          L0: while (true) {
            if (var11.length <= var6) {
              L1: {
                if (param2 > 5) {
                  break L1;
                } else {
                  var10 = null;
                  StringBuilder discarded$35 = ((gf) this).a((Hashtable) null, (byte) 102, 71, (StringBuilder) null);
                  break L1;
                }
              }
              return;
            } else {
              var7 = var11[var6];
              StringBuilder discarded$36 = param3.append(10);
              var8 = 0;
              L2: while (true) {
                if (var8 > param0) {
                  if (var7 == null) {
                    StringBuilder discarded$37 = param3.append("null");
                    var6++;
                    continue L0;
                  } else {
                    StringBuilder discarded$38 = var7.a(param1, (byte) 126, param0 - -1, param3);
                    var6++;
                    continue L0;
                  }
                } else {
                  StringBuilder discarded$39 = param3.append(32);
                  var8++;
                  continue L2;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, fi param1, int param2, int param3, int param4, int param5, int param6) {
        fi[] var8 = null;
        int var9 = 0;
        fi var10 = null;
        int var11 = 0;
        fi[] var12 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        if (null == ((gf) this).field_E) {
          return false;
        } else {
          var12 = ((gf) this).field_E;
          var8 = var12;
          var9 = param5;
          L0: while (true) {
            if (var12.length <= var9) {
              return false;
            } else {
              var10 = var12[var9];
              if (var10 != null) {
                if (var10.f(true)) {
                  if (var10.a(param0, param1, param2, param3, param4, param5 + 0, param6)) {
                    return true;
                  } else {
                    var9++;
                    continue L0;
                  }
                } else {
                  var9++;
                  continue L0;
                }
              } else {
                var9++;
                continue L0;
              }
            }
          }
        }
    }

    gf(int param0, int param1, int param2, int param3, ol param4) {
        super(param0, param1, param2, param3, param4, (cd) null);
    }

    private final fi a(int param0) {
        fi[] var2 = null;
        int var3 = 0;
        fi var4 = null;
        int var5 = 0;
        fi[] var6 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        if (((gf) this).field_E != null) {
          L0: {
            if (param0 == 16711935) {
              break L0;
            } else {
              field_B = null;
              break L0;
            }
          }
          var6 = ((gf) this).field_E;
          var2 = var6;
          var3 = 0;
          L1: while (true) {
            if (var6.length > var3) {
              var4 = var6[var3];
              if (var4 != null) {
                if (var4.f(true)) {
                  return var4;
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    private final boolean a(int param0, fi param1, int param2) {
        int var4 = 0;
        fi var5 = null;
        fi var6 = null;
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        if (null == ((gf) this).field_E) {
          return false;
        } else {
          var4 = param2;
          L0: while (true) {
            if (var4 >= ((gf) this).field_E.length) {
              return false;
            } else {
              var5 = ((gf) this).field_E[var4];
              var6 = var5;
              var6 = var5;
              if (var5 != null) {
                if (var5.f(true)) {
                  var4 = var4 + param0;
                  L1: while (true) {
                    if (var4 < ((gf) this).field_E.length) {
                      L2: {
                        var6 = ((gf) this).field_E[var4];
                        if (var6 == null) {
                          break L2;
                        } else {
                          if (!var6.a(param1, -8515)) {
                            break L2;
                          } else {
                            return true;
                          }
                        }
                      }
                      var4 = var4 + param0;
                      continue L1;
                    } else {
                      var4++;
                      continue L0;
                    }
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    final void c(int param0) {
        fi[] var2 = null;
        int var3 = 0;
        fi var4 = null;
        int var5 = 0;
        Object var6 = null;
        fi[] var7 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        var7 = ((gf) this).field_E;
        var2 = var7;
        var3 = 0;
        L0: while (true) {
          if (var3 >= var7.length) {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                var6 = null;
                boolean discarded$1 = ((gf) this).a((fi) null, -37);
                break L1;
              }
            }
            return;
          } else {
            var4 = var7[var3];
            if (var4 != null) {
              var4.c(-1);
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    final String d(int param0) {
        fi[] var2 = null;
        int var3 = 0;
        fi var4 = null;
        String var5 = null;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        if (((gf) this).field_E != null) {
          var2 = ((gf) this).field_E;
          var3 = 0;
          L0: while (true) {
            if (var3 >= var2.length) {
              if (param0 <= 35) {
                fi discarded$1 = this.a(-52);
                return null;
              } else {
                return null;
              }
            } else {
              var4 = var2[var3];
              if (var4 != null) {
                var5 = var4.d(117);
                if (var5 != null) {
                  return var5;
                } else {
                  var3++;
                  continue L0;
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static boolean a(int param0, int param1) {
        if (!(0 <= param1)) {
            return -1 == ((1 + param1) % 4 ^ -1) ? true : false;
        }
        if ((param1 ^ -1) > -1583) {
            return param1 % 4 == 0 ? true : false;
        }
        if (!(param1 % 4 == 0)) {
            return false;
        }
        if (param1 % 100 != 0) {
            return true;
        }
        if (param0 > -83) {
            hm discarded$0 = gf.g(false);
        }
        if (param1 % 400 == 0) {
            return true;
        }
        return false;
    }

    private final boolean c(fi param0, int param1) {
        if (param1 != 65793) {
            Object var4 = null;
            gf.a((String) null, -17, true, (String) null, 83, (String) null);
        }
        return this.a(1, param0, param1 + -65793);
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        if (!param1) {
            return;
        }
        super.a(param0, param1, param2, param3, param4);
        ((gf) this).c((byte) -99);
    }

    final static void a(int param0, int param1, int param2, int param3, wm param4, int param5, int param6, int param7) {
        int[] var8 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        Object var21 = null;
        tf var21_ref = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int[] var41 = null;
        int var44 = 0;
        wm var45 = null;
        int[] var50 = null;
        int[] var55 = null;
        int[] var60 = null;
        byte[] var62 = null;
        int[] var63 = null;
        int[] var64 = null;
        int[] var65 = null;
        int[] var66 = null;
        int[] var67 = null;
        int stackIn_14_0 = 0;
        int[] stackIn_15_0 = null;
        int[] stackIn_16_0 = null;
        int[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_31_0 = 0;
        tf stackIn_38_0 = null;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        short stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        short stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_30_0 = 0;
        short stackOut_29_0 = 0;
        tf stackOut_36_0 = null;
        Object stackOut_37_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int[] stackOut_14_0 = null;
        int[] stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int[] stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        L0: {
          L1: {
            var40 = Virogrid.field_F ? 1 : 0;
            var45 = param4;
            if (var45.field_z == null) {
              break L1;
            } else {
              if ((var45.field_a ^ -1) < -2) {
                var62 = var45.field_z;
                al.a(var62, ph.field_o, 0, 0, param7 ^ -22074);
                break L0;
              } else {
                break L1;
              }
            }
          }
          fh.b((byte) -80);
          break L0;
        }
        var66 = new int[param4.field_i];
        var60 = var66;
        var55 = var60;
        var50 = var55;
        var41 = var50;
        var8 = var41;
        var67 = new int[param4.field_i];
        var64 = u.field_q;
        var65 = fb.field_p;
        var63 = dc.field_Q;
        var13 = 0;
        L2: while (true) {
          if (var13 >= param4.field_i) {
            L3: {
              if (param7 == -22085) {
                break L3;
              } else {
                gf.a((byte) -54);
                break L3;
              }
            }
            var44 = 0;
            var13 = var44;
            L4: while (true) {
              if (var44 >= ck.field_f) {
                return;
              } else {
                L5: {
                  var14 = bf.field_m[var44];
                  var15 = param4.field_J[var14];
                  var16 = param4.field_e[var14];
                  var17 = param4.field_j[var14];
                  if (u.field_q.length > param4.field_y[var14]) {
                    stackOut_24_0 = param4.field_y[var14];
                    stackIn_25_0 = stackOut_24_0;
                    break L5;
                  } else {
                    stackOut_23_0 = -1;
                    stackIn_25_0 = stackOut_23_0;
                    break L5;
                  }
                }
                L6: {
                  var18 = stackIn_25_0;
                  if (param4.field_I[var14] < u.field_q.length) {
                    stackOut_27_0 = param4.field_I[var14];
                    stackIn_28_0 = stackOut_27_0;
                    break L6;
                  } else {
                    stackOut_26_0 = -1;
                    stackIn_28_0 = stackOut_26_0;
                    break L6;
                  }
                }
                L7: {
                  var19 = stackIn_28_0;
                  if (param4.field_K[var14] >= u.field_q.length) {
                    stackOut_30_0 = -1;
                    stackIn_31_0 = stackOut_30_0;
                    break L7;
                  } else {
                    stackOut_29_0 = param4.field_K[var14];
                    stackIn_31_0 = stackOut_29_0;
                    break L7;
                  }
                }
                L8: {
                  L9: {
                    var20 = stackIn_31_0;
                    if (td.field_e == null) {
                      break L9;
                    } else {
                      if (param4.field_S == null) {
                        break L9;
                      } else {
                        if (param4.field_S.length <= var14) {
                          break L9;
                        } else {
                          if (0 == (param4.field_S[var14] ^ -1)) {
                            break L9;
                          } else {
                            if (td.field_e.length <= param4.field_S[var14]) {
                              break L9;
                            } else {
                              stackOut_36_0 = td.field_e[param4.field_S[var14]];
                              stackIn_38_0 = stackOut_36_0;
                              break L8;
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_37_0 = null;
                  stackIn_38_0 = (tf) (Object) stackOut_37_0;
                  break L8;
                }
                L10: {
                  var21_ref = stackIn_38_0;
                  var22 = en.field_Hb[var15];
                  var23 = ld.field_h[var15];
                  var24 = en.field_Hb[var16];
                  var25 = ld.field_h[var16];
                  var26 = en.field_Hb[var17];
                  var27 = ld.field_h[var17];
                  if (var18 != var19) {
                    break L10;
                  } else {
                    if (var19 == var20) {
                      L11: {
                        var28 = var66[var18];
                        var29 = var67[var18];
                        if (var21_ref == null) {
                          stackOut_47_0 = 8355711;
                          stackIn_48_0 = stackOut_47_0;
                          break L11;
                        } else {
                          stackOut_46_0 = var21_ref.field_b;
                          stackIn_48_0 = stackOut_46_0;
                          break L11;
                        }
                      }
                      var30 = stackIn_48_0;
                      var31 = var30 & 16711935;
                      var32 = var30 & 65280;
                      var33 = var31 * var28 >>> -572003352 & 721355007 | (var32 * var28 & 16711835) >>> 2109971400;
                      var33 = var33 + var29 * 65793;
                      rj.a(var24, var23, (var33 & 16711422) >> 1460680993, var26, -69, var25, var22, var27);
                      var44++;
                      continue L4;
                    } else {
                      break L10;
                    }
                  }
                }
                L12: {
                  var28 = var66[var18];
                  var29 = var66[var19];
                  var30 = var66[var20];
                  var31 = var67[var18];
                  var32 = var67[var19];
                  var33 = var67[var20];
                  if (var21_ref != null) {
                    stackOut_43_0 = var21_ref.field_b;
                    stackIn_44_0 = stackOut_43_0;
                    break L12;
                  } else {
                    stackOut_42_0 = 8355711;
                    stackIn_44_0 = stackOut_42_0;
                    break L12;
                  }
                }
                var34 = stackIn_44_0;
                var35 = var34 & 16711935;
                var36 = var34 & 65280;
                var37 = (16711876 & var36 * var28) >>> -893506136 | (var28 * var35 & -16711806) >>> -57324536;
                var38 = (16711883 & var36 * var29) >>> -1766529624 | (-16711801 & var35 * var29) >>> -1975323288;
                var37 = var37 + 65793 * var31;
                var38 = var38 + 65793 * var32;
                var39 = (16711742 & var36 * var30) >>> -20100216 | (-16711685 & var35 * var30) >>> -1538775256;
                var39 = var39 + 65793 * var33;
                rf.a(false, var25, var39 >> 808665008, var39 & 255, (var39 & 65404) >> -1977101848, var24, var38 >> -1388777232, var38 >> 1313226408 & 255, var23, var37 >> -1245705264, var27, (var37 & 65315) >> 449189032, var26, var22, var38 & 255, var37 & 255);
                var44++;
                continue L4;
              }
            }
          } else {
            L13: {
              var14 = param5 * var63[var13] + param1 * var64[var13] - -(param6 * var65[var13]) >> -1991744408;
              if (0 <= var14) {
                break L13;
              } else {
                var14 = -var14;
                break L13;
              }
            }
            L14: {
              if (0 > var14) {
                stackOut_13_0 = 128;
                stackIn_14_0 = stackOut_13_0;
                break L14;
              } else {
                if (128 <= var14) {
                  stackOut_12_0 = 256;
                  stackIn_14_0 = stackOut_12_0;
                  break L14;
                } else {
                  stackOut_11_0 = var14 + 128;
                  stackIn_14_0 = stackOut_11_0;
                  break L14;
                }
              }
            }
            L15: {
              var14 = stackIn_14_0;
              var15 = var63[var13] * param2 + (var64[var13] * param3 - -(var65[var13] * param0)) >> 1054733672;
              stackOut_14_0 = dm.field_x;
              stackIn_16_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (var15 < 0) {
                stackOut_16_0 = (int[]) (Object) stackIn_16_0;
                stackOut_16_1 = -var15;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                break L15;
              } else {
                stackOut_15_0 = (int[]) (Object) stackIn_15_0;
                stackOut_15_1 = var15;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                break L15;
              }
            }
            var15 = stackIn_17_0[stackIn_17_1];
            var14 = var14 * (256 + -var15) >>> -2101004920;
            var66[var13] = var14;
            var67[var13] = var15;
            var13++;
            continue L2;
          }
        }
    }

    private final boolean a(fi param0, int param1, byte param2) {
        int var4 = 0;
        fi var5 = null;
        fi var6 = null;
        int var7 = 0;
        var7 = Virogrid.field_F ? 1 : 0;
        if (null == ((gf) this).field_E) {
          return false;
        } else {
          L0: {
            if (param2 == -29) {
              break L0;
            } else {
              field_A = null;
              break L0;
            }
          }
          var4 = -1 + ((gf) this).field_E.length;
          L1: while (true) {
            if (-1 < (var4 ^ -1)) {
              return false;
            } else {
              var5 = ((gf) this).field_E[var4];
              if (var5 != null) {
                if (var5.f(true)) {
                  var4 = var4 - param1;
                  L2: while (true) {
                    if (var4 >= 0) {
                      L3: {
                        var6 = ((gf) this).field_E[var4];
                        if (var6 != null) {
                          if (var6.a(param0, -8515)) {
                            return true;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      var4 = var4 - param1;
                      continue L2;
                    } else {
                      var4--;
                      continue L1;
                    }
                  }
                } else {
                  var4--;
                  continue L1;
                }
              } else {
                var4--;
                continue L1;
              }
            }
          }
        }
    }

    public static void a(byte param0) {
        field_z = null;
        field_D = null;
        field_C = null;
        field_y = null;
        field_B = null;
        field_x = null;
        int var1 = -19 / ((param0 - 70) / 41);
        field_A = null;
    }

    final void a(int param0, int param1, int param2, fi param3, int param4, int param5) {
        fi[] var7 = null;
        int var8 = 0;
        fi var9 = null;
        int var10 = 0;
        fi[] var11 = null;
        var10 = Virogrid.field_F ? 1 : 0;
        if (null != ((gf) this).field_E) {
          var11 = ((gf) this).field_E;
          var7 = var11;
          var8 = 0;
          L0: while (true) {
            if (var11.length <= var8) {
              L1: {
                if (param5 >= 73) {
                  break L1;
                } else {
                  ((gf) this).field_E = null;
                  break L1;
                }
              }
              return;
            } else {
              var9 = var11[var8];
              if (var9 != null) {
                var9.a(param0, param1, ((gf) this).field_l + param2, param3, param4 - -((gf) this).field_u, 104);
                var8++;
                continue L0;
              } else {
                var8++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    void a(int param0, int param1, fi param2, int param3) {
        fi[] var5 = null;
        int var6 = 0;
        fi var7 = null;
        int var8 = 0;
        fi[] var9 = null;
        var8 = Virogrid.field_F ? 1 : 0;
        super.a(param0, 114, param2, param3);
        if (((gf) this).field_E != null) {
          var9 = ((gf) this).field_E;
          var5 = var9;
          var6 = 0;
          if (param1 > 113) {
            L0: while (true) {
              if (var6 >= var9.length) {
                return;
              } else {
                var7 = var9[var6];
                if (var7 != null) {
                  var7.a(param0 - -((gf) this).field_l, 125, param2, param3 - -((gf) this).field_u);
                  var6++;
                  continue L0;
                } else {
                  var6++;
                  continue L0;
                }
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final StringBuilder a(Hashtable param0, byte param1, int param2, StringBuilder param3) {
        if (!(!((gf) this).a(param0, param2, 34, param3))) {
            ((gf) this).a(param2, param0, (byte) 127, param3);
            this.a(param2, param0, 56, param3);
        }
        if (param1 < 118) {
            field_A = null;
        }
        return param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "Your turn - playing <%0> (<%1>)";
        field_C = "Invalid date";
        field_D = "Real-life threats";
        field_z = new lc(6, 0, 4, 2);
        field_A = "Tips";
        field_y = "Email: ";
        field_x = "Find opponent";
    }
}
