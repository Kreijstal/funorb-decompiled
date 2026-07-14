/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends q {
    boolean field_p;
    static int[] field_k;
    lm field_m;
    static String field_l;
    private ti field_n;
    static String field_j;
    long[] field_o;

    final static String b(int param0) {
        if (!jd.field_E) {
            if (lp.field_b >= um.field_l) {
                if (um.field_l - -uf.field_g > lp.field_b) {
                    return wb.field_t;
                }
            }
        }
        if (param0 == 0) {
            return null;
        }
        String discarded$0 = ud.b(-7);
        return null;
    }

    final ud a(boolean param0, ti param1) {
        ud var3 = new ud(param1, ((ud) this).field_m);
        var3.field_p = ((ud) this).field_p;
        if (!param0) {
            ud.a((byte) -23);
        }
        var3.field_o = ((ud) this).field_o;
        return var3;
    }

    public static void a(byte param0) {
        field_l = null;
        field_k = null;
        int var1 = 99 % ((param0 - -48) / 61);
        field_j = null;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        long var5 = 0L;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Torquing.field_u;
          ((ud) this).field_o = ee.b(-124);
          ((ud) this).field_p = true;
          var2 = 57;
          ((ud) this).field_m.a(((ud) this).field_n.field_b, ((ud) this).field_n.field_h, ((ud) this).field_n.field_a, -6 + var2);
          var3 = -48 % ((22 - param0) / 54);
          var4 = ((ud) this).field_n.field_c;
          if ((var4 ^ -1) == -3) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= 64) {
                break L0;
              } else {
                var5 = ((ud) this).field_m.a(var2 + -var4, var4);
                if (var5 != 0L) {
                  ((ud) this).field_p = false;
                  ((ud) this).field_o[var4] = var5;
                  var4++;
                  continue L1;
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          } else {
            if (var4 != 3) {
              if (var4 != 1) {
                if (var4 == 0) {
                  var4 = 0;
                  L2: while (true) {
                    if (64 <= var4) {
                      break L0;
                    } else {
                      var5 = 1L << 63 + -var4;
                      var7 = ((ud) this).field_m.a(var4 + -6, 63 + -var4);
                      if ((var7 ^ -1L) != -1L) {
                        ((ud) this).field_p = false;
                        var9 = 63;
                        L3: while (true) {
                          if (0 <= var9) {
                            L4: {
                              if (-1L == (1L & var7 ^ -1L)) {
                                break L4;
                              } else {
                                ((ud) this).field_o[var9] = ((ud) this).field_o[var9] + var5;
                                break L4;
                              }
                            }
                            var7 = var7 >>> 1;
                            var9--;
                            continue L3;
                          } else {
                            var4++;
                            continue L2;
                          }
                        }
                      } else {
                        var4++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  break L0;
                }
              } else {
                var4 = 0;
                L5: while (true) {
                  if (var4 >= 64) {
                    break L0;
                  } else {
                    var5 = ((ud) this).field_m.a(var4 + -6, 63 + -var4);
                    if (0L != var5) {
                      ((ud) this).field_p = false;
                      ((ud) this).field_o[var4] = ag.a(var5, -109);
                      var4++;
                      continue L5;
                    } else {
                      var4++;
                      continue L5;
                    }
                  }
                }
              }
            } else {
              var4 = 0;
              L6: while (true) {
                if (var4 >= 64) {
                  break L0;
                } else {
                  var5 = 1L << 63 - var4;
                  var7 = ((ud) this).field_m.a(var2 - var4, var4);
                  if ((var7 ^ -1L) != -1L) {
                    ((ud) this).field_p = false;
                    var9 = 0;
                    L7: while (true) {
                      if (64 > var9) {
                        if (-1L != (var7 & 1L << var9 ^ -1L)) {
                          ((ud) this).field_o[var9] = ((ud) this).field_o[var9] + var5;
                          var9++;
                          continue L7;
                        } else {
                          var9++;
                          continue L7;
                        }
                      } else {
                        var4++;
                        continue L6;
                      }
                    }
                  } else {
                    var4++;
                    continue L6;
                  }
                }
              }
            }
          }
        }
    }

    ud(ti param0, lm param1) {
        ((ud) this).field_m = param1;
        ((ud) this).field_n = param0;
    }

    ud(long[] param0) {
        ((ud) this).field_m = null;
        ((ud) this).field_n = null;
        ((ud) this).field_p = false;
        ((ud) this).field_o = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[8192];
        field_j = "Type your password again to make sure it's correct";
        field_l = "Try again";
    }
}
