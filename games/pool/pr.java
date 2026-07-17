/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

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
            qf.field_d.a((kd) (Object) ta.field_h);
        }
        ta.field_h = null;
        mp.field_R = null;
        int var1 = -107;
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
                  var3 = (CharSequence) (Object) var2;
                  if (0L == td.a((byte) 52, var3)) {
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("pr.E(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int[] param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var6 = Pool.field_O;
        try {
          L0: {
            L1: {
              fo.field_c = new int[jd.field_h.length][5][3];
              var2_int = param0[9] >> 2;
              var3 = param0[10] >> 2;
              var4 = var2_int * var2_int - -(var3 * var3) >> 16;
              if (var4 <= 0) {
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
            var2_int = var2_int >> 3;
            var3 = var3 >> 3;
            var7 = 0;
            var4 = var7;
            L2: while (true) {
              if (var7 >= fo.field_c.length) {
                break L0;
              } else {
                L3: {
                  fo.field_c[var7][0][0] = var2_int;
                  fo.field_c[var7][0][1] = var3;
                  fo.field_c[var7][0][2] = jd.field_h[var7];
                  fo.field_c[var7][1][0] = var2_int >> 1;
                  fo.field_c[var7][1][1] = var3 >> 1;
                  fo.field_c[var7][1][2] = jd.field_h[var7];
                  fo.field_c[var7][2][0] = 0;
                  fo.field_c[var7][2][1] = 0;
                  fo.field_c[var7][2][2] = jd.field_h[var7];
                  fo.field_c[var7][3][0] = -var2_int >> 1;
                  fo.field_c[var7][3][1] = -var3 >> 1;
                  fo.field_c[var7][3][2] = jd.field_h[var7];
                  fo.field_c[var7][4][0] = -var2_int;
                  fo.field_c[var7][4][1] = -var3;
                  fo.field_c[var7][4][2] = jd.field_h[var7];
                  ga.a(param0, fo.field_c[var7][0], false);
                  ga.a(param0, fo.field_c[var7][1], false);
                  ga.a(param0, fo.field_c[var7][2], false);
                  ga.a(param0, fo.field_c[var7][3], false);
                  ga.a(param0, fo.field_c[var7][4], false);
                  if (fo.field_c[var7][0][2] >= 0) {
                    break L3;
                  } else {
                    fo.field_c[var7][0][1] = qh.field_f;
                    break L3;
                  }
                }
                L4: {
                  if (fo.field_c[var7][1][2] < 0) {
                    fo.field_c[var7][1][1] = qh.field_f;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (fo.field_c[var7][2][2] < 0) {
                    fo.field_c[var7][2][1] = qh.field_f;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  if (fo.field_c[var7][3][2] >= 0) {
                    break L6;
                  } else {
                    fo.field_c[var7][3][1] = qh.field_f;
                    break L6;
                  }
                }
                L7: {
                  if (fo.field_c[var7][4][2] >= 0) {
                    break L7;
                  } else {
                    fo.field_c[var7][4][1] = qh.field_f;
                    break L7;
                  }
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("pr.D(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + 0 + 41);
        }
    }

    final void a(int param0) {
        ((pr) this).field_u = null;
        if (param0 != 2) {
            ((pr) this).a(-106);
        }
        ((pr) this).field_x = null;
        ((pr) this).field_C = null;
        ((pr) this).field_o = null;
    }

    final static java.net.URL a(int param0, java.net.URL param1, String param2, byte param3, String param4) {
        try {
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
              var5 = param1.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  if (var5.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 - -1);
                    if (var7_int < 0) {
                      break L1;
                    } else {
                      if (param0 >= 0) {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      } else {
                        var6 = var7_int;
                        continue L0;
                      }
                    }
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (var5.regionMatches(var6, "/a=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int >= 0) {
                      var6 = var7_int;
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (var7_int < 0) {
                      break L3;
                    } else {
                      if (param2 == null) {
                        var6 = var7_int;
                        continue L0;
                      } else {
                        var5 = var5.substring(0, var6) + var5.substring(var7_int);
                        continue L0;
                      }
                    }
                  } else {
                    break L3;
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
                  var7_int = var5.indexOf('/', var6 - -1);
                  if (var7_int < 0) {
                    break L4;
                  } else {
                    if (param4 == null) {
                      var6 = var7_int;
                      continue L0;
                    } else {
                      var5 = var5.substring(0, var6) + var5.substring(var7_int);
                      continue L0;
                    }
                  }
                }
                L6: {
                  var7 = new StringBuilder(var6);
                  if (param3 == 63) {
                    break L6;
                  } else {
                    field_l = 117;
                    break L6;
                  }
                }
                L7: {
                  StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                  if (param0 > 0) {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param0));
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L8: {
                  if (param2 == null) {
                    break L8;
                  } else {
                    if (param2.length() <= 0) {
                      break L8;
                    } else {
                      StringBuilder discarded$12 = var7.append("/p=");
                      StringBuilder discarded$13 = var7.append(param2);
                      break L8;
                    }
                  }
                }
                L9: {
                  if (param4 == null) {
                    break L9;
                  } else {
                    if (0 >= param4.length()) {
                      break L9;
                    } else {
                      StringBuilder discarded$14 = var7.append("/s=");
                      StringBuilder discarded$15 = var7.append(param4);
                      break L9;
                    }
                  }
                }
                L10: {
                  if (~var6 > ~var5.length()) {
                    StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                    break L10;
                  } else {
                    StringBuilder discarded$17 = var7.append(47);
                    break L10;
                  }
                }
                try {
                  L11: {
                    stackOut_39_0 = new java.net.URL(param1, var7.toString());
                    stackIn_40_0 = stackOut_39_0;
                    break L11;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = (Exception) (Object) decompiledCaughtException;
                  var8.printStackTrace();
                  stackOut_41_0 = (java.net.URL) param1;
                  stackIn_42_0 = stackOut_41_0;
                  return stackIn_42_0;
                }
                return stackIn_40_0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_43_0 = (RuntimeException) var5_ref;
                stackOut_43_1 = new StringBuilder().append("pr.A(").append(param0).append(44);
                stackIn_45_0 = stackOut_43_0;
                stackIn_45_1 = stackOut_43_1;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                if (param1 == null) {
                  stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
                  stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
                  stackOut_45_2 = "null";
                  stackIn_46_0 = stackOut_45_0;
                  stackIn_46_1 = stackOut_45_1;
                  stackIn_46_2 = stackOut_45_2;
                  break L12;
                } else {
                  stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
                  stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
                  stackOut_44_2 = "{...}";
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_46_2 = stackOut_44_2;
                  break L12;
                }
              }
              L13: {
                stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(44);
                stackIn_48_0 = stackOut_46_0;
                stackIn_48_1 = stackOut_46_1;
                stackIn_47_0 = stackOut_46_0;
                stackIn_47_1 = stackOut_46_1;
                if (param2 == null) {
                  stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                  stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                  stackOut_48_2 = "null";
                  stackIn_49_0 = stackOut_48_0;
                  stackIn_49_1 = stackOut_48_1;
                  stackIn_49_2 = stackOut_48_2;
                  break L13;
                } else {
                  stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
                  stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
                  stackOut_47_2 = "{...}";
                  stackIn_49_0 = stackOut_47_0;
                  stackIn_49_1 = stackOut_47_1;
                  stackIn_49_2 = stackOut_47_2;
                  break L13;
                }
              }
              L14: {
                stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
                stackOut_49_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_49_2).append(44).append(param3).append(44);
                stackIn_51_0 = stackOut_49_0;
                stackIn_51_1 = stackOut_49_1;
                stackIn_50_0 = stackOut_49_0;
                stackIn_50_1 = stackOut_49_1;
                if (param4 == null) {
                  stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
                  stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
                  stackOut_51_2 = "null";
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  stackIn_52_2 = stackOut_51_2;
                  break L14;
                } else {
                  stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
                  stackOut_50_1 = (StringBuilder) (Object) stackIn_50_1;
                  stackOut_50_2 = "{...}";
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_52_1 = stackOut_50_1;
                  stackIn_52_2 = stackOut_50_2;
                  break L14;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_52_0, stackIn_52_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    pr() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 6348;
    }
}
