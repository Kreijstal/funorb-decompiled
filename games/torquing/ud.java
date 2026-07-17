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
        ud var3 = null;
        RuntimeException var3_ref = null;
        ud stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        ud stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new ud(param1, ((ud) this).field_m);
              var3.field_p = ((ud) this).field_p;
              if (param0) {
                break L1;
              } else {
                ud.a((byte) -23);
                break L1;
              }
            }
            var3.field_o = ((ud) this).field_o;
            stackOut_2_0 = (ud) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("ud.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0;
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
          if (var4 == 2) {
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
                      if (var7 != 0L) {
                        ((ud) this).field_p = false;
                        var9 = 63;
                        L3: while (true) {
                          if (0 <= var9) {
                            L4: {
                              if ((1L & var7) == 0L) {
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
                  if (var7 != 0L) {
                    ((ud) this).field_p = false;
                    var9 = 0;
                    L7: while (true) {
                      if (64 > var9) {
                        if ((var7 & 1L << var9) != 0L) {
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
        try {
            ((ud) this).field_m = param1;
            ((ud) this).field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ud.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    ud(long[] param0) {
        try {
            ((ud) this).field_m = null;
            ((ud) this).field_n = null;
            ((ud) this).field_p = false;
            ((ud) this).field_o = param0;
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "ud.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
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
