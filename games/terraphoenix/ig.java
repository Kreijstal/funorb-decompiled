/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static ci field_a;
    static String field_c;
    static String field_b;
    static tf field_e;
    static String field_d;

    final static dj[] a(int param0, uc param1) {
        int var2 = 0;
        int var3 = 0;
        dj[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        dj var6_ref = null;
        int var7 = 0;
        var7 = Terraphoenix.field_V;
        var2 = param1.a(false, 8);
        if (0 >= var2) {
          var3 = param1.a(false, 12);
          var4 = new dj[var3];
          if (param0 != -25831) {
            return null;
          } else {
            var5 = 0;
            L0: while (true) {
              if (var3 <= var5) {
                return var4;
              } else {
                if (!ma.a(param1, (byte) 98)) {
                  var6 = param1.a(false, fb.b(2, var5 - 1));
                  var4[var5] = var4[var6];
                  var5++;
                  continue L0;
                } else {
                  var6_ref = new dj();
                  int discarded$6 = param1.a(false, 24);
                  int discarded$7 = param1.a(false, 24);
                  var6_ref.field_b = param1.a(false, 24);
                  int discarded$8 = param1.a(false, 9);
                  int discarded$9 = param1.a(false, 12);
                  int discarded$10 = param1.a(false, 12);
                  int discarded$11 = param1.a(false, 12);
                  var4[var5] = var6_ref;
                  var5++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static byte[] a(int param0, int param1, uc param2, byte[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Terraphoenix.field_V;
        if (param1 > 81) {
          var4 = param2.a(false, param0);
          if (-1 != (var4 ^ -1)) {
            if (param3 != null) {
              if (param3.length == var4) {
                var5 = param2.a(false, 3);
                var6 = (byte)param2.a(false, 8);
                if (0 < var5) {
                  var7 = 0;
                  L0: while (true) {
                    if (var4 > var7) {
                      param3[var7] = (byte)(var6 + param2.a(false, var5));
                      var7++;
                      continue L0;
                    } else {
                      return param3;
                    }
                  }
                } else {
                  var7 = 0;
                  L1: while (true) {
                    if (var4 > var7) {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L1;
                    } else {
                      return param3;
                    }
                  }
                }
              } else {
                L2: {
                  param3 = new byte[var4];
                  var5 = param2.a(false, 3);
                  var6 = (byte)param2.a(false, 8);
                  if (0 < var5) {
                    var7 = 0;
                    L3: while (true) {
                      if (var4 <= var7) {
                        break L2;
                      } else {
                        param3[var7] = (byte)(var6 + param2.a(false, var5));
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    var7 = 0;
                    L4: while (true) {
                      if (var4 <= var7) {
                        break L2;
                      } else {
                        param3[var7] = (byte)var6;
                        var7++;
                        continue L4;
                      }
                    }
                  }
                }
                return param3;
              }
            } else {
              L5: {
                param3 = new byte[var4];
                var5 = param2.a(false, 3);
                var6 = (byte)param2.a(false, 8);
                if (0 < var5) {
                  var7 = 0;
                  L6: while (true) {
                    if (var4 <= var7) {
                      break L5;
                    } else {
                      param3[var7] = (byte)(var6 + param2.a(false, var5));
                      var7++;
                      continue L6;
                    }
                  }
                } else {
                  var7 = 0;
                  L7: while (true) {
                    if (var4 <= var7) {
                      break L5;
                    } else {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L7;
                    }
                  }
                }
              }
              return param3;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final static void a(int param0, int param1) {
        try {
            Throwable var2 = null;
            Object var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param1 == 12) {
                  break L0;
                } else {
                  var3 = null;
                  dj[] discarded$2 = ig.a(47, (uc) null);
                  break L0;
                }
              }
              Object discarded$3 = cd.a(dg.a(false), "resizing", new Object[1], 10056);
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
            }
            var2 = decompiledCaughtException;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ci[] a(fa param0, int param1, String param2, String param3) {
        if (param1 != 0) {
            Object var6 = null;
            dj[] discarded$0 = ig.a(-76, (uc) null);
        }
        int var4 = param0.c(-1, param3);
        int var5 = param0.a(-104, var4, param2);
        return pb.a(var4, false, var5, param0);
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 < 98) {
          field_d = null;
          field_d = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Allied Soldier";
        field_b = "Open in popup window";
        field_d = "Age:";
    }
}
