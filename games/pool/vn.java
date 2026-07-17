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
            byte[][] var20 = null;
            String var21 = null;
            String var22 = null;
            byte[][] var23 = null;
            byte[][] var24 = null;
            byte[][] var25 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            RuntimeException stackIn_36_0 = null;
            StringBuilder stackIn_36_1 = null;
            RuntimeException stackIn_37_0 = null;
            StringBuilder stackIn_37_1 = null;
            String stackIn_37_2 = null;
            RuntimeException stackIn_38_0 = null;
            StringBuilder stackIn_38_1 = null;
            RuntimeException stackIn_39_0 = null;
            StringBuilder stackIn_39_1 = null;
            RuntimeException stackIn_40_0 = null;
            StringBuilder stackIn_40_1 = null;
            String stackIn_40_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            RuntimeException stackOut_36_0 = null;
            StringBuilder stackOut_36_1 = null;
            String stackOut_36_2 = null;
            RuntimeException stackOut_35_0 = null;
            StringBuilder stackOut_35_1 = null;
            String stackOut_35_2 = null;
            RuntimeException stackOut_37_0 = null;
            StringBuilder stackOut_37_1 = null;
            RuntimeException stackOut_39_0 = null;
            StringBuilder stackOut_39_1 = null;
            String stackOut_39_2 = null;
            RuntimeException stackOut_38_0 = null;
            StringBuilder stackOut_38_1 = null;
            String stackOut_38_2 = null;
            var15 = Pool.field_O;
            try {
              L0: {
                var19 = (Object) (Object) new ho();
                ((ho) var19).field_t = param3.g(-105);
                ((ho) var19).field_o = param3.b(true);
                ((ho) var19).field_w = new byte[((ho) var19).field_t][][];
                ((ho) var19).field_r = new int[((ho) var19).field_t];
                ((ho) var19).field_p = new le[((ho) var19).field_t];
                ((ho) var19).field_m = new int[((ho) var19).field_t];
                ((ho) var19).field_n = new le[((ho) var19).field_t];
                var5 = 57 % ((param0 - -62) / 55);
                ((ho) var19).field_q = new int[((ho) var19).field_t];
                var6 = 0;
                L1: while (true) {
                  if (~var6 <= ~((ho) var19).field_t) {
                    pj.field_H.b((byte) 82, (ma) var19);
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
                              if (var7_int == 1) {
                                break L4;
                              } else {
                                if (var7_int != 2) {
                                  L5: {
                                    L6: {
                                      if (var7_int == 3) {
                                        break L6;
                                      } else {
                                        if (var7_int != 4) {
                                          break L5;
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                    var21 = param3.j(-21);
                                    var22 = param3.j(-26);
                                    var10 = param3.g(-84);
                                    var11 = new String[var10];
                                    var12_int = 0;
                                    L7: while (true) {
                                      if (var10 <= var12_int) {
                                        L8: {
                                          var25 = new byte[var10][];
                                          var24 = var25;
                                          var23 = var24;
                                          var20 = var23;
                                          var12 = var20;
                                          if (var7_int != 3) {
                                            break L8;
                                          } else {
                                            var13_int = 0;
                                            L9: while (true) {
                                              if (var13_int >= var10) {
                                                break L8;
                                              } else {
                                                var14 = param3.b(true);
                                                var12[var13_int] = new byte[var14];
                                                param3.a(0, (byte) -124, var25[var13_int], var14);
                                                var13_int++;
                                                continue L9;
                                              }
                                            }
                                          }
                                        }
                                        ((ho) var19).field_m[var6] = var7_int;
                                        var13 = new Class[var10];
                                        var18 = 0;
                                        var14 = var18;
                                        L10: while (true) {
                                          if (~var18 <= ~var10) {
                                            ((ho) var19).field_p[var6] = param2.a((byte) 16, fm.a(true, var21), var13, var22);
                                            ((ho) var19).field_w[var6] = var25;
                                            break L5;
                                          } else {
                                            var13[var18] = fm.a(true, var11[var18]);
                                            var18++;
                                            continue L10;
                                          }
                                        }
                                      } else {
                                        var11[var12_int] = param3.j(-49);
                                        var12_int++;
                                        continue L7;
                                      }
                                    }
                                  }
                                  break L3;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                          L11: {
                            var16 = param3.j(-98);
                            var8 = var16;
                            var17 = param3.j(-46);
                            var9 = var17;
                            var10 = 0;
                            if (var7_int == 1) {
                              var10 = param3.b(true);
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          ((ho) var19).field_m[var6] = var7_int;
                          ((ho) var19).field_r[var6] = var10;
                          ((ho) var19).field_n[var6] = param2.a(fm.a(true, var16), var17, (byte) -88);
                          break L3;
                        }
                        break L2;
                      }
                    } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L12: {
                        var7 = (ClassNotFoundException) (Object) decompiledCaughtException;
                        ((ho) var19).field_q[var6] = -1;
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter3) {
                      decompiledCaughtException = decompiledCaughtParameter3;
                      L15: {
                        var7_ref3 = (Exception) (Object) decompiledCaughtException;
                        ((ho) var19).field_q[var6] = -4;
                        break L15;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter4) {
                      decompiledCaughtException = decompiledCaughtParameter4;
                      L16: {
                        var7_ref4 = decompiledCaughtException;
                        ((ho) var19).field_q[var6] = -5;
                        break L16;
                      }
                    }
                    var6++;
                    continue L1;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              L17: {
                var4 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_34_0 = (RuntimeException) var4;
                stackOut_34_1 = new StringBuilder().append("vn.C(").append(param0).append(44).append(param1).append(44);
                stackIn_36_0 = stackOut_34_0;
                stackIn_36_1 = stackOut_34_1;
                stackIn_35_0 = stackOut_34_0;
                stackIn_35_1 = stackOut_34_1;
                if (param2 == null) {
                  stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
                  stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
                  stackOut_36_2 = "null";
                  stackIn_37_0 = stackOut_36_0;
                  stackIn_37_1 = stackOut_36_1;
                  stackIn_37_2 = stackOut_36_2;
                  break L17;
                } else {
                  stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
                  stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
                  stackOut_35_2 = "{...}";
                  stackIn_37_0 = stackOut_35_0;
                  stackIn_37_1 = stackOut_35_1;
                  stackIn_37_2 = stackOut_35_2;
                  break L17;
                }
              }
              L18: {
                stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
                stackOut_37_1 = ((StringBuilder) (Object) stackIn_37_1).append(stackIn_37_2).append(44);
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_38_0 = stackOut_37_0;
                stackIn_38_1 = stackOut_37_1;
                if (param3 == null) {
                  stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
                  stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
                  stackOut_39_2 = "null";
                  stackIn_40_0 = stackOut_39_0;
                  stackIn_40_1 = stackOut_39_1;
                  stackIn_40_2 = stackOut_39_2;
                  break L18;
                } else {
                  stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
                  stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
                  stackOut_38_2 = "{...}";
                  stackIn_40_0 = stackOut_38_0;
                  stackIn_40_1 = stackOut_38_1;
                  stackIn_40_2 = stackOut_38_2;
                  break L18;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 41);
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
        ((vn) this).field_i.a(param2, param1, -82, param0, param3, var7, var6);
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
            var4 = new vh[]{param1, ud.field_J, (vh) (Object) cp.field_c};
            ((vn) this).field_i = new wd(0L, bb.field_c, var3, ea.field_u, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "vn.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        field_h = null;
        field_j = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new nl();
        field_b = -1;
        field_a = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
    }
}
