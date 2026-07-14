/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends ne {
    int field_k;
    int field_r;
    static int[] field_s;
    static int[] field_n;
    static int field_j;
    static java.applet.Applet field_q;
    ci field_o;
    int field_l;
    static int field_m;
    int field_p;
    int field_i;

    final static va a(String param0, int param1) {
        if (!(!ll.field_r.b(param0, "", (byte) -82))) {
            return ha.field_k.a(param0, (byte) 126, "");
        }
        if (!(!ia.field_W.b(param0, "", (byte) -82))) {
            return ha.field_k.a(param0, "", param1 + 47712);
        }
        if (param1 == -10396) {
            return null;
        }
        Object var3 = null;
        va discarded$0 = ci.a((String) null, 40);
        return null;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        qk var9 = null;
        int var10 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        String stackIn_26_0 = null;
        String stackIn_33_0 = null;
        int stackIn_40_0 = 0;
        qk stackIn_45_0 = null;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        String stackOut_32_0 = null;
        String stackOut_31_0 = null;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        qk stackOut_44_0 = null;
        qk stackOut_43_0 = null;
        var10 = DungeonAssault.field_K;
        if (param0 == -119) {
          L0: {
            var1 = jm.field_c;
            var2 = 0;
            if (kh.field_t != 2) {
              break L0;
            } else {
              var3_long = -kg.field_d + kd.c(-2456);
              var2 = (int)((-var3_long + 10999L) / 1000L);
              if (-1 < var2) {
                var2 = 0;
                break L0;
              } else {
                break L0;
              }
            }
          }
          var3 = 0;
          L1: while (true) {
            if (var3 >= go.field_A.length) {
              return;
            } else {
              L2: {
                var4 = to.field_c[var3];
                if (-1 > var4) {
                  var5 = om.field_a;
                  break L2;
                } else {
                  if (d.field_g.field_b == var4) {
                    var5 = he.field_p;
                    break L2;
                  } else {
                    var5 = sm.field_c;
                    break L2;
                  }
                }
              }
              L3: {
                var6 = go.field_A[var3];
                if (2 != kh.field_t) {
                  break L3;
                } else {
                  if (var2 != 1) {
                    break L3;
                  } else {
                    L4: {
                      if (sn.field_a.length < mo.field_g.length) {
                        stackOut_17_0 = mo.field_g.length;
                        stackIn_18_0 = stackOut_17_0;
                        break L4;
                      } else {
                        stackOut_16_0 = sn.field_a.length;
                        stackIn_18_0 = stackOut_16_0;
                        break L4;
                      }
                    }
                    L5: {
                      var7 = stackIn_18_0;
                      if (fd.field_b.length <= cp.field_Q.length) {
                        stackOut_20_0 = cp.field_Q.length;
                        stackIn_21_0 = stackOut_20_0;
                        break L5;
                      } else {
                        stackOut_19_0 = fd.field_b.length;
                        stackIn_21_0 = stackOut_19_0;
                        break L5;
                      }
                    }
                    L6: {
                      var8 = stackIn_21_0;
                      if (6 > var3) {
                        break L6;
                      } else {
                        if (6 - -var7 <= var3) {
                          break L6;
                        } else {
                          L7: {
                            if ((-var7 + sn.field_a.length + (var3 + -6) ^ -1) > -1) {
                              stackOut_25_0 = "";
                              stackIn_26_0 = stackOut_25_0;
                              break L7;
                            } else {
                              stackOut_24_0 = sn.field_a[-var7 + (-6 + var3 - -sn.field_a.length)];
                              stackIn_26_0 = stackOut_24_0;
                              break L7;
                            }
                          }
                          var6_ref = stackIn_26_0;
                          break L6;
                        }
                      }
                    }
                    if (var3 < var7 + 7) {
                      break L3;
                    } else {
                      if (var8 + var7 + 7 > var3) {
                        L8: {
                          if (-7 + var3 + -var7 >= cp.field_Q.length) {
                            stackOut_32_0 = "";
                            stackIn_33_0 = stackOut_32_0;
                            break L8;
                          } else {
                            stackOut_31_0 = cp.field_Q[-var7 + (-7 + var3)];
                            stackIn_33_0 = stackOut_31_0;
                            break L8;
                          }
                        }
                        var6_ref = stackIn_33_0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              L9: {
                if ((var4 ^ -1) == 1) {
                  var6_ref = Integer.toString(var2);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 < 0) {
                  stackOut_39_0 = 0;
                  stackIn_40_0 = stackOut_39_0;
                  break L10;
                } else {
                  stackOut_38_0 = 1;
                  stackIn_40_0 = stackOut_38_0;
                  break L10;
                }
              }
              L11: {
                var7 = og.a(stackIn_40_0 != 0, var6_ref, -30633);
                var8 = -(var7 >> 879895905) + vo.field_r;
                if (-1 >= (var4 ^ -1)) {
                  L12: {
                    if (d.field_g.field_b == var4) {
                      stackOut_44_0 = om.field_d;
                      stackIn_45_0 = stackOut_44_0;
                      break L12;
                    } else {
                      stackOut_43_0 = gd.field_G;
                      stackIn_45_0 = stackOut_43_0;
                      break L12;
                    }
                  }
                  L13: {
                    var9 = stackIn_45_0;
                    var1 = var1 + field_j;
                    if (var9 != null) {
                      var9.a(var1, (h.field_q << 1906417377) + mj.field_g, (oh.field_t << 2073329665) + var7, 112, var8 + -oh.field_t);
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  var1 = var1 + h.field_q;
                  break L11;
                } else {
                  break L11;
                }
              }
              if ((var4 ^ -1) > -1) {
                n.field_c.b(var6_ref, var8, li.field_g + var1, var5, -1);
                var1 = var1 + ag.field_a;
                var3++;
                continue L1;
              } else {
                i.field_x.b(var6_ref, var8, i.field_n + var1, var5, -1);
                var1 = var1 + (field_j + h.field_q + mj.field_g);
                var3++;
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    final static long a(CharSequence param0, int param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = DungeonAssault.field_K;
          var2 = 0L;
          var4 = param0.length();
          var5 = 0;
          if (param1 == 2) {
            break L0;
          } else {
            ci.a(-61);
            break L0;
          }
        }
        L1: while (true) {
          L2: {
            if (var4 <= var5) {
              break L2;
            } else {
              L3: {
                L4: {
                  var2 = var2 * 37L;
                  var6 = param0.charAt(var5);
                  if (65 > var6) {
                    break L4;
                  } else {
                    if (var6 > 90) {
                      break L4;
                    } else {
                      var2 = var2 + (long)(-65 + (var6 + 1));
                      break L3;
                    }
                  }
                }
                L5: {
                  if (var6 < 97) {
                    break L5;
                  } else {
                    if (122 >= var6) {
                      var2 = var2 + (long)(-97 + (1 - -var6));
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var6 < 48) {
                  break L3;
                } else {
                  if (var6 <= 57) {
                    var2 = var2 + (long)(var6 + -21);
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              if (177917621779460413L > var2) {
                var5++;
                continue L1;
              } else {
                break L2;
              }
            }
          }
          L6: while (true) {
            L7: {
              if ((var2 % 37L ^ -1L) != -1L) {
                break L7;
              } else {
                if (-1L == (var2 ^ -1L)) {
                  break L7;
                } else {
                  var2 = var2 / 37L;
                  continue L6;
                }
              }
            }
            return var2;
          }
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_s = null;
        field_q = null;
        if (param0 <= 5) {
            field_j = -10;
        }
    }

    ci(int param0, int param1, int param2, int param3, int param4) {
        ((ci) this).field_k = param1;
        ((ci) this).field_r = param0;
        ((ci) this).field_l = param2;
        ((ci) this).field_p = param4;
        ((ci) this).field_i = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
    }
}
