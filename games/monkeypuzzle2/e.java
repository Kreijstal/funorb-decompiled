/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e {
    static String field_c;
    static int[] field_b;
    static ki[] field_a;

    final static boolean a(boolean param0, int param1, int param2, byte param3) {
        int stackIn_38_0 = 0;
        int var4;
        int var5;
        int var6;
        if (!param0) {
          if (cj.field_c[param1] <= cj.field_c[param2]) {
            if (cj.field_c[param1] < cj.field_c[param2]) {
              return false;
            } else {
              if (gi.field_e[param1] <= gi.field_e[param2]) {
                if (gi.field_e[param2] <= gi.field_e[param1]) {
                  var4 = rb.field_fb[param2] + jc.field_a[param2] + hf.field_c[param2];
                  var6 = -70 / ((param3 - 51) / 41);
                  var5 = jc.field_a[param1] - (-hf.field_c[param1] - rb.field_fb[param1]);
                  if (var4 >= var5) {
                    if (var5 < var4) {
                      return false;
                    } else {
                      if (param2 >= param1) {
                        return false;
                      } else {
                        return true;
                      }
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        } else {
          if (gi.field_e[param2] < gi.field_e[param1]) {
            return true;
          } else {
            if (gi.field_e[param1] < gi.field_e[param2]) {
              return false;
            } else {
              if (cj.field_c[param1] > cj.field_c[param2]) {
                return true;
              } else {
                if (cj.field_c[param1] >= cj.field_c[param2]) {
                  var4 = rb.field_fb[param2] + jc.field_a[param2] + hf.field_c[param2];
                  var6 = -70 / ((param3 - 51) / 41);
                  var5 = jc.field_a[param1] - (-hf.field_c[param1] - rb.field_fb[param1]);
                  if (var4 >= var5) {
                    if (var5 < var4) {
                      return false;
                    } else {
                      L0: {
                        if (param2 >= param1) {
                          stackIn_38_0 = 0;
                          break L0;
                        } else {
                          stackIn_38_0 = 1;
                          break L0;
                        }
                      }
                      return stackIn_38_0 != 0;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return false;
                }
              }
            }
          }
        }
    }

    final static void a(java.math.BigInteger param0, java.math.BigInteger param1, byte param2, gk param3, gk param4) {
        try {
            int var5_int = 123 / ((param2 - 0) / 41);
            be.a(param3, param1, -101, 0, param4.field_h, param0, param4.field_g);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "e.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1, int param2) {
        int var3;
        int var4;
        int var5;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_33_0 = 0;
        var3 = 1 << param2;
        if ((kg.field_c & var3) != 0) {
          return;
        } else {
          L0: {
            var4 = param2;
            if (-1 == (1 << var4 & bh.field_g ^ -1)) {
              stackIn_6_0 = 0;
              break L0;
            } else {
              stackIn_6_0 = 1;
              break L0;
            }
          }
          var5 = stackIn_6_0;
          if (var5 != 0) {
            hf.field_f.field_P = hf.field_f.field_P + 1;
            fg.field_b = fg.field_b | var3;
            kg.field_c = kg.field_c | var3;
            if (param1 == 40) {
              L1: {
                if (!mb.field_e.e(11253)) {
                  stackIn_33_0 = 0;
                  break L1;
                } else {
                  stackIn_33_0 = 1;
                  break L1;
                }
              }
              var4 = stackIn_33_0;
              mb.field_e.a(param1 + -8252, new he(param2));
              if (var4 != 0) {
                ke.b(8192);
                em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
                return;
              } else {
                em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
                return;
              }
            } else {
              L2: {
                field_a = (ki[]) null;
                if (!mb.field_e.e(11253)) {
                  stackIn_26_0 = 0;
                  break L2;
                } else {
                  stackIn_26_0 = 1;
                  break L2;
                }
              }
              var4 = stackIn_26_0;
              mb.field_e.a(param1 + -8252, new he(param2));
              if (var4 != 0) {
                ke.b(8192);
                em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
                return;
              } else {
                em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
                return;
              }
            }
          } else {
            bh.field_g = bh.field_g | 1 << var4;
            b.field_m = b.field_m - (1 << var4);
            hf.field_f.field_P = hf.field_f.field_P + 1;
            fg.field_b = fg.field_b | var3;
            kg.field_c = kg.field_c | var3;
            if (param1 != 40) {
              L3: {
                field_a = (ki[]) null;
                if (!mb.field_e.e(11253)) {
                  stackIn_18_0 = 0;
                  break L3;
                } else {
                  stackIn_18_0 = 1;
                  break L3;
                }
              }
              var4 = stackIn_18_0;
              mb.field_e.a(param1 + -8252, new he(param2));
              if (var4 != 0) {
                ke.b(8192);
                em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
                return;
              } else {
                em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
                return;
              }
            } else {
              L4: {
                if (!mb.field_e.e(11253)) {
                  stackIn_11_0 = 0;
                  break L4;
                } else {
                  stackIn_11_0 = 1;
                  break L4;
                }
              }
              var4 = stackIn_11_0;
              mb.field_e.a(param1 + -8252, new he(param2));
              if (var4 != 0) {
                ke.b(8192);
                em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
                return;
              } else {
                em.field_C.a(-8212, new vl(param2, param0, bh.field_g, b.field_m, sd.field_e, jc.field_e));
                return;
              }
            }
          }
        }
    }

    final static void b(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ki var7_ref_ki = null;
        int var7 = 0;
        int var8 = 0;
        var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              j.field_c.a(0, 0);
              var1_int = -290 + m.field_h;
              if (var1_int >= 0) {
                break L1;
              } else {
                var1_int = 0;
                break L1;
              }
            }
            L2: {
              var1_int = var1_int * 16;
              var2 = -m.field_h + 50;
              if (var2 < -50) {
                var2 = -50;
                break L2;
              } else {
                if ((var2 ^ -1) < -1) {
                  var2 = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var3 = -(-(m.field_h * 16) + 1700);
              if (var3 <= 0) {
                break L3;
              } else {
                var3 = 0;
                break L3;
              }
            }
            L4: {
              var4 = -(wg.field_g.field_n >> 1829537057) + (240 - -var1_int);
              wg.field_g.c(var2 + (320 + -(wg.field_g.field_m >> -1819008383)), var4);
              uk.field_n.c(500, var3 + (30 + var4));
              var5 = -330 + m.field_h;
              if (0 > var5) {
                var5 = 0;
                break L4;
              } else {
                break L4;
              }
            }
            var5 = var5 * 14;
            var6 = 240 - (wg.field_g.field_n >> -447447551) - -var5;
            if (param0 == 117) {
              we.field_f[mg.field_q].c(var2 + (-(we.field_f[mg.field_q].field_m >> 1133541985) + 320), var6 - (we.field_f[mg.field_q].field_n - 40));
              var7_ref_ki = (ki) ((Object) bd.field_b.a((byte) -117));
              L5: while (true) {
                if (var7_ref_ki == null) {
                  var7 = 0;
                  L6: while (true) {
                    if (ii.field_E <= var7) {
                      f.a(m.field_h - 374, (byte) 84);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L7: {
                        if ((ii.field_U[var7] ^ -1) > -1) {
                          break L7;
                        } else {
                          w.field_b[ii.field_U[var7]].c((int)((float)(-(w.field_b[0].field_m >> -110101631)) + jc.field_f[var7][0]) + var2, (int)((float)(-(w.field_b[0].field_n >> 779179297)) + jc.field_f[var7][1] + (float)var1_int));
                          break L7;
                        }
                      }
                      var7++;
                      continue L6;
                    }
                  }
                } else {
                  var7_ref_ki.field_q = var7_ref_ki.field_q + (float)var1_int;
                  var7_ref_ki.field_B = var7_ref_ki.field_B + (float)var2;
                  var7_ref_ki.a((byte) -65);
                  var7_ref_ki = (ki) ((Object) bd.field_b.d((byte) 63));
                  continue L5;
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
          throw la.a((Throwable) ((Object) var1), "e.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(gg param0, int param1, int param2, int param3, int param4, gg param5) {
        try {
            mg.field_u = param5;
            vf.field_b = param3;
            pl.field_h = param2;
            ud.field_a = param1;
            de.field_j = param0;
            if (param4 != -1) {
                field_b = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "e.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 31) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    static {
        field_a = new ki[1000];
        field_b = new int[4];
    }
}
