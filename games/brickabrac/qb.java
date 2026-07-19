/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends ki {
    static mf field_r;
    static boolean field_u;
    static mh field_x;
    static mh field_v;
    static String field_y;
    static String field_s;
    static int field_w;
    static String field_t;

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        pb var6 = null;
        if (param1 >= -84) {
            field_v = (mh) null;
        }
        if (this.b((byte) -122)) {
            var6 = kd.a(this.field_m, param3, (byte) -36);
            if (!var6.a((byte) -84, param3, this.field_m)) {
                qf.a(param3, var6, 2, rp.field_w, -13, false);
                var6.a(this.field_m, param3, (byte) 78);
            }
            dg.a(-899814320, 306, param2, cr.field_D, var6.field_p, param0, 2, ep.field_b, param4, -13);
        } else {
            lb.g(param2, param0, 306, 480, rm.field_d[param3], 22953);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var7 = null;
        if (this.b((byte) -106)) {
            var7 = ge.a(this.field_m, param3, -20777);
            if (!(var7.a((byte) -84, param3, this.field_m))) {
                qf.a(param3, var7, 1, dm.field_f, 0, !param0 ? true : false);
                var7.a(this.field_m, param3, (byte) 78);
            }
            dg.a(-899814320, 640, param4, lc.field_e, var7.field_p, param2, 1, rm.field_f, param1, 0);
        } else {
            lb.g(param4, param2, 640, 480, rm.field_d[param3], 22953);
        }
        if (!param0) {
            this.a((byte) -27, 96, -30, 88);
        }
    }

    final static jp a(jp param0, boolean param1, int param2) {
        jp var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        jp stackIn_3_0 = null;
        jp stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_7_0 = null;
        jp stackOut_2_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              var3 = new jp(param0.field_x * param2, param0.field_z);
              var3.g();
              var4 = 0;
              L1: while (true) {
                if (param2 <= var4) {
                  kc.field_q.a((byte) 116);
                  stackOut_7_0 = (jp) (var3);
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  param0.c(param0.field_x * var4, 0);
                  var4++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (jp) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("qb.P(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_8_0;
        }
    }

    qb(int param0, String param1, String param2, int param3) {
        super(param0, param1, param2, param3);
    }

    final boolean b(byte param0) {
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param0 <= -91) {
            break L0;
          } else {
            field_u = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == lc.field_e) {
              break L2;
            } else {
              if (rm.field_f == null) {
                break L2;
              } else {
                if (dm.field_f == null) {
                  break L2;
                } else {
                  if (null == gn.field_z) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final boolean a(boolean param0) {
        if (!(i.field_m.a("farm", -28138))) {
            return false;
        }
        lc.field_e = pl.a("farm", "farm_near", (byte) 103, i.field_m);
        rm.field_f = pl.a("farm", "farm_mid", (byte) -63, i.field_m);
        dm.field_f = pl.a("farm", "farm_far", (byte) -78, i.field_m);
        gn.field_z = pl.a("farm", "farm_small", (byte) 106, i.field_m);
        if (param0) {
            qb.g(-29);
        }
        cr.field_D = jh.a(0, lc.field_e);
        ep.field_b = jh.a(0, rm.field_f);
        rp.field_w = jh.a(0, dm.field_f);
        return true;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param1 > -1) {
            lb.g(param2, param3, 153, 238, rm.field_d[param1], 22953);
        } else {
            lb.g(param2, param3, 153, 238, 7829367, 22953);
        }
        if (this.b((byte) -109)) {
            gn.field_z.c(param2, param3);
        }
        int var5 = -18 / ((-28 - param0) / 43);
    }

    final static String[] a(byte param0, String param1, char param2) {
        int incrementValue$2 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        CharSequence var11 = null;
        String[] stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var11 = (CharSequence) ((Object) param1);
            var3_int = pp.a((byte) 120, param2, var11);
            var4 = new String[1 + var3_int];
            var5 = 0;
            var6 = -40 % ((param0 - 61) / 61);
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (var8 >= var3_int) {
                var4[var3_int] = param1.substring(var7);
                stackOut_7_0 = (String[]) (var4);
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var9 = var7;
                L2: while (true) {
                  if (param2 == param1.charAt(var9)) {
                    incrementValue$2 = var5;
                    var5++;
                    var4[incrementValue$2] = param1.substring(var7, var9);
                    var7 = var9 + 1;
                    var8++;
                    continue L1;
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("qb.Q(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    final static int a(String[] args, int param1, int param2, dh param3, String param4) {
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3.c(param4);
              if (param1 < var5_int) {
                break L1;
              } else {
                if (0 != (param4.indexOf("<br>") ^ -1)) {
                  break L1;
                } else {
                  args[0] = param4;
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            var6 = (var5_int - (-param1 - -1)) / param1;
            param1 = var5_int / var6;
            var6 = 0;
            var7 = 0;
            var8 = param4.length();
            var9 = 0;
            L2: while (true) {
              if (var9 >= var8) {
                L3: {
                  if (var8 <= var7) {
                    break L3;
                  } else {
                    incrementValue$3 = var6;
                    var6++;
                    args[incrementValue$3] = param4.substring(var7, var8).trim();
                    break L3;
                  }
                }
                L4: {
                  if (param2 == -63) {
                    break L4;
                  } else {
                    field_s = (String) null;
                    break L4;
                  }
                }
                stackOut_22_0 = var6;
                stackIn_23_0 = stackOut_22_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L5: {
                  L6: {
                    var10 = param4.charAt(var9);
                    if (var10 == 32) {
                      break L6;
                    } else {
                      if (var10 != 45) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var11 = param4.substring(var7, var9 + 1).trim();
                  var12 = param3.c(var11);
                  if (param1 <= var12) {
                    incrementValue$4 = var6;
                    var6++;
                    args[incrementValue$4] = var11;
                    var7 = 1 + var9;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (var10 == 62) {
                  if (param4.regionMatches(var9 - 3, "<br>", 0, 4)) {
                    incrementValue$5 = var6;
                    var6++;
                    args[incrementValue$5] = param4.substring(var7, var9 - 3).trim();
                    var7 = var9 + 1;
                    var9++;
                    continue L2;
                  } else {
                    var9++;
                    continue L2;
                  }
                } else {
                  var9++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var5);
            stackOut_24_1 = new StringBuilder().append("qb.A(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (args == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param4 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L9;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_23_0;
        }
    }

    public static void f(int param0) {
        v discarded$0 = null;
        field_t = null;
        field_v = null;
        field_y = null;
        if (param0 != 0) {
            String var2 = (String) null;
            discarded$0 = qb.a((Throwable) null, (String) null);
        }
        field_x = null;
        field_r = null;
        field_s = null;
    }

    final static v a(Throwable param0, String param1) {
        v var2 = null;
        if (!(param0 instanceof v)) {
            var2 = new v(param0, param1);
        } else {
            var2 = (v) ((Object) param0);
            var2.field_d = var2.field_d + ' ' + param1;
        }
        return var2;
    }

    final static void g(int param0) {
        L0: {
          L1: {
            if (10 == i.field_j) {
              break L1;
            } else {
              if (am.i(0)) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ec.h(6846);
          i.field_j = 11;
          break L0;
        }
        L2: {
          if (param0 >= 105) {
            break L2;
          } else {
            qb.f(-80);
            break L2;
          }
        }
        vq.field_C = true;
    }

    static {
        field_y = "Please enter your age in years";
        field_s = "Who can join";
        field_t = "Connection restored.";
    }
}
