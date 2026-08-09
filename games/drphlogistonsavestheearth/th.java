/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static boolean[] field_d;
    static volatile int field_e;
    static ld[] field_a;
    static sf field_c;
    static he[] field_b;

    final static void a(int param0, int param1, int param2, vk param3) {
        if (param0 != -27610) {
            return;
        }
        if (param3 == null) {
            return;
        }
        try {
            od.a(-1630758008, ag.a(param3, 100, param1, param2));
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "th.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static java.net.URL a(String param0, int param1, java.net.URL param2, int param3, String param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_41_0 = null;
            java.net.URL stackIn_43_0 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            String stackIn_47_2 = null;
            StringBuilder stackIn_49_1 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            StringBuilder stackIn_52_1 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            try {
              L0: {
                var5 = param2.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (var5.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5.indexOf('/', 1 + var6);
                      if (-1 >= (var7_int ^ -1)) {
                        if (param1 >= 0) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                        break L4;
                      } else {
                        var7_int = var5.indexOf('/', var6 - -1);
                        if (var7_int >= 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                        break L5;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (0 <= var7_int) {
                          if (param0 == null) {
                            break L3;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      L7: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', var6 + 1);
                      if (0 <= var7_int) {
                        if (param4 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if ((param1 ^ -1) < param3) {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param1));
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (param0 == null) {
                        break L9;
                      } else {
                        if ((param0.length() ^ -1) >= -1) {
                          break L9;
                        } else {
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param0);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (param4 == null) {
                        break L10;
                      } else {
                        if ((param4.length() ^ -1) < -1) {
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param4);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (var5.length() > var6) {
                        discarded$7 = var7.append(var5.substring(var6, var5.length()));
                        break L11;
                      } else {
                        discarded$8 = var7.append('/');
                        break L11;
                      }
                    }
                    try {
                      L12: {
                        stackIn_41_0 = new java.net.URL(param2, var7.toString());
                        break L12;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_43_0 = (java.net.URL) (param2);
                      return stackIn_43_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L13: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_46_0 = (RuntimeException) (var5_ref);

                stackIn_46_1 = new StringBuilder().append("th.E(");

                if (param0 == null) {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackIn_47_2 = "null";
                  break L13;
                } else {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
                  stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
                  stackIn_47_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_49_1 = ((StringBuilder) (Object) stackIn_47_1).append(stackIn_47_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "null";
                  break L14;
                } else {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "{...}";
                  break L14;
                }
              }
              L15: {


                stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',').append(param3).append(',');

                if (param4 == null) {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "null";
                  break L15;
                } else {
                  stackIn_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "{...}";
                  break L15;
                }
              }
              throw ie.a((Throwable) ((Object) stackIn_47_0), stackIn_53_2 + ')');
            }
            return stackIn_41_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(byte[] param0, byte param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 120) {
              stackIn_4_0 = ml.a(param0, 0, param2, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 87;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("th.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(boolean param0, int[] param1) {
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        wk var4_ref_wk = null;
        int var4 = 0;
        int var5_int = 0;
        wk var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            if (tl.field_O != ik.field_d) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var2_long = la.a(param0);
                if (-1 == (lc.field_v ^ -1)) {
                  break L1;
                } else {
                  if (-1 >= (dj.field_N ^ -1)) {
                    break L1;
                  } else {
                    var4_ref_wk = (wk) ((Object) og.field_f.h(-11151));
                    if (var4_ref_wk == null) {
                      break L1;
                    } else {
                      if ((var4_ref_wk.field_k ^ -1L) > (var2_long ^ -1L)) {
                        var4_ref_wk.a(-16175);
                        gf.field_C = var4_ref_wk.field_j.length;
                        dh.field_N.field_j = 0;
                        var5_int = 0;
                        L2: while (true) {
                          if (var5_int >= gf.field_C) {
                            l.field_q = gg.field_l;
                            gg.field_l = ek.field_h;
                            ek.field_h = t.field_b;
                            t.field_b = var4_ref_wk.field_n;
                            stackIn_14_0 = 1;
                            decompiledRegionSelector0 = 1;
                            break L0;
                          } else {
                            dh.field_N.field_h[var5_int] = var4_ref_wk.field_j[var5_int];
                            var5_int++;
                            continue L2;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                }
              }
              L3: while (true) {
                L4: {
                  if (-1 < (dj.field_N ^ -1)) {
                    dh.field_N.field_j = 0;
                    if (!jd.a(1, 5929)) {
                      stackIn_21_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      dj.field_N = dh.field_N.e((byte) 121);
                      dh.field_N.field_j = 0;
                      gf.field_C = param1[dj.field_N];
                      break L4;
                    }
                  } else {
                    break L4;
                  }
                }
                if (!li.d(-29427)) {
                  stackIn_26_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  if (lc.field_v == 0) {
                    l.field_q = gg.field_l;
                    gg.field_l = ek.field_h;
                    ek.field_h = t.field_b;
                    t.field_b = dj.field_N;
                    dj.field_N = -1;
                    stackIn_38_0 = 1;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    L5: {
                      var4 = lc.field_v;
                      if (0.0 != cm.field_G) {
                        var4 = (int)((double)var4 + cm.field_M.nextGaussian() * cm.field_G);
                        if (-1 < (var4 ^ -1)) {
                          var4 = 0;
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    var5 = new wk((long)var4 + var2_long, dj.field_N, new byte[gf.field_C]);
                    var6 = 0;
                    L6: while (true) {
                      if (var6 >= gf.field_C) {
                        og.field_f.a(var5, 255);
                        dj.field_N = -1;
                        continue L3;
                      } else {
                        var5.field_j[var6] = dh.field_N.field_h[var6];
                        var6++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackIn_41_0 = (RuntimeException) (var2);

            stackIn_41_1 = new StringBuilder().append("th.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "null";
              break L7;
            } else {
              stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackIn_42_2 = "{...}";
              break L7;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_14_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_26_0 != 0;
              } else {
                return stackIn_38_0 != 0;
              }
            }
          }
        }
    }

    final static boolean a(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int stackIn_3_0 = 0;
        int stackIn_5_0 = 0;
        Throwable decompiledCaughtException = null;
        var1_ref = ji.field_c;
        synchronized (var1_ref) {
          L0: {
            if (vb.field_l != rc.field_g) {
              var2 = 96 / ((param0 - -57) / 37);
              di.field_c = ac.field_f[rc.field_g];
              sj.field_g = na.field_a[rc.field_g];
              rc.field_g = rc.field_g + 1 & 127;
              stackIn_5_0 = 1;
              break L0;
            } else {
              stackIn_3_0 = 0;
              return stackIn_3_0 != 0;
            }
          }
        }
        return stackIn_5_0 != 0;
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 111) {
            field_a = (ld[]) null;
        }
        field_d = null;
    }

    static {
        field_e = 0;
        field_d = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, true, false, false, false, false, false, false, true, true, true, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
        field_a = new ld[13];
        field_b = new he[1];
    }
}
