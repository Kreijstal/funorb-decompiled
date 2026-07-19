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
        RuntimeException var5 = null;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        String stackIn_4_0 = null;
        String[] stackIn_36_0 = null;
        String stackIn_37_0 = null;
        String stackIn_38_0 = null;
        String stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        String[] stackIn_46_0 = null;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        String stackIn_61_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        String stackOut_2_0 = null;
        String[] stackOut_45_0 = null;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        String[] stackOut_35_0 = null;
        String stackOut_36_0 = null;
        String stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        String stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        String stackOut_60_2 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              jm.field_g = true;
              ui.field_f = param0;
              var11 = param1;
              if (!param4) {
                stackOut_3_0 = tg.field_j;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = tl.field_h;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              L3: {
                var6 = stackIn_4_0;
                if (ui.field_f == 0) {
                  break L3;
                } else {
                  if (ui.field_f == 1) {
                    var7 = iu.a(480, var11, param3 + 7412, ej.field_G, fs.field_c);
                    var8 = 2 + var7;
                    cj.field_k = new int[var8];
                    nb.field_h = new String[var8];
                    var9 = 0;
                    L4: while (true) {
                      L5: {
                        if (var9 >= var8) {
                          rg.field_m = new int[1];
                          break L5;
                        } else {
                          cj.field_k[var9] = -1;
                          var9++;
                          if (var10 != 0) {
                            break L5;
                          } else {
                            continue L4;
                          }
                        }
                      }
                      var9 = 0;
                      L6: while (true) {
                        L7: {
                          if (var7 <= var9) {
                            nb.field_h[var8 - 2] = "";
                            nb.field_h[var8 - 1] = pd.field_f;
                            cj.field_k[var8 - 1] = 0;
                            rg.field_m[0] = 2;
                            break L7;
                          } else {
                            nb.field_h[var9] = fs.field_c[var9];
                            var9++;
                            if (var10 != 0) {
                              break L7;
                            } else {
                              continue L6;
                            }
                          }
                        }
                        if (var10 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  } else {
                    throw new IllegalArgumentException();
                  }
                }
              }
              var7 = iu.a(480, var11, param3 ^ 7444, ej.field_G, fs.field_c);
              var8 = 3 + var7;
              cj.field_k = new int[var8];
              nb.field_h = new String[var8];
              var9 = 0;
              L8: while (true) {
                L9: {
                  if (var9 >= var8) {
                    rg.field_m = new int[2];
                    break L9;
                  } else {
                    cj.field_k[var9] = -1;
                    var9++;
                    if (var10 != 0) {
                      break L9;
                    } else {
                      continue L8;
                    }
                  }
                }
                var9 = 0;
                L10: while (true) {
                  L11: {
                    if (var9 >= var7) {
                      nb.field_h[var8 - 3] = "";
                      nb.field_h[-2 + var8] = var6;
                      cj.field_k[-2 + var8] = 0;
                      rg.field_m[0] = 1;
                      nb.field_h[var8 + -1] = pd.field_f;
                      cj.field_k[var8 + -1] = 1;
                      break L11;
                    } else {
                      nb.field_h[var9] = fs.field_c[var9];
                      var9++;
                      if (var10 != 0) {
                        break L11;
                      } else {
                        continue L10;
                      }
                    }
                  }
                  rg.field_m[1] = 2;
                  break L2;
                }
              }
            }
            nn.field_z.field_k = rg.field_m.length;
            var7 = 0;
            var8 = 0;
            L12: while (true) {
              L13: {
                L14: {
                  L15: {
                    L16: {
                      if (var8 >= nb.field_h.length) {
                        bm.field_h = var7 + bt.field_g + -(var7 >> -1245385087);
                        co.field_f = bt.field_g - (var7 >> 1437814529);
                        ms.field_r = (ar.field_w + rd.field_b << 33785409) * nn.field_z.field_k;
                        var8 = 0;
                        L17: while (true) {
                          stackOut_45_0 = nb.field_h;
                          stackIn_46_0 = stackOut_45_0;
                          if (stackIn_46_0.length <= var8) {
                            break L15;
                          } else {
                            stackOut_47_0 = ms.field_r;
                            stackOut_47_1 = cj.field_k[var8] ^ -1;
                            stackIn_50_0 = stackOut_47_0;
                            stackIn_50_1 = stackOut_47_1;
                            stackIn_48_0 = stackOut_47_0;
                            stackIn_48_1 = stackOut_47_1;
                            if (var10 == 0) {
                              L18: {
                                stackOut_50_0 = stackIn_50_0;
                                stackIn_52_0 = stackOut_50_0;
                                stackIn_51_0 = stackOut_50_0;
                                if (stackIn_50_1 <= -1) {
                                  stackOut_52_0 = stackIn_52_0;
                                  stackOut_52_1 = jg.field_k;
                                  stackIn_53_0 = stackOut_52_0;
                                  stackIn_53_1 = stackOut_52_1;
                                  break L18;
                                } else {
                                  stackOut_51_0 = stackIn_51_0;
                                  stackOut_51_1 = cn.field_o;
                                  stackIn_53_0 = stackOut_51_0;
                                  stackIn_53_1 = stackOut_51_1;
                                  break L18;
                                }
                              }
                              ms.field_r = stackIn_53_0 + stackIn_53_1;
                              var8++;
                              continue L17;
                            } else {
                              break L16;
                            }
                          }
                        }
                      } else {
                        stackOut_35_0 = nb.field_h;
                        stackIn_46_0 = stackOut_35_0;
                        stackIn_36_0 = stackOut_35_0;
                        if (var10 != 0) {
                          L19: while (true) {
                            if (stackIn_46_0.length <= var8) {
                              break L15;
                            } else {
                              stackOut_47_0 = ms.field_r;
                              stackOut_47_1 = cj.field_k[var8] ^ -1;
                              stackIn_50_0 = stackOut_47_0;
                              stackIn_50_1 = stackOut_47_1;
                              stackIn_48_0 = stackOut_47_0;
                              stackIn_48_1 = stackOut_47_1;
                              if (var10 == 0) {
                                L20: {
                                  stackOut_50_0 = stackIn_50_0;
                                  stackIn_52_0 = stackOut_50_0;
                                  stackIn_51_0 = stackOut_50_0;
                                  if (stackIn_50_1 <= -1) {
                                    stackOut_52_0 = stackIn_52_0;
                                    stackOut_52_1 = jg.field_k;
                                    stackIn_53_0 = stackOut_52_0;
                                    stackIn_53_1 = stackOut_52_1;
                                    break L20;
                                  } else {
                                    stackOut_51_0 = stackIn_51_0;
                                    stackOut_51_1 = cn.field_o;
                                    stackIn_53_0 = stackOut_51_0;
                                    stackIn_53_1 = stackOut_51_1;
                                    break L20;
                                  }
                                }
                                ms.field_r = stackIn_53_0 + stackIn_53_1;
                                var8++;
                                stackOut_45_0 = nb.field_h;
                                stackIn_46_0 = stackOut_45_0;
                                continue L19;
                              } else {
                                break L16;
                              }
                            }
                          }
                        } else {
                          L21: {
                            stackOut_36_0 = stackIn_36_0[var8];
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_37_0 = stackOut_36_0;
                            if ((cj.field_k[var8] ^ -1) > -1) {
                              stackOut_38_0 = (String) ((Object) stackIn_38_0);
                              stackOut_38_1 = 0;
                              stackIn_39_0 = stackOut_38_0;
                              stackIn_39_1 = stackOut_38_1;
                              break L21;
                            } else {
                              stackOut_37_0 = (String) ((Object) stackIn_37_0);
                              stackOut_37_1 = 1;
                              stackIn_39_0 = stackOut_37_0;
                              stackIn_39_1 = stackOut_37_1;
                              break L21;
                            }
                          }
                          L22: {
                            var9 = lp.a(stackIn_39_0, stackIn_39_1 != 0, false);
                            if (cj.field_k[var8] == -1) {
                              break L22;
                            } else {
                              var9 = var9 + df.field_E * 2;
                              break L22;
                            }
                          }
                          L23: {
                            if (var9 <= var7) {
                              break L23;
                            } else {
                              var7 = var9;
                              break L23;
                            }
                          }
                          var8++;
                          continue L12;
                        }
                      }
                    }
                    if (stackIn_48_0 == stackIn_48_1) {
                      break L13;
                    } else {
                      break L14;
                    }
                  }
                  if (param3 == 90) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
                field_x = (int[]) null;
                break L13;
              }
              rk.field_r = -(ms.field_r >> -533383551) + lm.field_g;
              nn.field_z.a(0, param2, vo.a((byte) -73, ko.field_b, sm.field_d), 0);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var5 = decompiledCaughtException;
            stackOut_58_0 = (RuntimeException) (var5);
            stackOut_58_1 = new StringBuilder().append("ld.D(").append(param0).append(',');
            stackIn_60_0 = stackOut_58_0;
            stackIn_60_1 = stackOut_58_1;
            stackIn_59_0 = stackOut_58_0;
            stackIn_59_1 = stackOut_58_1;
            if (param1 == null) {
              stackOut_60_0 = (RuntimeException) ((Object) stackIn_60_0);
              stackOut_60_1 = (StringBuilder) ((Object) stackIn_60_1);
              stackOut_60_2 = "null";
              stackIn_61_0 = stackOut_60_0;
              stackIn_61_1 = stackOut_60_1;
              stackIn_61_2 = stackOut_60_2;
              break L24;
            } else {
              stackOut_59_0 = (RuntimeException) ((Object) stackIn_59_0);
              stackOut_59_1 = (StringBuilder) ((Object) stackIn_59_1);
              stackOut_59_2 = "{...}";
              stackIn_61_0 = stackOut_59_0;
              stackIn_61_1 = stackOut_59_1;
              stackIn_61_2 = stackOut_59_2;
              break L24;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_61_0), stackIn_61_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int a(byte param0, int param1) {
        java.applet.Applet var3 = null;
        if (param0 < 62) {
          var3 = (java.applet.Applet) null;
          ld.a(-105, (java.applet.Applet) null);
          return tm.field_e[param1 & 2047];
        } else {
          return tm.field_e[param1 & 2047];
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            Object discarded$6 = null;
            Object discarded$7 = null;
            Object discarded$8 = null;
            Object discarded$9 = null;
            Object discarded$10 = null;
            Object discarded$11 = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            java.net.URL var4 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
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
                try {
                  L1: {
                    if (param0 == 16058) {
                      var4 = param1.getCodeBase();
                      var3 = ck.a(-3780, var4, param1).getFile();
                      discarded$6 = lj.a(param1, "updatelinks", new Object[]{"home", var3 + "home.ws"}, 116);
                      discarded$7 = lj.a(param1, "updatelinks", new Object[]{"gamelist", var3 + "togamelist.ws"}, 74);
                      discarded$8 = lj.a(param1, "updatelinks", new Object[]{"serverlist", var3 + "toserverlist.ws"}, 98);
                      discarded$9 = lj.a(param1, "updatelinks", new Object[]{"options", var3 + "options.ws"}, 75);
                      discarded$10 = lj.a(param1, "updatelinks", new Object[]{"terms", var3 + "terms.ws"}, 122);
                      discarded$11 = lj.a(param1, "updatelinks", new Object[]{"privacy", var3 + "privacy.ws"}, param0 + -15938);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = decompiledCaughtException;
                  return;
                }
                if (decompiledRegionSelector0 == 0) {
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var2_ref);
                stackOut_6_1 = new StringBuilder().append("ld.B(").append(param0).append(',');
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
              throw ig.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, ha param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int[] var3_array = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        var6 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            this.field_E = this.field_u;
            var9 = new int[this.field_D];
            var8 = var9;
            var7 = var8;
            var3_array = var7;
            this.field_F = this.field_v;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (var4 >= this.field_D) {
                      break L4;
                    } else {
                      var5 = this.field_C[var4];
                      var11 = -2;
                      var10 = var5 ^ -1;
                      if (var6 != 0) {
                        if (var10 == var11) {
                          break L2;
                        } else {
                          break L3;
                        }
                      } else {
                        L5: {
                          L6: {
                            L7: {
                              L8: {
                                if (var10 == var11) {
                                  this.field_F = this.field_F - 1;
                                  if (var6 == 0) {
                                    break L5;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  if (var5 == 2) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (var5 != 0) {
                                        break L9;
                                      } else {
                                        if (var6 == 0) {
                                          break L7;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    if ((var5 ^ -1) == -4) {
                                      break L6;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              this.field_F = this.field_F + 1;
                              if (var6 == 0) {
                                break L5;
                              } else {
                                break L7;
                              }
                            }
                            this.field_E = this.field_E + 1;
                            if (var6 == 0) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                          this.field_E = this.field_E - 1;
                          break L5;
                        }
                        var7[var4] = this.field_C[var4];
                        var4++;
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  L10: {
                    L11: {
                      if (!this.field_y.field_W) {
                        break L11;
                      } else {
                        if (this.field_y.field_N != 0) {
                          break L10;
                        } else {
                          break L11;
                        }
                      }
                    }
                    param1.field_l.a((byte) -119, (tc) (new kr(this.field_u, this.field_v, var9)));
                    break L10;
                  }
                  if (param0 == 64) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                discarded$1 = ld.a((byte) -102, 105);
                break L2;
              }
              L12: {
                L13: {
                  if (-1 != (this.field_w ^ -1)) {
                    break L13;
                  } else {
                    if (0 == this.field_t) {
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                L14: {
                  if (!this.field_y.field_W) {
                    break L14;
                  } else {
                    if (7 != this.field_y.field_N) {
                      break L14;
                    } else {
                      return;
                    }
                  }
                }
                param1.field_l.a((byte) -119, (tc) (new ns(this.field_E, this.field_F, this.field_w, this.field_t, this.field_z, this.field_A, this.field_B)));
                break L12;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_35_0 = (RuntimeException) (var3);
            stackOut_35_1 = new StringBuilder().append("ld.C(").append(param0).append(',');
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param1 == null) {
              stackOut_37_0 = (RuntimeException) ((Object) stackIn_37_0);
              stackOut_37_1 = (StringBuilder) ((Object) stackIn_37_1);
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L15;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L15;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_38_0), stackIn_38_2 + ')');
        }
    }

    final static void a(int param0, wk[] param1, tu param2, String param3, int param4, int param5, int param6) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
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
              L3: {
                var7_int = param2.a(param3) - -(param1[0].field_y << -1192671775);
                var8 = -(var7_int >> 1652655617) + param5;
                var9 = (var7_int >> 1427571553) + param5;
                if (0 > var8) {
                  break L3;
                } else {
                  if (var9 > 640) {
                    param5 = param5 - (var9 + -640);
                    if (!ArmiesOfGielinor.field_M) {
                      break L2;
                    } else {
                      break L3;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              param5 = param5 - var8;
              break L2;
            }
            jp.a(-(var7_int >> -820423231) + param5, param0, var7_int, param1, param4, -8991);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("ld.E(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          L5: {
            stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          L6: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param3 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
                break L1;
              } else {
                L2: {
                  this.field_z = param8.b(false);
                  var10_int = bw.field_m[this.field_y.field_N][9];
                  stackOut_2_0 = this;
                  stackOut_2_1 = this.field_y.field_Y * vu.field_N[var10_int] / this.field_y.field_t;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  if (this.field_y.field_Y * vu.field_N[var10_int] % this.field_y.field_t != 0) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    stackIn_5_2 = stackOut_4_2;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = stackIn_3_1;
                    stackOut_3_2 = 0;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_5_2 = stackOut_3_2;
                    break L2;
                  }
                }
                L3: {
                  ((ld) (this)).field_A = stackIn_5_1 - -stackIn_5_2;
                  var11 = bw.field_m[this.field_z.field_N][9];
                  stackOut_5_0 = this;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (0 != this.field_z.field_Y * vu.field_N[var11] % this.field_z.field_t) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L3;
                  } else {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L3;
                  }
                }
                ((ld) (this)).field_B = stackIn_8_1 + this.field_z.field_Y * vu.field_N[var11] / this.field_z.field_t;
                if (!ArmiesOfGielinor.field_M) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            this.field_w = 0;
            this.field_z = null;
            this.field_t = 0;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var10);
            stackOut_11_1 = new StringBuilder().append("ld.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          L5: {
            stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param7 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param8 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    static {
        field_G = "No target selected.";
        field_s = -1;
    }
}
