/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dh extends fc {
    static int field_l;
    int field_n;
    static String field_r;
    static String field_i;
    int field_m;
    static int field_p;
    int field_q;
    int field_k;
    int field_o;
    int field_j;

    final static nk a(int param0, int param1, int param2, int param3) {
        nk var4 = new nk();
        var4.field_i = param2;
        var4.field_m = new int[param3];
        qh.field_e.a((byte) -93, (fc) (Object) var4);
        gj.a(2, var4, param0);
        if (param1 != -1) {
            field_i = null;
        }
        return var4;
    }

    final static void a(String param0, long param1, java.applet.Applet param2, String param3, int param4) {
        try {
            Throwable var6 = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            Throwable decompiledCaughtException = null;
            if (param4 == 1000) {
              try {
                L0: {
                  L1: {
                    var8 = param2.getParameter("cookiehost");
                    var7 = var8;
                    var7 = var8;
                    var9 = param3 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                    var7 = var9;
                    var7 = var9;
                    if (param1 < 0L) {
                      var7 = var9 + "; Discard;";
                      break L1;
                    } else {
                      var7 = var9 + "; Expires=" + rb.a(qg.a(false) - -(1000L * param1), (byte) -101) + "; Max-Age=" + param1;
                      break L1;
                    }
                  }
                  sj.a(param2, "document.cookie=\"" + var7 + "\"", param4 ^ -23611);
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L2: {
                  var6 = decompiledCaughtException;
                  break L2;
                }
              }
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void d(int param0) {
        field_r = null;
        field_i = null;
        if (param0 > -5) {
            nk discarded$0 = dh.a(95, -52, 22, 106);
        }
    }

    final static qj[] e(int param0) {
        qj[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var13 = null;
        int[] var16 = null;
        int[] var20 = null;
        byte[] var21 = null;
        int[] var22 = null;
        byte[] var23 = null;
        int[] var24 = null;
        L0: {
          var8 = TrackController.field_F ? 1 : 0;
          var1 = new qj[gi.field_o];
          if (param0 == 2) {
            break L0;
          } else {
            field_p = -49;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= gi.field_o) {
            ff.b(param0 + 46);
            return var1;
          } else {
            var3 = cf.field_p[var2] * j.field_f[var2];
            var21 = qk.field_M[var2];
            if (ga.field_b[var2]) {
              var23 = fk.field_d[var2];
              var24 = new int[var3];
              var20 = var24;
              var16 = var20;
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (qj) (Object) new d(ab.field_a, qe.field_p, ka.field_f[var2], vb.field_a[var2], cf.field_p[var2], j.field_f[var2], var24);
                  var2++;
                  continue L1;
                } else {
                  var6[var7] = ok.a(tc.a(var23[var7] << -1369907464, -16777216), qe.field_z[tc.a(255, (int) var21[var7])]);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var9 = new int[var3];
              var22 = var9;
              var6_int = 0;
              L3: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new qj(ab.field_a, qe.field_p, ka.field_f[var2], vb.field_a[var2], cf.field_p[var2], j.field_f[var2], var22);
                  var2++;
                  continue L1;
                } else {
                  var9[var6_int] = qe.field_z[tc.a((int) var21[var6_int], 255)];
                  var6_int++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    final static void a(int param0, String param1, java.applet.Applet param2) {
        try {
            String var6 = null;
            String var5 = null;
            String var4 = null;
            String var7 = null;
            of.field_g = param1;
            if (param0 != -19136) {
                return;
            }
            try {
                var6 = param2.getParameter("cookieprefix");
                var5 = var6;
                var5 = var6;
                var4 = param2.getParameter("cookiehost");
                var5 = var4;
                var5 = var4;
                var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                var5 = var7;
                var5 = var7;
                if (-1 == (param1.length() ^ -1)) {
                    var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var7 + "; Expires=" + rb.a(94608000000L + qg.a(false), (byte) -111) + "; Max-Age=" + 94608000L;
                }
                sj.a(param2, "document.cookie=\"" + var5 + "\"", -24531);
            } catch (Throwable throwable) {
            }
            rj.a(param2, (byte) -99);
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static String a(byte param0, String[] param1, String param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        var11 = TrackController.field_F ? 1 : 0;
        var3 = param2.length();
        var4 = var3;
        var5 = 0;
        L0: while (true) {
          var6_int = param2.indexOf("<%", var5);
          if (var6_int < 0) {
            L1: {
              var6 = new StringBuilder(var4);
              var5 = 0;
              var7 = 0;
              if (param0 <= -40) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            L2: while (true) {
              var8 = param2.indexOf("<%", var5);
              if (-1 >= (var8 ^ -1)) {
                var5 = 2 + var8;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3) {
                      break L4;
                    } else {
                      if (!hd.a(-114, param2.charAt(var5))) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var9 = param2.substring(2 + var8, var5);
                  if (ej.a(false, (CharSequence) (Object) var9)) {
                    if (var5 >= var3) {
                      continue L2;
                    } else {
                      if (param2.charAt(var5) != 62) {
                        continue L2;
                      } else {
                        var5++;
                        var10 = uk.a((CharSequence) (Object) var9, 10);
                        StringBuilder discarded$3 = var6.append(param2.substring(var7, var8));
                        StringBuilder discarded$4 = var6.append(param1[var10]);
                        var7 = var5;
                        continue L2;
                      }
                    }
                  } else {
                    continue L2;
                  }
                }
              } else {
                StringBuilder discarded$5 = var6.append(param2.substring(var7));
                return var6.toString();
              }
            }
          } else {
            var5 = 2 + var6_int;
            L5: while (true) {
              L6: {
                if (var3 <= var5) {
                  break L6;
                } else {
                  if (!hd.a(-124, param2.charAt(var5))) {
                    break L6;
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
              var7_ref_String = param2.substring(2 + var6_int, var5);
              if (!ej.a(false, (CharSequence) (Object) var7_ref_String)) {
                continue L0;
              } else {
                if (var3 <= var5) {
                  continue L0;
                } else {
                  if (param2.charAt(var5) != 62) {
                    continue L0;
                  } else {
                    var5++;
                    var8 = uk.a((CharSequence) (Object) var7_ref_String, 10);
                    var4 = var4 + (param1[var8].length() - var5 + var6_int);
                    continue L0;
                  }
                }
              }
            }
          }
        }
    }

    dh(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((dh) this).field_j = param4;
        ((dh) this).field_o = param3;
        ((dh) this).field_k = param0;
        ((dh) this).field_q = param1;
        ((dh) this).field_m = param5;
        ((dh) this).field_n = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Reload game";
        field_i = "Create";
        field_p = 0;
    }
}
