/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class rt extends i {
    private int field_N;
    static String[] field_G;
    private int field_P;
    private int field_H;
    private up field_J;
    private int[] field_M;
    static vg field_F;
    private gm field_I;
    private hd field_L;
    static String field_K;
    private hd[] field_O;

    final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        ((rt) this).field_I.g((byte) 125);
        ((rt) this).field_L.b(0, param1);
        for (var3 = 0; 3 > var3; var3++) {
            if (!(1 != ((rt) this).field_O[var3].field_sb)) {
                ((rt) this).field_H = ((rt) this).field_H == var3 ? -1 : var3;
            }
        }
        ((rt) this).field_i[0].field_lb = ((rt) this).field_H != -1 ? true : false;
        var3 = param0;
        if (!(-1 != (((rt) this).field_H ^ -1))) {
            var3 = 16;
        }
        if ((((rt) this).field_H ^ -1) == -2) {
            var3 = 5;
        }
        if (!(-3 != (((rt) this).field_H ^ -1))) {
            var3 = 9;
        }
        ((rt) this).field_I.b((byte) -128, var3);
        ((rt) this).field_I.field_R = 128;
    }

    rt(int param0, int param1, up param2) {
        super(20);
        int var4 = 0;
        gr var6 = null;
        hd stackIn_3_0 = null;
        hd stackIn_4_0 = null;
        hd stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_7_0 = null;
        up stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        up stackIn_7_4 = null;
        int stackIn_7_5 = 0;
        Object stackIn_8_0 = null;
        up stackIn_8_1 = null;
        int stackIn_8_2 = 0;
        int stackIn_8_3 = 0;
        up stackIn_8_4 = null;
        int stackIn_8_5 = 0;
        Object stackIn_9_0 = null;
        up stackIn_9_1 = null;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        up stackIn_9_4 = null;
        int stackIn_9_5 = 0;
        Object stackIn_10_0 = null;
        up stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        up stackIn_10_4 = null;
        int stackIn_10_5 = 0;
        int stackIn_10_6 = 0;
        Object stackOut_6_0 = null;
        up stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        up stackOut_6_4 = null;
        int stackOut_6_5 = 0;
        Object stackOut_7_0 = null;
        up stackOut_7_1 = null;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        up stackOut_7_4 = null;
        int stackOut_7_5 = 0;
        Object stackOut_8_0 = null;
        up stackOut_8_1 = null;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        up stackOut_8_4 = null;
        int stackOut_8_5 = 0;
        int stackOut_8_6 = 0;
        Object stackOut_9_0 = null;
        up stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        up stackOut_9_4 = null;
        int stackOut_9_5 = 0;
        int stackOut_9_6 = 0;
        hd stackOut_2_0 = null;
        hd stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        hd stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        ((rt) this).field_H = -1;
        ((rt) this).field_N = -1;
        ((rt) this).field_J = param2;
        ((rt) this).field_P = param0;
        ((rt) this).field_N = param1;
        ((rt) this).field_L = new hd();
        ((rt) this).field_L.field_q = 150;
        ((rt) this).field_O = new hd[3];
        ((rt) this).field_M = new int[]{((rt) this).field_J.field_n, ((rt) this).field_J.field_g, ((rt) this).field_J.field_o};
        ((rt) this).field_L.field_mb = 110;
        var4 = 0;
        L0: while (true) {
          if (3 <= var4) {
            L1: {
              L2: {
                var6 = tu.field_E;
                stackOut_6_0 = this;
                stackOut_6_1 = ((rt) this).field_J;
                stackOut_6_2 = var6.field_w;
                stackOut_6_3 = var6.field_k;
                stackOut_6_4 = ((rt) this).field_J;
                stackOut_6_5 = -107;
                stackIn_9_0 = stackOut_6_0;
                stackIn_9_1 = stackOut_6_1;
                stackIn_9_2 = stackOut_6_2;
                stackIn_9_3 = stackOut_6_3;
                stackIn_9_4 = stackOut_6_4;
                stackIn_9_5 = stackOut_6_5;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                stackIn_7_4 = stackOut_6_4;
                stackIn_7_5 = stackOut_6_5;
                if (jd.f(-1)) {
                  break L2;
                } else {
                  stackOut_7_0 = this;
                  stackOut_7_1 = (up) (Object) stackIn_7_1;
                  stackOut_7_2 = stackIn_7_2;
                  stackOut_7_3 = stackIn_7_3;
                  stackOut_7_4 = (up) (Object) stackIn_7_4;
                  stackOut_7_5 = stackIn_7_5;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  stackIn_9_4 = stackOut_7_4;
                  stackIn_9_5 = stackOut_7_5;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  stackIn_8_4 = stackOut_7_4;
                  stackIn_8_5 = stackOut_7_5;
                  if (!wn.a((byte) -3)) {
                    break L2;
                  } else {
                    stackOut_8_0 = this;
                    stackOut_8_1 = (up) (Object) stackIn_8_1;
                    stackOut_8_2 = stackIn_8_2;
                    stackOut_8_3 = stackIn_8_3;
                    stackOut_8_4 = (up) (Object) stackIn_8_4;
                    stackOut_8_5 = stackIn_8_5;
                    stackOut_8_6 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    stackIn_10_3 = stackOut_8_3;
                    stackIn_10_4 = stackOut_8_4;
                    stackIn_10_5 = stackOut_8_5;
                    stackIn_10_6 = stackOut_8_6;
                    break L1;
                  }
                }
              }
              stackOut_9_0 = this;
              stackOut_9_1 = (up) (Object) stackIn_9_1;
              stackOut_9_2 = stackIn_9_2;
              stackOut_9_3 = stackIn_9_3;
              stackOut_9_4 = (up) (Object) stackIn_9_4;
              stackOut_9_5 = stackIn_9_5;
              stackOut_9_6 = 0;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              stackIn_10_3 = stackOut_9_3;
              stackIn_10_4 = stackOut_9_4;
              stackIn_10_5 = stackOut_9_5;
              stackIn_10_6 = stackOut_9_6;
              break L1;
            }
            ((rt) this).field_I = mg.a(stackIn_10_1, stackIn_10_2, stackIn_10_3, ((up) (Object) stackIn_10_4).c((byte) stackIn_10_5, stackIn_10_6 != 0), var6.field_R, (byte) 120);
            ((rt) this).field_i[0].field_lb = false;
            ((rt) this).field_I.field_nb = true;
            return;
          } else {
            L3: {
              ((rt) this).field_O[var4] = new hd();
              ((rt) this).field_O[var4].a(true, 150, 0, var4 * 40, 30);
              stackOut_2_0 = ((rt) this).field_O[var4];
              stackIn_4_0 = stackOut_2_0;
              stackIn_3_0 = stackOut_2_0;
              if (-101 >= (((rt) this).field_M[var4] ^ -1)) {
                stackOut_4_0 = (hd) (Object) stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L3;
              } else {
                stackOut_3_0 = (hd) (Object) stackIn_3_0;
                stackOut_3_1 = 1;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                break L3;
              }
            }
            stackIn_5_0.field_lb = stackIn_5_1 != 0;
            ((rt) this).field_L.a((byte) -127, ((rt) this).field_O[var4]);
            var4++;
            continue L0;
          }
        }
    }

    final void a(int param0, int param1) {
        hn var4 = null;
        if (param0 < 60) {
            int discarded$0 = ((rt) this).a((byte) 89);
        }
        super.a(62, param1);
        if (-1 == (param1 ^ -1)) {
            if (((rt) this).field_H != -1) {
                if (((rt) this).field_M[((rt) this).field_H] < 100) {
                    if (cq.field_h instanceof ta) {
                        cu.a((byte) -5, ((rt) this).field_P, ((rt) this).field_H);
                    } else {
                        if (!(la.a(100))) {
                            var4 = new hn(3, new int[2]);
                            if (cq.field_h instanceof ap) {
                                if (null != um.field_e) {
                                    if (um.field_e.d((byte) 76)) {
                                        um.field_e.a(((rt) this).field_N, var4, (byte) -78, ((rt) this).field_H);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    final int a(byte param0) {
        if (param0 <= 75) {
            ((rt) this).field_N = 96;
        }
        return 280;
    }

    final static java.net.URL a(java.net.URL param0, String param1, int param2, String param3, boolean param4) {
        try {
            String var5 = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            java.net.URL stackIn_43_0 = null;
            Throwable decompiledCaughtException = null;
            java.net.URL stackOut_42_0 = null;
            var9 = Kickabout.field_G;
            if (!param4) {
              var5 = param0.getFile();
              var6 = 0;
              L0: while (true) {
                L1: {
                  if (var5.regionMatches(var6, "/l=", 0, 3)) {
                    var7_int = var5.indexOf('/', var6 - -1);
                    if (var7_int >= 0) {
                      if (param2 < 0) {
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
                  if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                    break L2;
                  } else {
                    var7_int = var5.indexOf('/', 1 + var6);
                    if (-1 < (var7_int ^ -1)) {
                      break L2;
                    } else {
                      var6 = var7_int;
                      continue L0;
                    }
                  }
                }
                L3: {
                  if (var5.regionMatches(var6, "/p=", 0, 3)) {
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
                  } else {
                    break L3;
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
                  if ((var7_int ^ -1) <= -1) {
                    if (param1 != null) {
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
                  StringBuilder discarded$9 = var7.append(var5.substring(0, var6));
                  if (0 < param2) {
                    StringBuilder discarded$10 = var7.append("/l=");
                    StringBuilder discarded$11 = var7.append(Integer.toString(param2));
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  if (param3 == null) {
                    if (param1 == null) {
                      break L7;
                    } else {
                      if (0 >= param1.length()) {
                        break L7;
                      } else {
                        StringBuilder discarded$12 = var7.append("/s=");
                        StringBuilder discarded$13 = var7.append(param1);
                        break L7;
                      }
                    }
                  } else {
                    if (param1 == null) {
                      break L7;
                    } else {
                      if (0 >= param1.length()) {
                        break L7;
                      } else {
                        StringBuilder discarded$14 = var7.append("/s=");
                        StringBuilder discarded$15 = var7.append(param1);
                        break L7;
                      }
                    }
                  }
                }
                L8: {
                  if (var6 < var5.length()) {
                    StringBuilder discarded$16 = var7.append(var5.substring(var6, var5.length()));
                    break L8;
                  } else {
                    StringBuilder discarded$17 = var7.append(47);
                    break L8;
                  }
                }
                try {
                  L9: {
                    stackOut_42_0 = new java.net.URL(param0, var7.toString());
                    stackIn_43_0 = stackOut_42_0;
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var8 = (Exception) (Object) decompiledCaughtException;
                  var8.printStackTrace();
                  return param0;
                }
                return stackIn_43_0;
              }
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void g(int param0) {
        field_G = null;
        if (param0 != 25996) {
            rt.b(-32, 113, 1);
        }
        field_F = null;
        field_K = null;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Kickabout.field_G;
          super.a((byte) -70, param1, param2);
          ((rt) this).field_L.field_J = 95 + param2;
          ((rt) this).field_L.field_s = param1 + 180;
          ((rt) this).field_L.b(0, true);
          iw.a(-65, c.field_b);
          on.b();
          ((rt) this).field_I.a(1200, 0, on.field_g >> 247256193, on.field_f + -10, (byte) -68);
          if (param0 < -11) {
            break L0;
          } else {
            ((rt) this).field_P = 5;
            break L0;
          }
        }
        ta.e(123);
        c.field_b.f(40 + param1, param2 - -80);
        pb.field_C.d(((rt) this).field_J.d(100), param1 + 90, param2 + 190, 16777215, -1);
        eo.a(param1 + 40, 200 + param2, ((rt) this).field_J.field_r, 3, true, 0);
        var4 = 0;
        L1: while (true) {
          if ((var4 ^ -1) <= -4) {
            return;
          } else {
            L2: {
              var5 = ((rt) this).field_O[var4].field_F;
              var6 = ((rt) this).field_O[var4].field_T;
              var7 = ((rt) this).field_O[var4].field_q;
              var8 = ((rt) this).field_O[var4].field_mb;
              if ((var4 ^ -1) != (((rt) this).field_H ^ -1)) {
                if (!((rt) this).field_O[var4].field_gb) {
                  if (((rt) this).field_M[var4] >= 100) {
                    q.field_d.a(ne.field_L, 123 + var5, var6 - -19, 13382451, 65793);
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  on.f(var5, var6, var7, var8, 8, 4473924);
                  q.field_d.a("+1%", 123 + var5, var6 - -19, 5592405, -1);
                  break L2;
                }
              } else {
                on.a(var5, var6, var7, var8, 8, 65793, 128);
                on.f(var5, var6, var7, var8, 8, 10066329);
                q.field_d.a("+1%", 123 + var5, 19 + var6, 16777215, 65793);
                break L2;
              }
            }
            L3: {
              var9 = 0;
              if (0 == var4) {
                var9 = ((rt) this).field_J.c(true, oi.b(-79));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-2 != (var4 ^ -1)) {
                break L4;
              } else {
                var9 = ((rt) this).field_J.a(5205, oi.b(-79));
                break L4;
              }
            }
            L5: {
              if (-3 == (var4 ^ -1)) {
                var9 = ((rt) this).field_J.b((byte) 120, oi.b(27));
                break L5;
              } else {
                break L5;
              }
            }
            eo.a(16 + var5, 9 + var6, ((rt) this).field_M[var4], var4, true, var9);
            var4++;
            continue L1;
          }
        }
    }

    final int b(int param0) {
        if (param0 != -1379118556) {
            rt.g(-26);
        }
        return 370;
    }

    final static void b(int param0, int param1, int param2) {
        int var4 = Kickabout.field_G;
        hn var3 = (hn) (Object) da.field_h.g(24009);
        while (var3 != null) {
            if (8 == var3.field_i) {
                var3.c((byte) -109);
            }
            var3 = (hn) (Object) da.field_h.c(33);
        }
        if (param1 <= 32) {
            field_F = null;
        }
        var3 = new hn(8, new int[2]);
        ii.a(var3, 76);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_K = "Achievements are awarded during games of Kickabout. Some will only be awarded in <col=ffff00>rated</col> games or Tournaments with at least 8 starting players. No achievements are awarded in <col=ffff00>Exhibition</col> games.";
    }
}
