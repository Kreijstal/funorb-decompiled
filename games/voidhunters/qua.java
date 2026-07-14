/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qua {
    static dpb field_a;
    lu field_e;
    static float field_b;
    ml[] field_c;
    static kb field_d;

    final void a(byte param0, ml param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        var5 = VoidHunters.field_G;
        var3 = 1;
        var4 = 0;
        L0: while (true) {
          L1: {
            if (((qua) this).field_c.length <= var4) {
              break L1;
            } else {
              L2: {
                if (((qua) this).field_c[var4] == param1) {
                  break L2;
                } else {
                  if (((qua) this).field_c[var4].a(16, param1)) {
                    break L2;
                  } else {
                    var4++;
                    continue L0;
                  }
                }
              }
              var3 = 0;
              break L1;
            }
          }
          L3: {
            if (var3 != 0) {
              var7 = 0;
              var4 = var7;
              L4: while (true) {
                if (var7 >= ((qua) this).field_c.length) {
                  ((qua) this).field_c = (ml[]) (Object) ija.a((Object) (Object) param1, (Object[]) (Object) ((qua) this).field_c, 0, ii.field_d);
                  break L3;
                } else {
                  if (param1.a(16, ((qua) this).field_c[var7])) {
                    ((qua) this).field_c = (ml[]) (Object) dt.a(ii.field_d, var7, 15667, (Object[]) (Object) ((qua) this).field_c);
                    var7--;
                    var7++;
                    continue L4;
                  } else {
                    var7++;
                    continue L4;
                  }
                }
              }
            } else {
              break L3;
            }
          }
          L5: {
            if (param0 == 108) {
              break L5;
            } else {
              var6 = null;
              tpa discarded$1 = qua.a(false, (String) null);
              break L5;
            }
          }
          return;
        }
    }

    final static long a(CharSequence param0, boolean param1) {
        int var5 = 0;
        int var6 = VoidHunters.field_G;
        if (!param1) {
            return -34L;
        }
        int var2 = param0.length();
        long var3 = 0L;
        for (var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 1848720389) - (var3 + -(long)param0.charAt(var5));
        }
        return var3;
    }

    final static int a(int param0, byte param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        L0: {
          var5 = param3 >> 1248689983;
          param3 = var5 ^ var5 + param3;
          var5 = param2 >> -207628961;
          param2 = var5 ^ var5 + param2;
          if (param1 == 119) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var5 = param0 >> 1098980287;
            param0 = param0 - -var5 ^ var5;
            var4 = 0;
            if (param2 <= param3) {
              break L2;
            } else {
              if (param0 >= param2) {
                break L2;
              } else {
                var5 = param3;
                param3 = param2;
                param2 = var5;
                break L1;
              }
            }
          }
          if (param0 > param3) {
            var5 = param3;
            param3 = param0;
            param0 = var5;
            break L1;
          } else {
            break L1;
          }
        }
        L3: {
          if (16384 > param3) {
            break L3;
          } else {
            L4: {
              if ((param3 ^ -1) > -536870913) {
                break L4;
              } else {
                var4 += 16;
                param2 = param2 >> 16;
                param0 = param0 >> 16;
                param3 = param3 >> 16;
                break L4;
              }
            }
            L5: {
              if (2097152 <= param3) {
                param2 = param2 >> 8;
                param0 = param0 >> 8;
                param3 = param3 >> 8;
                var4 += 8;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (-131073 >= (param3 ^ -1)) {
                param3 = param3 >> 4;
                param0 = param0 >> 4;
                param2 = param2 >> 4;
                var4 += 4;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if ((param3 ^ -1) > -32769) {
                break L7;
              } else {
                param3 = param3 >> 2;
                param2 = param2 >> 2;
                var4 += 2;
                param0 = param0 >> 2;
                break L7;
              }
            }
            if (16384 <= param3) {
              param2 = param2 >> 1;
              var4++;
              param0 = param0 >> 1;
              param3 = param3 >> 1;
              break L3;
            } else {
              break L3;
            }
          }
        }
        L8: {
          if (param3 <= param2 << 1340571493) {
            break L8;
          } else {
            if (param0 << -1953076283 < param3) {
              return param3 << var4;
            } else {
              break L8;
            }
          }
        }
        param3 = param0 * param0 + param2 * param2 + param3 * param3;
        if ((param3 ^ -1) <= -65537) {
          if (param3 <= -16777217) {
            if (param3 < 268435456) {
              if (param3 >= 67108864) {
                L9: {
                  if ((var4 ^ -1) > -3) {
                    stackOut_60_0 = eo.field_o[param3 >> 433160660] >> 2 - var4;
                    stackIn_61_0 = stackOut_60_0;
                    break L9;
                  } else {
                    stackOut_59_0 = eo.field_o[param3 >> 478182420] << var4 + -2;
                    stackIn_61_0 = stackOut_59_0;
                    break L9;
                  }
                }
                return stackIn_61_0;
              } else {
                L10: {
                  if (3 <= var4) {
                    stackOut_56_0 = eo.field_o[param3 >> -1730558222] << -3 + var4;
                    stackIn_57_0 = stackOut_56_0;
                    break L10;
                  } else {
                    stackOut_55_0 = eo.field_o[param3 >> 1233457458] >> 3 - var4;
                    stackIn_57_0 = stackOut_55_0;
                    break L10;
                  }
                }
                return stackIn_57_0;
              }
            } else {
              if (1073741824 > param3) {
                L11: {
                  if (var4 < 1) {
                    stackOut_51_0 = eo.field_o[param3 >> 1859664246] >> -var4 + 1;
                    stackIn_52_0 = stackOut_51_0;
                    break L11;
                  } else {
                    stackOut_50_0 = eo.field_o[param3 >> 1108967286] << -1 + var4;
                    stackIn_52_0 = stackOut_50_0;
                    break L11;
                  }
                }
                return stackIn_52_0;
              } else {
                return eo.field_o[param3 >> 1186452728] << var4;
              }
            }
          } else {
            if (-1048577 > param3) {
              if (param3 < 262144) {
                return eo.field_o[param3 >> 870130922] >> -1740513209;
              } else {
                return eo.field_o[param3 >> -528338548] >> 1807525574;
              }
            } else {
              if (4194304 > param3) {
                return eo.field_o[param3 >> -310644050] >> -1849586843;
              } else {
                return eo.field_o[param3 >> -1923959664] >> -1570377788;
              }
            }
          }
        } else {
          if ((param3 ^ -1) <= -257) {
            if ((param3 ^ -1) > -4097) {
              if (param3 < 1024) {
                return eo.field_o[param3 >> 1718801346] >> 351968299;
              } else {
                return eo.field_o[param3 >> -232231836] >> -97993526;
              }
            } else {
              if (param3 >= 16384) {
                return eo.field_o[param3 >> -673719704] >> 1418418632;
              } else {
                return eo.field_o[param3 >> 2069905894] >> -690033271;
              }
            }
          } else {
            if ((param3 ^ -1) <= -1) {
              return eo.field_o[param3] >> -1426862196;
            } else {
              return -1;
            }
          }
        }
    }

    final static int a(dj param0, boolean param1, dj param2) {
        if (!param1) {
            field_a = null;
        }
        Object var4 = null;
        return cnb.a(0, param2, param0, 0, 0, (String) null, false);
    }

    qua(lu param0) {
        ((qua) this).field_e = param0;
        ((qua) this).field_c = new ml[]{};
    }

    final static tpa a(boolean param0, String param1) {
        Object var3 = null;
        if (dw.field_c != lrb.field_b) {
          L0: {
            if (!param0) {
              break L0;
            } else {
              var3 = null;
              break L0;
            }
          }
          L1: {
            if (gka.field_o != lrb.field_b) {
              break L1;
            } else {
              if (param1.equals((Object) (Object) vsa.field_q)) {
                lrb.field_b = kla.field_d;
                return jra.field_a;
              } else {
                break L1;
              }
            }
          }
          lrb.field_b = dw.field_c;
          jra.field_a = null;
          vsa.field_q = param1;
          return null;
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 != 16606) {
            Object var2 = null;
            tpa discarded$0 = qua.a(false, (String) null);
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new dpb();
        field_b = 0.4000000059604645f;
        field_d = new kb(4);
    }
}
