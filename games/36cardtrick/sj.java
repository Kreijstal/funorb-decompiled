/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class sj {
    static int field_c;
    static be field_d;
    static bk field_a;
    static Calendar field_b;

    final static int a(int param0, int param1, Random param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Main.field_T;
        try {
          L0: {
            if (param1 > 0) {
              if (ng.a(param1, (byte) -101)) {
                stackIn_6_0 = (int)((4294967295L & (long)param2.nextInt()) * (long)param1 >> -1558177248);
                decompiledRegionSelector0 = 0;
                break L0;
              } else {
                L1: {
                  var3_int = -2147483648 + -(int)(4294967296L % (long)param1);
                  if (param0 == 10999) {
                    break L1;
                  } else {
                    field_a = (bk) null;
                    break L1;
                  }
                }
                L2: while (true) {
                  var4 = param2.nextInt();
                  if (var4 >= var3_int) {
                    continue L2;
                  } else {
                    stackIn_11_0 = sk.a(param0 + -10970, param1, var4);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("sj.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static Object a(boolean param0, int param1, byte[] param2) {
        ei var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        ei stackIn_6_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param2 != null) {
              if (param1 < param2.length) {
                var3 = new ei();
                ((vf) ((Object) var3)).a(param2, (byte) 120);
                stackIn_6_0 = (ei) (var3);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (param0) {
                  stackIn_11_0 = bf.a(0, param2);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_9_0 = (byte[]) (param2);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3_ref);

            stackIn_14_1 = new StringBuilder().append("sj.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L1;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_9_0;
            } else {
              return stackIn_11_0;
            }
          }
        }
    }

    final static kc b(byte param0) {
        int var5_int = 0;
        int var6 = Main.field_T;
        int var1 = hb.field_a[0] * na.field_q[0];
        byte[] var2 = rd.field_k[0];
        int[] var3 = new int[var1];
        int var4 = -87 % ((-29 - param0) / 59);
        for (var5_int = 0; var5_int < var1; var5_int++) {
            var3[var5_int] = jf.field_i[bc.a(255, (int) var2[var5_int])];
        }
        kc var5 = new kc(p.field_l, gk.field_a, kb.field_c[0], ml.field_b[0], na.field_q[0], hb.field_a[0], var3);
        rh.d(-128);
        return var5;
    }

    final static void a(byte param0) {
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        String stackIn_28_0 = null;
        String stackIn_35_0 = null;
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        vg stackIn_46_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        vg var9 = null;
        int var10 = 0;
        var10 = Main.field_T;
        try {
          L0: {
            if (param0 <= -60) {
              L1: {
                var1_int = qe.field_E;
                var2 = 0;
                if (v.field_R != 2) {
                  break L1;
                } else {
                  var3_long = -jl.field_c + id.a(87);
                  var2 = (int)((10999L + -var3_long) / 1000L);
                  if ((var2 ^ -1) > -1) {
                    var2 = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var3 = 0;
              L2: while (true) {
                if (var3 >= me.field_a.length) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var4 = wd.field_d[var3];
                    if (-1 < (var4 ^ -1)) {
                      var5 = af.field_jb;
                      break L3;
                    } else {
                      if (var4 == cg.field_e.field_k) {
                        var5 = ca.field_b;
                        break L3;
                      } else {
                        var5 = wg.field_a;
                        break L3;
                      }
                    }
                  }
                  L4: {
                    var6 = me.field_a[var3];
                    if (v.field_R != 2) {
                      break L4;
                    } else {
                      if (var2 != 1) {
                        break L4;
                      } else {
                        L5: {
                          if (tf.field_p.length <= ia.field_d.length) {
                            stackIn_19_0 = ia.field_d.length;
                            break L5;
                          } else {
                            stackIn_19_0 = tf.field_p.length;
                            break L5;
                          }
                        }
                        L6: {
                          var7 = stackIn_19_0;
                          if (gl.field_G.length > da.field_c.length) {
                            stackIn_22_0 = gl.field_G.length;
                            break L6;
                          } else {
                            stackIn_22_0 = da.field_c.length;
                            break L6;
                          }
                        }
                        L7: {
                          var8 = stackIn_22_0;
                          if ((var3 ^ -1) > -7) {
                            break L7;
                          } else {
                            if (var3 < var7 + 6) {
                              L8: {
                                if (ia.field_d.length + (var3 - 6 + -var7) >= 0) {
                                  stackIn_28_0 = ia.field_d[ia.field_d.length + (-6 + (var3 - var7))];
                                  break L8;
                                } else {
                                  stackIn_28_0 = "";
                                  break L8;
                                }
                              }
                              var6 = stackIn_28_0;
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                        }
                        if (var3 < var7 + 7) {
                          break L4;
                        } else {
                          if (var3 < 7 - (-var7 + -var8)) {
                            L9: {
                              if (-7 + (var3 - var7) >= da.field_c.length) {
                                stackIn_35_0 = "";
                                break L9;
                              } else {
                                stackIn_35_0 = da.field_c[-7 + var3 - var7];
                                break L9;
                              }
                            }
                            var6 = stackIn_35_0;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L10: {
                    if (1 != (var4 ^ -1)) {
                      break L10;
                    } else {
                      var6 = Integer.toString(var2);
                      break L10;
                    }
                  }
                  L11: {
                    stackIn_40_0 = 0;

                    if (var4 < 0) {
                      stackIn_41_0 = stackIn_40_0;
                      stackIn_41_1 = 0;
                      break L11;
                    } else {
                      stackIn_41_0 = stackIn_40_0;
                      stackIn_41_1 = 1;
                      break L11;
                    }
                  }
                  L12: {
                    var7 = hj.a(stackIn_41_0 != 0, stackIn_41_1 != 0, var6);
                    var8 = dl.field_g - (var7 >> 548018209);
                    if (-1 >= (var4 ^ -1)) {
                      L13: {
                        var1_int = var1_int + e.field_i;
                        if (cg.field_e.field_k == var4) {
                          stackIn_46_0 = ie.field_m;
                          break L13;
                        } else {
                          stackIn_46_0 = wd.field_b;
                          break L13;
                        }
                      }
                      L14: {
                        var9 = stackIn_46_0;
                        if (var9 != null) {
                          var9.a((byte) -122, var1_int, tl.field_b + (a.field_o << 1452217473), var8 - tc.field_b, var7 - -(tc.field_b << -1063980095));
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      var1_int = var1_int + a.field_o;
                      break L12;
                    } else {
                      break L12;
                    }
                  }
                  L15: {
                    if ((var4 ^ -1) <= -1) {
                      c.field_u.b(var6, var8, var1_int - -field_c, var5, -1);
                      var1_int = var1_int + (a.field_o - (-e.field_i + -tl.field_b));
                      break L15;
                    } else {
                      mb.field_a.b(var6, var8, mg.field_q + var1_int, var5, -1);
                      var1_int = var1_int + sa.field_d;
                      break L15;
                    }
                  }
                  var3++;
                  continue L2;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "sj.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
            return;
        }
        field_a = null;
        field_b = null;
        field_d = null;
    }

    final static nc a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var6 = null;
        nc stackIn_3_0 = null;
        nc stackIn_7_0 = null;
        nc stackIn_17_0 = null;
        nc stackIn_21_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Main.field_T;
        try {
          L0: {
            var2_int = param0.length();
            if (var2_int != 0) {
              if (-64 > (var2_int ^ -1)) {
                stackIn_7_0 = dj.field_f;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L1: while (true) {
                  if (var3 >= var2_int) {
                    if (param1 != 8) {
                      var6 = (byte[]) null;
                      sj.a(true, 21, (byte[]) null);
                      stackIn_26_0 = null;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    L2: {
                      var4 = param0.charAt(var3);
                      if (var4 != 45) {
                        if ((ag.field_c.indexOf(var4) ^ -1) == 0) {
                          stackIn_21_0 = ij.field_i;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      } else {
                        L3: {
                          if (var3 == 0) {
                            break L3;
                          } else {
                            if (var2_int + -1 != var3) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackIn_17_0 = ij.field_i;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L1;
                  }
                }
              }
            } else {
              stackIn_3_0 = ec.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var2);

            stackIn_29_1 = new StringBuilder().append("sj.C(");

            if (param0 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L4;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_21_0;
              } else {
                return (nc) ((Object) stackIn_26_0);
              }
            }
          }
        }
    }

    final static void a(int param0, String param1, String[] param2, int param3) {
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param0 > 23) {
                break L1;
              } else {
                field_a = (bk) null;
                break L1;
              }
            }
            L2: {
              jc.field_P = gg.field_b;
              if (255 != param3) {
                L3: {
                  if (-101 < (param3 ^ -1)) {
                    break L3;
                  } else {
                    if (-106 <= (param3 ^ -1)) {
                      mh.field_a = pf.a(-109, param2);
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                mh.field_a = nc.a(param3, 0, param1);
                break L2;
              } else {
                L4: {
                  stackIn_6_0 = -1;

                  if (13 <= ok.field_c) {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = 0;
                    break L4;
                  } else {
                    stackIn_7_0 = stackIn_6_0;
                    stackIn_7_1 = 1;
                    break L4;
                  }
                }
                mh.field_a = il.a(stackIn_7_0, stackIn_7_1 != 0);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("sj.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    static {
        field_d = new be();
        field_a = new bk();
        field_b = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
    }
}
