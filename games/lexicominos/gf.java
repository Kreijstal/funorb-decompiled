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
        int fieldTemp$2 = 0;
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
              L2: {
                if (u.field_sb < this.field_f) {
                  break L2;
                } else {
                  if ((this.field_f ^ -1) < -1) {
                    ef.field_e = 0;
                    if (!Lexicominos.field_L) {
                      break L1;
                    } else {
                      break L2;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              ef.field_e = (this.field_f + -u.field_sb) / 2;
              break L1;
            }
            if (u.field_sb == this.field_s) {
              if (bk.field_d != this.field_c) {
                this.field_g.a(-26278, this.field_s, this.field_c);
                return;
              } else {
                return;
              }
            } else {
              this.field_g.a(-26278, this.field_s, this.field_c);
              return;
            }
          } else {
            fieldTemp$2 = this.field_n - 1;
            this.field_n = this.field_n - 1;
            if ((fieldTemp$2 ^ -1) < param0) {
              return;
            } else {
              this.field_n = this.field_j;
              if (ia.field_C < this.field_p) {
                this.field_r = false;
                return;
              } else {
                this.c(115);
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
            RuntimeException var2_ref = null;
            Throwable var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_7_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_6_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_2_0 = 0;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
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
                        L3: {
                          if (var5 >= var4.length) {
                            break L3;
                          } else {
                            var6 = var4[var5].indexOf('=');
                            stackOut_6_0 = var6 ^ -1;
                            stackIn_17_0 = stackOut_6_0;
                            stackIn_7_0 = stackOut_6_0;
                            if (var7 != 0) {
                              decompiledRegionSelector0 = 1;
                              break L1;
                            } else {
                              L4: {
                                if (stackIn_7_0 > -1) {
                                  break L4;
                                } else {
                                  if (!var4[var5].substring(0, var6).trim().equals(var2)) {
                                    break L4;
                                  } else {
                                    stackOut_9_0 = 1;
                                    stackIn_10_0 = stackOut_9_0;
                                    decompiledRegionSelector0 = 2;
                                    break L1;
                                  }
                                }
                              }
                              var5++;
                              if (var7 == 0) {
                                continue L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var2_ref2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L5;
                    }
                  }
                  L6: {
                    if (decompiledRegionSelector0 == 0) {
                      if (param1.getParameter("tuhstatbut") == null) {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        break L6;
                      } else {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        break L6;
                      }
                    } else {
                      if (decompiledRegionSelector0 == 1) {
                        break L6;
                      } else {
                        decompiledRegionSelector1 = 2;
                        break L0;
                      }
                    }
                  }
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  stackOut_2_0 = 1;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L7: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) (var2_ref);
                stackOut_18_1 = new StringBuilder().append("gf.D(").append(param0).append(',');
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param1 == null) {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L7;
                } else {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "{...}";
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L7;
                }
              }
              throw ld.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0 != 0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_17_0 != 0;
              } else {
                return stackIn_10_0 != 0;
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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
        if (!this.a(0)) {
          this.field_r = false;
          return;
        } else {
          L1: {
            L2: {
              if (var3 > this.field_m) {
                break L2;
              } else {
                if (this.field_d > var3) {
                  var3 = this.field_d;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                } else {
                  break L1;
                }
              }
            }
            var3 = this.field_m;
            break L1;
          }
          L3: {
            L4: {
              if (this.field_h < var2) {
                break L4;
              } else {
                if (var2 < this.field_o) {
                  var2 = this.field_o;
                  if (var5 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                } else {
                  break L3;
                }
              }
            }
            var2 = this.field_h;
            break L3;
          }
          L5: {
            if (0.0f >= this.field_t) {
              break L5;
            } else {
              L6: {
                var4 = (int)(0.5f + (float)var3 * this.field_t);
                if (var4 > var2) {
                  break L6;
                } else {
                  if (var4 < var2) {
                    var2 = var4;
                    if (var5 == 0) {
                      break L5;
                    } else {
                      break L6;
                    }
                  } else {
                    break L5;
                  }
                }
              }
              var3 = (int)((float)var2 / this.field_t);
              break L5;
            }
          }
          L7: {
            L8: {
              if (var2 != u.field_sb) {
                break L8;
              } else {
                if (var3 != bk.field_d) {
                  break L8;
                } else {
                  break L7;
                }
              }
            }
            this.field_g.a(-26278, var2, var3);
            break L7;
          }
          L9: {
            if (-1 <= (this.field_f ^ -1)) {
              break L9;
            } else {
              ef.field_e = (this.field_f - u.field_sb) / 2;
              break L9;
            }
          }
          return;
        }
    }

    final boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (ia.field_C < this.field_p) {
                break L1;
              } else {
                if (jd.field_c <= 0) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final void a(byte param0) {
        boolean discarded$0 = false;
        this.field_g.a(param0 ^ 26312, this.field_k, this.field_b);
        if (param0 != -110) {
            discarded$0 = this.a(107);
        }
    }

    final static void a(int param0, int param1, db[] param2, int param3, int param4, byte param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_85_0 = null;
        StringBuilder stackIn_85_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        String stackIn_86_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        String stackOut_85_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
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
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param2[3].field_r;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null == param2[5]) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = param2[5].field_r;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (null != param2[1]) {
                        stackOut_15_0 = param2[1].field_x;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (param2[7] == null) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = param2[7].field_x;
                        stackIn_19_0 = stackOut_17_0;
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
                                if (var22 != 0) {
                                  break L12;
                                } else {
                                  continue L13;
                                }
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
                                if (var22 != 0) {
                                  break L14;
                                } else {
                                  continue L15;
                                }
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
                                if (var22 != 0) {
                                  break L16;
                                } else {
                                  continue L17;
                                }
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
                                if (var22 != 0) {
                                  break L18;
                                } else {
                                  continue L19;
                                }
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
                                  if (var22 != 0) {
                                    break L20;
                                  } else {
                                    var21 = var12;
                                    L22: while (true) {
                                      L23: {
                                        if (var21 >= var13) {
                                          var20 = var20 + param2[4].field_x;
                                          break L23;
                                        } else {
                                          param2[4].d(var21, var20);
                                          var21 = var21 + param2[4].field_r;
                                          if (var22 != 0) {
                                            break L23;
                                          } else {
                                            continue L22;
                                          }
                                        }
                                      }
                                      continue L21;
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
          L24: {
            var6 = decompiledCaughtException;
            stackOut_83_0 = (RuntimeException) (var6);
            stackOut_83_1 = new StringBuilder().append("gf.G(").append(param0).append(',').append(param1).append(',');
            stackIn_85_0 = stackOut_83_0;
            stackIn_85_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param2 == null) {
              stackOut_85_0 = (RuntimeException) ((Object) stackIn_85_0);
              stackOut_85_1 = (StringBuilder) ((Object) stackIn_85_1);
              stackOut_85_2 = "null";
              stackIn_86_0 = stackOut_85_0;
              stackIn_86_1 = stackOut_85_1;
              stackIn_86_2 = stackOut_85_2;
              break L24;
            } else {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "{...}";
              stackIn_86_0 = stackOut_84_0;
              stackIn_86_1 = stackOut_84_1;
              stackIn_86_2 = stackOut_84_2;
              break L24;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_86_0), stackIn_86_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
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
        byte dupTemp$1 = 0;
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
        int var15 = 0;
        wf var16 = null;
        wf var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int stackIn_27_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_68_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_30_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_58_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_61_0 = 0;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        String stackOut_66_2 = null;
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
              L2: {
                L3: {
                  if (th.field_t <= var4) {
                    break L3;
                  } else {
                    mg.field_x[var4] = var16.b(-1698573656);
                    var4++;
                    if (var15 != 0) {
                      break L2;
                    } else {
                      if (var15 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4 = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (th.field_t <= var4) {
                      break L6;
                    } else {
                      rg.field_c[var4] = var16.b(-1698573656);
                      var4++;
                      if (var15 != 0) {
                        break L5;
                      } else {
                        if (var15 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  var4 = 0;
                  break L5;
                }
                L7: while (true) {
                  L8: {
                    L9: {
                      if (th.field_t <= var4) {
                        break L9;
                      } else {
                        pb.field_h[var4] = var16.b(param0 + -1698573762);
                        var4++;
                        if (var15 != 0) {
                          break L8;
                        } else {
                          if (var15 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    if (param0 == 106) {
                      break L8;
                    } else {
                      field_q = (String) null;
                      break L8;
                    }
                  }
                  var4 = 0;
                  L10: while (true) {
                    L11: {
                      L12: {
                        if (var4 >= th.field_t) {
                          break L12;
                        } else {
                          bd.field_m[var4] = var16.b(-1698573656);
                          var4++;
                          if (var15 != 0) {
                            break L11;
                          } else {
                            if (var15 == 0) {
                              continue L10;
                            } else {
                              break L12;
                            }
                          }
                        }
                      }
                      var17.field_h = -(th.field_t * 8) + -7 + (param1.length - 3 * (var3 - 1));
                      ci.field_b = new int[var3];
                      break L11;
                    }
                    var4 = 1;
                    L13: while (true) {
                      L14: {
                        if (var4 >= var3) {
                          var17.field_h = 0;
                          stackOut_30_0 = 0;
                          stackIn_31_0 = stackOut_30_0;
                          break L14;
                        } else {
                          ci.field_b[var4] = var16.a(84);
                          stackOut_26_0 = ci.field_b[var4];
                          stackIn_31_0 = stackOut_26_0;
                          stackIn_27_0 = stackOut_26_0;
                          if (var15 != 0) {
                            break L14;
                          } else {
                            L15: {
                              if (stackIn_27_0 != 0) {
                                break L15;
                              } else {
                                ci.field_b[var4] = 1;
                                break L15;
                              }
                            }
                            var4++;
                            continue L13;
                          }
                        }
                      }
                      var4 = stackIn_31_0;
                      L16: while (true) {
                        stackOut_32_0 = var4 ^ -1;
                        stackIn_33_0 = stackOut_32_0;
                        L17: while (true) {
                          stackOut_33_0 = stackIn_33_0;
                          stackOut_33_1 = th.field_t ^ -1;
                          stackIn_34_0 = stackOut_33_0;
                          stackIn_34_1 = stackOut_33_1;
                          L18: while (true) {
                            L19: {
                              if (stackIn_34_0 <= stackIn_34_1) {
                                break L19;
                              } else {
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
                                if (var15 != 0) {
                                  decompiledRegionSelector0 = 1;
                                  break L0;
                                } else {
                                  L20: {
                                    L21: {
                                      if ((var11 & 1) != 0) {
                                        break L21;
                                      } else {
                                        var12 = 0;
                                        L22: while (true) {
                                          L23: {
                                            if (var12 >= var7) {
                                              if ((2 & var11) != 0) {
                                                break L23;
                                              } else {
                                                break L20;
                                              }
                                            } else {
                                              var8[var12] = var16.e(true);
                                              var12++;
                                              if (var15 != 0) {
                                                break L23;
                                              } else {
                                                continue L22;
                                              }
                                            }
                                          }
                                          var12 = 0;
                                          if (var12 >= var7) {
                                            if (var15 == 0) {
                                              break L20;
                                            } else {
                                              break L21;
                                            }
                                          } else {
                                            dupTemp$1 = var16.e(true);
                                            var9[var12] = dupTemp$1;
                                            var13 = dupTemp$1;
                                            stackOut_45_0 = var10;
                                            stackOut_45_1 = var13 ^ -1;
                                            stackIn_34_0 = stackOut_45_0;
                                            stackIn_34_1 = stackOut_45_1;
                                            continue L18;
                                          }
                                        }
                                      }
                                    }
                                    var12 = 0;
                                    L24: while (true) {
                                      L25: {
                                        if (var12 >= var5) {
                                          stackOut_58_0 = -1;
                                          stackIn_59_0 = stackOut_58_0;
                                          break L25;
                                        } else {
                                          stackOut_50_0 = 0;
                                          stackIn_59_0 = stackOut_50_0;
                                          stackIn_51_0 = stackOut_50_0;
                                          if (var15 != 0) {
                                            break L25;
                                          } else {
                                            var13 = stackIn_51_0;
                                            L26: while (true) {
                                              L27: {
                                                if (var6 <= var13) {
                                                  var12++;
                                                  break L27;
                                                } else {
                                                  var8[var12 + var13 * var5] = var16.e(true);
                                                  var13++;
                                                  if (var15 != 0) {
                                                    break L27;
                                                  } else {
                                                    continue L26;
                                                  }
                                                }
                                              }
                                              continue L24;
                                            }
                                          }
                                        }
                                      }
                                      if (stackIn_59_0 == (2 & var11 ^ -1)) {
                                        break L20;
                                      } else {
                                        var12 = 0;
                                        if (var12 >= var5) {
                                          break L20;
                                        } else {
                                          stackOut_61_0 = 0;
                                          stackIn_33_0 = stackOut_61_0;
                                          continue L17;
                                        }
                                      }
                                    }
                                  }
                                  me.field_w[var4] = var10 != 0;
                                  var4++;
                                  if (var15 == 0) {
                                    continue L16;
                                  } else {
                                    break L19;
                                  }
                                }
                              }
                            }
                            decompiledRegionSelector0 = 0;
                            break L0;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var2 = decompiledCaughtException;
            stackOut_65_0 = (RuntimeException) (var2);
            stackOut_65_1 = new StringBuilder().append("gf.A(").append(param0).append(',');
            stackIn_67_0 = stackOut_65_0;
            stackIn_67_1 = stackOut_65_1;
            stackIn_66_0 = stackOut_65_0;
            stackIn_66_1 = stackOut_65_1;
            if (param1 == null) {
              stackOut_67_0 = (RuntimeException) ((Object) stackIn_67_0);
              stackOut_67_1 = (StringBuilder) ((Object) stackIn_67_1);
              stackOut_67_2 = "null";
              stackIn_68_0 = stackOut_67_0;
              stackIn_68_1 = stackOut_67_1;
              stackIn_68_2 = stackOut_67_2;
              break L28;
            } else {
              stackOut_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackOut_66_1 = (StringBuilder) ((Object) stackIn_66_1);
              stackOut_66_2 = "{...}";
              stackIn_68_0 = stackOut_66_0;
              stackIn_68_1 = stackOut_66_1;
              stackIn_68_2 = stackOut_66_2;
              break L28;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_68_0), stackIn_68_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static db a(byte param0, int param1, int param2) {
        java.net.URL discarded$2 = null;
        db var3 = null;
        int var4 = 0;
        int var5 = 0;
        java.applet.Applet var6 = null;
        db stackIn_6_0 = null;
        db stackIn_7_0 = null;
        db stackOut_5_0 = null;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          if (param0 == -76) {
            break L0;
          } else {
            var6 = (java.applet.Applet) null;
            discarded$2 = gf.a(107, (java.net.URL) null, (java.applet.Applet) null);
            break L0;
          }
        }
        var3 = new db(param1, param1);
        var4 = 0;
        L1: while (true) {
          if (var4 < var3.field_y.length) {
            stackOut_5_0 = (db) (var3);
            stackIn_7_0 = stackOut_5_0;
            stackIn_6_0 = stackOut_5_0;
            if (var5 == 0) {
              stackIn_7_0.field_y[var4] = param2;
              var4++;
              continue L1;
            } else {
              return stackIn_6_0;
            }
          } else {
            return var3;
          }
        }
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
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
            stackOut_8_0 = rf.a(-1, param1, (String) (var4), 0, (String) (var3));
            stackIn_9_0 = stackOut_8_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = var3;
            stackOut_10_1 = new StringBuilder().append("gf.K(").append(param0).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_9_0;
    }

    static {
        field_q = "Unpacking graphics";
    }
}
