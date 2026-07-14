/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si implements pf {
    private dj field_h;
    private int field_o;
    static ll[] field_p;
    static String field_q;
    private int field_m;
    private int field_j;
    private int field_k;
    static int field_l;
    private int field_c;
    static String field_n;
    private int field_f;
    private int field_b;
    private int field_d;
    private int field_a;
    private int field_e;
    private int field_i;
    static int field_g;

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        bk var11 = null;
        qm stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        qm stackOut_1_0 = null;
        L0: {
          if (!(param0 instanceof bk)) {
            stackOut_2_0 = null;
            stackIn_3_0 = (qm) (Object) stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = (qm) param0;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var11 = (bk) (Object) stackIn_3_0;
          if (var11 != null) {
            param4 = param4 & var11.field_B;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var7 = 5592405;
          de.d(param0.field_n + param2, param3 + param0.field_j, param0.field_v, param0.field_k, ((si) this).field_m);
          if (!param4) {
            break L2;
          } else {
            var7 = 16777215;
            break L2;
          }
        }
        var8 = param2 + param0.field_n + ((si) this).field_k;
        var9 = param3 + (param0.field_j - -((si) this).field_c);
        de.g(var8, var9, ((si) this).field_f, ((si) this).field_d, param1);
        de.d(var8, var9, ((si) this).field_f, ((si) this).field_d, var7);
        if (var11.field_z) {
          L3: {
            de.b(var8, var9, ((si) this).field_f + var8, ((si) this).field_d + var9, 1);
            de.b(var8 + ((si) this).field_f, var9, var8, ((si) this).field_d + var9, 1);
            if (((si) this).field_h != null) {
              var10 = ((si) this).field_j + ((si) this).field_k + ((si) this).field_f;
              int discarded$2 = ((si) this).field_h.a(param0.field_g, param0.field_n + param2 + var10, param0.field_j + (param3 - -((si) this).field_b), -((si) this).field_j + (-var10 + param0.field_v), param0.field_k - (((si) this).field_j << 845520257), ((si) this).field_e, ((si) this).field_i, ((si) this).field_a, ((si) this).field_o, 0);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        } else {
          L4: {
            if (((si) this).field_h != null) {
              var10 = ((si) this).field_j + ((si) this).field_k + ((si) this).field_f;
              int discarded$3 = ((si) this).field_h.a(param0.field_g, param0.field_n + param2 + var10, param0.field_j + (param3 - -((si) this).field_b), -((si) this).field_j + (-var10 + param0.field_v), param0.field_k - (((si) this).field_j << 845520257), ((si) this).field_e, ((si) this).field_i, ((si) this).field_a, ((si) this).field_o, 0);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    public static void b(byte param0) {
        if (param0 != 36) {
            return;
        }
        field_q = null;
        field_n = null;
        field_p = null;
    }

    final static String a(String param0, String param1, String param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = param0.indexOf(param1);
        L0: while (true) {
          if (-1 == var4) {
            if (param3 <= 98) {
              var6 = null;
              String discarded$2 = si.a((String) null, (String) null, (String) null, (byte) -117);
              return param0;
            } else {
              return param0;
            }
          } else {
            param0 = param0.substring(0, var4) + param2 + param0.substring(var4 + param1.length());
            var4 = param0.indexOf(param1, param2.length() + var4);
            continue L0;
          }
        }
    }

    final static int a(byte param0) {
        if (param0 == 116) {
          mk.field_O.a(-8456);
          if (!jl.field_c.e(param0 + -3261)) {
            return to.d(true);
          } else {
            return 0;
          }
        } else {
          field_q = null;
          mk.field_O.a(-8456);
          if (!jl.field_c.e(param0 + -3261)) {
            return to.d(true);
          } else {
            return 0;
          }
        }
    }

    final static java.net.URL a(byte param0, String param1, String param2, int param3, java.net.URL param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_44_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_43_0 = null;
            var9 = ArcanistsMulti.field_G ? 1 : 0;
            var5 = param4.getFile();
            var6 = 0;
            L0: while (true) {
              L1: {
                if (var5.regionMatches(var6, "/l=", 0, 3)) {
                  var7_int = var5.indexOf('/', 1 + var6);
                  if (0 <= var7_int) {
                    if (0 > param3) {
                      var6 = var7_int;
                      continue L0;
                    } else {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
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
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (var7_int < 0) {
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
                    if (param1 != null) {
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
                    if (var5.regionMatches(var6, "/c=", 0, 3)) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                }
                var7_int = var5.indexOf('/', 1 + var6);
                if (-1 >= (var7_int ^ -1)) {
                  if (param2 != null) {
                    var5 = var5.substring(0, var6) + var5.substring(var7_int);
                    continue L0;
                  } else {
                    var6 = var7_int;
                    continue L0;
                  }
                } else {
                  break L4;
                }
              }
              L6: {
                var7 = new StringBuilder(var6);
                if (param0 > 102) {
                  break L6;
                } else {
                  si.b((byte) -35);
                  break L6;
                }
              }
              L7: {
                StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                if (param3 > 0) {
                  StringBuilder discarded$10 = var7.append("/l=");
                  StringBuilder discarded$11 = var7.append(Integer.toString(param3));
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (param1 == null) {
                  break L8;
                } else {
                  if (0 < param1.length()) {
                    StringBuilder discarded$12 = var7.append("/p=");
                    StringBuilder discarded$13 = var7.append(param1);
                    break L8;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (param2 == null) {
                  break L9;
                } else {
                  if (-1 > (param2.length() ^ -1)) {
                    StringBuilder discarded$14 = var7.append("/s=");
                    StringBuilder discarded$15 = var7.append(param2);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
              L10: {
                if (var6 < var5.length()) {
                  StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                  break L10;
                } else {
                  StringBuilder discarded$17 = var7.append(47);
                  break L10;
                }
              }
              try {
                stackOut_43_0 = new java.net.URL(param4, var7.toString());
                stackIn_44_0 = stackOut_43_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return (java.net.URL) (Object) stackIn_44_0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    si(dj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        ((si) this).field_o = 1;
        ((si) this).field_a = 1;
        ((si) this).field_k = param5;
        ((si) this).field_d = param7;
        ((si) this).field_j = param1;
        ((si) this).field_f = param8;
        ((si) this).field_i = param4;
        ((si) this).field_h = param0;
        ((si) this).field_c = param6;
        ((si) this).field_e = param3;
        ((si) this).field_b = param2;
        ((si) this).field_m = param9;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 256;
        field_q = "Use this alternative as your account name";
        field_n = "Please try again in a few minutes.";
    }
}
