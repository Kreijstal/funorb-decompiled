/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ew extends bca {
    static int[] field_s;
    static ee field_q;
    static kv field_r;

    final void a(byte param0, lu param1) {
        if (param0 > -12) {
            Object var4 = null;
        }
    }

    final static java.net.URL a(java.net.URL param0, int param1, int param2, String param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_46_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_45_0 = null;
            var9 = BachelorFridge.field_y;
            var5 = param0.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                  break L1;
                } else {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 > var7_int) {
                    break L1;
                  } else {
                    if (-1 < (param2 ^ -1)) {
                      var6 = var7_int;
                      continue L0;
                    } else {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    }
                  }
                }
              }
              L2: {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', var6 + 1);
                  if (0 > var7_int) {
                    break L2;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                  break L3;
                } else {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if ((var7_int ^ -1) <= -1) {
                    if (param3 != null) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                L5: {
                  if (var5.regionMatches(var6, "/s=", 0, 3)) {
                    break L5;
                  } else {
                    if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                var7_int = var5.indexOf('/', var6 - -1);
                if (0 > var7_int) {
                  break L4;
                } else {
                  if (param4 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                }
              }
              L6: {
                var7 = new StringBuilder(var6);
                StringBuilder discarded$13 = var7.append(var5.substring(0, var6));
                if (0 < param2) {
                  StringBuilder discarded$14 = var7.append("/l=");
                  StringBuilder discarded$15 = var7.append(Integer.toString(param2));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (param3 != null) {
                  if (0 < param3.length()) {
                    StringBuilder discarded$16 = var7.append("/p=");
                    StringBuilder discarded$17 = var7.append(param3);
                    if (param4 == null) {
                      break L7;
                    } else {
                      if (0 >= param4.length()) {
                        break L7;
                      } else {
                        StringBuilder discarded$18 = var7.append("/s=");
                        StringBuilder discarded$19 = var7.append(param4);
                        break L7;
                      }
                    }
                  } else {
                    if (param4 == null) {
                      break L7;
                    } else {
                      if (0 >= param4.length()) {
                        break L7;
                      } else {
                        StringBuilder discarded$20 = var7.append("/s=");
                        StringBuilder discarded$21 = var7.append(param4);
                        break L7;
                      }
                    }
                  }
                } else {
                  if (param4 == null) {
                    break L7;
                  } else {
                    if (0 >= param4.length()) {
                      break L7;
                    } else {
                      StringBuilder discarded$22 = var7.append("/s=");
                      StringBuilder discarded$23 = var7.append(param4);
                      break L7;
                    }
                  }
                }
              }
              L8: {
                if (var6 >= var5.length()) {
                  StringBuilder discarded$24 = var7.append(47);
                  break L8;
                } else {
                  StringBuilder discarded$25 = var7.append(var5.substring(var6, var5.length()));
                  break L8;
                }
              }
              try {
                L9: {
                  if (param1 == 25969) {
                    break L9;
                  } else {
                    ew.d(35);
                    break L9;
                  }
                }
                stackOut_45_0 = new java.net.URL(param0, var7.toString());
                stackIn_46_0 = stackOut_45_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return (java.net.URL) (Object) stackIn_46_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(op param0, int param1) {
        int var3 = 113 / ((param1 - 12) / 35);
    }

    ew(lu param0) {
        super(param0);
    }

    final static boolean a(int[] param0, long param1, int param2, boolean param3, String param4) {
        nv var6 = null;
        CharSequence var7 = null;
        if (eu.a(param4, (byte) -103, param1, param2, param0)) {
          L0: {
            if ((param2 ^ -1) != -2) {
              break L0;
            } else {
              param2 = 0;
              break L0;
            }
          }
          gk.field_d = param2;
          bd.field_k = param4;
          var7 = (CharSequence) (Object) param4;
          df.field_s = fq.a(0, var7);
          eaa.field_a = param1;
          var6 = lma.a(jv.field_i, param0, tga.field_p, 0, mj.field_k);
          if (param3) {
            return true;
          } else {
            lga.a(var6, true);
            return true;
          }
        } else {
          return false;
        }
    }

    final at a(int param0, gj param1) {
        Object var4 = null;
        if (param0 != 5) {
          var4 = null;
          ((ew) this).a((op) null, 89);
          return (at) (Object) new ra(param1, (ew) this);
        } else {
          return (at) (Object) new ra(param1, (ew) this);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        if (param0 > param4) {
          hba.a(param3, param4, tj.field_b[param1], 7, param0);
          var5 = 13 % ((param2 - -26) / 40);
          return;
        } else {
          hba.a(param3, param0, tj.field_b[param1], 7, param4);
          var5 = 13 % ((param2 - -26) / 40);
          return;
        }
    }

    final static long a(byte param0, CharSequence param1) {
        int var2 = 0;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        var2 = param1.length();
        var3 = 0L;
        if (param0 != 8) {
          return -70L;
        } else {
          var5 = 0;
          L0: while (true) {
            if (var2 <= var5) {
              return var3;
            } else {
              var3 = -var3 + ((var3 << 1406137221) - -(long)param1.charAt(var5));
              var5++;
              continue L0;
            }
          }
        }
    }

    public static void d(int param0) {
        if (param0 != 16776) {
          ew.a(34, -45, 26, 51, -47);
          field_q = null;
          field_s = null;
          field_r = null;
          return;
        } else {
          field_q = null;
          field_s = null;
          field_r = null;
          return;
        }
    }

    ew(nq param0) {
        super(1023, param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = new int[8192];
    }
}
