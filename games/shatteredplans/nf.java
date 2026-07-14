/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class nf {
    long field_p;
    boolean field_h;
    static String field_m;
    int field_g;
    static String field_i;
    static int[] field_a;
    String field_o;
    String field_k;
    int field_c;
    String field_d;
    int field_l;
    int[] field_f;
    String field_b;
    int field_n;
    qr field_j;
    int field_e;

    final int a(byte param0) {
        if (!((nf) this).field_h) {
          if ((((nf) this).field_n ^ -1) != -3) {
            if ((((nf) this).field_p ^ -1L) == (ec.field_p ^ -1L)) {
              return 1;
            } else {
              if (-3 != (po.field_b ^ -1)) {
                if (param0 <= 100) {
                  return 23;
                } else {
                  return 0;
                }
              } else {
                if (!da.a(-30106, ((nf) this).field_b)) {
                  if (param0 <= 100) {
                    return 23;
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              }
            }
          } else {
            if (((nf) this).field_c <= 0) {
              if ((((nf) this).field_p ^ -1L) == (ec.field_p ^ -1L)) {
                return 1;
              } else {
                if (-3 != (po.field_b ^ -1)) {
                  if (param0 <= 100) {
                    return 23;
                  } else {
                    return 0;
                  }
                } else {
                  if (!da.a(-30106, ((nf) this).field_b)) {
                    if (param0 <= 100) {
                      return 23;
                    } else {
                      return 0;
                    }
                  } else {
                    return 1;
                  }
                }
              }
            } else {
              return 2;
            }
          }
        } else {
          return 2;
        }
    }

    final static String a(eg param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        ne var4 = null;
        String var5 = null;
        String[] var6 = null;
        String var7 = null;
        int var8 = 0;
        String var9 = null;
        String stackIn_14_0 = null;
        String stackOut_13_0 = null;
        String stackOut_12_0 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 0;
        var3 = 0;
        var4 = (ne) (Object) param0.field_v.d(0);
        L0: while (true) {
          if (var4 == null) {
            if (param1 == 23248) {
              if (-1 == (var2 ^ -1)) {
                return bq.field_f;
              } else {
                L1: {
                  if (1 == var2) {
                    stackOut_13_0 = bk.field_d;
                    stackIn_14_0 = stackOut_13_0;
                    break L1;
                  } else {
                    stackOut_12_0 = re.a(rl.field_e, 4371, new String[1]);
                    stackIn_14_0 = stackOut_12_0;
                    break L1;
                  }
                }
                L2: {
                  var9 = stackIn_14_0;
                  var5 = var9;
                  if (0 != var3) {
                    var6 = new String[1 + var3];
                    var3 = 1;
                    var6[0] = var9;
                    var4 = (ne) (Object) param0.field_v.d(0);
                    L3: while (true) {
                      if (var4 == null) {
                        var5 = va.a(-2, var6);
                        break L2;
                      } else {
                        L4: {
                          if (var4.field_h != ho.field_d) {
                            break L4;
                          } else {
                            if (-1 == var4.field_r) {
                              break L4;
                            } else {
                              if (null == var4.field_k) {
                                break L4;
                              } else {
                                L5: {
                                  if (-2 != var4.field_r) {
                                    var7 = re.a(wl.field_c, 4371, new String[2]);
                                    break L5;
                                  } else {
                                    var7 = re.a(lh.field_H, 4371, new String[1]);
                                    break L5;
                                  }
                                }
                                var3++;
                                var6[var3] = var7;
                                break L4;
                              }
                            }
                          }
                        }
                        var4 = (ne) (Object) param0.field_v.a((byte) -71);
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                return var5;
              }
            } else {
              return null;
            }
          } else {
            L6: {
              if (ho.field_d != var4.field_h) {
                break L6;
              } else {
                L7: {
                  if (-1 == (var4.field_r ^ -1)) {
                    break L7;
                  } else {
                    if (null == var4.field_k) {
                      break L7;
                    } else {
                      var3++;
                      break L7;
                    }
                  }
                }
                var2 = var2 + var4.field_p;
                break L6;
              }
            }
            var4 = (ne) (Object) param0.field_v.a((byte) -71);
            continue L0;
          }
        }
    }

    final static int[] a(int[] param0, int param1) {
        int var2 = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = param0.length;
        var8 = new int[var2];
        var7 = var8;
        var3 = var7;
        if (param1 != 3718) {
          nf.b((byte) -75);
          var4 = 1;
          L0: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var5 = var4;
              L1: while (true) {
                L2: {
                  var5--;
                  if (0 > var5) {
                    break L2;
                  } else {
                    if (param0[var8[var5]] <= param0[var4]) {
                      break L2;
                    } else {
                      var3[1 + var5] = var8[var5];
                      continue L1;
                    }
                  }
                }
                var3[1 + var5] = var4;
                var4++;
                continue L0;
              }
            }
          }
        } else {
          var4 = 1;
          L3: while (true) {
            if (var2 <= var4) {
              return var3;
            } else {
              var5 = var4;
              L4: while (true) {
                L5: {
                  var5--;
                  if (0 > var5) {
                    break L5;
                  } else {
                    if (param0[var8[var5]] <= param0[var4]) {
                      break L5;
                    } else {
                      var3[1 + var5] = var8[var5];
                      continue L4;
                    }
                  }
                }
                var3[1 + var5] = var4;
                var4++;
                continue L3;
              }
            }
          }
        }
    }

    final static String a(String param0, String param1, byte param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = param1.indexOf(param0);
        if (param2 > 57) {
          L0: while (true) {
            if (var4 == -1) {
              return param1;
            } else {
              param1 = param1.substring(0, var4) + param3 + param1.substring(var4 - -param0.length());
              var4 = param1.indexOf(param0, var4 - -param3.length());
              continue L0;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        if (null == tc.field_G) {
          var3 = 107 % ((param0 - -29) / 53);
          return;
        } else {
          L0: {
            var3 = tc.field_G.b(param2, (byte) -68);
            if (1 == (var3 ^ -1)) {
              break L0;
            } else {
              L1: {
                if (var3 == -1) {
                  break L1;
                } else {
                  var4 = tc.field_G.i(-86) ? 1 : 0;
                  bb.a(94, tc.field_G.field_Gb, param1, var4 != 0, tc.field_G.g((byte) -42), var3);
                  break L1;
                }
              }
              tc.field_G = null;
              ai.a(3);
              break L0;
            }
          }
          var3 = 107 % ((param0 - -29) / 53);
          return;
        }
    }

    nf(boolean param0) {
        ((nf) this).field_e = va.field_b;
        if (param0) {
            ((nf) this).field_f = mb.field_p;
        } else {
            ((nf) this).field_f = null;
        }
        ((nf) this).field_b = em.field_a;
        ((nf) this).field_k = ke.field_h;
        ((nf) this).field_c = nj.field_a;
        ((nf) this).field_h = kr.field_b;
        ((nf) this).field_o = mc.field_q;
        ((nf) this).field_p = sp.field_j;
        ((nf) this).field_l = el.field_f;
        ((nf) this).field_g = fm.field_f;
        ((nf) this).field_n = ob.field_k;
        ((nf) this).field_d = jc.field_s;
    }

    public static void b(byte param0) {
        field_i = null;
        if (param0 != -25) {
            field_i = null;
            field_m = null;
            field_a = null;
            return;
        }
        field_m = null;
        field_a = null;
    }

    nf(int param0, String param1, int param2, String param3, String param4) {
        ((nf) this).field_h = true;
        ((nf) this).field_k = param4;
        ((nf) this).field_g = param2;
        ((nf) this).field_o = param3;
        ((nf) this).field_d = param1;
        ((nf) this).field_c = 0;
        ((nf) this).field_n = param0;
        ((nf) this).field_p = 0L;
        ((nf) this).field_e = 0;
        ((nf) this).field_f = null;
        ((nf) this).field_b = param1;
        ((nf) this).field_l = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Total fleets lost.";
        field_i = "Close";
    }
}
