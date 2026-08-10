/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    private int field_n;
    private int field_d;
    private int field_m;
    static int field_e;
    private int field_k;
    private oi field_g;
    private int field_j;
    private boolean field_r;
    private int field_p;
    private float field_t;
    private int field_b;
    private int field_s;
    private int field_h;
    private int field_f;
    private int field_i;
    private int field_o;
    private int field_l;
    static String field_q;
    private int field_a;
    private int field_c;

    final void d(int param0) {
        int fieldTemp$0 = 0;
        if (ff.field_b == null) {
          L0: {
            if (jd.field_c <= 0) {
              this.field_r = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!this.field_r) {
            L1: {
              if (u.field_sb < this.field_f) {
                ef.field_e = (this.field_f + -u.field_sb) / 2;
                break L1;
              } else {
                if ((this.field_f ^ -1) < -1) {
                  ef.field_e = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (u.field_sb != this.field_s) {
                break L2;
              } else {
                if (bk.field_d == this.field_c) {
                  return;
                } else {
                  break L2;
                }
              }
            }
            this.field_g.a(-26278, this.field_s, this.field_c);
            return;
          } else {
            fieldTemp$0 = this.field_n - 1;
            this.field_n = this.field_n - 1;
            if ((fieldTemp$0 ^ -1) < param0) {
              return;
            } else {
              this.field_n = this.field_j;
              if (ia.field_C >= this.field_p) {
                this.c(115);
                return;
              } else {
                this.field_r = false;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void b(int param0) {
        if (param0 >= -46) {
            field_q = (String) null;
        }
        field_q = null;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_16_0 = 0;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            var7 = Lexicominos.field_L ? 1 : 0;
            try {
              L0: {
                if (!pf.field_m) {
                  try {
                    L1: {
                      var2 = "tuhstatbut";
                      var3 = (String) (oa.a(true, param1, "getcookies"));
                      var4 = dc.a(var3, ';', (byte) -125);
                      var5 = param0;
                      L2: while (true) {
                        if (var5 >= var4.length) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L3: {
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                              break L3;
                            } else {
                              if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                break L3;
                              } else {
                                stackIn_9_0 = 1;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              }
                            }
                          }
                          var5++;
                          continue L2;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2_ref = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    L5: {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackIn_16_0 = 0;
                        break L5;
                      } else {
                        stackIn_16_0 = 1;
                        break L5;
                      }
                    }
                    decompiledRegionSelector1 = 1;
                    break L0;
                  } else {
                    decompiledRegionSelector1 = 2;
                    break L0;
                  }
                } else {
                  stackIn_3_0 = 1;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_19_0 = (RuntimeException) (var2_ref2);

                stackIn_19_1 = new StringBuilder().append("gf.D(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "null";
                  break L6;
                } else {
                  stackIn_20_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackIn_20_2 = "{...}";
                  break L6;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_16_0 != 0;
              } else {
                return stackIn_9_0 != 0;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ra b(byte param0) {
        if (param0 != -74) {
            this.c(-88);
        }
        this.field_b = bk.field_d;
        this.field_k = u.field_sb;
        this.field_g.a(-26278, this.field_i, this.field_a);
        rl.field_O = false;
        ra var2 = sg.a(0, this.field_i, this.field_a, 0, 0, jh.field_a);
        if (!(var2 != null)) {
            this.a((byte) -110);
        }
        return var2;
    }

    private final void c(int param0) {
        int var2;
        int var3;
        int var5;
        int var4;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          if (param0 >= 103) {
            break L0;
          } else {
            this.field_m = -89;
            break L0;
          }
        }
        var2 = this.field_f;
        var3 = this.field_l;
        if (this.a(0)) {
          L1: {
            if (var3 > this.field_m) {
              var3 = this.field_m;
              break L1;
            } else {
              if (this.field_d > var3) {
                var3 = this.field_d;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (this.field_h < var2) {
              var2 = this.field_h;
              break L2;
            } else {
              if (var2 < this.field_o) {
                var2 = this.field_o;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (0.0f >= this.field_t) {
              break L3;
            } else {
              var4 = (int)(0.5f + (float)var3 * this.field_t);
              if (var4 > var2) {
                var3 = (int)((float)var2 / this.field_t);
                break L3;
              } else {
                if (var4 < var2) {
                  var2 = var4;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          }
          L4: {
            L5: {
              if (var2 != u.field_sb) {
                break L5;
              } else {
                if (var3 != bk.field_d) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            this.field_g.a(-26278, var2, var3);
            break L4;
          }
          L6: {
            if (-1 <= (this.field_f ^ -1)) {
              break L6;
            } else {
              ef.field_e = (this.field_f - u.field_sb) / 2;
              break L6;
            }
          }
          return;
        } else {
          this.field_r = false;
          return;
        }
    }

    final boolean a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (ia.field_C < this.field_p) {
                break L1;
              } else {
                if (jd.field_c <= 0) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final void a(byte param0) {
        this.field_g.a(param0 ^ 26312, this.field_k, this.field_b);
        if (param0 != -110) {
            this.a(107);
        }
    }

    final static void a(int param0, int param1, db[] param2, int param3, int param4, byte param5) {
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        var22 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (-1 <= (param3 ^ -1)) {
                  break L1;
                } else {
                  if ((param1 ^ -1) < -1) {
                    L2: {
                      if (param2[3] == null) {
                        stackIn_10_0 = 0;
                        break L2;
                      } else {
                        stackIn_10_0 = param2[3].field_r;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null == param2[5]) {
                        stackIn_13_0 = 0;
                        break L3;
                      } else {
                        stackIn_13_0 = param2[5].field_r;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (null != param2[1]) {
                        stackIn_16_0 = param2[1].field_x;
                        break L4;
                      } else {
                        stackIn_16_0 = 0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (param2[7] == null) {
                        stackIn_19_0 = 0;
                        break L5;
                      } else {
                        stackIn_19_0 = param2[7].field_x;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_19_0;
                      var10 = param0 - -param3;
                      var11 = param1 + param4;
                      var12 = var6_int + param0;
                      var13 = -var7 + var10;
                      var14 = var8 + param4;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (var16 > var17) {
                        var17 = param0 - -(var6_int * param3 / (var7 + var6_int));
                        var16 = param0 - -(var6_int * param3 / (var7 + var6_int));
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      lf.b(ji.field_a);
                      if (var18 <= var19) {
                        break L7;
                      } else {
                        var19 = param4 - -(param1 * var8 / (var9 + var8));
                        var18 = param4 - -(param1 * var8 / (var9 + var8));
                        break L7;
                      }
                    }
                    L8: {
                      if (null != param2[0]) {
                        lf.f(param0, param4, var16, var18);
                        param2[0].d(param0, param4);
                        lf.a(ji.field_a);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (param5 > 77) {
                      L9: {
                        if (param2[2] == null) {
                          break L9;
                        } else {
                          lf.f(var17, param4, var10, var18);
                          param2[2].d(var13, param4);
                          lf.a(ji.field_a);
                          break L9;
                        }
                      }
                      L10: {
                        if (param2[6] == null) {
                          break L10;
                        } else {
                          lf.f(param0, var19, var16, var11);
                          param2[6].d(param0, var15);
                          lf.a(ji.field_a);
                          break L10;
                        }
                      }
                      L11: {
                        if (null == param2[8]) {
                          break L11;
                        } else {
                          lf.f(var17, var19, var10, var11);
                          param2[8].d(var13, var15);
                          lf.a(ji.field_a);
                          break L11;
                        }
                      }
                      L12: {
                        if (null == param2[1]) {
                          break L12;
                        } else {
                          if (0 == param2[1].field_r) {
                            break L12;
                          } else {
                            lf.f(var16, param4, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              if (var20 >= var13) {
                                lf.a(ji.field_a);
                                break L12;
                              } else {
                                param2[1].d(var20, param4);
                                var20 = var20 + param2[1].field_r;
                                continue L13;
                              }
                            }
                          }
                        }
                      }
                      L14: {
                        if (null == param2[7]) {
                          break L14;
                        } else {
                          if (0 == param2[7].field_r) {
                            break L14;
                          } else {
                            lf.f(var16, var19, var17, var11);
                            var20 = var12;
                            L15: while (true) {
                              if (var13 <= var20) {
                                lf.a(ji.field_a);
                                break L14;
                              } else {
                                param2[7].d(var20, var15);
                                var20 = var20 + param2[7].field_r;
                                continue L15;
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        if (null == param2[3]) {
                          break L16;
                        } else {
                          if (param2[3].field_x != 0) {
                            lf.f(param0, var18, var16, var19);
                            var20 = var14;
                            L17: while (true) {
                              if (var20 >= var15) {
                                lf.a(ji.field_a);
                                break L16;
                              } else {
                                param2[3].d(param0, var20);
                                var20 = var20 + param2[3].field_x;
                                continue L17;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      L18: {
                        if (param2[5] == null) {
                          break L18;
                        } else {
                          if (param2[5].field_x == 0) {
                            break L18;
                          } else {
                            lf.f(var17, var18, var10, var19);
                            var20 = var14;
                            L19: while (true) {
                              if (var20 >= var15) {
                                lf.a(ji.field_a);
                                break L18;
                              } else {
                                param2[5].d(var13, var20);
                                var20 = var20 + param2[5].field_x;
                                continue L19;
                              }
                            }
                          }
                        }
                      }
                      L20: {
                        if (param2[4] == null) {
                          break L20;
                        } else {
                          if (0 == param2[4].field_r) {
                            break L20;
                          } else {
                            if (param2[4].field_x == 0) {
                              break L20;
                            } else {
                              lf.f(var16, var18, var17, var19);
                              var20 = var14;
                              L21: while (true) {
                                if (var20 >= var15) {
                                  lf.a(ji.field_a);
                                  break L20;
                                } else {
                                  var21 = var12;
                                  L22: while (true) {
                                    if (var21 >= var13) {
                                      var20 = var20 + param2[4].field_x;
                                      continue L21;
                                    } else {
                                      param2[4].d(var21, var20);
                                      var21 = var21 + param2[4].field_r;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackIn_73_0 = (RuntimeException) (var6);

            stackIn_73_1 = new StringBuilder().append("gf.G(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "null";
              break L23;
            } else {
              stackIn_74_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackIn_74_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackIn_74_2 = "{...}";
              break L23;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_74_0), stackIn_74_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(byte param0, byte[] param1) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wf var16 = null;
        wf var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        var15 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var16 = new wf(param1);
            var17 = var16;
            var17.field_h = param1.length - 2;
            th.field_t = var17.b(-1698573656);
            mg.field_x = new int[th.field_t];
            hl.field_o = new byte[th.field_t][];
            me.field_w = new boolean[th.field_t];
            rg.field_c = new int[th.field_t];
            pb.field_h = new int[th.field_t];
            be.field_f = new byte[th.field_t][];
            bd.field_m = new int[th.field_t];
            var17.field_h = -(8 * th.field_t) + -7 + param1.length;
            uc.field_fb = var17.b(-1698573656);
            eh.field_b = var17.b(-1698573656);
            var3 = (var17.d(true) & 255) + 1;
            var4 = 0;
            L1: while (true) {
              if (th.field_t <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (th.field_t <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (th.field_t <= var4) {
                        L4: {
                          if (param0 == 106) {
                            break L4;
                          } else {
                            field_q = (String) null;
                            break L4;
                          }
                        }
                        var4 = 0;
                        L5: while (true) {
                          if (var4 >= th.field_t) {
                            var17.field_h = -(th.field_t * 8) + -7 + (param1.length - 3 * (var3 - 1));
                            ci.field_b = new int[var3];
                            var4 = 1;
                            L6: while (true) {
                              if (var4 >= var3) {
                                var17.field_h = 0;
                                var4 = 0;
                                L7: while (true) {
                                  if (var4 >= th.field_t) {
                                    break L0;
                                  } else {
                                    L8: {
                                      var5 = pb.field_h[var4];
                                      var6 = bd.field_m[var4];
                                      var7 = var6 * var5;
                                      var20 = new byte[var7];
                                      var18 = var20;
                                      var8 = var18;
                                      be.field_f[var4] = var20;
                                      var21 = new byte[var7];
                                      var19 = var21;
                                      var9 = var19;
                                      hl.field_o[var4] = var21;
                                      var10 = 0;
                                      var11 = var17.d(true);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L9: while (true) {
                                          if (var12 >= var5) {
                                            if (-1 == (2 & var11 ^ -1)) {
                                              break L8;
                                            } else {
                                              var12 = 0;
                                              L10: while (true) {
                                                if (var12 >= var5) {
                                                  break L8;
                                                } else {
                                                  var13 = 0;
                                                  L11: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L10;
                                                    } else {
                                                      L12: {
                                                        dupTemp$0 = var17.e(true);
                                                        var9[var5 * var13 + var12] = dupTemp$0;
                                                        var14 = dupTemp$0;
                                                        stackIn_47_0 = var10;

                                                        if (-1 == var14) {
                                                          stackIn_48_0 = stackIn_47_0;
                                                          stackIn_48_1 = 0;
                                                          break L12;
                                                        } else {
                                                          stackIn_48_0 = stackIn_47_0;
                                                          stackIn_48_1 = 1;
                                                          break L12;
                                                        }
                                                      }
                                                      var10 = stackIn_48_0 | stackIn_48_1;
                                                      var13++;
                                                      continue L11;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L13: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L9;
                                              } else {
                                                var8[var12 + var13 * var5] = var17.e(true);
                                                var13++;
                                                continue L13;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L14: while (true) {
                                          if (var12 >= var7) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L15: while (true) {
                                                if (var12 >= var7) {
                                                  break L8;
                                                } else {
                                                  L16: {
                                                    dupTemp$1 = var17.e(true);
                                                    var9[var12] = dupTemp$1;
                                                    var13 = dupTemp$1;
                                                    stackIn_32_0 = var10;

                                                    if ((var13 ^ -1) == 0) {
                                                      stackIn_33_0 = stackIn_32_0;
                                                      stackIn_33_1 = 0;
                                                      break L16;
                                                    } else {
                                                      stackIn_33_0 = stackIn_32_0;
                                                      stackIn_33_1 = 1;
                                                      break L16;
                                                    }
                                                  }
                                                  var10 = stackIn_33_0 | stackIn_33_1;
                                                  var12++;
                                                  continue L15;
                                                }
                                              }
                                            } else {
                                              break L8;
                                            }
                                          } else {
                                            var8[var12] = var17.e(true);
                                            var12++;
                                            continue L14;
                                          }
                                        }
                                      }
                                    }
                                    me.field_w[var4] = var10 != 0;
                                    var4++;
                                    continue L7;
                                  }
                                }
                              } else {
                                L17: {
                                  ci.field_b[var4] = var17.a(84);
                                  if (ci.field_b[var4] != 0) {
                                    break L17;
                                  } else {
                                    ci.field_b[var4] = 1;
                                    break L17;
                                  }
                                }
                                var4++;
                                continue L6;
                              }
                            }
                          } else {
                            bd.field_m[var4] = var17.b(-1698573656);
                            var4++;
                            continue L5;
                          }
                        }
                      } else {
                        pb.field_h[var4] = var17.b(param0 + -1698573762);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    rg.field_c[var4] = var17.b(-1698573656);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                mg.field_x[var4] = var16.b(-1698573656);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var2 = decompiledCaughtException;
            stackIn_54_0 = (RuntimeException) (var2);

            stackIn_54_1 = new StringBuilder().append("gf.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "null";
              break L18;
            } else {
              stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
              stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
              stackIn_55_2 = "{...}";
              break L18;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_55_0), stackIn_55_2 + ')');
        }
    }

    final static db a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Lexicominos.field_L ? 1 : 0;
        if (param0 != -76) {
            java.applet.Applet var6 = (java.applet.Applet) null;
            gf.a(107, (java.net.URL) null, (java.applet.Applet) null);
        }
        db var7 = new db(param1, param1);
        db var3 = var7;
        for (var4 = 0; var4 < var3.field_y.length; var4++) {
            var7.field_y[var4] = param2;
        }
        return var3;
    }

    final void a(int param0, byte param1, int param2) {
        this.field_l = param0;
        if (param1 != -65) {
            return;
        }
        this.field_f = param2;
    }

    private gf() throws Throwable {
        throw new Error();
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param0 == 3) {
                break L1;
              } else {
                field_e = 14;
                break L1;
              }
            }
            L2: {
              if (mb.field_a == null) {
                break L2;
              } else {
                if (mb.field_a.equals(param2.getParameter("settings"))) {
                  break L2;
                } else {
                  var3 = mb.field_a;
                  var4 = var3;
                  var4 = var3;
                  break L2;
                }
              }
            }
            L3: {
              var4 = null;
              if (null == ta.field_d) {
                break L3;
              } else {
                if (ta.field_d.equals(param2.getParameter("session"))) {
                  break L3;
                } else {
                  var4 = ta.field_d;
                  break L3;
                }
              }
            }
            stackIn_9_0 = rf.a(-1, param1, (String) (var4), 0, (String) (var3));
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("gf.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param2 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L5;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    static {
        field_q = "Unpacking graphics";
    }
}
