/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq {
    static String field_b;
    static String field_d;
    static int field_f;
    static String field_a;
    static String[] field_e;
    static int[] field_c;

    final static boolean a(int param0) {
        q.field_e = true;
        dl.field_e = bl.a((byte) 115) + (long)param0;
        return -12 == (a.field_b ^ -1) ? true : false;
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_d = null;
        field_c = null;
        field_e = null;
        int var1 = -92 % ((param0 - -1) / 54);
    }

    final static void a(java.applet.Applet param0, boolean param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param1) {
                    field_c = null;
                }
                var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
                param0.getAppletContext().showDocument(gf.a((java.applet.Applet) (Object) (java.applet.AppletContext) (Object) param0, !param1 ? true : false, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(String param0, int param1) {
        CharSequence var3 = null;
        CharSequence var4 = null;
        if (param1 <= -117) {
          if (sq.field_N) {
            if ((va.field_a ^ -1) == -3) {
              if (null != ql.field_a) {
                var4 = (CharSequence) (Object) param0;
                if (!ql.field_a.equals((Object) (Object) tg.a(var4, false))) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          field_c = null;
          if (sq.field_N) {
            if ((va.field_a ^ -1) == -3) {
              if (null != ql.field_a) {
                var3 = (CharSequence) (Object) param0;
                if (!ql.field_a.equals((Object) (Object) tg.a(var3, false))) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static long a(int param0, CharSequence param1) {
        long var2 = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = (long)param0;
        var4 = param1.length();
        var5 = 0;
        L0: while (true) {
          if (var4 > var5) {
            L1: {
              L2: {
                var2 = var2 * 37L;
                var6 = param1.charAt(var5);
                if (var6 < 65) {
                  break L2;
                } else {
                  if (var6 > 90) {
                    break L2;
                  } else {
                    var2 = var2 + (long)(-65 + (1 + var6));
                    break L1;
                  }
                }
              }
              L3: {
                if (97 > var6) {
                  break L3;
                } else {
                  if (var6 <= 122) {
                    var2 = var2 + (long)(-97 + (1 - -var6));
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (var6 < 48) {
                break L1;
              } else {
                if (var6 > 57) {
                  break L1;
                } else {
                  var2 = var2 + (long)(-21 - -var6);
                  break L1;
                }
              }
            }
            if (-177917621779460414L < (var2 ^ -1L)) {
              var5++;
              continue L0;
            } else {
              L4: while (true) {
                L5: {
                  if (0L != var2 % 37L) {
                    break L5;
                  } else {
                    if ((var2 ^ -1L) == -1L) {
                      break L5;
                    } else {
                      var2 = var2 / 37L;
                      continue L4;
                    }
                  }
                }
                return var2;
              }
            }
          } else {
            L6: while (true) {
              L7: {
                if (0L != var2 % 37L) {
                  break L7;
                } else {
                  if ((var2 ^ -1L) == -1L) {
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
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Imposed";
        ja discarded$0 = new ja(48, 48);
        field_d = "Confirm Email:";
        field_e = new String[16];
        field_f = 2;
        field_c = new int[]{38};
        field_a = "to keep fullscreen or";
    }
}
