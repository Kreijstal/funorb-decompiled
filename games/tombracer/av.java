/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class av {
    private hj field_f;
    static String field_b;
    private int[][] field_a;
    private int field_c;
    private int field_d;
    static boolean field_e;

    private final void a(boolean param0) {
        int discarded$2 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_12_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_11_0 = false;
        var4 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          stackOut_1_0 = var2;
          stackIn_2_0 = stackOut_1_0;
          L1: while (true) {
            L2: {
              L3: {
                if (stackIn_2_0 >= this.field_f.field_f) {
                  break L3;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_12_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var4 != 0) {
                    break L2;
                  } else {
                    var3 = stackIn_4_0;
                    L4: while (true) {
                      L5: {
                        if (var3 >= this.field_f.field_a) {
                          break L5;
                        } else {
                          stackOut_6_0 = this.c(-124, this.field_f.b((byte) -5, var3, var2));
                          stackIn_2_0 = stackOut_6_0 ? 1 : 0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var4 != 0) {
                            continue L1;
                          } else {
                            L6: {
                              if (!stackIn_7_0) {
                                break L6;
                              } else {
                                this.field_f.a(var3, 0, 0, var2);
                                break L6;
                              }
                            }
                            var3++;
                            if (var4 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var2++;
                      if (var4 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              stackOut_11_0 = param0;
              stackIn_12_0 = stackOut_11_0 ? 1 : 0;
              break L2;
            }
            if (stackIn_12_0 != 1) {
              discarded$2 = this.b(47, 0);
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6, int param7, int param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              lra.field_e.field_r = param4;
              if (2 == bta.field_q) {
                qpa.field_b.field_r = gj.field_a;
                break L1;
              } else {
                qpa.field_b.field_r = sd.field_J;
                if (!TombRacer.field_G) {
                  break L1;
                } else {
                  qpa.field_b.field_r = gj.field_a;
                  break L1;
                }
              }
            }
            var9_int = 495;
            var10 = 5;
            dh.field_e.a(var9_int + -10, param7, -23776, var10, 5);
            pq.field_g.a(dh.field_e.field_G - mka.field_b.field_G, param7, -23776, 0, 0);
            if (param3 == -5327) {
              var10 = var10 + (param7 + param5);
              mka.field_b.a(mka.field_b.field_G, param7, -23776, 0, pq.field_g.field_G);
              lra.field_d.a(lra.field_d.b((byte) 69), param6, param3 + -18449, var10, 5);
              var11 = qpa.field_b.b((byte) 69);
              qpa.field_b.a(var11, param6, -23776, var10, var9_int + -5 + -var11);
              var12 = 5 + (param6 + var10);
              lra.field_e.a(var9_int, param1, -23776, 0, 0);
              ep.field_r.a(var9_int, var12, -23776, param1, 0);
              ep.field_r.field_w = hca.c(ep.field_r.field_t, 2105376, 3, 11579568, -112, 8421504);
              var12 = var12 + param1;
              wi.field_s.a(var9_int, var12, -23776, -(var12 / 2) + param0, -(var9_int / 2) + param8);
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
            var9 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var9);
            stackOut_9_1 = new StringBuilder().append("av.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L2;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, fia param1, int param2, String param3, int param4, int param5, int param6, int param7, int param8) {
        try {
            wea.field_a = param4;
            int var9_int = -25 / ((44 - param2) / 33);
            pu.field_b = param0;
            wk.field_n = param5;
            pca.field_a = param3;
            oi.field_a = param1;
            joa.field_a = param7;
            ko.field_d = param8;
            du.field_d = param6;
            wg.field_l = (qda) ((Object) new gv());
            ep.field_k = new ss(param1);
            uja.field_a = new fma(wg.field_l, ep.field_k);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "av.J(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (this.field_f.a(param1, param2, (byte) -128)) {
          L0: {
            L1: {
              var5 = this.field_f.b((byte) -5, param2, param1);
              var6 = 0;
              if (var5 != 0) {
                break L1;
              } else {
                var6 = 1;
                if (!TombRacer.field_G) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (var5 <= 0) {
              var7 = this.a((byte) -121, var5);
              if (var7 > param3) {
                var6 = 1;
                break L0;
              } else {
                if (var6 == 0) {
                  return;
                } else {
                  this.field_f.a(param2, this.b(param3, 8421504), 0, param1);
                  param3++;
                  this.a(param0, -1 + param1, param2, param3);
                  this.a(true, 1 + param1, param2, param3);
                  this.a(true, param1, param2 - 1, param3);
                  this.a(param0, param1, param2 - -1, param3);
                  return;
                }
              }
            } else {
              if (var6 == 0) {
                return;
              } else {
                this.field_f.a(param2, this.b(param3, 8421504), 0, param1);
                param3++;
                this.a(param0, -1 + param1, param2, param3);
                this.a(true, 1 + param1, param2, param3);
                this.a(true, param1, param2 - 1, param3);
                this.a(param0, param1, param2 - -1, param3);
                return;
              }
            }
          }
          if (var6 == 0) {
            return;
          } else {
            this.field_f.a(param2, this.b(param3, 8421504), 0, param1);
            param3++;
            this.a(param0, -1 + param1, param2, param3);
            this.a(true, 1 + param1, param2, param3);
            this.a(true, param1, param2 - 1, param3);
            this.a(param0, param1, param2 - -1, param3);
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        if (99 <= (this.field_f.b((byte) -5, this.field_c, this.field_d) ^ -1)) {
          var2 = this.a((byte) -111, this.field_f.b((byte) -5, this.field_c, this.field_d));
          var3 = var2;
          this.field_a = new int[var2][2];
          if (param0 > 57) {
            var4 = this.field_d;
            var5 = this.field_c;
            var6 = 0;
            L0: while (true) {
              if (this.field_a.length > var6) {
                var7 = -1 + (this.field_a.length - var6);
                this.field_a[var7][0] = var4;
                this.field_a[var7][1] = var5;
                if (var8 == 0) {
                  L1: {
                    L2: {
                      if (this.a(92, var5, -1 + var4) == var3 - 1) {
                        break L2;
                      } else {
                        L3: {
                          if (-1 + var3 == this.a(90, var5, var4 - -1)) {
                            break L3;
                          } else {
                            if (var3 - 1 == this.a(-41, -1 + var5, var4)) {
                              var5--;
                              var3--;
                              if (var8 == 0) {
                                break L1;
                              } else {
                                break L3;
                              }
                            } else {
                              L4: {
                                if (this.a(96, var5 - -1, var4) != -1 + var3) {
                                  break L4;
                                } else {
                                  var3--;
                                  var5++;
                                  if (var8 == 0) {
                                    break L1;
                                  } else {
                                    break L4;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                        var3--;
                        var4++;
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var3--;
                    var4--;
                    break L1;
                  }
                  var6++;
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            this.a(93, 41, -21, -32, -119);
            var4 = this.field_d;
            var5 = this.field_c;
            var6 = 0;
            L5: while (true) {
              if (this.field_a.length > var6) {
                var7 = -1 + (this.field_a.length - var6);
                this.field_a[var7][0] = var4;
                this.field_a[var7][1] = var5;
                if (var8 == 0) {
                  L6: {
                    L7: {
                      if (this.a(92, var5, -1 + var4) == var3 - 1) {
                        break L7;
                      } else {
                        L8: {
                          if (-1 + var3 == this.a(90, var5, var4 - -1)) {
                            break L8;
                          } else {
                            if (var3 - 1 == this.a(-41, -1 + var5, var4)) {
                              var5--;
                              var3--;
                              if (var8 == 0) {
                                break L6;
                              } else {
                                break L8;
                              }
                            } else {
                              L9: {
                                if (this.a(96, var5 - -1, var4) != -1 + var3) {
                                  break L9;
                                } else {
                                  var3--;
                                  var5++;
                                  if (var8 == 0) {
                                    break L6;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              return;
                            }
                          }
                        }
                        var3--;
                        var4++;
                        if (var8 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var3--;
                    var4--;
                    break L6;
                  }
                  var6++;
                  continue L5;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    final int[][] b(byte param0) {
        if (param0 < 120) {
            this.field_c = 94;
            return this.field_a;
        }
        return this.field_a;
    }

    private final int b(int param0, int param1) {
        if (param1 != 8421504) {
            this.field_f = (hj) null;
            return -param0 + -100;
        }
        return -param0 + -100;
    }

    private final int a(byte param0, int param1) {
        if (param0 >= -25) {
            return -100;
        }
        return -param1 - 100;
    }

    final int[][] a(byte param0) {
        int var3_int = 0;
        int[][] var3 = null;
        int var4 = 0;
        qja var5 = null;
        int var5_int = 0;
        int var6 = 0;
        vna var7 = null;
        int[][] var8 = null;
        int[][] var9 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_23_0 = 0;
        int[][] stackIn_27_0 = null;
        int[][] stackIn_29_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        boolean stackOut_6_0 = false;
        int stackOut_22_0 = 0;
        int[][] stackOut_26_0 = null;
        int[][] stackOut_28_0 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        var7 = new vna();
        var3_int = 0;
        L0: while (true) {
          stackOut_1_0 = this.field_f.field_f;
          stackIn_2_0 = stackOut_1_0;
          L1: while (true) {
            L2: {
              L3: {
                if (stackIn_2_0 <= var3_int) {
                  break L3;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_23_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    var4 = stackIn_4_0;
                    L4: while (true) {
                      L5: {
                        if (this.field_f.field_a <= var4) {
                          break L5;
                        } else {
                          var5_int = 0;
                          stackOut_6_0 = this.b(var4, var3_int, -51);
                          stackIn_2_0 = stackOut_6_0 ? 1 : 0;
                          stackIn_7_0 = stackOut_6_0;
                          if (var6 != 0) {
                            continue L1;
                          } else {
                            L6: {
                              if (!stackIn_7_0) {
                                break L6;
                              } else {
                                L7: {
                                  if (this.b(var4, -1 + var3_int, 67)) {
                                    var5_int++;
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                L8: {
                                  if (!this.b(var4, 1 + var3_int, 100)) {
                                    break L8;
                                  } else {
                                    var5_int++;
                                    break L8;
                                  }
                                }
                                L9: {
                                  if (this.b(-1 + var4, var3_int, 124)) {
                                    var5_int++;
                                    break L9;
                                  } else {
                                    break L9;
                                  }
                                }
                                L10: {
                                  if (!this.b(1 + var4, var3_int, 126)) {
                                    break L10;
                                  } else {
                                    var5_int++;
                                    break L10;
                                  }
                                }
                                if ((var5_int ^ -1) != -2) {
                                  break L6;
                                } else {
                                  var7.b((byte) -80, new qja(var3_int, var4));
                                  break L6;
                                }
                              }
                            }
                            var4++;
                            if (var6 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var3_int++;
                      if (var6 == 0) {
                        continue L0;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
              }
              stackOut_22_0 = var7.a((byte) -16);
              stackIn_23_0 = stackOut_22_0;
              break L2;
            }
            var9 = new int[stackIn_23_0][2];
            var8 = var9;
            var3 = var8;
            if (param0 > -40) {
              return (int[][]) null;
            } else {
              var4 = 0;
              var5 = (qja) ((Object) var7.f(-80));
              L11: while (true) {
                L12: {
                  L13: {
                    if (var5 == null) {
                      break L13;
                    } else {
                      var9[var4][0] = var5.field_h;
                      stackOut_26_0 = (int[][]) (var3);
                      stackIn_29_0 = stackOut_26_0;
                      stackIn_27_0 = stackOut_26_0;
                      if (var6 != 0) {
                        break L12;
                      } else {
                        stackIn_27_0[var4][1] = var5.field_g;
                        var4++;
                        var5 = (qja) ((Object) var7.e(125));
                        if (var6 == 0) {
                          continue L11;
                        } else {
                          break L13;
                        }
                      }
                    }
                  }
                  stackOut_28_0 = (int[][]) (var3);
                  stackIn_29_0 = stackOut_28_0;
                  break L12;
                }
                return stackIn_29_0;
              }
            }
          }
        }
    }

    public static void b(boolean param0) {
        field_b = null;
        if (param0) {
            field_e = false;
        }
    }

    private final boolean c(int param0, int param1) {
        if (param0 > -104) {
            return true;
        }
        return (param1 ^ -1) >= 99 ? true : false;
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        var4 = 52 % ((26 - param0) / 61);
        if (this.field_f.a(param2, param1, (byte) -128)) {
          var5 = this.field_f.b((byte) -5, param1, param2);
          if (!this.c(-118, var5)) {
            return 0;
          } else {
            return this.a((byte) -36, var5);
          }
        } else {
          return 0;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        this.field_c = param1;
        this.field_d = param4;
        var6 = 1;
        this.a(true, param2, param0, var6);
        if (param3 <= 79) {
          return;
        } else {
          this.a(66);
          this.a(true);
          return;
        }
    }

    final static ht a(int param0, int param1) {
        ht discarded$11 = null;
        od stackIn_4_0 = null;
        od stackIn_8_0 = null;
        Object stackOut_7_0 = null;
        od stackOut_6_0 = null;
        Object stackOut_3_0 = null;
        od stackOut_2_0 = null;
        if (param1 != 0) {
          L0: {
            discarded$11 = av.a(96, 11);
            if (null == jb.field_K) {
              stackOut_7_0 = null;
              stackIn_8_0 = (od) ((Object) stackOut_7_0);
              break L0;
            } else {
              stackOut_6_0 = jb.field_K.a(-122, (long)param0);
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return (ht) ((Object) stackIn_8_0);
        } else {
          L1: {
            if (null == jb.field_K) {
              stackOut_3_0 = null;
              stackIn_4_0 = (od) ((Object) stackOut_3_0);
              break L1;
            } else {
              stackOut_2_0 = jb.field_K.a(-122, (long)param0);
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return (ht) ((Object) stackIn_4_0);
        }
    }

    private final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!this.field_f.a(param1, param0, (byte) -128)) {
          return true;
        } else {
          L0: {
            var4 = 6 / ((5 - param2) / 55);
            if (this.field_f.b((byte) -5, param0, param1) != 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    av(hj param0) {
        try {
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "av.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Enter name of player to delete from list";
    }
}
