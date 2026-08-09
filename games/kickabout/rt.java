/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int var3;
        int var4;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        hd stackIn_11_0 = null;
        hd stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        var4 = Kickabout.field_G;
        this.field_I.g((byte) 125);
        this.field_L.b(0, param1);
        var3 = 0;
        L0: while (true) {
          if (3 <= var3) {
            L1: {
              stackIn_11_0 = this.field_i[0];

              if (this.field_H == -1) {
                stackIn_12_0 = (hd) ((Object) stackIn_11_0);
                stackIn_12_1 = 0;
                break L1;
              } else {
                stackIn_12_0 = (hd) ((Object) stackIn_11_0);
                stackIn_12_1 = 1;
                break L1;
              }
            }
            L2: {
              stackIn_12_0.field_lb = stackIn_12_1 != 0;
              var3 = param0;
              if (-1 == (this.field_H ^ -1)) {
                var3 = 16;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if ((this.field_H ^ -1) != -2) {
                break L3;
              } else {
                var3 = 5;
                break L3;
              }
            }
            L4: {
              if (-3 == (this.field_H ^ -1)) {
                var3 = 9;
                break L4;
              } else {
                break L4;
              }
            }
            this.field_I.b((byte) -128, var3);
            this.field_I.field_R = 128;
            return;
          } else {
            if (1 == this.field_O[var3].field_sb) {
              L5: {
                stackIn_7_0 = this;

                if (this.field_H != var3) {
                  stackIn_8_0 = this;
                  stackIn_8_1 = var3;
                  break L5;
                } else {
                  stackIn_8_0 = this;
                  stackIn_8_1 = -1;
                  break L5;
                }
              }
              ((rt) (this)).field_H = stackIn_8_1;
              var3++;
              continue L0;
            } else {
              var3++;
              continue L0;
            }
          }
        }
    }

    rt(int param0, int param1, up param2) {
        super(20);
        hd stackIn_5_0 = null;
        hd stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_10_0;
        up stackIn_10_1;
        int stackIn_10_2;
        int stackIn_10_3;
        up stackIn_10_4;
        int stackIn_10_5;
        Object stackIn_11_0;
        up stackIn_11_1;
        int stackIn_11_2;
        int stackIn_11_3;
        up stackIn_11_4;
        int stackIn_11_5;
        int stackIn_11_6;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        gr var6 = null;
        this.field_H = -1;
        this.field_N = -1;
        try {
          L0: {
            this.field_J = param2;
            this.field_P = param0;
            this.field_N = param1;
            this.field_L = new hd();
            this.field_L.field_q = 150;
            this.field_O = new hd[3];
            this.field_M = new int[]{this.field_J.field_n, this.field_J.field_g, this.field_J.field_o};
            this.field_L.field_mb = 110;
            var4_int = 0;
            L1: while (true) {
              if (3 <= var4_int) {
                L2: {
                  L3: {
                    var6 = tu.field_E;
                    stackIn_10_0 = this;

                    stackIn_10_1 = this.field_J;

                    stackIn_10_2 = var6.field_w;

                    stackIn_10_3 = var6.field_k;

                    stackIn_10_4 = this.field_J;

                    stackIn_10_5 = -107;

                    if (jd.f(-1)) {
                      break L3;
                    } else {
                      stackIn_10_0 = this;

                      stackIn_10_1 = (up) ((Object) stackIn_10_1);

                      stackIn_10_4 = (up) ((Object) stackIn_10_4);

                      if (!wn.a((byte) -3)) {
                        break L3;
                      } else {
                        stackIn_11_0 = this;
                        stackIn_11_1 = (up) ((Object) stackIn_10_1);
                        stackIn_11_2 = stackIn_10_2;
                        stackIn_11_3 = stackIn_10_3;
                        stackIn_11_4 = (up) ((Object) stackIn_10_4);
                        stackIn_11_5 = stackIn_10_5;
                        stackIn_11_6 = 1;
                        break L2;
                      }
                    }
                  }
                  stackIn_11_0 = this;
                  stackIn_11_1 = (up) ((Object) stackIn_10_1);
                  stackIn_11_2 = stackIn_10_2;
                  stackIn_11_3 = stackIn_10_3;
                  stackIn_11_4 = (up) ((Object) stackIn_10_4);
                  stackIn_11_5 = stackIn_10_5;
                  stackIn_11_6 = 0;
                  break L2;
                }
                ((rt) (this)).field_I = mg.a(stackIn_11_1, stackIn_11_2, stackIn_11_3, ((up) (Object) stackIn_11_4).c((byte) stackIn_11_5, stackIn_11_6 != 0), var6.field_R, (byte) 120);
                this.field_i[0].field_lb = false;
                this.field_I.field_nb = true;
                break L0;
              } else {
                L4: {
                  this.field_O[var4_int] = new hd();
                  this.field_O[var4_int].a(true, 150, 0, var4_int * 40, 30);
                  stackIn_5_0 = this.field_O[var4_int];

                  if (-101 >= (this.field_M[var4_int] ^ -1)) {
                    stackIn_6_0 = (hd) ((Object) stackIn_5_0);
                    stackIn_6_1 = 0;
                    break L4;
                  } else {
                    stackIn_6_0 = (hd) ((Object) stackIn_5_0);
                    stackIn_6_1 = 1;
                    break L4;
                  }
                }
                stackIn_6_0.field_lb = stackIn_6_1 != 0;
                this.field_L.a((byte) -127, this.field_O[var4_int]);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("rt.<init>(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
    }

    final void a(int param0, int param1) {
        hn var4 = null;
        if (param0 < 60) {
            this.a((byte) 89);
        }
        super.a(62, param1);
        if (-1 == (param1 ^ -1) && this.field_H != -1 && this.field_M[this.field_H] < 100) {
            if (cq.field_h instanceof ta) {
                cu.a((byte) -5, this.field_P, this.field_H);
            } else {
                if (!(la.a(100))) {
                    var4 = new hn(3, new int[]{this.field_P, this.field_H});
                    if (cq.field_h instanceof ap && null != um.field_e && um.field_e.d((byte) 76)) {
                        um.field_e.a(this.field_N, var4, (byte) -78, this.field_H);
                    }
                }
            }
        }
    }

    final int a(byte param0) {
        if (param0 <= 75) {
            this.field_N = 96;
        }
        return 280;
    }

    final static java.net.URL a(java.net.URL param0, String param1, int param2, String param3, boolean param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_3_0 = null;
            java.net.URL stackIn_44_0 = null;
            java.net.URL stackIn_46_0 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            String stackIn_50_2 = null;
            StringBuilder stackIn_52_1 = null;
            StringBuilder stackIn_53_1 = null;
            String stackIn_53_2 = null;
            StringBuilder stackIn_55_1 = null;
            StringBuilder stackIn_56_1 = null;
            String stackIn_56_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            var9 = Kickabout.field_G;
            try {
              L0: {
                if (!param4) {
                  var5 = param0.getFile();
                  var6 = 0;
                  L1: while (true) {
                    L2: {
                      if (var5.regionMatches(var6, "/l=", 0, 3)) {
                        var7_int = var5.indexOf('/', var6 - -1);
                        if (var7_int >= 0) {
                          if (param2 < 0) {
                            var6 = var7_int;
                            continue L1;
                          } else {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          }
                        } else {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (!var5.regionMatches(var6, "/a=", 0, 3)) {
                        break L3;
                      } else {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if (-1 < (var7_int ^ -1)) {
                          break L3;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      }
                    }
                    L4: {
                      if (var5.regionMatches(var6, "/p=", 0, 3)) {
                        var7_int = var5.indexOf('/', 1 + var6);
                        if ((var7_int ^ -1) <= -1) {
                          if (param3 != null) {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            continue L1;
                          } else {
                            var6 = var7_int;
                            continue L1;
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        if (var5.regionMatches(var6, "/s=", 0, 3)) {
                          break L6;
                        } else {
                          if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var7_int = var5.indexOf('/', 1 + var6);
                      if ((var7_int ^ -1) <= -1) {
                        if (param1 != null) {
                          var5 = var5.substring(0, var6) + var5.substring(var7_int);
                          continue L1;
                        } else {
                          var6 = var7_int;
                          continue L1;
                        }
                      } else {
                        break L5;
                      }
                    }
                    L7: {
                      var7 = new StringBuilder(var6);
                      discarded$0 = var7.append(var5.substring(0, var6));
                      if (0 < param2) {
                        discarded$1 = var7.append("/l=");
                        discarded$2 = var7.append(Integer.toString(param2));
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (param3 == null) {
                        break L8;
                      } else {
                        if ((param3.length() ^ -1) < -1) {
                          discarded$3 = var7.append("/p=");
                          discarded$4 = var7.append(param3);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                    }
                    L9: {
                      if (param1 == null) {
                        break L9;
                      } else {
                        if (0 >= param1.length()) {
                          break L9;
                        } else {
                          discarded$5 = var7.append("/s=");
                          discarded$6 = var7.append(param1);
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (var6 < var5.length()) {
                        discarded$7 = var7.append(var5.substring(var6, var5.length()));
                        break L10;
                      } else {
                        discarded$8 = var7.append('/');
                        break L10;
                      }
                    }
                    try {
                      L11: {
                        stackIn_44_0 = new java.net.URL(param0, var7.toString());
                        break L11;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var8 = (Exception) (Object) decompiledCaughtException;
                      var8.printStackTrace();
                      stackIn_46_0 = (java.net.URL) (param0);
                      return stackIn_46_0;
                    }
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  stackIn_3_0 = (java.net.URL) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L12: {
                var5_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_49_0 = (RuntimeException) (var5_ref);

                stackIn_49_1 = new StringBuilder().append("rt.A(");

                if (param0 == null) {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "null";
                  break L12;
                } else {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_49_0);
                  stackIn_50_1 = (StringBuilder) ((Object) stackIn_49_1);
                  stackIn_50_2 = "{...}";
                  break L12;
                }
              }
              L13: {


                stackIn_52_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');

                if (param1 == null) {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "null";
                  break L13;
                } else {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_53_1 = (StringBuilder) ((Object) stackIn_52_1);
                  stackIn_53_2 = "{...}";
                  break L13;
                }
              }
              L14: {


                stackIn_55_1 = ((StringBuilder) (Object) stackIn_53_1).append(stackIn_53_2).append(',').append(param2).append(',');

                if (param3 == null) {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackIn_56_2 = "null";
                  break L14;
                } else {
                  stackIn_50_0 = (RuntimeException) ((Object) stackIn_50_0);
                  stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
                  stackIn_56_2 = "{...}";
                  break L14;
                }
              }
              throw nb.a((Throwable) ((Object) stackIn_50_0), stackIn_56_2 + ',' + param4 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return stackIn_3_0;
            } else {
              return stackIn_44_0;
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
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        L0: {
          var10 = Kickabout.field_G;
          super.a((byte) -70, param1, param2);
          this.field_L.field_J = 95 + param2;
          this.field_L.field_s = param1 + 180;
          this.field_L.b(0, true);
          iw.a(-65, c.field_b);
          on.b();
          this.field_I.a(1200, 0, on.field_g >> 247256193, on.field_f + -10, (byte) -68);
          if (param0 < -11) {
            break L0;
          } else {
            this.field_P = 5;
            break L0;
          }
        }
        ta.e(123);
        c.field_b.f(40 + param1, param2 - -80);
        pb.field_C.d(this.field_J.d(100), param1 + 90, param2 + 190, 16777215, -1);
        eo.a(param1 + 40, 200 + param2, this.field_J.field_r, 3, true, 0);
        var4 = 0;
        L1: while (true) {
          if ((var4 ^ -1) <= -4) {
            return;
          } else {
            L2: {
              var5 = this.field_O[var4].field_F;
              var6 = this.field_O[var4].field_T;
              var7 = this.field_O[var4].field_q;
              var8 = this.field_O[var4].field_mb;
              if (var4 != this.field_H) {
                if (!this.field_O[var4].field_gb) {
                  if (this.field_M[var4] >= 100) {
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
                var9 = this.field_J.c(true, oi.b(-79));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-2 != (var4 ^ -1)) {
                break L4;
              } else {
                var9 = this.field_J.a(5205, oi.b(-79));
                break L4;
              }
            }
            L5: {
              if (-3 == (var4 ^ -1)) {
                var9 = this.field_J.b((byte) 120, oi.b(27));
                break L5;
              } else {
                break L5;
              }
            }
            eo.a(16 + var5, 9 + var6, this.field_M[var4], var4, true, var9);
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
        hn var3 = null;
        int var4 = Kickabout.field_G;
        try {
            var3 = (hn) ((Object) da.field_h.g(24009));
            while (var3 != null) {
                if (8 == var3.field_i) {
                    var3.c((byte) -109);
                }
                var3 = (hn) ((Object) da.field_h.c(33));
            }
            if (param1 <= 32) {
                field_F = (vg) null;
            }
            var3 = new hn(8, new int[]{param0, param2});
            ii.a(var3, 76);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "rt.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_G = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
        field_K = "Achievements are awarded during games of Kickabout. Some will only be awarded in <col=ffff00>rated</col> games or Tournaments with at least 8 starting players. No achievements are awarded in <col=ffff00>Exhibition</col> games.";
    }
}
