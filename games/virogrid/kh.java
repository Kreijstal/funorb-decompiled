/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kh {
    static dl field_c;
    static int[][] field_f;
    static String field_a;
    static ob field_e;
    static int field_d;
    static km field_g;
    static km field_b;

    public static void a(byte param0) {
        field_c = null;
        field_e = null;
        field_f = null;
        field_g = null;
        field_b = null;
        field_a = null;
        if (param0 <= 24) {
            field_f = null;
        }
    }

    final static void a(boolean param0) {
        pe var1 = null;
        int var2 = 0;
        L0: {
          var2 = Virogrid.field_F ? 1 : 0;
          ae.field_g.c();
          ac.field_c.c();
          ql.field_t = ql.field_t - 1;
          if (-1 == (ql.field_t ^ -1)) {
            ql.field_t = 200;
            var1 = (pe) (Object) co.field_a.a((byte) -112);
            L1: while (true) {
              if (var1 == null) {
                if (gk.field_f != null) {
                  var1 = (pe) (Object) gk.field_f.a((byte) -112);
                  L2: while (true) {
                    if (var1 != null) {
                      L3: {
                        if (var1.field_h.b(false)) {
                          break L3;
                        } else {
                          var1.a(false);
                          break L3;
                        }
                      }
                      var1 = (pe) (Object) gk.field_f.a(16213);
                      continue L2;
                    } else {
                      if (vg.field_B == null) {
                        break L0;
                      } else {
                        if (vg.field_B.d(120)) {
                          break L0;
                        } else {
                          qi.field_b = null;
                          break L0;
                        }
                      }
                    }
                  }
                } else {
                  if (vg.field_B == null) {
                    break L0;
                  } else {
                    if (vg.field_B.d(120)) {
                      break L0;
                    } else {
                      qi.field_b = null;
                      break L0;
                    }
                  }
                }
              } else {
                L4: {
                  if (var1.field_h.b(false)) {
                    break L4;
                  } else {
                    var1.a(false);
                    break L4;
                  }
                }
                var1 = (pe) (Object) co.field_a.a(16213);
                continue L1;
              }
            }
          } else {
            if (vg.field_B == null) {
              break L0;
            } else {
              if (vg.field_B.d(120)) {
                break L0;
              } else {
                qi.field_b = null;
                break L0;
              }
            }
          }
        }
        L5: {
          if (!param0) {
            break L5;
          } else {
            field_f = null;
            break L5;
          }
        }
    }

    final static void a(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Object var4 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var3 = Virogrid.field_F ? 1 : 0;
                        if (param0 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        var4 = null;
                        gh discarded$3 = kh.a((byte) -112, (String) null);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (ji.field_e != null) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        ji.field_e.b(120);
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        if (null == bc.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        bc.field_a.b((byte) -56);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (dj.field_l == null) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        try {
                            dj.field_l.b((byte) 14);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (null != ij.field_n) {
                            statePc = 13;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        var1 = 0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (var1 >= ij.field_n.length) {
                            statePc = 20;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (ij.field_n[var1] != null) {
                            statePc = 17;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ij.field_n[var1].b((byte) 14);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 19: {
                        var2 = (IOException) (Object) caughtException;
                        var1++;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 20: {
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(km param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dj var9 = null;
        String var10 = null;
        mg var11 = null;
        dj var12 = null;
        String var13 = null;
        mg var14 = null;
        dj var15 = null;
        String var16 = null;
        mg var17 = null;
        dj var18 = null;
        String var19 = null;
        mg var20 = null;
        dj var21 = null;
        String var22 = null;
        mg var23 = null;
        dj var24 = null;
        String var25 = null;
        mg var26 = null;
        dj var27 = null;
        String var28 = null;
        mg var29 = null;
        mg var29_ref = null;
        dj var30 = null;
        String var31 = null;
        mg var32 = null;
        dj var33 = null;
        String var34 = null;
        mg var35 = null;
        dj var36 = null;
        L0: {
          ai.a(param1, (um) null, (int[]) null, (String) null, 0L, (String) null, -1, param0, 60);
          if (param1 == 0) {
            var9 = md.field_e;
            var11 = j.field_k[0];
            var29 = var11;
            var29 = var11;
            var10 = vb.field_d;
            var9.field_a.a(var10, (byte) 89, 11, var11);
            var12 = md.field_e;
            var14 = j.field_k[1];
            var29 = var14;
            var29 = var14;
            var13 = ql.field_p;
            var12.field_a.a(var13, (byte) 89, 12, var14);
            var15 = md.field_e;
            var17 = j.field_k[2];
            var29 = var17;
            var29 = var17;
            var16 = f.field_h;
            var15.field_a.a(var16, (byte) 89, 13, var17);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (1 != param1) {
            break L1;
          } else {
            var18 = md.field_e;
            var20 = j.field_k[0];
            var29 = var20;
            var29 = var20;
            var19 = pc.field_c;
            var18.field_a.a(var19, (byte) 89, 11, var20);
            var21 = md.field_e;
            var23 = j.field_k[1];
            var29 = var23;
            var29 = var23;
            var22 = oa.field_u;
            var21.field_a.a(var22, (byte) 89, 12, var23);
            var24 = md.field_e;
            var26 = j.field_k[2];
            var29 = var26;
            var29 = var26;
            var25 = la.field_m;
            var24.field_a.a(var25, (byte) 89, 13, var26);
            break L1;
          }
        }
        L2: {
          if (param1 == 2) {
            var27 = md.field_e;
            var29_ref = j.field_k[0];
            var28 = bf.field_s;
            var27.field_a.a(var28, (byte) 89, 11, var29_ref);
            var30 = md.field_e;
            var32 = j.field_k[1];
            var31 = ql.field_f;
            var30.field_a.a(var31, (byte) 89, 12, var32);
            var33 = md.field_e;
            var35 = j.field_k[2];
            var34 = mi.field_a;
            var33.field_a.a(var34, (byte) 89, 13, var35);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (param2 == 20435) {
            break L3;
          } else {
            field_c = null;
            break L3;
          }
        }
        var36 = md.field_e;
        var4 = param0.field_Bb;
        var5 = param0.field_J;
        var6 = param0.field_K;
        var7 = param0.field_ub;
        var36.field_a.a(var7, 0, var6, var4, var5);
    }

    final static mg[] a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        mg[] var10 = null;
        mg[] var11_ref_mg__ = null;
        int var11 = 0;
        int var12 = 0;
        mg var13 = null;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        var15 = Virogrid.field_F ? 1 : 0;
        var9 = param8 + param0 + param6;
        var10 = new mg[]{new mg(var9, var9), new mg(param5, var9), new mg(var9, var9), new mg(var9, param5), new mg(64, 64), new mg(var9, param5), new mg(var9, var9), new mg(param5, var9), new mg(var9, var9)};
        var11_ref_mg__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 >= var11_ref_mg__.length) {
            var11 = 0;
            L1: while (true) {
              if (param0 <= var11) {
                var11 = 0;
                L2: while (true) {
                  if (param0 <= var11) {
                    L3: {
                      if (param2 == -105) {
                        break L3;
                      } else {
                        var16 = null;
                        kh.a(92, -47, -44, -58, (e) null, (byte) 53, (mg[]) null, 44, 120, 77, -28, (mg[]) null, 119, (e) null, true);
                        break L3;
                      }
                    }
                    var11 = 0;
                    L4: while (true) {
                      if (var11 >= param5) {
                        var11 = 0;
                        L5: while (true) {
                          if (var11 >= param5 >> 358628609) {
                            return var10;
                          } else {
                            var12 = 0;
                            L6: while (true) {
                              if (var12 < param6) {
                                var10[1].field_B[var11 + (-1 + var9 - var12) * param5] = param7;
                                var10[3].field_B[-var12 - (1 + -var9) + var11 * var9] = param7;
                                var10[7].field_B[var11 + var12 * param5] = param7;
                                var10[5].field_B[var12 + var9 * var11] = param7;
                                var12++;
                                continue L6;
                              } else {
                                var11++;
                                continue L5;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = 0;
                        L7: while (true) {
                          if (param0 > var12) {
                            var10[7].field_B[(-var12 + (var9 - 1)) * param5 - -var11] = param1;
                            var10[5].field_B[var11 * var9 + (-var12 + -1) + var9] = param1;
                            var10[1].field_B[param5 * var12 - -var11] = param3;
                            var10[3].field_B[var11 * var9 - -var12] = param3;
                            var12++;
                            continue L7;
                          } else {
                            var11++;
                            continue L4;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = 0;
                    L8: while (true) {
                      if (var9 <= var12) {
                        var11++;
                        continue L2;
                      } else {
                        var10[0].field_B[var12 + var9 * var11] = param3;
                        var10[0].field_B[var12 * var9 - -var11] = param3;
                        if (var9 - var11 > var12) {
                          var10[2].field_B[var12 - -(var11 * var9)] = param3;
                          var10[6].field_B[var9 * var12 - -var11] = param3;
                          var12++;
                          continue L8;
                        } else {
                          var12++;
                          continue L8;
                        }
                      }
                    }
                  }
                }
              } else {
                var12 = 0;
                L9: while (true) {
                  if (var9 <= var12) {
                    var11++;
                    continue L1;
                  } else {
                    var10[6].field_B[var12 + (-var11 + (var9 - 1)) * var9] = param1;
                    var10[8].field_B[var12 + (var9 + (-var11 + -1)) * var9] = param1;
                    var10[2].field_B[var9 * var12 + (-var11 + -1 + var9)] = param1;
                    var10[8].field_B[var9 - (1 - -var11 - var9 * var12)] = param1;
                    var12++;
                    continue L9;
                  }
                }
              }
            }
          } else {
            var13 = var11_ref_mg__[var12];
            var14 = 0;
            L10: while (true) {
              if (var13.field_B.length <= var14) {
                var12++;
                continue L0;
              } else {
                var13.field_B[var14] = param4;
                var14++;
                continue L10;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, e param4, byte param5, mg[] param6, int param7, int param8, int param9, int param10, mg[] param11, int param12, e param13, boolean param14) {
        Object var16 = null;
        ok.a(param0, 480, jl.field_E, -100, param3, param9, en.field_Kb, param2, param10, param13, param1, (mg[]) null, 0, param8, param7, ti.field_b, param11, param4, param6, param12, 0);
        int var15 = -42 % ((18 - param5) / 62);
        ti.a(param14, -1502464351);
    }

    final static gh a(byte param0, String param1) {
        int var2 = 0;
        String var3 = null;
        gh var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        var6 = Virogrid.field_F ? 1 : 0;
        if (ie.field_a != null) {
          L0: {
            var2 = 0 % ((param0 - -51) / 62);
            var7 = (CharSequence) (Object) param1;
            var3 = c.a(var7, true);
            if (var3 == null) {
              var3 = (String) (Object) var7;
              break L0;
            } else {
              break L0;
            }
          }
          var4 = (gh) (Object) ie.field_a.a((long)var3.hashCode(), (byte) 96);
          L1: while (true) {
            if (var4 != null) {
              L2: {
                var8 = (CharSequence) (Object) var4.field_Hb;
                var5 = c.a(var8, true);
                if (var5 == null) {
                  var5 = var4.field_Hb;
                  break L2;
                } else {
                  break L2;
                }
              }
              if (var5.equals((Object) (Object) var3)) {
                return var4;
              } else {
                var4 = (gh) (Object) ie.field_a.c(48);
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new dl();
        field_a = "Add name";
        field_e = new ob();
    }
}
