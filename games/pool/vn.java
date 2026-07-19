/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn {
    static nl field_d;
    static ko field_g;
    static int field_f;
    static dd field_j;
    static int field_c;
    static int field_b;
    wd field_i;
    static int field_e;
    static int[] field_h;
    static String[] field_a;

    final static void a(byte param0, int param1, sj param2, ge param3) {
        try {
            byte[] array$1 = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6 = 0;
            ClassNotFoundException var7 = null;
            SecurityException var7_ref = null;
            NullPointerException var7_ref2 = null;
            Exception var7_ref3 = null;
            Throwable var7_ref4 = null;
            int var7_int = 0;
            String var8 = null;
            String var9 = null;
            int var10 = 0;
            String[] var11 = null;
            int var12_int = 0;
            byte[][] var12 = null;
            Class[] var13 = null;
            int var13_int = 0;
            int var14 = 0;
            int var15 = 0;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            Object var19 = null;
            ho var19_ref = null;
            byte[][] var20 = null;
            String var21 = null;
            String var22 = null;
            byte[][] var23 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            String stackIn_38_2 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            String stackIn_41_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            String stackOut_37_2 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            RuntimeException stackOut_40_0 = null;
            StringBuilder stackOut_40_1 = null;
            String stackOut_40_2 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            var15 = Pool.field_O;
            try {
              L0: {
                var19_ref = new ho();
                var19_ref.field_t = param3.g(-105);
                var19_ref.field_o = param3.b(true);
                var19_ref.field_w = new byte[var19_ref.field_t][][];
                var19_ref.field_r = new int[var19_ref.field_t];
                var19_ref.field_p = new le[var19_ref.field_t];
                var19_ref.field_m = new int[var19_ref.field_t];
                var19_ref.field_n = new le[var19_ref.field_t];
                var5 = 57 % ((param0 - -62) / 55);
                var19_ref.field_q = new int[var19_ref.field_t];
                var6 = 0;
                L1: while (true) {
                  if (var6 >= var19_ref.field_t) {
                    pj.field_H.b((byte) 82, var19_ref);
                    break L0;
                  } else {
                    try {
                      L2: {
                        L3: {
                          L4: {
                            var7_int = param3.g(-102);
                            if (0 == var7_int) {
                              break L4;
                            } else {
                              if (-2 == (var7_int ^ -1)) {
                                break L4;
                              } else {
                                if (-3 != (var7_int ^ -1)) {
                                  L5: {
                                    if (-4 == (var7_int ^ -1)) {
                                      break L5;
                                    } else {
                                      if (var7_int == 4) {
                                        break L5;
                                      } else {
                                        var6++;
                                        decompiledRegionSelector0 = 1;
                                        break L2;
                                      }
                                    }
                                  }
                                  var21 = param3.j(-21);
                                  var22 = param3.j(-26);
                                  var10 = param3.g(-84);
                                  var11 = new String[var10];
                                  var12_int = 0;
                                  L6: while (true) {
                                    if (var10 <= var12_int) {
                                      L7: {
                                        var23 = new byte[var10][];
                                        var20 = var23;
                                        var12 = var20;
                                        if (var7_int != 3) {
                                          break L7;
                                        } else {
                                          var13_int = 0;
                                          L8: while (true) {
                                            if (var13_int >= var10) {
                                              break L7;
                                            } else {
                                              var14 = param3.b(true);
                                              array$1 = new byte[var14];
                                              var12[var13_int] = array$1;
                                              param3.a(0, (byte) -124, var23[var13_int], var14);
                                              var13_int++;
                                              continue L8;
                                            }
                                          }
                                        }
                                      }
                                      var19_ref.field_m[var6] = var7_int;
                                      var13 = new Class[var10];
                                      var18 = 0;
                                      var14 = var18;
                                      L9: while (true) {
                                        if (var18 >= var10) {
                                          var19_ref.field_p[var6] = param2.a((byte) 16, fm.a(true, var21), var13, var22);
                                          var19_ref.field_w[var6] = var23;
                                          break L3;
                                        } else {
                                          var13[var18] = fm.a(true, var11[var18]);
                                          var18++;
                                          continue L9;
                                        }
                                      }
                                    } else {
                                      var11[var12_int] = param3.j(-49);
                                      var12_int++;
                                      continue L6;
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L10: {
                            var16 = param3.j(-98);
                            var8 = var16;
                            var17 = param3.j(-46);
                            var9 = var17;
                            var10 = 0;
                            if (-2 == (var7_int ^ -1)) {
                              var10 = param3.b(true);
                              break L10;
                            } else {
                              break L10;
                            }
                          }
                          var19_ref.field_m[var6] = var7_int;
                          var19_ref.field_r[var6] = var10;
                          var19_ref.field_n[var6] = param2.a(fm.a(true, var16), var17, (byte) -88);
                          break L3;
                        }
                        decompiledRegionSelector0 = 0;
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L11: {
                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        var19_ref.field_q[var6] = -1;
                        decompiledRegionSelector0 = 0;
                        break L11;
                      }
                    } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L12: {
                        var7_ref = (SecurityException) (Object) decompiledCaughtException;
                        var19_ref.field_q[var6] = -2;
                        decompiledRegionSelector0 = 0;
                        break L12;
                      }
                    } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                      decompiledCaughtException = decompiledCaughtParameter2;
                      L13: {
                        var7_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                        var19_ref.field_q[var6] = -3;
                        decompiledRegionSelector0 = 0;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L14: {
                        var7_ref3 = (Exception) (Object) decompiledCaughtException;
                        var19_ref.field_q[var6] = -4;
                        decompiledRegionSelector0 = 0;
                        break L14;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L15: {
                        var7_ref4 = decompiledCaughtException;
                        var19_ref.field_q[var6] = -5;
                        decompiledRegionSelector0 = 0;
                        break L15;
                      }
                    }
                    if (decompiledRegionSelector0 == 0) {
                      var6++;
                      continue L1;
                    } else {
                      continue L1;
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L16: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_35_0 = (RuntimeException) (var4);
                stackOut_35_1 = new StringBuilder().append("vn.C(").append(param0).append(',').append(param1).append(',');
                stackIn_37_0 = stackOut_35_0;
                stackIn_37_1 = stackOut_35_1;
                stackIn_36_0 = stackOut_35_0;
                stackIn_36_1 = stackOut_35_1;
                if (param2 == null) {
                  stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
                  stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
                  stackOut_37_2 = "null";
                  stackIn_38_0 = stackOut_37_0;
                  stackIn_38_1 = stackOut_37_1;
                  stackIn_38_2 = stackOut_37_2;
                  break L16;
                } else {
                  stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
                  stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
                  stackOut_36_2 = "{...}";
                  stackIn_38_0 = stackOut_36_0;
                  stackIn_38_1 = stackOut_36_1;
                  stackIn_38_2 = stackOut_36_2;
                  break L16;
                }
              }
              L17: {
                stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
                stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(',');
                stackIn_40_0 = stackOut_38_0;
                stackIn_40_1 = stackOut_38_1;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                if (param3 == null) {
                  stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
                  stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
                  stackOut_40_2 = "null";
                  stackIn_41_0 = stackOut_40_0;
                  stackIn_41_1 = stackOut_40_1;
                  stackIn_41_2 = stackOut_40_2;
                  break L17;
                } else {
                  stackOut_39_0 = (RuntimeException) ((Object) stackIn_39_0);
                  stackOut_39_1 = (StringBuilder) ((Object) stackIn_39_1);
                  stackOut_39_2 = "{...}";
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_41_1 = stackOut_39_1;
                  stackIn_41_2 = stackOut_39_2;
                  break L17;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_41_0), stackIn_41_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (param1 != 0) {
            return -51;
        }
        return aj.a(param3, false, aj.a(param2, false, param0));
    }

    final void a(int param0, int param1, int param2, int param3, byte param4) {
        int var6 = 24;
        int var7 = 5;
        this.field_i.a(param2, param1, -82, param0, param3, var7, var6);
        ba.field_sb.b(0, 2147483647, 0, ud.field_J.field_gb, ad.field_x);
        qk.field_e.b(2 + ad.field_x, 2147483647, 0, -80 + (-2 + -nk.field_n) + (ud.field_J.field_gb + -2), 18);
        mb.field_f.b(ad.field_x + 2, 2147483647, -2 + ud.field_J.field_gb + (-nk.field_n + -80), 82 - -nk.field_n, 18);
        aj.field_Mb.a(0, ud.field_J.field_gb, 8, 2, nk.field_n, 20, -22 + -ad.field_x + ud.field_J.field_Db, 20 + (2 + ad.field_x));
        cp.field_c.a(20, nk.field_n, 0, 2);
        int var8 = 111 % ((param4 - -58) / 45);
    }

    vn(String param0, vh param1) {
        String[] var3 = null;
        vh[] var4 = null;
        try {
            var3 = new String[]{param0, cl.field_i, ll.field_e};
            var4 = new vh[]{param1, ud.field_J, (vh) ((Object) cp.field_c)};
            this.field_i = new wd(0L, bb.field_c, var3, ea.field_u, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "vn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_h = null;
        field_j = null;
        field_g = null;
        if (!param0) {
            ge var2 = (ge) null;
            vn.a((byte) -54, -128, (sj) null, (ge) null);
        }
    }

    static {
        field_d = new nl();
        field_b = -1;
        field_a = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
