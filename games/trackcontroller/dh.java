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
        qh.field_e.a((byte) -93, var4);
        gj.a(2, var4, param0);
        if (param1 != -1) {
            field_i = (String) null;
        }
        return var4;
    }

    final static void a(String param0, long param1, java.applet.Applet param2, String param3, int param4) {
        try {
            RuntimeException stackIn_11_0 = null;
            StringBuilder stackIn_11_1 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            String stackIn_12_2 = null;
            StringBuilder stackIn_14_1 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            StringBuilder stackIn_17_1 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var6 = null;
            RuntimeException var6_ref = null;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            try {
              L0: {
                if (param4 == 1000) {
                  try {
                    L1: {
                      L2: {
                        var8 = param2.getParameter("cookiehost");
                        var7 = var8;
                        var7 = var8;
                        var9 = param3 + "=" + param0 + "; version=1; path=/; domain=" + var8;
                        var7 = var9;
                        var7 = var9;
                        if (param1 < 0L) {
                          var7 = var9 + "; Discard;";
                          break L2;
                        } else {
                          var7 = var9 + "; Expires=" + rb.a(qg.a(false) - -(1000L * param1), (byte) -101) + "; Max-Age=" + param1;
                          break L2;
                        }
                      }
                      sj.a(param2, "document.cookie=\"" + var7 + "\"", param4 ^ -23611);
                      break L1;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var6 = decompiledCaughtException;
                      break L3;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var6_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_11_0 = (RuntimeException) (var6_ref);

                stackIn_11_1 = new StringBuilder().append("dh.F(");

                if (param0 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "null";
                  break L4;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
                  stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
                  stackIn_12_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

                if (param2 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              L6: {


                stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

                if (param3 == null) {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "null";
                  break L6;
                } else {
                  stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
                  stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackIn_18_2 = "{...}";
                  break L6;
                }
              }
              throw sl.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param4 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
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
            dh.a(95, -52, 22, 106);
        }
    }

    final static qj[] e(int param0) {
        qj[] var1;
        int var2;
        int var3;
        int[] var6;
        int var6_int;
        int var7;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
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
            var20 = qk.field_M[var2];
            if (ga.field_b[var2]) {
              var22 = fk.field_d[var2];
              var16 = new int[var3];
              var13 = var16;
              var6 = var13;
              var7 = 0;
              L2: while (true) {
                if (var3 <= var7) {
                  var1[var2] = (qj) ((Object) new d(ab.field_a, qe.field_p, ka.field_f[var2], vb.field_a[var2], cf.field_p[var2], j.field_f[var2], var16));
                  var2++;
                  continue L1;
                } else {
                  var6[var7] = ok.a(tc.a(var22[var7] << -1369907464, -16777216), qe.field_z[tc.a(255, (int) var20[var7])]);
                  var7++;
                  continue L2;
                }
              }
            } else {
              var9 = new int[var3];
              var21 = var9;
              var6_int = 0;
              L3: while (true) {
                if (var3 <= var6_int) {
                  var1[var2] = new qj(ab.field_a, qe.field_p, ka.field_f[var2], vb.field_a[var2], cf.field_p[var2], j.field_f[var2], var21);
                  var2++;
                  continue L1;
                } else {
                  var9[var6_int] = qe.field_z[tc.a((int) var20[var6_int], 255)];
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
            String var4 = null;
            String var5 = null;
            String var6 = null;
            String var7 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            StringBuilder stackIn_16_1 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            RuntimeException var3_ref = null;
            try {
              L0: {
                of.field_g = param1;
                try {
                  L1: {
                    if (param0 == -19136) {
                      L2: {
                        var6 = param2.getParameter("cookieprefix");
                        var5 = var6;
                        var5 = var6;
                        var4 = param2.getParameter("cookiehost");
                        var5 = var4;
                        var5 = var4;
                        var7 = var6 + "settings=" + param1 + "; version=1; path=/; domain=" + var4;
                        var5 = var7;
                        var5 = var7;
                        if (-1 != (param1.length() ^ -1)) {
                          var5 = var7 + "; Expires=" + rb.a(94608000000L + qg.a(false), (byte) -111) + "; Max-Age=" + 94608000L;
                          break L2;
                        } else {
                          var5 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                          break L2;
                        }
                      }
                      sj.a(param2, "document.cookie=\"" + var5 + "\"", -24531);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L3: {
                    var3 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L3;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  rj.a(param2, (byte) -99);
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var3_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_13_0 = (RuntimeException) (var3_ref);

                stackIn_13_1 = new StringBuilder().append("dh.C(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "null";
                  break L4;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                  stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                  stackIn_14_2 = "{...}";
                  break L4;
                }
              }
              L5: {


                stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

                if (param2 == null) {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L5;
                } else {
                  stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L5;
                }
              }
              throw sl.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
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

    final static String a(byte param0, String[] param1, String param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        try {
          L0: {
            var3_int = param2.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param2.indexOf("<%", var5);
              if (var6_int < 0) {
                L2: {
                  var6 = new StringBuilder(var4);
                  var5 = 0;
                  var7 = 0;
                  if (param0 <= -40) {
                    break L2;
                  } else {
                    field_r = (String) null;
                    break L2;
                  }
                }
                L3: while (true) {
                  var8 = param2.indexOf("<%", var5);
                  if (-1 >= (var8 ^ -1)) {
                    var5 = 2 + var8;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          break L5;
                        } else {
                          if (!hd.a(-114, param2.charAt(var5))) {
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      var9 = param2.substring(2 + var8, var5);
                      if (ej.a(false, (CharSequence) ((Object) var9))) {
                        if (var5 >= var3_int) {
                          continue L3;
                        } else {
                          if (param2.charAt(var5) != 62) {
                            continue L3;
                          } else {
                            var5++;
                            var10 = uk.a((CharSequence) ((Object) var9), 10);
                            discarded$0 = var6.append(param2.substring(var7, var8));
                            discarded$1 = var6.append(param1[var10]);
                            var7 = var5;
                            continue L3;
                          }
                        }
                      } else {
                        continue L3;
                      }
                    }
                  } else {
                    discarded$2 = var6.append(param2.substring(var7));
                    stackIn_25_0 = var6.toString();
                    break L0;
                  }
                }
              } else {
                var5 = 2 + var6_int;
                L6: while (true) {
                  L7: {
                    if (var3_int <= var5) {
                      break L7;
                    } else {
                      if (!hd.a(-124, param2.charAt(var5))) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param2.substring(2 + var6_int, var5);
                  if (!ej.a(false, (CharSequence) ((Object) var7_ref_String))) {
                    continue L1;
                  } else {
                    if (var3_int <= var5) {
                      continue L1;
                    } else {
                      if (param2.charAt(var5) != 62) {
                        continue L1;
                      } else {
                        var5++;
                        var8 = uk.a((CharSequence) ((Object) var7_ref_String), 10);
                        var4 = var4 + (param1[var8].length() - var5 + var6_int);
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var3);

            stackIn_28_1 = new StringBuilder().append("dh.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L8;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L9;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ')');
        }
        return stackIn_25_0;
    }

    dh(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_j = param4;
        this.field_o = param3;
        this.field_k = param0;
        this.field_q = param1;
        this.field_m = param5;
        this.field_n = param2;
    }

    static {
        field_r = "Reload game";
        field_i = "Create";
        field_p = 0;
    }
}
