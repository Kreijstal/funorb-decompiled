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
            field_v = null;
        }
        if (((qb) this).b((byte) -122)) {
            var6 = kd.a(((qb) this).field_m, param3, (byte) -36);
            if (!var6.a((byte) -84, param3, ((qb) this).field_m)) {
                qf.a(param3, var6, 2, rp.field_w, -13, false);
                var6.a(((qb) this).field_m, param3, (byte) 78);
            }
            dg.a(-899814320, 306, param2, cr.field_D, var6.field_p, param0, 2, ep.field_b, param4, -13);
        } else {
            lb.g(param2, param0, 306, 480, rm.field_d[param3], 22953);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        pb var7 = null;
        if (((qb) this).b((byte) -106)) {
            int discarded$1 = -20777;
            var7 = ge.a(((qb) this).field_m, param3);
            if (!(var7.a((byte) -84, param3, ((qb) this).field_m))) {
                qf.a(param3, var7, 1, dm.field_f, 0, !param0 ? true : false);
                var7.a(((qb) this).field_m, param3, (byte) 78);
            }
            dg.a(-899814320, 640, param4, lc.field_e, var7.field_p, param2, 1, rm.field_f, param1, 0);
        } else {
            lb.g(param4, param2, 640, 480, rm.field_d[param3], 22953);
        }
        if (!param0) {
            ((qb) this).a((byte) -27, 96, -30, 88);
        }
    }

    final static jp a(jp param0) {
        jp var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        jp stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var3 = new jp(param0.field_x * 8, param0.field_z);
            var3.g();
            var4 = 0;
            L1: while (true) {
              if (var4 >= 8) {
                kc.field_q.a((byte) 116);
                stackOut_6_0 = (jp) var3;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param0.c(param0.field_x * var4, 0);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("qb.P(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + false + ',' + 8 + ')');
        }
        return stackIn_7_0;
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
        if (((qb) this).b((byte) -109)) {
            gn.field_z.c(param2, param3);
        }
        int var5 = -18 / ((-28 - param0) / 43);
    }

    final static String[] a(byte param0, String param1, char param2) {
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
            var11 = (CharSequence) (Object) param1;
            var3_int = pp.a((byte) 120, param2, var11);
            var4 = new String[1 + var3_int];
            var5 = 0;
            var6 = -40 % ((param0 - 61) / 61);
            var7 = 0;
            var8 = 0;
            L1: while (true) {
              if (var8 >= var3_int) {
                var4[var3_int] = param1.substring(var7);
                stackOut_7_0 = (String[]) var4;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                var9 = var7;
                L2: while (true) {
                  if (param2 == param1.charAt(var9)) {
                    int incrementValue$2 = var5;
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
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("qb.Q(").append(param0).append(',');
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
          throw qb.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param2 + ')');
        }
        return stackIn_8_0;
    }

    final static int a(String[] args, int param1, int param2, dh param3, String param4) {
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
        int stackIn_19_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param3.c(param4);
              if (param1 < var5_int) {
                break L1;
              } else {
                if (param4.indexOf("<br>") != -1) {
                  break L1;
                } else {
                  args[0] = (String) (Object) args;
                  stackOut_3_0 = 1;
                  stackIn_4_0 = stackOut_3_0;
                  return stackIn_4_0;
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
                    int incrementValue$2 = var6;
                    var6++;
                    args[incrementValue$2] = param4.substring(var7, var8).trim();
                    break L3;
                  }
                }
                stackOut_18_0 = var6;
                stackIn_19_0 = stackOut_18_0;
                break L0;
              } else {
                L4: {
                  L5: {
                    var10 = param4.charAt(var9);
                    if (var10 == 32) {
                      break L5;
                    } else {
                      if (var10 != 45) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var11 = param4.substring(var7, var9 + 1).trim();
                  var12 = param3.c(var11);
                  if (param1 <= var12) {
                    int incrementValue$3 = var6;
                    var6++;
                    args[incrementValue$3] = var11;
                    var7 = 1 + var9;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L6: {
                  if (var10 != 62) {
                    break L6;
                  } else {
                    break L6;
                  }
                }
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var5;
            stackOut_20_1 = new StringBuilder().append("qb.A(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (args == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',').append(-63).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
            stackOut_26_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param4 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ')');
        }
        return stackIn_19_0;
    }

    public static void f(int param0) {
        field_t = null;
        field_v = null;
        field_y = null;
        if (param0 != 0) {
            Object var2 = null;
            v discarded$0 = qb.a((Throwable) null, (String) null);
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
            var2 = (v) (Object) param0;
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
          int discarded$2 = 6846;
          ec.h();
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Please enter your age in years";
        field_s = "Who can join";
        field_t = "Connection restored.";
    }
}
