/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends ca {
    static bd field_e;
    static String field_i;
    private String field_j;
    static int field_g;
    static bd field_h;
    private String field_f;

    final static void a(int param0, String param1, byte param2) {
        int var3_int = 0;
        try {
            rj.field_K = false;
            if (param2 < 41) {
                field_h = (bd) null;
            }
            eh.field_e = false;
            if (null != jj.field_d) {
                if (!jj.field_d.field_F) {
                    return;
                }
                var3_int = 1;
                if (8 == param0) {
                    if (!li.field_o) {
                        param1 = de.field_m;
                    } else {
                        param1 = ti.field_i;
                    }
                    param0 = 2;
                    ib.field_e.a(rf.field_e, 10000536);
                }
                if (!(10 != param0)) {
                    var3_int = 0;
                    fe.a(true);
                }
                if (var3_int != 0) {
                    if (!(!rj.field_K)) {
                        param1 = vg.a(new String[]{param1}, 21, ck.field_o);
                    }
                    if (!(!md.field_i)) {
                        param1 = jm.field_h;
                    }
                    jj.field_d.a(param0, 17, param1);
                }
                if (-257 != (param0 ^ -1) && param0 != 10 && !li.field_o) {
                    ib.field_e.a(false);
                    return;
                }
            }
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "la.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_4_0 = 0;
            int stackIn_12_0 = 0;
            int stackIn_19_0 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = HostileSpawn.field_I ? 1 : 0;
            try {
              L0: {
                if (al.field_T) {
                  stackIn_4_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  try {
                    L1: {
                      L2: {
                        var2 = "tuhstatbut";
                        var3 = (String) (a.a("getcookies", param0, param1 + -10419));
                        var4 = cj.a(var3, -44, ';');
                        if (param1 == 10295) {
                          break L2;
                        } else {
                          la.b(-103);
                          break L2;
                        }
                      }
                      var5 = 0;
                      L3: while (true) {
                        if (var4.length <= var5) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L4: {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                              break L4;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                break L4;
                              } else {
                                stackIn_12_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              }
                            }
                          }
                          var5++;
                          continue L3;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L6: {
                      if (param0.getParameter("tuhstatbut") == null) {
                        stackIn_19_0 = 0;
                        break L6;
                      } else {
                        stackIn_19_0 = 1;
                        break L6;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_22_0 = (RuntimeException) (var2_ref2);

                stackIn_22_1 = new StringBuilder().append("la.I(");

                if (param0 == null) {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "null";
                  break L7;
                } else {
                  stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                  stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                  stackIn_23_2 = "{...}";
                  break L7;
                }
              }
              throw wg.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_4_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_19_0 != 0;
              } else {
                return stackIn_12_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        if (param0 == 19659) {
          if (uj.field_m == null) {
            if (eb.field_e != null) {
              eb.field_e.h();
              return;
            } else {
              return;
            }
          } else {
            uj.field_m.h();
            if (eb.field_e == null) {
              return;
            } else {
              eb.field_e.h();
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(vi param0, int param1) {
        try {
            param0.a(120, this.field_j);
            if (param1 >= -94) {
                field_g = -36;
            }
            param0.a((byte) -119, this.field_f);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "la.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1) {
        java.applet.Applet var3;
        kb.field_b = de.field_k[param1];
        u.field_j = gg.field_C[param1];
        if (param0 != -29828) {
          var3 = (java.applet.Applet) null;
          la.a((java.applet.Applet) null, 68);
          ad.field_b = gm.field_k[param1];
          return;
        } else {
          ad.field_b = gm.field_k[param1];
          return;
        }
    }

    final static void a(int param0, int param1, pg param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        var21 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (param0 - param4 << -750320120) / param2.field_i;
              var7 = (param4 << -469219640) - -(var6_int * param2.field_c);
              param5 = param5 + param2.field_b;
              param3 = param3 + param2.field_c;
              var8 = si.field_e * param5 + param3;
              var9 = 0;
              var10 = param2.field_f;
              var11 = param2.field_a;
              var12 = -var11 + si.field_e;
              if (param5 < si.field_j) {
                var14 = si.field_j - param5;
                var10 = var10 - var14;
                var9 = var9 + var14 * var11;
                param5 = si.field_j;
                var8 = var8 + var14 * si.field_e;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var13 = 0;
              if (si.field_a < var10 + param5) {
                var10 = var10 - (-si.field_a + (param5 - -var10));
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param3 < si.field_b) {
                var14 = si.field_b - param3;
                param3 = si.field_b;
                var11 = var11 - var14;
                var12 = var12 + var14;
                var7 = var7 + var14 * var6_int;
                var13 = var13 + var14;
                var9 = var9 + var14;
                var8 = var8 + var14;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (si.field_l < var11 + param3) {
                var14 = -si.field_l + (param3 - -var11);
                var12 = var12 + var14;
                var11 = var11 - var14;
                var13 = var13 + var14;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (0 >= var11) {
                break L5;
              } else {
                if ((var10 ^ -1) >= -1) {
                  break L5;
                } else {
                  var14 = 75 / ((45 - param1) / 60);
                  param5 = -var10;
                  L6: while (true) {
                    if (0 <= param5) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var15 = var7;
                      param3 = -var11;
                      L7: while (true) {
                        if (0 <= param3) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param5++;
                          continue L6;
                        } else {
                          L8: {
                            var16 = var15 >> -1103182872;
                            var15 = var15 + var6_int;
                            var17 = 256 + -var16;
                            if (var16 < 0) {
                              var9++;
                              var8++;
                              break L8;
                            } else {
                              L9: {
                                incrementValue$0 = var9;
                                var9++;
                                var18 = param2.field_k[255 & param2.field_j[incrementValue$0]];
                                if (var18 == 0) {
                                  break L9;
                                } else {
                                  if (-256 > (var16 ^ -1)) {
                                    si.field_i[var8] = var18;
                                    break L9;
                                  } else {
                                    var19 = si.field_i[var8];
                                    var20 = var16 * (var18 & 16711935) + var17 * (var19 & 16711935) >> -81417368 & 16711935;
                                    si.field_i[var8] = var20 - -(ua.a(16711749, var16 * ua.a(65280, var18) + ua.a(var19, 65280) * var17) >> 2095813768);
                                    break L9;
                                  }
                                }
                              }
                              var8++;
                              break L8;
                            }
                          }
                          param3++;
                          continue L7;
                        }
                      }
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var6 = decompiledCaughtException;
            stackIn_35_0 = (RuntimeException) (var6);

            stackIn_35_1 = new StringBuilder().append("la.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L10;
            } else {
              stackIn_36_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L10;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final bl a(boolean param0) {
        if (param0) {
            field_i = (String) null;
            return uk.field_a;
        }
        return uk.field_a;
    }

    final static int a(int param0, boolean param1) {
        if (param1) {
            field_h = (bd) null;
            return ge.field_d[2047 & param0];
        }
        return ge.field_d[2047 & param0];
    }

    final static s b(boolean param0) {
        if (param0) {
          field_h = (bd) null;
          return new s(jm.a((byte) 93), hm.c(8));
        } else {
          return new s(jm.a((byte) 93), hm.c(8));
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -62) {
            field_h = (bd) null;
            field_h = null;
            field_i = null;
            return;
        }
        field_h = null;
        field_i = null;
    }

    la(String param0, String param1) {
        try {
            this.field_f = param1;
            this.field_j = param0;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "la.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = "If you have an account, log in to start at any level you've reached.";
    }
}
