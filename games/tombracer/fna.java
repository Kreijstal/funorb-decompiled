/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fna {
    static qua[] field_j;
    static int field_h;
    dea field_c;
    static String field_k;
    String field_e;
    int field_g;
    private int field_f;
    int field_i;
    private int field_d;
    int field_b;
    boolean field_a;
    private boolean field_l;

    final void c(int param0) {
        this.field_c.c(-72);
        if (param0 != 1701110401) {
            this.field_e = (String) null;
        }
    }

    final static void a(int param0, int param1, ik param2) {
        kh var3 = null;
        try {
            if (param1 != -23814) {
                field_j = (qua[]) null;
            }
            var3 = ql.field_k;
            var3.k(param0, -2988);
            var3.i(2, 0);
            var3.i(0, 0);
            var3.i(param2.field_g, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fna.K(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int d(int param0) {
        nh var2 = null;
        int var3 = 0;
        if (-6 != (this.field_g ^ -1)) {
          if (-7 == (this.field_g ^ -1)) {
            return ng.field_k[5].c() / 2 + this.field_d;
          } else {
            L0: {
              if (param0 == 11919) {
                break L0;
              } else {
                field_k = (String) null;
                break L0;
              }
            }
            L1: {
              L2: {
                var2 = this.b(-28425);
                var3 = var2.c();
                if (1 == this.field_g) {
                  break L2;
                } else {
                  if ((this.field_g ^ -1) == -4) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var3 = -5 + var3 * 2 / 3;
              break L1;
            }
            return this.field_d + var3;
          }
        } else {
          return ng.field_k[5].c() / 2 + this.field_d;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_j = (qua[]) null;
        }
        field_k = null;
        field_j = null;
    }

    final void a(boolean param0, boolean param1, boolean param2, int param3) {
        boolean discarded$2 = false;
        dea stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        boolean stackIn_5_2 = false;
        dea stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean stackIn_6_2 = false;
        dea stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean stackIn_7_2 = false;
        int stackIn_7_3 = 0;
        dea stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        boolean stackOut_4_2 = false;
        dea stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        boolean stackOut_6_2 = false;
        int stackOut_6_3 = 0;
        dea stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        boolean stackOut_5_2 = false;
        int stackOut_5_3 = 0;
        L0: {
          if (param3 == 6) {
            break L0;
          } else {
            discarded$2 = this.a(-5, 1, -105);
            break L0;
          }
        }
        L1: {
          if (!this.field_a) {
            L2: {
              stackOut_4_0 = this.field_c;
              stackOut_4_1 = -115;
              stackOut_4_2 = param0;
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              if (param2) {
                stackOut_6_0 = (dea) ((Object) stackIn_6_0);
                stackOut_6_1 = stackIn_6_1;
                stackOut_6_2 = stackIn_6_2;
                stackOut_6_3 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                stackIn_7_2 = stackOut_6_2;
                stackIn_7_3 = stackOut_6_3;
                break L2;
              } else {
                stackOut_5_0 = (dea) ((Object) stackIn_5_0);
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                stackIn_7_2 = stackOut_5_2;
                stackIn_7_3 = stackOut_5_3;
                break L2;
              }
            }
            ((dea) (Object) stackIn_7_0).a((byte) stackIn_7_1, stackIn_7_2, stackIn_7_3 != 0);
            break L1;
          } else {
            break L1;
          }
        }
        L3: {
          if (param1) {
            if (6 > this.field_d) {
              this.field_d = this.field_d + 1;
              if (param1) {
                break L3;
              } else {
                if (-1 <= (this.field_d ^ -1)) {
                  break L3;
                } else {
                  this.field_d = this.field_d - 1;
                  break L3;
                }
              }
            } else {
              if (param1) {
                break L3;
              } else {
                if (-1 <= (this.field_d ^ -1)) {
                  break L3;
                } else {
                  this.field_d = this.field_d - 1;
                  break L3;
                }
              }
            }
          } else {
            if (-1 <= (this.field_d ^ -1)) {
              break L3;
            } else {
              this.field_d = this.field_d - 1;
              break L3;
            }
          }
        }
    }

    final void a(boolean param0, boolean param1, int param2, boolean param3) {
        int var5 = 0;
        da var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        nh var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        kea var20_ref_kea = null;
        kia var20_ref_kia = null;
        int var21_int = 0;
        kea var21 = null;
        nh var21_ref = null;
        String var21_ref2 = null;
        int var22_int = 0;
        String var22 = null;
        int var24 = 0;
        nh[] var25 = null;
        ha var26 = null;
        kia var27 = null;
        nh[] var28 = null;
        ha var29 = null;
        nh var30 = null;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        kia stackIn_51_0 = null;
        int stackIn_78_0 = 0;
        nh stackIn_89_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_14_0 = 0;
        kia stackOut_50_0 = null;
        kia stackOut_49_0 = null;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        nh stackOut_88_0 = null;
        nh stackOut_87_0 = null;
        L0: {
          var24 = TombRacer.field_G ? 1 : 0;
          if (!param0) {
            stackOut_2_0 = 2431750;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 10827264;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        var6 = eda.field_f;
        var7 = this.e(-163) / 2;
        var8 = this.d(param2 + 11918) / 2;
        var9 = this.field_i + this.field_c.e(param2 ^ -103);
        if (param2 == 1) {
          L1: {
            var10 = -var7 + this.field_b;
            var11 = var9 + -var8;
            var12 = this.b(-28425);
            var13 = this.e(-163);
            var14 = this.d(11919);
            var15 = -1;
            if (36 != this.field_g) {
              if (-38 != (this.field_g ^ -1)) {
                if (38 == this.field_g) {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                } else {
                  stackOut_10_0 = 0;
                  stackIn_13_0 = stackOut_10_0;
                  break L1;
                }
              } else {
                stackOut_8_0 = 1;
                stackIn_13_0 = stackOut_8_0;
                break L1;
              }
            } else {
              stackOut_6_0 = 1;
              stackIn_13_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var16 = stackIn_13_0;
            if (39 != this.field_g) {
              if (-41 == (this.field_g ^ -1)) {
                stackOut_17_0 = 1;
                stackIn_19_0 = stackOut_17_0;
                break L2;
              } else {
                stackOut_16_0 = 0;
                stackIn_19_0 = stackOut_16_0;
                break L2;
              }
            } else {
              stackOut_14_0 = 1;
              stackIn_19_0 = stackOut_14_0;
              break L2;
            }
          }
          L3: {
            var17 = stackIn_19_0;
            if (var16 != 0) {
              break L3;
            } else {
              if (var17 != 0) {
                break L3;
              } else {
                L4: {
                  if (!param1) {
                    break L4;
                  } else {
                    if (!param3) {
                      break L3;
                    } else {
                      var5 = 10827264;
                      if (var24 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L5: {
                  if (!param3) {
                    break L5;
                  } else {
                    var5 = 12632256;
                    if (var24 == 0) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                var5 = 1052688;
                break L3;
              }
            }
          }
          L6: {
            L7: {
              if (-6 == (this.field_g ^ -1)) {
                break L7;
              } else {
                if (6 == this.field_g) {
                  break L7;
                } else {
                  L8: {
                    if (var16 != 0) {
                      break L8;
                    } else {
                      L9: {
                        if (var17 != 0) {
                          break L9;
                        } else {
                          L10: {
                            L11: {
                              if (!param1) {
                                break L11;
                              } else {
                                L12: {
                                  if (!param3) {
                                    break L12;
                                  } else {
                                    var12.a(var10, var11, var13, var14);
                                    if (var24 == 0) {
                                      break L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                var12.a(var10, var11, var13, var14, 0, -4144960, 1);
                                if (var24 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            L13: {
                              if (!param3) {
                                break L13;
                              } else {
                                var12.a(var10, var11, var13, var14, 2, 1614823488, 1);
                                if (var24 == 0) {
                                  break L10;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            var12.a(var10, var11, var13, var14, 2, 1610612736, 1);
                            break L10;
                          }
                          oka.a(this.field_e, var5, var6, -1, 5 + var9, this.field_b, var15);
                          if (var24 == 0) {
                            break L6;
                          } else {
                            break L9;
                          }
                        }
                      }
                      L14: {
                        var18 = 300;
                        var19 = 120;
                        if (39 == this.field_g) {
                          ng.field_k[4].a(-89 + this.field_b, -16 + (-(var19 >> -1331862303) + var9), var18, var19, 0, -4144960, 1);
                          oka.a(bc.field_a, var5, var6, -1, var9 + (-(var19 >> -1281634943) + 25), -94 + (var18 >> 770940129) + this.field_b, var15);
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L15: {
                        var26 = tga.field_a;
                        var21_int = this.field_b + -8;
                        var22_int = var9 + -8 + -16;
                        var25 = dr.field_a;
                        tra.a(1, var25, (byte) -68, var21_int, var26, 16, 1, 16, var22_int, 0);
                        if (param3) {
                          var15 = 2236962;
                          var5 = 10309393;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      L16: {
                        if (-40 != (this.field_g ^ -1)) {
                          stackOut_50_0 = vk.field_d;
                          stackIn_51_0 = stackOut_50_0;
                          break L16;
                        } else {
                          stackOut_49_0 = ska.field_r;
                          stackIn_51_0 = stackOut_49_0;
                          break L16;
                        }
                      }
                      L17: {
                        var27 = stackIn_51_0;
                        var20_ref_kia = var27;
                        if (vja.b(30000) == var27) {
                          var15 = 2236962;
                          var5 = 10827264;
                          oka.a("X", var5, var6, -1, -8 + (var9 + -1), this.field_b, var15);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        var21_ref2 = this.field_e;
                        if (ipa.a(dna.A(param2 + 124), true, var27)) {
                          break L18;
                        } else {
                          var5 = 2431750;
                          var21_ref2 = "<str=010101>" + this.field_e + "</str>";
                          var15 = -1;
                          break L18;
                        }
                      }
                      oka.a(var21_ref2, var5, var6, -1, 10 + var9, this.field_b, var15);
                      if (var24 == 0) {
                        break L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                  L19: {
                    var18 = 300;
                    var19 = 120;
                    if (-37 != (this.field_g ^ -1)) {
                      break L19;
                    } else {
                      ng.field_k[5].a(-63 + this.field_b, var9 - (var19 >> -522518271) - 16, var18, var19, 0, -4144960, 1);
                      oka.a(dna.field_I, var5, var6, -1, 25 + (-(var19 >> 398467809) + var9), -65 + (this.field_b + (var18 >> -1834489247)), var15);
                      break L19;
                    }
                  }
                  L20: {
                    var29 = tga.field_a;
                    var21_int = this.field_b - 8;
                    var22_int = var9 - 8 + -16;
                    var28 = dr.field_a;
                    tra.a(1, var28, (byte) -109, var21_int, var29, 16, 1, 16, var22_int, 0);
                    if ((this.field_g ^ -1) == -37) {
                      var20_ref_kea = baa.field_e;
                      break L20;
                    } else {
                      if (37 != this.field_g) {
                        var20_ref_kea = kva.field_s;
                        break L20;
                      } else {
                        var20_ref_kea = tia.field_d;
                        break L20;
                      }
                    }
                  }
                  L21: {
                    if (param3) {
                      var15 = 2236962;
                      var5 = 10309393;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    var21 = dna.A(36);
                    if (var20_ref_kea != var21) {
                      break L22;
                    } else {
                      var15 = 2236962;
                      var5 = 10827264;
                      oka.a("X", var5, var6, param2 + -2, -8 + var9 - 1, this.field_b, var15);
                      break L22;
                    }
                  }
                  L23: {
                    var22 = this.field_e;
                    if (ipa.a(var20_ref_kea, true, vja.b(30000))) {
                      break L23;
                    } else {
                      var15 = -1;
                      var5 = 2431750;
                      var22 = "<str=010101>" + this.field_e + "</str>";
                      break L23;
                    }
                  }
                  oka.a(var22, var5, var6, -1, var9 - -10, this.field_b, var15);
                  if (var24 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L24: {
              var18 = 300;
              var19 = 100;
              if (this.field_g == 5) {
                ng.field_k[5].a(this.field_b + (-(var18 >> -1462975583) + 10), var9 + -(var19 >> 644658177) - -13, var18, var19, 0, -4144960, 1);
                break L24;
              } else {
                break L24;
              }
            }
            L25: {
              oka.a(this.field_e, var5, var6, param2 + -2, var9, -64 + this.field_b, var15);
              if (-6 != (this.field_g ^ -1)) {
                stackOut_77_0 = jg.a((byte) -103);
                stackIn_78_0 = stackOut_77_0;
                break L25;
              } else {
                stackOut_76_0 = tk.a(param2 ^ -22635);
                stackIn_78_0 = stackOut_76_0;
                break L25;
              }
            }
            L26: {
              L27: {
                var20 = stackIn_78_0;
                if (param3) {
                  break L27;
                } else {
                  tka.field_p.a(-34 + this.field_b, var9 + -16, 0, -4144960, 1);
                  if (var24 == 0) {
                    break L26;
                  } else {
                    break L27;
                  }
                }
              }
              tka.field_p.a(this.field_b - 34, -16 + var9);
              break L26;
            }
            L28: {
              L29: {
                tga.field_a.KA(this.field_b - 35, -17 + var9, (var20 >> -1269344863) + -35 + this.field_b, var9);
                if (param3) {
                  break L29;
                } else {
                  ep.field_n.a(this.field_b - 34, -16 + var9, 0, -4144960, 1);
                  if (var24 == 0) {
                    break L28;
                  } else {
                    break L29;
                  }
                }
              }
              ep.field_n.a(-34 + this.field_b, -16 + var9);
              break L28;
            }
            L30: {
              tga.field_a.la();
              if (this.field_g != 6) {
                stackOut_88_0 = haa.field_z;
                stackIn_89_0 = stackOut_88_0;
                break L30;
              } else {
                stackOut_87_0 = wh.field_y;
                stackIn_89_0 = stackOut_87_0;
                break L30;
              }
            }
            L31: {
              var30 = stackIn_89_0;
              var21_ref = var30;
              if (!param3) {
                break L31;
              } else {
                var30.a(-12 + ((var20 >> 1961730465) + -35) + this.field_b, var9 + -(var30.c() >> 1805656001) - 6);
                if (var24 == 0) {
                  break L6;
                } else {
                  break L31;
                }
              }
            }
            var30.a((var20 >> 1025141217) + (-35 + this.field_b) - 12, -6 + -(var30.c() >> 1701110401) + var9, 0, -4144960, 1);
            break L6;
          }
          return;
        } else {
          return;
        }
    }

    final int e(int param0) {
        if (param0 != -163) {
            return -37;
        }
        nh var2 = this.b(param0 ^ 28586);
        return var2.a() - -this.field_d;
    }

    final void a(boolean param0) {
        hra discarded$0 = null;
        if (param0) {
            String var3 = (String) null;
            discarded$0 = fna.a(86, (String) null);
        }
        this.field_c.d(31990);
    }

    final static hra a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String var3 = null;
        String var4 = null;
        hra var5 = null;
        int var6 = 0;
        hra stackIn_4_0 = null;
        hra stackIn_8_0 = null;
        hra stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hra stackOut_7_0 = null;
        hra stackOut_11_0 = null;
        hra stackOut_3_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param1 == null) {
                break L1;
              } else {
                if (0 != param1.length()) {
                  var2_int = param1.indexOf('@');
                  if (var2_int == -1) {
                    stackOut_7_0 = is.field_wb;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var3 = param1.substring(0, var2_int);
                    var4 = param1.substring(var2_int + 1);
                    var6 = 77 % ((param0 - -25) / 63);
                    var5 = bd.a(-1, var3);
                    if (var5 != null) {
                      stackOut_11_0 = (hra) (var5);
                      stackIn_12_0 = stackOut_11_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      return wn.a(76, var4);
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            stackOut_3_0 = mma.field_d;
            stackIn_4_0 = stackOut_3_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("fna.I(").append(param0).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final static void a(int param0, int param1, boolean param2, boolean param3, boolean param4, int param5, int param6, int param7, boolean param8, int param9, int param10, boolean param11, int param12, int param13) {
        qda.field_b = null;
        se.d((byte) 118);
        if (param5 != -22919) {
          return;
        } else {
          param3 = rk.a(param12, param3, (byte) 107, param0, param9, param10, param7);
          voa.a(param13, param4, param5 + 27015, param8, param1, param3, param12, param6, param2, param11);
          uka.b(param13, -125, param11);
          pw.a(param3, (byte) -112, param7, param13);
          return;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        nh var10 = null;
        if (!this.field_c.b(20)) {
          return false;
        } else {
          L0: {
            if ((this.field_g ^ -1) == -2) {
              break L0;
            } else {
              if (3 != this.field_g) {
                L1: {
                  var10 = this.b(-28425);
                  var5 = var10.a();
                  var6 = var10.c();
                  if (param0 == -30323) {
                    break L1;
                  } else {
                    fna.a(39, 63, false, true, true, 14, -127, -48, false, 75, -103, false, -22, 2);
                    break L1;
                  }
                }
                var7 = param1 - -(var5 / 2) - this.field_b;
                var8 = param2 - (this.field_i - var6 / 2);
                if (!ab.a(this.field_i - var6 / 2, param1, this.field_i - -(var6 / 2), param2, this.field_b - -(var5 / 2), this.field_b - var5 / 2, 105)) {
                  return false;
                } else {
                  var9 = ema.a(this.field_l, 0, var7, this.field_f, var8) ? 1 : 0;
                  return var9 != 0;
                }
              } else {
                break L0;
              }
            }
          }
          var4 = this.e(-163);
          var5 = this.d(11919);
          return ab.a(-(var5 / 2) + this.field_i, param1, var5 / 2 + this.field_i, param2, this.field_b + var4 / 2, this.field_b - var4 / 2, 104);
        }
    }

    private final nh b(int param0) {
        if (!(this.field_g != 1)) {
            return fra.field_q;
        }
        if (!(-4 != (this.field_g ^ -1))) {
            return ij.field_X;
        }
        if (param0 != -28425) {
            fna.a(-43, -1, false, true, false, -66, -12, 75, false, -21, 73, false, -95, 84);
        }
        return this.field_l ? em.field_h[this.field_f] : ng.field_k[this.field_f];
    }

    fna(int param0, String param1, int param2, boolean param3) {
        this.field_c = new dea();
        try {
            this.field_g = param0;
            this.field_l = param3 ? true : false;
            this.field_f = param2;
            this.field_e = param1.toUpperCase();
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "fna.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
    }
}
