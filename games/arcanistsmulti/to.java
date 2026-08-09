/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class to extends tf {
    static qb field_q;
    static String field_n;
    static int[] field_r;
    static hf field_s;
    static String field_o;
    static int field_p;
    static int field_m;

    public static void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                to.d(true);
                break L1;
              }
            }
            field_s = null;
            field_o = null;
            field_n = null;
            field_q = null;
            field_r = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "to.NA(" + param0 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!pn.a((byte) 111)) {
                break L1;
              } else {
                param0 = false;
                break L1;
              }
            }
            L2: {
              ej.a(-11837, param0);
              var2_int = 125 / ((25 - param1) / 59);
              if (!ua.field_J) {
                break L2;
              } else {
                de.b(tn.field_Ob.field_c.field_T, tn.field_Ob.field_c.field_db, tn.field_Ob.field_c.field_x, tn.field_Ob.field_c.field_I);
                tn.field_Ob.field_c.a(param0, true);
                break L2;
              }
            }
            bg.a(param0, (byte) -73);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "to.LA(" + param0 + ',' + param1 + ')');
        }
    }

    to() {
    }

    final static void a(byte[] param0, boolean param1, int[] param2, int param3, int param4) {
        int incrementValue$21 = 0;
        int incrementValue$22 = 0;
        byte dupTemp$23 = 0;
        int dupTemp$24 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (kl.field_B.length <= var5_int) {
                L2: {
                  if (!param1) {
                    break L2;
                  } else {
                    field_p = 100;
                    break L2;
                  }
                }
                break L0;
              } else {
                param3 = kl.field_B[var5_int];
                var6 = var5_int << 1602644708;
                L3: while (true) {
                  incrementValue$21 = param3;
                  param3--;
                  if (-1 == (incrementValue$21 ^ -1)) {
                    var5_int++;
                    continue L1;
                  } else {
                    incrementValue$22 = var6;
                    var6++;
                    param4 = w.field_Lb[incrementValue$22];
                    dupTemp$23 = param0[param4];
                    dupTemp$24 = param2[dupTemp$23];
                    param2[dupTemp$23] = dupTemp$24 + 1;
                    w.field_Lb[dupTemp$24] = param4;
                    continue L3;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var5);

            stackIn_16_1 = new StringBuilder().append("to.OA(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_21_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int d(boolean param0) {
        try {
            int stackIn_5_0 = 0;
            int stackIn_8_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_39_0 = 0;
            int stackIn_47_0 = 0;
            int stackIn_50_0 = 0;
            int stackIn_52_0 = 0;
            int stackIn_54_0 = 0;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            wk var1 = null;
            int var1_int = 0;
            IOException var1_ref = null;
            RuntimeException var1_ref2 = null;
            try {
              L0: {
                if (4 <= jl.field_c.field_i) {
                  if ((jl.field_c.field_o ^ -1) != 0) {
                    if ((jl.field_c.field_o ^ -1) != 1) {
                      stackIn_10_0 = 1;
                      decompiledRegionSelector1 = 2;
                      break L0;
                    } else {
                      stackIn_8_0 = 4;
                      decompiledRegionSelector1 = 1;
                      break L0;
                    }
                  } else {
                    stackIn_5_0 = 3;
                    decompiledRegionSelector1 = 0;
                    break L0;
                  }
                } else {
                  L1: {
                    if (param0) {
                      break L1;
                    } else {
                      to.a((byte[]) null, false, (int[]) null, -92, -42);
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      L3: {
                        if (0 == uh.field_m) {
                          hg.field_a = ri.field_g.a(ed.field_Hb, true, jd.field_g);
                          uh.field_m = uh.field_m + 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      L4: {
                        if ((uh.field_m ^ -1) != -2) {
                          break L4;
                        } else {
                          if (-3 != (hg.field_a.field_e ^ -1)) {
                            if ((hg.field_a.field_e ^ -1) != -2) {
                              break L4;
                            } else {
                              uh.field_m = uh.field_m + 1;
                              break L4;
                            }
                          } else {
                            stackIn_23_0 = hg.a((byte) 110, -1);
                            decompiledRegionSelector0 = 0;
                            break L2;
                          }
                        }
                      }
                      L5: {
                        if (uh.field_m == 2) {
                          td.field_E = new k((java.net.Socket) (hg.field_a.field_g), ri.field_g);
                          var1 = new wk(13);
                          jb.a(var1, ne.field_b, ib.field_u, ce.field_o, 123);
                          var1.f(15, (byte) -28);
                          var1.a(hd.field_a, (byte) -101);
                          td.field_E.a(13, 0, (byte) 126, var1.field_j);
                          uh.field_m = uh.field_m + 1;
                          ud.field_E = qj.b(-26572) + 30000L;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (3 == uh.field_m) {
                          if (-1 <= (td.field_E.b(0) ^ -1)) {
                            if (qj.b(-26572) > ud.field_E) {
                              stackIn_47_0 = hg.a((byte) 110, -2);
                              decompiledRegionSelector0 = 2;
                              break L2;
                            } else {
                              break L6;
                            }
                          } else {
                            var1_int = td.field_E.a((byte) 120);
                            if (var1_int != 0) {
                              stackIn_39_0 = hg.a((byte) 110, var1_int);
                              decompiledRegionSelector0 = 1;
                              break L2;
                            } else {
                              uh.field_m = uh.field_m + 1;
                              break L6;
                            }
                          }
                        } else {
                          break L6;
                        }
                      }
                      if (uh.field_m != 4) {
                        stackIn_52_0 = -1;
                        decompiledRegionSelector0 = 4;
                        break L2;
                      } else {
                        jl.field_c.a(ab.field_n, true, td.field_E);
                        hg.field_a = null;
                        td.field_E = null;
                        uh.field_m = 0;
                        stackIn_50_0 = 0;
                        decompiledRegionSelector0 = 3;
                        break L2;
                      }
                    }
                  } catch (java.io.IOException decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var1_ref = (IOException) (Object) decompiledCaughtException;
                    stackIn_54_0 = hg.a((byte) 110, -3);
                    return stackIn_54_0;
                  }
                  if (decompiledRegionSelector0 == 0) {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  } else {
                    if (decompiledRegionSelector0 == 1) {
                      decompiledRegionSelector1 = 4;
                      break L0;
                    } else {
                      if (decompiledRegionSelector0 == 2) {
                        decompiledRegionSelector1 = 5;
                        break L0;
                      } else {
                        if (decompiledRegionSelector0 == 3) {
                          decompiledRegionSelector1 = 6;
                          break L0;
                        } else {
                          decompiledRegionSelector1 = 7;
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              throw aa.a((Throwable) ((Object) var1_ref2), "to.MA(" + param0 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_5_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_8_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_10_0;
                } else {
                  if (decompiledRegionSelector1 == 3) {
                    return stackIn_23_0;
                  } else {
                    if (decompiledRegionSelector1 == 4) {
                      return stackIn_39_0;
                    } else {
                      if (decompiledRegionSelector1 == 5) {
                        return stackIn_47_0;
                      } else {
                        if (decompiledRegionSelector1 == 6) {
                          return stackIn_50_0;
                        } else {
                          return stackIn_52_0;
                        }
                      }
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(byte param0, int[] param1, int[] param2, boolean param3, vg param4, boolean param5, boolean param6) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
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
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        int stackIn_59_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_72_1 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        StringBuilder stackIn_76_1 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        var31 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var7_int = 2147483647;
            var8 = -2147483648;
            var15 = 33 / ((param0 - 23) / 38);
            var22 = param1[3] >> 65481538;
            var23 = param1[4] >> -1429560158;
            var24 = param1[5] >> -1831640638;
            var25 = param1[6] >> -1865710814;
            var26 = param1[7] >> -504894846;
            var27 = param1[8] >> 846479170;
            var28 = param1[9] >> -580718750;
            var29 = param1[10] >> 314192226;
            var30 = param1[11] >> 567829858;
            var12 = param2[5] * var24 + (param2[4] * var23 + param2[3] * var22) >> -1812247538;
            var13 = var25 * param2[3] + (var26 * param2[4] + var27 * param2[5]) >> -409636818;
            var14 = var28 * param2[3] - -(var29 * param2[4]) + param2[5] * var30 >> 1682335950;
            var16 = var24 * param2[8] + var22 * param2[6] + var23 * param2[7] >> -1479717586;
            var17 = var26 * param2[7] + (var25 * param2[6] + var27 * param2[8]) >> 531368430;
            var21 = var29 * param2[10] + (var28 * param2[9] - -(var30 * param2[11])) >> 900719982;
            var20 = param2[9] * var25 + (var26 * param2[10] + var27 * param2[11]) >> 758941038;
            var18 = param2[8] * var30 + param2[6] * var28 + var29 * param2[7] >> -1766822834;
            var19 = var23 * param2[10] + param2[9] * var22 - -(var24 * param2[11]) >> 350886030;
            var22 = -param1[0] + param2[0];
            var23 = param2[1] - param1[1];
            var24 = -param1[2] + param2[2];
            var9 = var24 * param1[5] + (param1[3] * var22 + param1[4] * var23) >> 16 + -tj.field_C;
            var10 = var24 * param1[8] + (param1[7] * var23 + var22 * param1[6]) >> 16 - tj.field_C;
            var11 = var24 * param1[11] + (var23 * param1[10] + param1[9] * var22) >> 1190130736;
            var22 = id.field_i;
            var23 = id.field_g;
            var24 = 0;
            L1: while (true) {
              L2: {
                if ((var24 ^ -1) <= (param4.field_f ^ -1)) {
                  L3: {
                    if (null == param4.field_y) {
                      break L3;
                    } else {
                      if (param4.field_g == null) {
                        break L3;
                      } else {
                        if (param4.field_x == null) {
                          break L3;
                        } else {
                          if (null == param4.field_J) {
                            break L3;
                          } else {
                            if (param4.field_a == null) {
                              break L3;
                            } else {
                              if (param4.field_j == null) {
                                break L3;
                              } else {
                                if (param4.field_o == null) {
                                  break L3;
                                } else {
                                  if (param4.field_E == null) {
                                    break L3;
                                  } else {
                                    if (param4.field_p != null) {
                                      var24 = 0;
                                      L4: while (true) {
                                        if ((param4.field_G ^ -1) >= (var24 ^ -1)) {
                                          break L3;
                                        } else {
                                          var25 = param4.field_y[var24];
                                          var26 = param4.field_g[var24];
                                          var27 = param4.field_x[var24];
                                          sl.field_V[var24] = (var16 * var26 + (var25 * var12 + var19 * var27) >> -731594064) + var9;
                                          k.field_m[var24] = var10 + (var27 * var20 + var26 * var17 + var25 * var13 >> -1792894672);
                                          kc.field_N[var24] = (var21 * var27 + var18 * var26 + var25 * var14 >> 1265459664) + var11;
                                          var25 = param4.field_J[var24];
                                          var26 = param4.field_a[var24];
                                          var27 = param4.field_j[var24];
                                          cn.field_M[var24] = var9 - -(var27 * var19 + (var16 * var26 + var12 * var25) >> -640783184);
                                          q.field_E[var24] = (var25 * var13 - -(var26 * var17) + var27 * var20 >> 1396061872) + var10;
                                          dh.field_Db[var24] = (var26 * var18 + var25 * var14 + var27 * var21 >> -529805456) + var11;
                                          var25 = param4.field_o[var24];
                                          var26 = param4.field_E[var24];
                                          var27 = param4.field_p[var24];
                                          ik.field_d[var24] = (var19 * var27 + var12 * var25 - -(var26 * var16) >> -613960784) + var9;
                                          be.field_m[var24] = (var27 * var20 + (var13 * var25 + var17 * var26) >> 1846939024) + var10;
                                          lm.field_b[var24] = var11 + (var21 * var27 + (var26 * var18 + var25 * var14) >> -918056656);
                                          var24++;
                                          continue L4;
                                        }
                                      }
                                    } else {
                                      break L3;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (!param3) {
                    break L2;
                  } else {
                    var9 = param2[3];
                    var10 = param2[4];
                    var11 = param2[5];
                    var12 = param2[6];
                    var13 = param2[7];
                    var14 = param2[8];
                    var15 = param2[9];
                    var16 = param2[10];
                    var17 = param2[11];
                    var18 = 0;
                    L5: while (true) {
                      stackIn_56_0 = param4.field_A ^ -1;
                      stackIn_56_1 = var18 ^ -1;
                      if (stackIn_56_0 >= stackIn_56_1) {
                        break L2;
                      } else {
                        stackIn_59_0 = var18 ^ -1;
                        if (stackIn_59_0 <= (dc.field_k.length ^ -1)) {
                          break L2;
                        } else {
                          var19 = param4.field_r[var18];
                          var20 = param4.field_e[var18];
                          var21 = param4.field_S[var18];
                          dc.field_k[var18] = var9 * var19 - (-(var12 * var20) - var21 * var15) >> 1635417840;
                          nf.field_Lb[var18] = var16 * var21 + var13 * var20 + var10 * var19 >> -1780948656;
                          mf.field_b[var18] = var21 * var17 + var19 * var11 - -(var20 * var14) >> 1614729552;
                          var18++;
                          continue L5;
                        }
                      }
                    }
                  }
                } else {
                  var25 = param4.field_b[var24];
                  var26 = param4.field_B[var24];
                  var27 = param4.field_L[var24];
                  var28 = var9 - -(var25 * var12 - (-(var26 * var16) - var27 * var19) >> -tj.field_C + 16);
                  var29 = (var20 * var27 + var17 * var26 + var13 * var25 >> 16 - tj.field_C) + var10;
                  var30 = var11 - -(var27 * var21 + var14 * var25 - -(var18 * var26) >> -1867092144);
                  stackIn_56_0 = 50;

                  stackIn_56_1 = var30;

                  L7: {
                    if (stackIn_56_0 > stackIn_56_1) {
                      eg.field_a[var24] = -2147483648;
                      break L7;
                    } else {
                      L8: {
                        ud.field_p[var24] = var28 / var30 + var22;
                        v.field_g[var24] = var29 / var30 + var23;
                        if ((var30 ^ -1) >= (var8 ^ -1)) {
                          break L8;
                        } else {
                          var8 = var30;
                          break L8;
                        }
                      }
                      eg.field_a[var24] = var30;
                      if (var30 < var7_int) {
                        var7_int = var30;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                  L9: {
                    if (!param6) {
                      break L9;
                    } else {
                      ba.field_k[var24] = var28 >> tj.field_C;
                      vf.field_v[var24] = var29 >> tj.field_C;
                      gm.field_g[var24] = var30;
                      break L9;
                    }
                  }
                  var24++;
                  continue L1;
                }
              }
              ig.a(param5, param4, var8, (byte) -79, var7_int);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            runtimeException = decompiledCaughtException;
            stackIn_68_0 = (RuntimeException) (runtimeException);

            stackIn_68_1 = new StringBuilder().append("to.KA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L10;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_68_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_69_2).append(',');

            if (param2 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "null";
              break L11;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_73_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackIn_73_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_76_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "null";
              break L12;
            } else {
              stackIn_69_0 = (RuntimeException) ((Object) stackIn_69_0);
              stackIn_77_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackIn_77_2 = "{...}";
              break L12;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_69_0), stackIn_77_2 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_n = "You need a rating of <%1> to play with the current options.";
        field_o = "If you run out of Imps, just summon some more. Move an Imp to a target and blow it up!";
        field_r = new int[228];
    }
}
