/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class ue {
    static String field_a;
    private fc field_d;
    private ja field_b;
    static String[] field_c;

    final fc a(int param0) {
        fc var2 = ((ue) this).field_b.field_d.field_e;
        if (param0 <= 43) {
            ((ue) this).field_b = null;
        }
        if (var2 == ((ue) this).field_b.field_d) {
            ((ue) this).field_d = null;
            return null;
        }
        ((ue) this).field_d = var2.field_e;
        return var2;
    }

    final fc a(boolean param0, fc param1) {
        fc var3 = null;
        if (param1 == null) {
            var3 = ((ue) this).field_b.field_d.field_e;
        } else {
            var3 = param1;
        }
        if (var3 == ((ue) this).field_b.field_d) {
            ((ue) this).field_d = null;
            return null;
        }
        if (!param0) {
            return null;
        }
        ((ue) this).field_d = var3.field_e;
        return var3;
    }

    final static String a(int param0, CharSequence[] param1, byte param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = TrackController.field_F ? 1 : 0;
        if (param3 != 0) {
          if (param3 != 1) {
            var4 = param0 + param3;
            var5 = 0;
            if (param2 == 57) {
              var6_int = param0;
              L0: while (true) {
                if (var6_int >= var4) {
                  var6 = new StringBuilder(var5);
                  var7 = param0;
                  L1: while (true) {
                    if (var7 >= var4) {
                      return var6.toString();
                    } else {
                      var8 = param1[var7];
                      if (var8 != null) {
                        StringBuilder discarded$2 = var6.append(var8);
                        var7++;
                        continue L1;
                      } else {
                        StringBuilder discarded$3 = var6.append("null");
                        var7++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  var7_ref_CharSequence = param1[var6_int];
                  if (var7_ref_CharSequence != null) {
                    var5 = var5 + var7_ref_CharSequence.length();
                    var6_int++;
                    continue L0;
                  } else {
                    var5 += 4;
                    var6_int++;
                    continue L0;
                  }
                }
              }
            } else {
              return null;
            }
          } else {
            var10 = param1[param0];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          }
        } else {
          return "";
        }
    }

    final fc a(byte param0, fc param1) {
        fc var3 = null;
        if (param0 != -37) {
            Object var4 = null;
            java.net.URL discarded$0 = ue.a((java.net.URL) null, 89, (String) null, 12, (String) null);
        }
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((ue) this).field_b.field_d.field_h;
        }
        if (var3 == ((ue) this).field_b.field_d) {
            ((ue) this).field_d = null;
            return null;
        }
        ((ue) this).field_d = var3.field_h;
        return var3;
    }

    final static java.net.URL a(java.net.URL param0, int param1, String param2, int param3, String param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            int var8 = 0;
            Exception var9 = null;
            int var10 = 0;
            java.net.URL stackIn_40_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_39_0 = null;
            var10 = TrackController.field_F ? 1 : 0;
            var5 = param0.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (var5.regionMatches(var6, "/l=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (var7_int >= 0) {
                    if (0 <= param3) {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (var5.regionMatches(var6, "/a=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (-1 < (var7_int ^ -1)) {
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
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (var7_int >= 0) {
                    if (param2 != null) {
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
                var7_int = var5.indexOf('/', 1 + var6);
                if (var7_int < 0) {
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
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if (-1 > (param3 ^ -1)) {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                var8 = 108 % ((param1 - -59) / 50);
                if (param2 == null) {
                  break L7;
                } else {
                  if (param2.length() < -1) {
                    StringBuilder discarded$12 = var7.append("/p=");
                    StringBuilder discarded$13 = var7.append(param2);
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (param4 == null) {
                  break L8;
                } else {
                  if (-1 < param4.length()) {
                    StringBuilder discarded$14 = var7.append("/s=");
                    StringBuilder discarded$15 = var7.append(param4);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (var6 < var5.length()) {
                  StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                  break L9;
                } else {
                  StringBuilder discarded$17 = var7.append(47);
                  break L9;
                }
              }
              try {
                stackOut_39_0 = new java.net.URL(param0, var7.toString());
                stackIn_40_0 = stackOut_39_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_40_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final fc e(int param0) {
        fc var2 = ((ue) this).field_d;
        if (!(var2 != ((ue) this).field_b.field_d)) {
            ((ue) this).field_d = null;
            return null;
        }
        ((ue) this).field_d = var2.field_h;
        if (param0 != 37) {
            field_a = null;
        }
        return var2;
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        if (param0 >= -119) {
            field_c = null;
        }
    }

    final static void a(int param0, int param1, byte param2, int param3) {
        param1 = -65 & param1;
        int var4 = ud.a((byte) 54, param1);
        if (param2 != 91) {
            boolean discarded$0 = ue.a(-77, '');
        }
        u discarded$1 = nl.a(e.a(param1, -1932340400, var4), true, -257, param0, 0, var4, param3, param1);
    }

    final static String a(long param0, byte param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = TrackController.field_F ? 1 : 0;
        if ((param0 ^ -1L) >= -1L) {
            return null;
        }
        if (-6582952005840035282L >= (param0 ^ -1L)) {
            return null;
        }
        if ((param0 % 37L ^ -1L) == -1L) {
            return null;
        }
        int var3 = 0;
        long var4 = param0;
        while ((var4 ^ -1L) != -1L) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (0L != param0) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = lg.field_b[(int)(-(37L * param0) + var7)];
            if (!(95 != var9)) {
                var10 = -1 + var6.length();
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                var9 = 160;
            }
            StringBuilder discarded$0 = var6.append(var9);
        }
        StringBuilder discarded$4 = var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        if (param1 <= 28) {
            Object var12 = null;
            ue.a((String) null, true);
        }
        return var6.toString();
    }

    final fc c(int param0) {
        fc var2 = ((ue) this).field_d;
        if (!(((ue) this).field_b.field_d != var2)) {
            ((ue) this).field_d = null;
            return null;
        }
        ((ue) this).field_d = var2.field_e;
        if (param0 > -8) {
            fc discarded$0 = ((ue) this).e(-30);
        }
        return var2;
    }

    final static boolean a(int param0, char param1) {
        if (!(!Character.isISOControl(param1))) {
            return false;
        }
        if (vl.a(param1, 18102)) {
            return true;
        }
        if (param1 != 45) {
            // if_icmpeq L53
            // if_icmpeq L53
            // if_icmpeq L53
        } else {
            return true;
        }
        if (param0 != -16490) {
            return true;
        }
        return false;
    }

    final static void a(String param0, boolean param1) {
        ab.field_b = param0;
        qc.b(12, (byte) -42);
        if (param1) {
            String discarded$0 = ue.a(-17L, (byte) 10);
        }
    }

    final fc d(int param0) {
        fc var2 = ((ue) this).field_b.field_d.field_h;
        int var3 = 61 / ((38 - param0) / 34);
        if (!(((ue) this).field_b.field_d != var2)) {
            ((ue) this).field_d = null;
            return null;
        }
        ((ue) this).field_d = var2.field_h;
        return var2;
    }

    ue(ja param0) {
        ((ue) this).field_b = param0;
    }

    static {
    }
}
