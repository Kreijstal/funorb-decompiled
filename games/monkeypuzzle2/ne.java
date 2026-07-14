/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne {
    static ai[] field_a;
    static fg field_c;
    static int field_b;

    final static am a(String param0, byte param1) {
        int var5 = 0;
        String var6 = null;
        am var7 = null;
        int var8 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var2 = param0.length();
        if (!(var2 != 0)) {
            return si.field_s;
        }
        if (!(255 >= var2)) {
            return wk.field_f;
        }
        String[] var3 = ma.a(126, '.', param0);
        if ((var3.length ^ -1) > -3) {
            return si.field_s;
        }
        if (param1 >= -61) {
            field_b = -50;
        }
        String[] var4 = var3;
        for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = dh.a(var6, (byte) 55);
            if (!(var7 == null)) {
                return var7;
            }
        }
        return bi.a(var3[-1 + var3.length], 5000);
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        gg var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_32_0 = null;
        int stackIn_37_0 = 0;
        String stackIn_37_1 = null;
        int stackIn_38_0 = 0;
        String stackIn_38_1 = null;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        int stackIn_39_2 = 0;
        gg stackIn_43_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        int stackOut_36_0 = 0;
        String stackOut_36_1 = null;
        int stackOut_38_0 = 0;
        String stackOut_38_1 = null;
        int stackOut_38_2 = 0;
        int stackOut_37_0 = 0;
        String stackOut_37_1 = null;
        int stackOut_37_2 = 0;
        gg stackOut_42_0 = null;
        gg stackOut_41_0 = null;
        L0: {
          var10 = MonkeyPuzzle2.field_F ? 1 : 0;
          var1 = fb.field_k;
          var2 = 0;
          if ((ud.field_b ^ -1) != -3) {
            break L0;
          } else {
            var3_long = -fb.field_n + pf.a(0);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (-1 < (var2 ^ -1)) {
              var2 = 0;
              break L0;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 == -107) {
            break L1;
          } else {
            int discarded$1 = ne.a(-67);
            break L1;
          }
        }
        var3 = 0;
        L2: while (true) {
          if (pl.field_k.length <= var3) {
            return;
          } else {
            L3: {
              var4 = gh.field_a[var3];
              if (0 > var4) {
                var5 = lc.field_e;
                break L3;
              } else {
                if (sj.field_f.field_a != var4) {
                  var5 = qj.field_D;
                  break L3;
                } else {
                  var5 = ki.field_s;
                  break L3;
                }
              }
            }
            L4: {
              var6 = pl.field_k[var3];
              if (-3 != (ud.field_b ^ -1)) {
                break L4;
              } else {
                if ((var2 ^ -1) != -2) {
                  break L4;
                } else {
                  L5: {
                    if (uj.field_c.length <= wi.field_b.length) {
                      stackOut_17_0 = wi.field_b.length;
                      stackIn_18_0 = stackOut_17_0;
                      break L5;
                    } else {
                      stackOut_16_0 = uj.field_c.length;
                      stackIn_18_0 = stackOut_16_0;
                      break L5;
                    }
                  }
                  L6: {
                    var7 = stackIn_18_0;
                    if (re.field_a.length <= ud.field_e.length) {
                      stackOut_20_0 = ud.field_e.length;
                      stackIn_21_0 = stackOut_20_0;
                      break L6;
                    } else {
                      stackOut_19_0 = re.field_a.length;
                      stackIn_21_0 = stackOut_19_0;
                      break L6;
                    }
                  }
                  L7: {
                    var8 = stackIn_21_0;
                    if (var3 < 6) {
                      break L7;
                    } else {
                      if (6 - -var7 <= var3) {
                        break L7;
                      } else {
                        L8: {
                          if ((wi.field_b.length + -6 + (var3 + -var7) ^ -1) > -1) {
                            stackOut_25_0 = "";
                            stackIn_26_0 = stackOut_25_0;
                            break L8;
                          } else {
                            stackOut_24_0 = wi.field_b[-var7 + (-6 + var3 - -wi.field_b.length)];
                            stackIn_26_0 = stackOut_24_0;
                            break L8;
                          }
                        }
                        var6_ref = stackIn_26_0;
                        break L7;
                      }
                    }
                  }
                  if (var7 + 7 > var3) {
                    break L4;
                  } else {
                    if (7 + (var7 - -var8) <= var3) {
                      break L4;
                    } else {
                      L9: {
                        if (ud.field_e.length > -var7 + -7 + var3) {
                          stackOut_31_0 = ud.field_e[-var7 + (var3 - 7)];
                          stackIn_32_0 = stackOut_31_0;
                          break L9;
                        } else {
                          stackOut_30_0 = "";
                          stackIn_32_0 = stackOut_30_0;
                          break L9;
                        }
                      }
                      var6_ref = stackIn_32_0;
                      break L4;
                    }
                  }
                }
              }
            }
            L10: {
              if (-2 == var4) {
                var6_ref = Integer.toString(var2);
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              stackOut_36_0 = 47;
              stackOut_36_1 = (String) var6_ref;
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              if (0 > var4) {
                stackOut_38_0 = stackIn_38_0;
                stackOut_38_1 = (String) (Object) stackIn_38_1;
                stackOut_38_2 = 0;
                stackIn_39_0 = stackOut_38_0;
                stackIn_39_1 = stackOut_38_1;
                stackIn_39_2 = stackOut_38_2;
                break L11;
              } else {
                stackOut_37_0 = stackIn_37_0;
                stackOut_37_1 = (String) (Object) stackIn_37_1;
                stackOut_37_2 = 1;
                stackIn_39_0 = stackOut_37_0;
                stackIn_39_1 = stackOut_37_1;
                stackIn_39_2 = stackOut_37_2;
                break L11;
              }
            }
            L12: {
              var7 = hh.a((byte) stackIn_39_0, stackIn_39_1, stackIn_39_2 != 0);
              var8 = -(var7 >> -677257887) + jc.field_b;
              if (var4 < 0) {
                break L12;
              } else {
                L13: {
                  if (var4 == sj.field_f.field_a) {
                    stackOut_42_0 = mg.field_u;
                    stackIn_43_0 = stackOut_42_0;
                    break L13;
                  } else {
                    stackOut_41_0 = de.field_j;
                    stackIn_43_0 = stackOut_41_0;
                    break L13;
                  }
                }
                L14: {
                  var9 = stackIn_43_0;
                  var1 = var1 + ud.field_a;
                  if (var9 == null) {
                    break L14;
                  } else {
                    var9.a(var7 - -(pl.field_h << -966354943), var8 + -pl.field_h, false, var1, hb.field_n - -(vf.field_b << -718633823));
                    break L14;
                  }
                }
                var1 = var1 + vf.field_b;
                break L12;
              }
            }
            if (-1 >= (var4 ^ -1)) {
              sl.field_o.b(var6_ref, var8, da.field_a + var1, var5, -1);
              var1 = var1 + (hb.field_n + vf.field_b + ud.field_a);
              var3++;
              continue L2;
            } else {
              fe.field_a.b(var6_ref, var8, nf.field_M + var1, var5, -1);
              var1 = var1 + gi.field_a;
              var3++;
              continue L2;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_c = null;
        if (param0 != -17) {
            field_b = -18;
        }
        field_a = null;
    }

    final static int a(int param0) {
        if (param0 != -1) {
            ne.b((byte) 95);
        }
        return ib.field_a;
    }

    final static void a(boolean param0) {
        if (null != wg.field_j) {
            wg.field_j.a(true);
        }
        if (!param0) {
            ne.a((byte) -120);
        }
        if (null != vl.field_f) {
            vl.field_f.c(true);
        }
        vb.g(81);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
    }
}
