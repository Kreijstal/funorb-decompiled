/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nl extends oa {
    int field_ab;
    int field_eb;
    static int[] field_db;
    int field_Y;
    static String field_V;
    static String field_Z;
    int field_W;
    int field_bb;
    static boolean field_X;
    int field_cb;

    final boolean a(int param0, lh param1, int param2, int param3, int param4, boolean param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var12 = SteelSentinels.field_G;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3, param4, param5, param6)) {
              var8_int = -((nl) this).field_cb + (-((nl) this).field_o + (-param2 + param3));
              var9 = param0 + -((nl) this).field_Y + -((nl) this).field_z + -param4;
              if (var8_int * var8_int + var9 * var9 < ((nl) this).field_ab * ((nl) this).field_ab) {
                L1: {
                  var10 = Math.atan2((double)var9, (double)var8_int) - mj.field_Xb;
                  if (0.0 <= var10) {
                    if (0.0 < var10) {
                      var10 = var10 + 3.141592653589793 / (double)((nl) this).field_bb;
                      break L1;
                    } else {
                      break L1;
                    }
                  } else {
                    var10 = var10 - 3.141592653589793 / (double)((nl) this).field_bb;
                    break L1;
                  }
                }
                ((nl) this).field_eb = (int)(var10 * (double)((nl) this).field_bb / 6.283185307179586);
                L2: while (true) {
                  if (((nl) this).field_eb < ((nl) this).field_bb) {
                    L3: while (true) {
                      if (((nl) this).field_eb >= 0) {
                        stackOut_15_0 = 1;
                        stackIn_16_0 = stackOut_15_0;
                        break L0;
                      } else {
                        ((nl) this).field_eb = ((nl) this).field_eb + ((nl) this).field_bb;
                        continue L3;
                      }
                    }
                  } else {
                    ((nl) this).field_eb = ((nl) this).field_eb - ((nl) this).field_bb;
                    continue L2;
                  }
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var8 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var8;
            stackOut_17_1 = new StringBuilder().append("nl.I(").append(param0).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_16_0 != 0;
    }

    final static boolean g(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_8_0 = 0;
        var2 = SteelSentinels.field_G;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              L2: {
                if (var1_int >= ue.field_c.length) {
                  break L2;
                } else {
                  if (ue.field_c[var1_int] == null) {
                    break L2;
                  } else {
                    var1_int++;
                    continue L1;
                  }
                }
              }
              bi.field_f.field_Ub.field_eb = -100 + bi.field_f.field_Lb + -bi.field_f.field_Ub.field_Lb;
              fg.field_Ob = 1;
              va.field_k[0] = bi.field_f.field_Ub.field_eb;
              vn.d(-31);
              if (var1_int < ue.field_c.length) {
                L3: {
                  L4: {
                    uc.field_b = cj.a(73, di.field_c, hl.field_v);
                    if (null == ue.field_c[var1_int]) {
                      break L4;
                    } else {
                      if (ue.field_c[var1_int].length != uc.field_b.length) {
                        break L4;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ue.field_c[var1_int] = new int[uc.field_b.length];
                  break L3;
                }
                ii.a(uc.field_b, 0, ue.field_c[var1_int], 0, uc.field_b.length);
                ad.a(var1_int, hl.field_v, 55);
                stackOut_14_0 = 1;
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                km.field_a = wh.field_i;
                ln.field_c = lj.field_e[0];
                stackOut_8_0 = 0;
                stackIn_9_0 = stackOut_8_0;
                return stackIn_9_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "nl.Q(" + 127 + 41);
        }
        return stackIn_15_0 != 0;
    }

    final static void a(int param0, byte[] param1, boolean param2, int param3, int param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        kj var6 = mm.field_g;
        var6.a(param4, (byte) -117);
        try {
            var6.field_p = var6.field_p + 1;
            var7 = var6.field_p;
            var6.a((byte) 115, 4);
            var6.a((byte) 119, param0);
            var8 = param3;
            if (!(!param2)) {
                var8 += 128;
            }
            var6.a((byte) 112, var8);
            var6.a(param1.length, (byte) -122, 0, param1);
            var6.b((byte) -116, var6.field_p - var7);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "nl.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 44 + 81 + 41);
        }
    }

    public static void f(byte param0) {
        field_db = null;
        field_V = null;
        field_Z = null;
    }

    final static wk[] a(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        wk var9 = null;
        Object var10 = null;
        Object var11 = null;
        int[] var12 = null;
        wk var13 = null;
        wk var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        L0: {
          var18 = pb.field_g;
          var17 = var18;
          var16 = var17;
          var15 = var16;
          var12 = var15;
          var6 = var12;
          var7 = pb.field_c;
          var8 = pb.field_j;
          var9 = new wk(16, param4);
          var9.d();
          pb.e(0, 0, 16, param4, param1, param5);
          var10 = null;
          var11 = null;
          if (!param0) {
            break L0;
          } else {
            var13 = var9.g();
            var10 = (Object) (Object) var13;
            var13.d();
            pb.g(0, 0, 5, 0);
            pb.g(0, 1, 3, 0);
            pb.g(0, 2, 2, 0);
            pb.g(0, 3, 1, 0);
            pb.g(0, 4, 1, 0);
            break L0;
          }
        }
        L1: {
          if (param3 < -7) {
            break L1;
          } else {
            field_X = true;
            break L1;
          }
        }
        L2: {
          if (!param2) {
            break L2;
          } else {
            var14 = var9.g();
            var11 = (Object) (Object) var14;
            var14.d();
            pb.g(11, 0, 5, 0);
            pb.g(13, 1, 3, 0);
            pb.g(14, 2, 2, 0);
            pb.g(15, 3, 1, 0);
            pb.g(15, 4, 1, 0);
            break L2;
          }
        }
        pb.a(var18, var7, var8);
        return new wk[]{null, null, null, (wk) var10, var9, (wk) var11, null, null, null};
    }

    final static void a(byte param0, cm param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        pe var5_ref_pe = null;
        int[] var6 = null;
        int var7 = 0;
        kj var8 = null;
        int var9 = 0;
        kj var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = SteelSentinels.field_G;
        try {
          L0: {
            var8 = new kj(param1.a("", -742, "logo.fo3d"));
            var10 = var8;
            var3 = var10.f((byte) -119);
            var10.d(false);
            pm.field_W = nm.a(var10, (byte) 87);
            nn.field_h = new pe[var3];
            cl.field_f = new int[var3][];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3) {
                var10.i((byte) -3);
                var9 = 0;
                var4 = var9;
                L2: while (true) {
                  if (var9 >= var3) {
                    var5 = -123 % ((49 - param0) / 35);
                    break L0;
                  } else {
                    var5_ref_pe = nn.field_h[var9];
                    var5_ref_pe.a(6, 6, 1, 6, 14866);
                    var5_ref_pe.b(32767);
                    var6 = new int[]{var5_ref_pe.field_J - -var5_ref_pe.field_c >> 1, var5_ref_pe.field_p + var5_ref_pe.field_W >> 1, var5_ref_pe.field_n + var5_ref_pe.field_s >> 1};
                    cl.field_f[var9] = var6;
                    var5_ref_pe.a(0, -var6[1], -var6[2], -var6[0]);
                    var9++;
                    continue L2;
                  }
                }
              } else {
                nn.field_h[var4] = ve.a(-100, var8);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var2;
            stackOut_9_1 = new StringBuilder().append("nl.BA(").append(param0).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + 41);
        }
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        if (param1 == 26) {
          var2 = param0;
          if (55 != var2) {
            if (0 != var2) {
              if (var2 != 57) {
                if (62 == var2) {
                  return 13;
                } else {
                  if (var2 == 65) {
                    return 16;
                  } else {
                    if (var2 != 69) {
                      if (var2 != 72) {
                        if (var2 == 75) {
                          return 26;
                        } else {
                          if (var2 == 79) {
                            return 28;
                          } else {
                            return -1;
                          }
                        }
                      } else {
                        return 23;
                      }
                    } else {
                      return 19;
                    }
                  }
                }
              } else {
                return 5;
              }
            } else {
              return 9;
            }
          } else {
            return 2;
          }
        } else {
          return 14;
        }
    }

    final static int[] a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        if (param1 > 122) {
          var2 = param0;
          if (0 != var2) {
            if (var2 != 55) {
              if (57 != var2) {
                if (var2 != 62) {
                  if (var2 != 65) {
                    if (var2 == 69) {
                      return ua.field_O;
                    } else {
                      if (var2 != 72) {
                        if (var2 != 75) {
                          if (79 == var2) {
                            return ua.field_E;
                          } else {
                            if (84 == var2) {
                              return vk.field_s;
                            } else {
                              if (88 == var2) {
                                return jm.field_p;
                              } else {
                                if (92 == var2) {
                                  return si.field_k;
                                } else {
                                  return null;
                                }
                              }
                            }
                          }
                        } else {
                          return ua.field_J;
                        }
                      } else {
                        return ua.field_D;
                      }
                    }
                  } else {
                    return ua.field_N;
                  }
                } else {
                  return ua.field_z;
                }
              } else {
                return ua.field_P;
              }
            } else {
              return ua.field_x;
            }
          } else {
            return ua.field_v;
          }
        } else {
          return null;
        }
    }

    final static String a(String param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var5 = 0;
        int var6 = 0;
        ah var7 = null;
        ah var8 = null;
        kj var9 = null;
        CharSequence var10 = null;
        String stackIn_4_0 = null;
        String stackIn_8_0 = null;
        String stackIn_12_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_7_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = SteelSentinels.field_G;
        try {
          L0: {
            var10 = (CharSequence) (Object) param0;
            if (!fa.a(true, var10)) {
              stackOut_3_0 = en.field_a;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (2 != qc.field_P) {
                stackOut_7_0 = ug.field_N;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var8 = wi.a(param0, (byte) 113);
                if (var8 == null) {
                  stackOut_11_0 = db.a(bd.field_a, -75, new String[1]);
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  ck discarded$1 = ea.field_c.a((byte) 125, (ck) (Object) var8);
                  L1: while (true) {
                    var7 = (ah) (Object) ea.field_c.a((byte) -102);
                    if (var7 != null) {
                      var7.field_bc = var7.field_bc - 1;
                      continue L1;
                    } else {
                      var8.b(4);
                      var8.e(480);
                      vd.field_h = vd.field_h - 1;
                      var9 = mm.field_g;
                      var9.a(param1, (byte) -117);
                      var9.field_p = var9.field_p + 1;
                      var5 = var9.field_p;
                      var9.a((byte) 110, 1);
                      var9.a(param0, -61);
                      var9.b((byte) -53, -var5 + var9.field_p);
                      stackOut_17_0 = null;
                      stackIn_18_0 = stackOut_17_0;
                      break L0;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var3;
            stackOut_19_1 = new StringBuilder().append("nl.K(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L2;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L2;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + 1 + 41);
        }
        return (String) (Object) stackIn_18_0;
    }

    private nl() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1, int param2) {
        hk var6 = null;
        hk var7 = null;
        kj var4 = null;
        if (bj.field_j != param0) {
            var6 = (hk) (Object) fm.field_a.a((long)bj.field_j, (byte) 92);
            var7 = var6;
            if (!(var7 == null)) {
                var7.field_hc = null;
            }
            bj.field_j = param0;
            var4 = mm.field_g;
            var4.a(param1, (byte) -117);
            var4.a((byte) 108, 3);
            var4.a((byte) 113, 11);
            var4.d(param0, 21);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_db = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        field_V = "On";
        field_Z = "Accept unrated rematch";
    }
}
