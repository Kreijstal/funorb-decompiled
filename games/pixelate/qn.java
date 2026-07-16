/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends fa {
    static fm field_l;
    static int field_k;
    static String field_m;
    static int field_p;
    static jk[] field_q;
    static String field_n;
    byte[] field_r;
    static int field_o;

    final static int e(int param0) {
        ck.field_j.b((byte) -2);
        if (param0 != 59) {
            qn.a(-63);
        }
        if (pm.field_h.a(false)) {
            return 0;
        }
        return ph.e(param0 + 25901);
    }

    public static void a(int param0) {
        field_n = null;
        field_m = null;
        if (param0 != -1) {
            int discarded$0 = qn.e(52);
        }
        field_q = null;
        field_l = null;
    }

    final static String a(java.applet.Applet param0, String param1, byte param2) {
        try {
            String var3 = null;
            Throwable var3_ref = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object stackIn_3_0 = null;
            String stackIn_9_0 = null;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            Object stackOut_2_0 = null;
            var7 = Pixelate.field_H ? 1 : 0;
            try {
              L0: {
                var3 = (String) cq.a("getcookies", (byte) -114, param0);
                var4 = dd.a(var3, (byte) -61, ';');
                if (param2 == -85) {
                  var5 = 0;
                  L1: while (true) {
                    if (var5 >= var4.length) {
                      break L0;
                    } else {
                      L2: {
                        var6 = var4[var5].indexOf('=');
                        if (0 > var6) {
                          break L2;
                        } else {
                          if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) param1)) {
                            break L2;
                          } else {
                            stackOut_8_0 = var4[var5].substring(1 + var6).trim();
                            stackIn_9_0 = stackOut_8_0;
                            return stackIn_9_0;
                          }
                        }
                      }
                      var5++;
                      continue L1;
                    }
                  }
                } else {
                  stackOut_2_0 = null;
                  stackIn_3_0 = stackOut_2_0;
                  return (String) (Object) stackIn_3_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var3_ref = decompiledCaughtException;
                break L3;
              }
            }
            return null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    qn(byte[] param0) {
        ((qn) this).field_r = param0;
    }

    final static int a(String param0, int param1, String[] param2, int param3, jl param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        L0: {
          var13 = Pixelate.field_H ? 1 : 0;
          var5 = param4.c(param0);
          if (var5 > param1) {
            break L0;
          } else {
            if (param0.indexOf("<br>") == -1) {
              param2[0] = (String) (Object) param2;
              return 1;
            } else {
              break L0;
            }
          }
        }
        L1: {
          var6 = (param1 + (var5 - 1)) / param1;
          param1 = var5 / var6;
          var6 = 0;
          var7 = 0;
          var8 = param0.length();
          if (param3 < -99) {
            break L1;
          } else {
            int discarded$4 = qn.e(-2);
            break L1;
          }
        }
        var9 = 0;
        L2: while (true) {
          if (var9 >= var8) {
            L3: {
              if (var8 > var7) {
                int incrementValue$5 = var6;
                var6++;
                param2[incrementValue$5] = param0.substring(var7, var8).trim();
                break L3;
              } else {
                break L3;
              }
            }
            return var6;
          } else {
            L4: {
              L5: {
                var10 = param0.charAt(var9);
                if (var10 == 32) {
                  break L5;
                } else {
                  if (var10 != 45) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              var11 = param0.substring(var7, var9 - -1).trim();
              var12 = param4.c(var11);
              if (param1 > var12) {
                break L4;
              } else {
                var7 = var9 + 1;
                int incrementValue$6 = var6;
                var6++;
                param2[incrementValue$6] = var11;
                break L4;
              }
            }
            if (62 == var10) {
              if (param0.regionMatches(var9 - 3, "<br>", 0, 4)) {
                int incrementValue$7 = var6;
                var6++;
                param2[incrementValue$7] = param0.substring(var7, -3 + var9).trim();
                var7 = var9 + 1;
                var9++;
                continue L2;
              } else {
                var9++;
                continue L2;
              }
            } else {
              var9++;
              continue L2;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Name";
        field_p = 0;
        field_n = "Invalid name";
    }
}
