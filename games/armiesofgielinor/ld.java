/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld extends bd {
    private int field_v;
    static int field_s;
    private int field_F;
    static String field_G;
    static int[] field_x;
    private int field_D;
    private int field_u;
    private int field_E;
    private int field_A;
    private jd field_z;
    private int field_t;
    private jd field_y;
    private int field_w;
    private int field_B;
    private int[] field_C;

    final static void a(int param0, String param1, boolean param2, byte param3, boolean param4) {
        String stackIn_4_0 = null;
        String stackIn_25_0 = null;
        String stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_39_1 = 0;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              jm.field_g = true;
              ui.field_f = param0;
              var11 = param1;
              if (!param4) {
                stackIn_4_0 = tg.field_j;
                break L1;
              } else {
                stackIn_4_0 = tl.field_h;
                break L1;
              }
            }
            L2: {
              var6 = stackIn_4_0;
              if (ui.field_f == 0) {
                var7 = iu.a(480, var11, param3 ^ 7444, ej.field_G, fs.field_c);
                var8 = 3 + var7;
                cj.field_k = new int[var8];
                nb.field_h = new String[var8];
                var9 = 0;
                L3: while (true) {
                  if (var9 >= var8) {
                    rg.field_m = new int[2];
                    var9 = 0;
                    L4: while (true) {
                      if (var9 >= var7) {
                        nb.field_h[var8 - 3] = "";
                        nb.field_h[-2 + var8] = var6;
                        cj.field_k[-2 + var8] = 0;
                        rg.field_m[0] = 1;
                        nb.field_h[var8 + -1] = pd.field_f;
                        cj.field_k[var8 + -1] = 1;
                        rg.field_m[1] = 2;
                        break L2;
                      } else {
                        nb.field_h[var9] = fs.field_c[var9];
                        var9++;
                        continue L4;
                      }
                    }
                  } else {
                    cj.field_k[var9] = -1;
                    var9++;
                    continue L3;
                  }
                }
              } else {
                if (ui.field_f == 1) {
                  var7 = iu.a(480, var11, param3 + 7412, ej.field_G, fs.field_c);
                  var8 = 2 + var7;
                  cj.field_k = new int[var8];
                  nb.field_h = new String[var8];
                  var9 = 0;
                  L5: while (true) {
                    if (var9 >= var8) {
                      rg.field_m = new int[1];
                      var9 = 0;
                      L6: while (true) {
                        if (var7 <= var9) {
                          nb.field_h[var8 - 2] = "";
                          nb.field_h[var8 - 1] = pd.field_f;
                          cj.field_k[var8 - 1] = 0;
                          rg.field_m[0] = 2;
                          break L2;
                        } else {
                          nb.field_h[var9] = fs.field_c[var9];
                          var9++;
                          continue L6;
                        }
                      }
                    } else {
                      cj.field_k[var9] = -1;
                      var9++;
                      continue L5;
                    }
                  }
                } else {
                  throw new IllegalArgumentException();
                }
              }
            }
            nn.field_z.field_k = rg.field_m.length;
            var7 = 0;
            var8 = 0;
            L7: while (true) {
              if (var8 >= nb.field_h.length) {
                bm.field_h = var7 + bt.field_g + -(var7 >> -1245385087);
                co.field_f = bt.field_g - (var7 >> 1437814529);
                ms.field_r = (ar.field_w + rd.field_b << 33785409) * nn.field_z.field_k;
                var8 = 0;
                L8: while (true) {
                  L9: {
                    L10: {
                      if (nb.field_h.length <= var8) {
                        if (param3 == 90) {
                          break L9;
                        } else {
                          break L10;
                        }
                      } else {
                        stackIn_36_0 = ms.field_r;

                        stackIn_36_1 = cj.field_k[var8] ^ -1;

                        L11: {


                          if (stackIn_36_1 <= -1) {

                            stackIn_39_1 = jg.field_k;
                            break L11;
                          } else {

                            stackIn_39_1 = cn.field_o;
                            break L11;
                          }
                        }
                        ms.field_r = stackIn_36_0 + stackIn_39_1;
                        var8++;
                        continue L8;
                      }
                    }
                    field_x = (int[]) null;
                    break L9;
                  }
                  rk.field_r = -(ms.field_r >> -533383551) + lm.field_g;
                  nn.field_z.a(0, param2, vo.a((byte) -73, ko.field_b, sm.field_d), 0);
                  break L0;
                }
              } else {
                L12: {
                  stackIn_25_0 = nb.field_h[var8];

                  if ((cj.field_k[var8] ^ -1) > -1) {
                    stackIn_26_0 = (String) ((Object) stackIn_25_0);
                    stackIn_26_1 = 0;
                    break L12;
                  } else {
                    stackIn_26_0 = (String) ((Object) stackIn_25_0);
                    stackIn_26_1 = 1;
                    break L12;
                  }
                }
                L13: {
                  var9 = lp.a(stackIn_26_0, stackIn_26_1 != 0, false);
                  if (cj.field_k[var8] == -1) {
                    break L13;
                  } else {
                    var9 = var9 + df.field_E * 2;
                    break L13;
                  }
                }
                if (var9 > var7) {
                  var7 = var9;
                  var8++;
                  continue L7;
                } else {
                  var8++;
                  continue L7;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var5 = decompiledCaughtException;
            stackIn_46_0 = (RuntimeException) (var5);

            stackIn_46_1 = new StringBuilder().append("ld.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "null";
              break L14;
            } else {
              stackIn_47_0 = (RuntimeException) ((Object) stackIn_46_0);
              stackIn_47_1 = (StringBuilder) ((Object) stackIn_46_1);
              stackIn_47_2 = "{...}";
              break L14;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_47_0), stackIn_47_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        if (param0 < 62) {
            java.applet.Applet var3 = (java.applet.Applet) null;
            ld.a(-105, (java.applet.Applet) null);
        }
        return tm.field_e[param1 & 2047];
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param0 == 16058) {
                      var4 = param1.getCodeBase();
                      var3 = ck.a(-3780, var4, param1).getFile();
                      lj.a(param1, "updatelinks", new Object[]{"home", var3 + "home.ws"}, 116);
                      lj.a(param1, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, 74);
                      lj.a(param1, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, 98);
                      lj.a(param1, "updatelinks", new Object[]{"options", var3 + "options.ws"}, 75);
                      lj.a(param1, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, 122);
                      lj.a(param1, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, param0 + -15938);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2 = decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L2;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref);

                stackIn_8_1 = new StringBuilder().append("ld.B(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L3;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L3;
                }
              }
              throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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

    final void a(int param0, ha param1) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_E = this.field_u;
            var8 = new int[this.field_D];
            var7 = var8;
            var3 = var7;
            this.field_F = this.field_v;
            var4 = 0;
            L1: while (true) {
              if (var4 >= this.field_D) {
                L2: {
                  L3: {
                    if (!this.field_y.field_W) {
                      break L3;
                    } else {
                      if (this.field_y.field_N != 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  param1.field_l.a((byte) -119, (tc) (new kr(this.field_u, this.field_v, var8)));
                  break L2;
                }
                L4: {
                  if (param0 == 64) {
                    break L4;
                  } else {
                    ld.a((byte) -102, 105);
                    break L4;
                  }
                }
                L5: {
                  L6: {
                    L7: {
                      if (-1 != (this.field_w ^ -1)) {
                        break L7;
                      } else {
                        if (0 == this.field_t) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    L8: {
                      if (!this.field_y.field_W) {
                        break L8;
                      } else {
                        if (7 != this.field_y.field_N) {
                          break L8;
                        } else {
                          break L5;
                        }
                      }
                    }
                    param1.field_l.a((byte) -119, (tc) (new ns(this.field_E, this.field_F, this.field_w, this.field_t, this.field_z, this.field_A, this.field_B)));
                    break L6;
                  }
                  break L5;
                }
                break L0;
              } else {
                L9: {
                  var5 = this.field_C[var4];
                  if ((var5 ^ -1) == -2) {
                    this.field_F = this.field_F - 1;
                    break L9;
                  } else {
                    if (var5 == 2) {
                      this.field_F = this.field_F + 1;
                      break L9;
                    } else {
                      if (var5 != 0) {
                        if ((var5 ^ -1) == -4) {
                          this.field_E = this.field_E - 1;
                          break L9;
                        } else {
                          break L9;
                        }
                      } else {
                        this.field_E = this.field_E + 1;
                        break L9;
                      }
                    }
                  }
                }
                var3[var4] = this.field_C[var4];
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3_ref = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var3_ref);

            stackIn_32_1 = new StringBuilder().append("ld.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L10;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
    }

    final static void a(int param0, wk[] param1, tu param2, String param3, int param4, int param5, int param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          L0: {
            L1: {
              if (param6 < -33) {
                break L1;
              } else {
                field_x = (int[]) null;
                break L1;
              }
            }
            L2: {
              var7_int = param2.a(param3) - -(param1[0].field_y << -1192671775);
              var8 = -(var7_int >> 1652655617) + param5;
              var9 = (var7_int >> 1427571553) + param5;
              if (0 > var8) {
                param5 = param5 - var8;
                break L2;
              } else {
                if (var9 > 640) {
                  param5 = param5 - (var9 + -640);
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            jp.a(-(var7_int >> -820423231) + param5, param0, var7_int, param1, param4, -8991);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var7);

            stackIn_11_1 = new StringBuilder().append("ld.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param3 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_12_0), stackIn_18_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void e(int param0) {
        if (param0 >= -40) {
            return;
        }
        field_G = null;
        field_x = null;
    }

    ld(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, jd param7, jd param8) {
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        try {
          L0: {
            L1: {
              this.field_v = param1;
              this.field_w = param4;
              this.field_y = param7;
              this.field_D = param3;
              this.field_u = param0;
              this.field_t = param5;
              this.field_m = param6;
              this.field_C = param2;
              if (param8 == null) {
                this.field_w = 0;
                this.field_z = null;
                this.field_t = 0;
                break L1;
              } else {
                L2: {
                  this.field_z = param8.b(false);
                  var10_int = bw.field_m[this.field_y.field_N][9];
                  stackIn_4_0 = this;

                  stackIn_4_1 = this.field_y.field_Y * vu.field_N[var10_int] / this.field_y.field_t;

                  if (this.field_y.field_Y * vu.field_N[var10_int] % this.field_y.field_t != 0) {
                    stackIn_5_0 = this;
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = 1;
                    break L2;
                  } else {
                    stackIn_5_0 = this;
                    stackIn_5_1 = stackIn_4_1;
                    stackIn_5_2 = 0;
                    break L2;
                  }
                }
                L3: {
                  ((ld) (this)).field_A = stackIn_5_1 - -stackIn_5_2;
                  var11 = bw.field_m[this.field_z.field_N][9];
                  stackIn_7_0 = this;

                  if (0 != this.field_z.field_Y * vu.field_N[var11] % this.field_z.field_t) {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L3;
                  } else {
                    stackIn_8_0 = this;
                    stackIn_8_1 = 0;
                    break L3;
                  }
                }
                ((ld) (this)).field_B = stackIn_8_1 + this.field_z.field_Y * vu.field_N[var11] / this.field_z.field_t;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var10);

            stackIn_13_1 = new StringBuilder().append("ld.<init>(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
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
          L6: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');

            if (param8 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L6;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), stackIn_20_2 + ')');
        }
    }

    static {
        field_G = "No target selected.";
        field_s = -1;
    }
}
