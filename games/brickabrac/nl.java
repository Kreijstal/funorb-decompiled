/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static int field_c;
    static jp field_d;
    static mf field_a;
    static om field_f;
    static jp field_e;
    static jp field_b;

    public static void a(int param0) {
        boolean discarded$2 = false;
        int[] var2 = null;
        field_a = null;
        field_d = null;
        field_f = null;
        field_e = null;
        field_b = null;
        if (param0 <= -68) {
          return;
        } else {
          var2 = (int[]) null;
          discarded$2 = nl.a((int[]) null, (byte) -73);
          return;
        }
    }

    final static boolean a(int[] param0, byte param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        pg var4_ref_pg = null;
        int var4 = 0;
        int var5_int = 0;
        pg var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (q.field_i == rf.field_b) {
              L1: {
                if (param1 == 64) {
                  break L1;
                } else {
                  field_f = (om) null;
                  break L1;
                }
              }
              L2: {
                var2_long = ue.a(false);
                if (0 == ue.field_d) {
                  break L2;
                } else {
                  if (-1 >= (ob.field_I ^ -1)) {
                    break L2;
                  } else {
                    var4_ref_pg = (pg) ((Object) al.field_m.d(-124));
                    if (var4_ref_pg == null) {
                      break L2;
                    } else {
                      if ((var2_long ^ -1L) >= (var4_ref_pg.field_j ^ -1L)) {
                        break L2;
                      } else {
                        var4_ref_pg.b((byte) 111);
                        ga.field_j = var4_ref_pg.field_l.length;
                        jl.field_e.field_l = 0;
                        var5_int = 0;
                        L3: while (true) {
                          if (ga.field_j <= var5_int) {
                            r.field_z = we.field_a;
                            we.field_a = mh.field_gb;
                            mh.field_gb = si.field_a;
                            si.field_a = var4_ref_pg.field_r;
                            stackOut_13_0 = 1;
                            stackIn_14_0 = stackOut_13_0;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            jl.field_e.field_k[var5_int] = var4_ref_pg.field_l[var5_int];
                            var5_int++;
                            continue L3;
                          }
                        }
                      }
                    }
                  }
                }
              }
              L4: while (true) {
                L5: {
                  if (0 <= ob.field_I) {
                    break L5;
                  } else {
                    jl.field_e.field_l = 0;
                    if (!vd.a(20, 1)) {
                      stackOut_19_0 = 0;
                      stackIn_20_0 = stackOut_19_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      ob.field_I = jl.field_e.d(true);
                      jl.field_e.field_l = 0;
                      ga.field_j = param0[ob.field_I];
                      break L5;
                    }
                  }
                }
                if (!um.b((byte) -104)) {
                  stackOut_24_0 = 0;
                  stackIn_25_0 = stackOut_24_0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (ue.field_d != 0) {
                    L6: {
                      var4 = ue.field_d;
                      if (0.0 == ej.field_J) {
                        break L6;
                      } else {
                        var4 = (int)((double)var4 + ji.field_e.nextGaussian() * ej.field_J);
                        if (0 <= var4) {
                          break L6;
                        } else {
                          var4 = 0;
                          break L6;
                        }
                      }
                    }
                    var5 = new pg(var2_long + (long)var4, ob.field_I, new byte[ga.field_j]);
                    var6 = 0;
                    L7: while (true) {
                      if (ga.field_j <= var6) {
                        al.field_m.a(var5, (byte) 3);
                        ob.field_I = -1;
                        continue L4;
                      } else {
                        var5.field_l[var6] = jl.field_e.field_k[var6];
                        var6++;
                        continue L7;
                      }
                    }
                  } else {
                    r.field_z = we.field_a;
                    we.field_a = mh.field_gb;
                    mh.field_gb = si.field_a;
                    si.field_a = ob.field_I;
                    ob.field_I = -1;
                    stackOut_27_0 = 1;
                    stackIn_28_0 = stackOut_27_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) (var2);
            stackOut_36_1 = new StringBuilder().append("nl.A(");
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param0 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L8;
            } else {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L8;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_20_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_25_0 != 0;
              } else {
                return stackIn_28_0 != 0;
              }
            }
          }
        }
    }

    final static String a(boolean param0, boolean param1, int param2, long param3, int param4) {
        StringBuilder discarded$10 = null;
        StringBuilder discarded$11 = null;
        StringBuilder discarded$12 = null;
        StringBuilder discarded$13 = null;
        StringBuilder discarded$14 = null;
        StringBuilder discarded$15 = null;
        StringBuilder discarded$16 = null;
        StringBuilder discarded$17 = null;
        StringBuilder discarded$18 = null;
        StringBuilder discarded$19 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        StringBuilder var13 = null;
        StringBuilder var14 = null;
        L0: {
          var12 = BrickABrac.field_J ? 1 : 0;
          var6 = 44;
          var7 = 46;
          if (0 == param4) {
            var6 = 46;
            var7 = 44;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param4 != 2) {
            break L1;
          } else {
            var7 = 160;
            break L1;
          }
        }
        if (param0) {
          L2: {
            var8 = 0;
            if (param3 < 0L) {
              param3 = -param3;
              var8 = 1;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            var14 = new StringBuilder(26);
            if (param2 <= 0) {
              break L3;
            } else {
              var10 = 0;
              L4: while (true) {
                if (param2 <= var10) {
                  discarded$10 = var14.append((char) var6);
                  break L3;
                } else {
                  var11 = (int)param3;
                  param3 = param3 / 10L;
                  discarded$11 = var14.append((char)(-((int)param3 * 10) + (48 - -var11)));
                  var10++;
                  continue L4;
                }
              }
            }
          }
          var10 = 0;
          L5: while (true) {
            var11 = (int)param3;
            param3 = param3 / 10L;
            discarded$12 = var14.append((char)(-(10 * (int)param3) + var11 + 48));
            if (-1L == (param3 ^ -1L)) {
              if (var8 != 0) {
                discarded$13 = var14.append('-');
                return var14.reverse().toString();
              } else {
                return var14.reverse().toString();
              }
            } else {
              if (!param1) {
                continue L5;
              } else {
                var10++;
                if (var10 % 3 != 0) {
                  continue L5;
                } else {
                  discarded$14 = var14.append((char) var7);
                  continue L5;
                }
              }
            }
          }
        } else {
          L6: {
            field_a = (mf) null;
            var8 = 0;
            if (param3 < 0L) {
              param3 = -param3;
              var8 = 1;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            var13 = new StringBuilder(26);
            var9 = var13;
            if (param2 <= 0) {
              break L7;
            } else {
              var10 = 0;
              L8: while (true) {
                if (param2 <= var10) {
                  discarded$15 = var13.append((char) var6);
                  break L7;
                } else {
                  var11 = (int)param3;
                  param3 = param3 / 10L;
                  discarded$16 = var13.append((char)(-((int)param3 * 10) + (48 - -var11)));
                  var10++;
                  continue L8;
                }
              }
            }
          }
          var10 = 0;
          L9: while (true) {
            var11 = (int)param3;
            param3 = param3 / 10L;
            discarded$17 = var13.append((char)(-(10 * (int)param3) + var11 + 48));
            if (-1L == (param3 ^ -1L)) {
              if (var8 == 0) {
                return var13.reverse().toString();
              } else {
                discarded$18 = var13.append('-');
                return var13.reverse().toString();
              }
            } else {
              if (!param1) {
                continue L9;
              } else {
                var10++;
                if (var10 % 3 != 0) {
                  continue L9;
                } else {
                  discarded$19 = var13.append((char) var7);
                  continue L9;
                }
              }
            }
          }
        }
    }

    static {
    }
}
