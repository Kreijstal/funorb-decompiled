/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pr extends ma {
    int field_w;
    int field_A;
    int field_E;
    jg field_C;
    int field_G;
    static int field_l;
    int field_B;
    int field_y;
    g field_u;
    int field_s;
    int field_v;
    int field_m;
    int field_q;
    int field_z;
    int field_F;
    int field_t;
    int field_r;
    int field_D;
    nb field_o;
    int field_n;
    int field_p;
    kp field_x;

    final static void c(byte param0) {
        if (!(null == ta.field_h)) {
            qf.field_d.a(ta.field_h);
        }
        ta.field_h = null;
        mp.field_R = null;
        int var1 = 107 / ((24 - param0) / 56);
        wm.field_Xb = null;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param0 == -23989) {
              L1: {
                var2 = param1.getParameter("username");
                if (var2 == null) {
                  break L1;
                } else {
                  var3 = (CharSequence) ((Object) var2);
                  if (0L == td.a((byte) 52, var3)) {
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("pr.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int[] param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        java.applet.Applet var7 = null;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            L1: {
              fo.field_c = new int[jd.field_h.length][5][3];
              var2_int = param0[9] >> -343778814;
              var3 = param0[10] >> -1707735358;
              var4 = var2_int * var2_int - -(var3 * var3) >> -392414640;
              if (-1 <= (var4 ^ -1)) {
                var3 = 65536;
                var2_int = 0;
                break L1;
              } else {
                var5 = rf.a(var4, -127);
                var2_int = lh.a(var5, (byte) -81, (long)var2_int);
                var3 = lh.a(var5, (byte) -121, (long)var3);
                break L1;
              }
            }
            L2: {
              if (!param1) {
                break L2;
              } else {
                var7 = (java.applet.Applet) null;
                pr.a(-15, (java.applet.Applet) null);
                break L2;
              }
            }
            var2_int = var2_int >> 3;
            var3 = var3 >> 3;
            var8 = 0;
            var4 = var8;
            L3: while (true) {
              if (var8 >= fo.field_c.length) {
                break L0;
              } else {
                L4: {
                  fo.field_c[var8][0][0] = var2_int;
                  fo.field_c[var8][0][1] = var3;
                  fo.field_c[var8][0][2] = jd.field_h[var8];
                  fo.field_c[var8][1][0] = var2_int >> 1390158465;
                  fo.field_c[var8][1][1] = var3 >> -1764583103;
                  fo.field_c[var8][1][2] = jd.field_h[var8];
                  fo.field_c[var8][2][0] = 0;
                  fo.field_c[var8][2][1] = 0;
                  fo.field_c[var8][2][2] = jd.field_h[var8];
                  fo.field_c[var8][3][0] = -var2_int >> -702933407;
                  fo.field_c[var8][3][1] = -var3 >> -1092755231;
                  fo.field_c[var8][3][2] = jd.field_h[var8];
                  fo.field_c[var8][4][0] = -var2_int;
                  fo.field_c[var8][4][1] = -var3;
                  fo.field_c[var8][4][2] = jd.field_h[var8];
                  ga.a(param0, fo.field_c[var8][0], false);
                  ga.a(param0, fo.field_c[var8][1], param1);
                  ga.a(param0, fo.field_c[var8][2], false);
                  ga.a(param0, fo.field_c[var8][3], false);
                  ga.a(param0, fo.field_c[var8][4], false);
                  if (fo.field_c[var8][0][2] >= 0) {
                    break L4;
                  } else {
                    fo.field_c[var8][0][1] = qh.field_f;
                    break L4;
                  }
                }
                L5: {
                  if (-1 < (fo.field_c[var8][1][2] ^ -1)) {
                    fo.field_c[var8][1][1] = qh.field_f;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (-1 < (fo.field_c[var8][2][2] ^ -1)) {
                    fo.field_c[var8][2][1] = qh.field_f;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if ((fo.field_c[var8][3][2] ^ -1) <= -1) {
                    break L7;
                  } else {
                    fo.field_c[var8][3][1] = qh.field_f;
                    break L7;
                  }
                }
                L8: {
                  if ((fo.field_c[var8][4][2] ^ -1) <= -1) {
                    break L8;
                  } else {
                    fo.field_c[var8][4][1] = qh.field_f;
                    break L8;
                  }
                }
                var8++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var2);
            stackOut_22_1 = new StringBuilder().append("pr.D(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
    }

    final void a(int param0) {
        this.field_u = null;
        if (param0 != 2) {
            this.a(-106);
        }
        this.field_x = null;
        this.field_C = null;
        this.field_o = null;
    }

    final static java.net.URL a(int param0, java.net.URL param1, String param2, byte param3, String param4) {
        try {
            StringBuilder discarded$9 = null;
            StringBuilder discarded$10 = null;
            StringBuilder discarded$11 = null;
            StringBuilder discarded$12 = null;
            StringBuilder discarded$13 = null;
            StringBuilder discarded$14 = null;
            StringBuilder discarded$15 = null;
            StringBuilder discarded$16 = null;
            StringBuilder discarded$17 = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            java.net.URL stackIn_40_0 = null;
            java.net.URL stackIn_42_0 = null;
            RuntimeException stackIn_44_0 = null;
            StringBuilder stackIn_44_1 = null;
            RuntimeException stackIn_45_0 = null;
            StringBuilder stackIn_45_1 = null;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            String stackIn_46_2 = null;
            RuntimeException stackIn_47_0 = null;
            StringBuilder stackIn_47_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_39_0 = null;
            java.net.URL stackOut_41_0 = null;
            RuntimeException stackOut_43_0 = null;
            StringBuilder stackOut_43_1 = null;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            String stackOut_45_2 = null;
            RuntimeException stackOut_44_0 = null;
            StringBuilder stackOut_44_1 = null;
            String stackOut_44_2 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            RuntimeException stackOut_47_0 = null;
            StringBuilder stackOut_47_1 = null;
            String stackOut_47_2 = null;
            RuntimeException stackOut_49_0 = null;
            StringBuilder stackOut_49_1 = null;
            RuntimeException stackOut_51_0 = null;
            StringBuilder stackOut_51_1 = null;
            String stackOut_51_2 = null;
            RuntimeException stackOut_50_0 = null;
            StringBuilder stackOut_50_1 = null;
            String stackOut_50_2 = null;
            try {
              L0: {
                var5 = param1.getFile();
                var6 = 0;
                L1: while (true) {
                  L2: {
                    if (var5.regionMatches(var6, "/l=", 0, 3)) {
                      var7_int = var5.indexOf('/', var6 - -1);
                      if (-1 < (var7_int ^ -1)) {
                        break L2;
                      } else {
                        if (-1 >= (param0 ^ -1)) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      if (var5.regionMatches(var6, "/a=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (-1 >= (var7_int ^ -1)) {
                          break L3;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      if (var5.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if ((var7_int ^ -1) > -1) {
                          break L5;
                        } else {
                          if (param2 == null) {
                            break L3;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      L7: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L7;
                        } else {
                          if (var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', var6 - -1);
                      if (var7_int < 0) {
                        break L6;
                      } else {
                        if (param4 == null) {
                          break L3;
                        } else {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        }
                      }
                    }
                    L8: {
                      var7 = new StringBuilder(var6);
                      if (param3 == 63) {
                        break L8;
                      } else {
                        field_l = 117;
                        break L8;
                      }
                    }
                    L9: {
                      discarded$9 = var7.append(var5.substring(0, var6));
                      if (-1 > (param0 ^ -1)) {
                        discarded$10 = var7.append("/l=");
                        discarded$11 = var7.append(Integer.toString(param0));
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (param2 == null) {
                        break L10;
                      } else {
                        if ((param2.length() ^ -1) >= -1) {
                          break L10;
                        } else {
                          discarded$12 = var7.append("/p=");
                          discarded$13 = var7.append(param2);
                          break L10;
                        }
                      }
                    }
                    L11: {
                      if (param4 == null) {
                        break L11;
                      } else {
                        if (0 >= param4.length()) {
                          break L11;
                        } else {
                          discarded$14 = var7.append("/s=");
                          discarded$15 = var7.append(param4);
                          break L11;
                        }
                      }
                    }
                    L12: {
                      if (var6 < var5.length()) {
                        discarded$16 = var7.append(var5.substring(var6, var5.length()));
                        break L12;
                      } else {
                        discarded$17 = var7.append('/');
                        break L12;
                      }
                    }
                    try {
                      L13: {
                        stackOut_39_0 = new java.net.URL(param1, var7.toString());
                        stackIn_40_0 = stackOut_39_0;
                        break L13;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackOut_41_0 = (java.net.URL) (param1);
                      stackIn_42_0 = stackOut_41_0;
                      return stackIn_42_0;
                    }
                    break L0;
                  }
                  var6 = var7_int;
                  continue L1;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L14: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_43_0 = (RuntimeException) (var5_ref);
                stackOut_43_1 = new StringBuilder().append("pr.A(").append(param0).append(',');
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                if (param1 == null) {
                  stackOut_45_0 = (RuntimeException) ((Object) stackIn_45_0);
                  stackOut_45_1 = (StringBuilder) ((Object) stackIn_45_1);
                  stackOut_45_2 = "null";
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  stackIn_46_2 = stackOut_45_2;
                  break L14;
                } else {
                  stackOut_44_0 = (RuntimeException) ((Object) stackIn_44_0);
                  stackOut_44_1 = (StringBuilder) ((Object) stackIn_44_1);
                  stackOut_44_2 = "{...}";
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_46_2 = stackOut_44_2;
                  break L14;
                }
              }
              L15: {
                stackOut_46_0 = (RuntimeException) ((Object) stackIn_46_0);
                stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param2 == null) {
                  stackOut_48_0 = (RuntimeException) ((Object) stackIn_48_0);
                  stackOut_48_1 = (StringBuilder) ((Object) stackIn_48_1);
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L15;
                } else {
                  stackOut_47_0 = (RuntimeException) ((Object) stackIn_47_0);
                  stackOut_47_1 = (StringBuilder) ((Object) stackIn_47_1);
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L15;
                }
              }
              L16: {
                stackOut_49_0 = (RuntimeException) ((Object) stackIn_49_0);
                stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(',').append(param3).append(',');
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                if (param4 == null) {
                  stackOut_51_0 = (RuntimeException) ((Object) stackIn_51_0);
                  stackOut_51_1 = (StringBuilder) ((Object) stackIn_51_1);
                  stackOut_51_2 = "null";
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  stackIn_52_2 = stackOut_51_2;
                  break L16;
                } else {
                  stackOut_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackOut_50_1 = (StringBuilder) ((Object) stackIn_50_1);
                  stackOut_50_2 = "{...}";
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_52_2 = stackOut_50_2;
                  break L16;
                }
              }
              throw wm.a((Throwable) ((Object) stackIn_52_0), stackIn_52_2 + ')');
            }
            return stackIn_40_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    pr() {
    }

    static {
        field_l = 6348;
    }
}
