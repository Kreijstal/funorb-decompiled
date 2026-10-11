/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh {
    static vp field_a;
    static sc field_f;
    static th field_d;
    static String[] field_b;
    static int[] field_c;
    static String field_e;

    public static void a(byte param0) {
        field_a = null;
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 >= -2) {
          bh.a((byte) 84);
        }
        field_d = null;
        field_f = null;
    }

    final static String a(int param0, ka param1) {
        String stackIn_32_0 = null;
        Object stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var2 = null;
        String var3 = null;
        int var4 = 0;
        jh var5 = null;
        String var6 = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var2 = null;
          if (param1.field_n != null) {
            var6 = param1.field_n;
            var2 = var6;
            var2 = var6;
            var2 = var6;
            if (1 == param1.field_h) {
              var2 = "<img=0>" + var6;
            }
            if (param1.field_h == 2) {
              var2 = "<img=1>" + (String) (var2);
            }
          }
          if (param0 >= -125) {
            var5 = (jh) null;
            bh.a(-58, -66, -108, (jh) null, true, 107, -83, 97);
          }
          var3 = "";
          if (2 != param1.field_l) {
            if (param1.field_l == 0 &&
              sn.field_Hb) {
              var3 = "[" + ne.field_vb + "] ";
            }
            if (param1.field_l == 1) {
              var3 = "[" + vl.a(ae.field_g, new String[]{param1.field_g}, 2) + "] ";
            }
            if (param1.field_l == 4 &&
              null != bp.field_t) {
              var3 = "[" + bp.field_t + "] ";
            }
            if (param1.field_l == 3) {
              var3 = "[#" + param1.field_g + "] ";
            }
            if (!param1.field_k) {
              var3 = var3 + (String) (var2) + ": ";
            }
          } else {
            if (!param1.field_k) {
              if (param1.field_i == 0 &&
                param1.field_o == 0) {
                var3 = vl.a(v.field_c, new String[]{(String) (var2)}, 2);
              } else {
                var3 = vl.a(lc.field_n, new String[]{(String) (var2)}, 2);
              }
            }
          }
          stackIn_32_0 = var3;
          return stackIn_32_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_35_0 = var2;
          stackIn_35_1 = new StringBuilder().append("bh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw fa.a((Throwable) (stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, jh param3, boolean param4, int param5, int param6, int param7) {
        mo[][] stackIn_6_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_101_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        mo[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        mo var13_ref_mo = null;
        int var14 = 0;
        int var15 = 0;
        ka var16 = null;
        mo[] var17 = null;
        mo[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int var10_intLifetime1;
        int var13Lifetime1;
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != -1712) {
            var16 = (ka) null;
            bh.a(-40, (ka) null);
          }
          if (param7 >= param5) {
            var8_int = 1;
            var9 = 0;
            while (true) {
              if (var9 >= iq.field_b.length) {
                if (var8_int == 0) {
                  return;
                }
                dj.field_l = true;
                return;
              }
              var20 = iq.field_b[var9];
              var19 = var20;
              var10 = var19;
              var11 = 0;
              var12 = 0;
              L4: while (true) {
                if (var12 >= var20.length) {
                  if (var11 == 0 &&
                    kj.field_h != param7) {
                    break L4;
                  }
                  var8_int = 0;
                  for (var12 = 0; var20.length > var12; var12 += 2) {
                    var13 = var20[var12];
                    if (var13 != -1) {
                      if (var13 < param7) {
                        ll.field_c[var13] = true;
                      }
                    } else {
                      lp.field_p = true;
                    }
                  }
                  break L4;
                }
                var13Lifetime1 = var20[var12];
                var14 = var10[var12 + 1];
                if (-1 != var13Lifetime1) {
                  if (param7 == var13Lifetime1 &&
                    param1 == var14) {
                    var11 = 1;
                  } else {
                    if (param7 <= var13Lifetime1) {
                      break L4;
                    }
                    if (var14 != (255 & rl.field_v[var13Lifetime1])) {
                      break L4;
                    }
                  }
                } else {
                  if (var14 != qo.field_r[param6]) {
                    break L4;
                  }
                }
                var12 += 2;
                continue;

              }
              var9++;
            }
          }
          stackIn_6_0 = ma.field_b;
          if (-1 != param7) {
            stackIn_7_1 = 4 + param7;
          } else {
            stackIn_7_1 = 1;
          }
          var17 = stackIn_6_0[stackIn_7_1];
          var18 = var17;
          var8 = var18;
          var9 = 1;
          if (param4) {
            if (-1 != param7) {
              for (var10_int = 0; var10_int < var17.length - 1; var10_int++) {
                if ((tg.field_a[(param2 + var10_int) / 8] & 1 << (param2 + var10_int & 7)) == 0) {
                  continue;
                }
                var9 = 0;
                break;
              }
              param2 = param2 + (od.field_Gb[param7] & 255);
            } else {
              var10_int = 0;
              while (!(qo.field_r.length <= var10_int)) {
                if (0 == (fg.field_k[var10_int / 8] & 1 << (7 & var10_int))) {
                  var10_int++;
                  continue;
                }
                var9 = 0;
                break;
              }
            }
          }
          var10_intLifetime1 = 0;
          var11 = 0;
          while (true) {
            if (param7 == -1) {
              stackIn_25_0 = qo.field_r.length;
            } else {
              stackIn_25_0 = var18.length - 1;
            }
            if (stackIn_25_0 <= var11) {
              if (var10_intLifetime1 == 0) {
                for (var11 = 0; var11 < -1 + var18.length; var11++) {
                  if (param7 == -1) {
                    param6 = var11;
                  } else {
                    rl.field_v[param7] = (byte)var11;
                  }
                  bh.a(-1712, param1, param2, param3, param4, param5, param6, param7 + 1);
                  if (dj.field_l) {
                    return;
                  }
                }
                return;
              }
              return;
            }
            if (-1 == param7) {
              param6 = var11;
            } else {
              rl.field_v[param7] = (byte)var11;
            }
            if (param7 == -1 &&
              1 == qo.field_r.length) {
              var12 = 1;
            } else {
              var13_ref_mo = var8[var11 + 1];
              if (param4) {
                if (!var13_ref_mo.field_Ab) {
                  if (var9 != 0) {
                    stackIn_49_0 = (var13_ref_mo.field_Z) ? 1 : 0;
                  } else {
                    stackIn_49_0 = 0;
                  }
                } else {
                  stackIn_49_0 = 1;
                }
                var12 = stackIn_49_0;
              } else {
                if (param7 != -1) {
                  stackIn_40_0 = ((mh.field_c.field_Zb[param7] & 255) != var11) ? 0 : 1;
                } else {
                  stackIn_40_0 = (qo.field_r[var11] != mh.field_c.field_mc) ? 0 : 1;
                }
                var12 = stackIn_40_0;
              }
            }
            if (var12 != 0) {
              var10_intLifetime1 = 1;
              bh.a(-1712, param1, param2, param3, param4, param5, param6, param7 + 1);
            }
            if (dj.field_l) {
              return;
            }
            var11++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_100_0 = var8_ref;
          stackIn_100_1 = new StringBuilder().append("bh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_101_2 = "null";
          } else {
            stackIn_101_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_100_0), ((StringBuilder) (Object) stackIn_100_1).append(stackIn_101_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    static {
        field_e = "Type your password again to make sure it's correct";
        field_c = new int[8192];
        field_d = new th();
    }
}
