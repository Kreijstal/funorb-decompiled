/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vh {
    private bd[] field_b;
    static java.awt.Font field_d;
    static byte[][] field_a;
    static String field_c;

    final static void a(oj param0, int param1, oj param2) {
        int var3 = 0;
        double var3_double = 0.0;
        int var4 = 0;
        int var5 = 0;
        double var5_double = 0.0;
        double var7 = 0.0;
        oc var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        L0: {
          var13 = HostileSpawn.field_I ? 1 : 0;
          if (param2.field_n) {
            break L0;
          } else {
            if (!kc.a((byte) -124, param2.field_j)) {
              nl.field_b = 180;
              param2.field_I = 1000;
              return;
            } else {
              pm.field_a = true;
              param2.field_w = 1;
              param2.field_n = true;
              tk.a(1, jc.field_c, 31, true);
              break L0;
            }
          }
        }
        L1: {
          nl.field_b = 256;
          if (-1 > (param2.field_e ^ -1)) {
            param2.field_e = param2.field_e - 1;
            break L1;
          } else {
            var3 = (int)(((double)param0.field_j.field_e + param0.field_l.field_f - (double)param2.field_j.field_e - param2.field_l.field_f) * 24.0);
            var4 = (int)(24.0 * (-param2.field_l.field_a + (param0.field_l.field_a + (double)param0.field_j.field_g - (double)param2.field_j.field_g)));
            if (512 < Math.abs(var3)) {
              break L1;
            } else {
              if (Math.abs(var4) <= 512) {
                param2.field_e = param2.field_e - 1;
                if ((param2.field_e ^ -1) <= -1) {
                  break L1;
                } else {
                  mm.field_m[el.field_j] = new oj(param2.field_j, 3, rl.field_c);
                  mm.field_m[el.field_j].field_M = 0;
                  el.field_j = el.field_j + 1;
                  param2.field_e = 100;
                  break L1;
                }
              } else {
                break L1;
              }
            }
          }
        }
        L2: {
          param2.field_p = param2.field_p + 1;
          if (param2.field_w != 4) {
            if (param2.field_p < param2.field_C) {
              break L2;
            } else {
              param2.field_p = 0;
              param2.field_z = param2.field_z + 1;
              break L2;
            }
          } else {
            L3: {
              if (-5 >= param2.field_p) {
                param2.field_p = 0;
                param2.field_z = param2.field_z + 1;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-7 != param2.field_z) {
                break L4;
              } else {
                if (0 != param2.field_p) {
                  break L4;
                } else {
                  L5: {
                    var3_double = param2.field_c * 3.141592653589793 / 128.0;
                    var5_double = param2.field_l.field_f + ((double)param2.field_j.field_e - 0.5) - Math.sin(var3_double);
                    var7 = param2.field_l.field_a + ((double)param2.field_j.field_g - 0.5) - Math.cos(var3_double);
                    var9 = new oc((int)var5_double, (int)var7);
                    var10 = var9.b(-4);
                    wh.a(true, var10);
                    wh.a(true, var10 + -ln.field_a.field_d);
                    wh.a(true, -1 + var10);
                    wh.a(true, 1 + var10);
                    wh.a(true, var10 + ln.field_a.field_d);
                    wh.a(true, -ln.field_a.field_d + var10 + -1);
                    wh.a(true, var10 + -1 - -ln.field_a.field_d);
                    wh.a(true, -ln.field_a.field_d + (var10 - -1));
                    wh.a(true, ln.field_a.field_d + var10 + 1);
                    var10 = param2.field_j.b(-4);
                    if (128.0 > param2.field_c) {
                      stackOut_20_0 = -1;
                      stackIn_21_0 = stackOut_20_0;
                      break L5;
                    } else {
                      stackOut_19_0 = 1;
                      stackIn_21_0 = stackOut_19_0;
                      break L5;
                    }
                  }
                  L6: {
                    L7: {
                      var11 = stackIn_21_0;
                      if (64.0 > param2.field_c) {
                        break L7;
                      } else {
                        if (param2.field_c <= 192.0) {
                          stackOut_25_0 = ln.field_a.field_d;
                          stackIn_26_0 = stackOut_25_0;
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    stackOut_24_0 = -ln.field_a.field_d;
                    stackIn_26_0 = stackOut_24_0;
                    break L6;
                  }
                  var12 = stackIn_26_0;
                  wh.a(true, var10);
                  wh.a(true, var11 + var10);
                  wh.a(true, var12 + var10);
                  wh.a(true, var12 + (var10 + var11));
                  break L4;
                }
              }
            }
            if (re.field_D[4].length > param2.field_z) {
              break L2;
            } else {
              param2.field_z = 0;
              param2.field_w = 1;
              break L2;
            }
          }
        }
        L8: {
          if (1 == param2.field_w) {
            L9: {
              var3_double = nh.a(-12149, (p) (Object) param2, (p) (Object) param0);
              param2.a(param1 ^ 228, var3_double, 3);
              li.field_r = param2.a(ln.field_a, 128, param2.field_o);
              var5 = param2.field_j.b(param1 + -9);
              wh.a(true, var5);
              wh.a(true, var5 - 1);
              wh.a(true, var5 + -ln.field_a.field_d);
              wh.a(true, -1 + var5 - ln.field_a.field_d);
              if (li.field_r[0]) {
                break L9;
              } else {
                if (!li.field_r[1]) {
                  break L8;
                } else {
                  break L9;
                }
              }
            }
            param2.field_p = 0;
            param2.field_z = 0;
            param2.field_w = 4;
            if (1 == uj.field_l) {
              tk.a(5, jc.field_c, 35, true);
              break L8;
            } else {
              break L8;
            }
          } else {
            break L8;
          }
        }
        L10: {
          if (0 < param2.field_I) {
            break L10;
          } else {
            if ((param2.field_w ^ -1) != -6) {
              param2.field_w = 5;
              param2.e((byte) -49);
              param2.field_p = 0;
              param2.field_z = 0;
              break L10;
            } else {
              break L10;
            }
          }
        }
        L11: {
          if (param1 != param2.field_w) {
            break L11;
          } else {
            if (param2.field_z == re.field_D[5].length) {
              param2.c((byte) -86);
              var3 = 0;
              L12: while (true) {
                if (10 <= var3) {
                  L13: {
                    if (-1 != (bm.field_c ^ -1)) {
                      break L13;
                    } else {
                      kd.a(0, 1);
                      break L13;
                    }
                  }
                  bn.a(3, param2);
                  break L11;
                } else {
                  mm.field_m[el.field_j] = new oj(param2.field_j, 3, rl.field_c);
                  el.field_j = el.field_j + 1;
                  var3++;
                  continue L12;
                }
              }
            } else {
              break L11;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        hm.a(param0, ((vh) this).field_b, false, param2, param1, param3);
        if (param4 != 5) {
            field_d = null;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          param0 = v.a(-18214, '_', "", param0);
          if (param1 == 29360) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = ia.a(param2, 10);
            if (-1 != param0.indexOf(param2)) {
              break L2;
            } else {
              if (-1 == param0.indexOf(var3)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static void a(byte param0, int param1) {
        int var4 = HostileSpawn.field_I ? 1 : 0;
        hm var5 = (hm) (Object) ih.field_x.g(-77);
        while (var5 != null) {
            ci.a(param1, 2, var5);
            var5 = (hm) (Object) ih.field_x.a(12684);
        }
        int var2 = 109 / ((param0 - -73) / 52);
        am var3 = ei.field_h.g(-79);
        while (var3 != null) {
            wg.d(-9420, param1);
            var3 = ei.field_h.a(12684);
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (param0) {
            field_c = null;
        }
        field_d = null;
        field_a = null;
    }

    vh(bd[] param0) {
        ((vh) this).field_b = param0;
    }

    static {
    }
}
