/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jm implements pf, ac {
    static volatile boolean field_j;
    private int field_c;
    int field_l;
    static String field_b;
    int field_i;
    private boolean field_n;
    int field_m;
    int field_k;
    int field_f;
    int field_h;
    int field_a;
    dj field_g;
    int field_e;
    int field_d;
    int field_o;

    public final int a(int param0, int param1, qm param2) {
        RuntimeException var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -13372) {
                break L1;
              } else {
                this.field_o = 75;
                break L1;
              }
            }
            stackIn_3_0 = this.a(param0, 0, (byte) 120, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("jm.T(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, byte param1, boolean param2, na param3, int param4, int param5, int param6, int param7) {
        nl[][] stackIn_6_0 = null;
        nl[][] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_106_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        nl[] var8 = null;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int[] var10 = null;
        int var10_int = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        nl var13_ref_nl = null;
        int var14 = 0;
        int var15 = 0;
        nl[] var16 = null;
        nl[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var15 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param1 == -25) {
              L1: {
                L2: {
                  if (param6 >= param5) {
                    var8_int = 1;
                    var9 = 0;
                    L3: while (true) {
                      if (var9 >= um.field_a.length) {
                        if (var8_int != 0) {
                          bg.field_a = true;
                          break L2;
                        } else {
                          break L1;
                        }
                      } else {
                        var19 = um.field_a[var9];
                        var18 = var19;
                        var10 = var18;
                        var11 = 0;
                        var12 = 0;
                        L4: while (true) {
                          L5: {
                            if (var12 >= var19.length) {
                              L6: {
                                if (var11 != 0) {
                                  break L6;
                                } else {
                                  if (param6 == vf.field_l) {
                                    break L6;
                                  } else {
                                    var9++;
                                    continue L3;
                                  }
                                }
                              }
                              var12 = 0;
                              L7: while (true) {
                                if (var19.length <= var12) {
                                  var8_int = 0;
                                  break L5;
                                } else {
                                  L8: {
                                    var13 = var19[var12];
                                    if (0 == (var13 ^ -1)) {
                                      nb.field_d = true;
                                      break L8;
                                    } else {
                                      if (param6 <= var13) {
                                        break L8;
                                      } else {
                                        tk.field_q[var13] = true;
                                        break L8;
                                      }
                                    }
                                  }
                                  var12 += 2;
                                  continue L7;
                                }
                              }
                            } else {
                              L9: {
                                var13 = var19[var12];
                                var14 = var10[var12 - -1];
                                if (var13 == -1) {
                                  if (var14 == ao.field_h[param0]) {
                                    break L9;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  L10: {
                                    if (var13 != param6) {
                                      break L10;
                                    } else {
                                      if (param4 == var14) {
                                        var11 = 1;
                                        break L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                  if (param6 > var13) {
                                    if ((qa.field_l[var13] & 255) == var14) {
                                      break L9;
                                    } else {
                                      break L5;
                                    }
                                  } else {
                                    var9++;
                                    continue L3;
                                  }
                                }
                              }
                              var12 += 2;
                              continue L4;
                            }
                          }
                          var9++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    L11: {
                      stackIn_6_0 = s.field_e;

                      if (-1 == param6) {
                        stackIn_7_0 = (nl[][]) ((Object) stackIn_6_0);
                        stackIn_7_1 = 1;
                        break L11;
                      } else {
                        stackIn_7_0 = (nl[][]) ((Object) stackIn_6_0);
                        stackIn_7_1 = 4 - -param6;
                        break L11;
                      }
                    }
                    L12: {
                      var16 = stackIn_7_0[stackIn_7_1];
                      var17 = var16;
                      var8 = var17;
                      var9 = 1;
                      if (param2) {
                        if (param6 == -1) {
                          var10_int = 0;
                          L13: while (true) {
                            if (ao.field_h.length <= var10_int) {
                              break L12;
                            } else {
                              if (-1 != (gh.field_E[var10_int / 8] & 1 << (7 & var10_int) ^ -1)) {
                                var9 = 0;
                                break L12;
                              } else {
                                var10_int++;
                                continue L13;
                              }
                            }
                          }
                        } else {
                          var10_int = 0;
                          L14: while (true) {
                            L15: {
                              if (var10_int >= var16.length + -1) {
                                break L15;
                              } else {
                                if (0 != (ng.field_D[(param7 - -var10_int) / 8] & 1 << (var10_int + param7 & 7))) {
                                  var9 = 0;
                                  break L15;
                                } else {
                                  var10_int++;
                                  continue L14;
                                }
                              }
                            }
                            param7 = param7 + (in.field_Nb[param6] & 255);
                            break L12;
                          }
                        }
                      } else {
                        break L12;
                      }
                    }
                    var10_int = 0;
                    var11 = 0;
                    L16: while (true) {
                      L17: {
                        stackIn_26_0 = var11 ^ -1;

                        if (-1 == param6) {
                          stackIn_27_0 = stackIn_26_0;
                          stackIn_27_1 = ao.field_h.length;
                          break L17;
                        } else {
                          stackIn_27_0 = stackIn_26_0;
                          stackIn_27_1 = var17.length + -1;
                          break L17;
                        }
                      }
                      if (stackIn_27_0 <= (stackIn_27_1 ^ -1)) {
                        if (var10_int == 0) {
                          var11 = 0;
                          L18: while (true) {
                            if (var11 >= var17.length - 1) {
                              break L2;
                            } else {
                              L19: {
                                if (param6 != -1) {
                                  qa.field_l[param6] = (byte)var11;
                                  break L19;
                                } else {
                                  param0 = var11;
                                  break L19;
                                }
                              }
                              jm.a(param0, (byte) -25, param2, param3, param4, param5, 1 + param6, param7);
                              if (!bg.field_a) {
                                var11++;
                                continue L18;
                              } else {
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                        } else {
                          break L1;
                        }
                      } else {
                        L20: {
                          if (param6 == -1) {
                            param0 = var11;
                            break L20;
                          } else {
                            qa.field_l[param6] = (byte)var11;
                            break L20;
                          }
                        }
                        L21: {
                          L22: {
                            if ((param6 ^ -1) != 0) {
                              break L22;
                            } else {
                              if ((ao.field_h.length ^ -1) != -2) {
                                break L22;
                              } else {
                                var12 = 1;
                                break L21;
                              }
                            }
                          }
                          var13_ref_nl = var8[var11 + 1];
                          if (param2) {
                            L23: {
                              if (!var13_ref_nl.field_ab) {
                                if (var9 != 0) {
                                  if (var13_ref_nl.field_ub) {
                                    stackIn_51_0 = 1;
                                    break L23;
                                  } else {
                                    stackIn_51_0 = 0;
                                    break L23;
                                  }
                                } else {
                                  stackIn_51_0 = 0;
                                  break L23;
                                }
                              } else {
                                stackIn_51_0 = 1;
                                break L23;
                              }
                            }
                            var12 = stackIn_51_0;
                            break L21;
                          } else {
                            L24: {
                              if (-1 == param6) {
                                if (ao.field_h[var11] != wi.field_f.field_dc) {
                                  stackIn_42_0 = 0;
                                  break L24;
                                } else {
                                  stackIn_42_0 = 1;
                                  break L24;
                                }
                              } else {
                                if ((wi.field_f.field_Wb[param6] & 255) != var11) {
                                  stackIn_42_0 = 0;
                                  break L24;
                                } else {
                                  stackIn_42_0 = 1;
                                  break L24;
                                }
                              }
                            }
                            var12 = stackIn_42_0;
                            break L21;
                          }
                        }
                        L25: {
                          if (var12 != 0) {
                            jm.a(param0, (byte) -25, param2, param3, param4, param5, 1 + param6, param7);
                            var10_int = 1;
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        if (bg.field_a) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          var11++;
                          continue L16;
                        }
                      }
                    }
                  }
                }
                break L1;
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L26: {
            var8_ref = decompiledCaughtException;
            stackIn_105_0 = (RuntimeException) (var8_ref);

            stackIn_105_1 = new StringBuilder().append("jm.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackIn_106_2 = "null";
              break L26;
            } else {
              stackIn_106_0 = (RuntimeException) ((Object) stackIn_105_0);
              stackIn_106_1 = (StringBuilder) ((Object) stackIn_105_1);
              stackIn_106_2 = "{...}";
              break L26;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_106_0), stackIn_106_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final void a(jm param0, int param1) {
        param0.field_g = this.field_g;
        param0.field_o = this.field_o;
        param0.field_a = this.field_a;
        param0.field_d = this.field_d;
        param0.field_c = this.field_c;
        param0.field_i = this.field_i;
        param0.field_l = this.field_l;
        param0.field_f = this.field_f;
        if (param1 != 1881) {
            return;
        }
        try {
            param0.field_k = this.field_k;
            param0.field_e = this.field_e;
            param0.field_n = this.field_n;
            param0.field_m = this.field_m;
            param0.field_h = this.field_h;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "jm.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, qm param1, int param2, int param3, int param4, int param5) {
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        vd var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        kh var17 = null;
        kh var18 = null;
        var16 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param4 != param5) {
              L1: {
                if (param3 == 6600) {
                  break L1;
                } else {
                  this.field_g = (dj) null;
                  break L1;
                }
              }
              L2: {
                if (!param1.d(-2116)) {
                  break L2;
                } else {
                  L3: {
                    var17 = this.a(param1, -118);
                    var18 = var17;
                    if (param4 > param5) {
                      var8 = param5;
                      var9 = param4;
                      break L3;
                    } else {
                      var8 = param4;
                      var9 = param5;
                      break L3;
                    }
                  }
                  var10 = var18.a((byte) -67, var8);
                  var11 = var18.a((byte) 77, var9);
                  da.a(param2 + param1.field_n - -param1.field_v, param1.field_j + param0 - -param1.field_k, 123, param2 - -param1.field_n, param1.field_j + param0);
                  var12 = var10;
                  L4: while (true) {
                    if (var12 > var11) {
                      oo.c(param3 + -22005);
                      break L2;
                    } else {
                      L5: {
                        var13 = var17.field_f[var12];
                        if ((var12 ^ -1) == (var10 ^ -1)) {
                          stackIn_14_0 = var18.a(var8, 0);
                          break L5;
                        } else {
                          stackIn_14_0 = var13.field_f[0];
                          break L5;
                        }
                      }
                      L6: {
                        var14 = stackIn_14_0;
                        if (var12 != var11) {
                          if (var13 == null) {
                            stackIn_19_0 = 0;
                            break L6;
                          } else {
                            stackIn_19_0 = var13.field_f[var13.field_f.length + -1];
                            break L6;
                          }
                        } else {
                          stackIn_19_0 = var18.a(var9, param3 ^ 6600);
                          break L6;
                        }
                      }
                      var15 = stackIn_19_0;
                      io.field_n.a(var13.field_e, var13.field_g + param1.field_i + this.field_f + (param0 + param1.field_j), this.field_e, -var14 + var15, this.field_e >>> 54916888, param3 + -6599, this.a(param2, param3 + 2693, var14, param1));
                      var12++;
                      continue L4;
                    }
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
          L7: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("jm.Q(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, int param1, int param2, qm param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 9293) {
                break L1;
              } else {
                this.field_m = -128;
                break L1;
              }
            }
            stackIn_3_0 = param2 + param0 + (param3.field_n + this.field_m - -param3.field_h);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("jm.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final void a(int param0, int param1, int param2, int param3, qm param4) {
        kh var13 = null;
        kh var14 = null;
        int var7 = 0;
        vd var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        if (param0 <= 6) {
            return;
        }
        try {
            if (param4.d(-2116)) {
                var13 = this.a(param4, -128);
                var14 = var13;
                var7 = var14.a((byte) -109, param3);
                var8 = var13.field_f[var7];
                var9 = var14.a(param3, 0);
                var10 = this.a(param2, 9293, var9, param4);
                var11 = this.a(param1, -13372, param4) + Math.max(0, var8.field_g);
                var12 = this.a(param1, -13372, param4) + Math.min(this.a(param4, false), Math.min(var8.field_e, var14.field_f.length > 1 + var7 ? var13.field_f[1 + var7].field_g : var8.field_e));
                da.a(param4.field_n + param2 - -param4.field_v, param4.field_k + param4.field_j + param1, 116, param2 + param4.field_n, param1 + param4.field_j);
                io.field_n.a(var10, var10, var12, this.field_o, var11, (byte) 102);
                oo.c(-15405);
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "jm.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public final int a(int param0) {
        if (param0 != 27184) {
            qm var3 = (qm) null;
            this.a((qm) null, (byte) -41, 24);
        }
        return this.field_g.field_m + this.field_g.field_C;
    }

    public void a(qm param0, int param1, int param2, int param3, boolean param4) {
        if (this.field_g == null) {
            return;
        }
        try {
            this.a(param3, param2, param0, (byte) -89);
            if (param1 != 5592405) {
                this.field_c = 110;
            }
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "jm.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public final int b(int param0, qm param1, int param2, int param3, int param4, int param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a(param1, -35);
            if (param5 == 2454) {
              stackIn_4_0 = param1.field_s.a(-this.a(param4, -13372, param1) + param2, -this.a(param1, (byte) -105, param0) + param3, true);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -110;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var7 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var7);

            stackIn_7_1 = new StringBuilder().append("jm.V(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final void a(int param0, int param1, qm param2, byte param3) {
        try {
            if (param3 != -89) {
                qm var6 = (qm) null;
                this.b((byte) -88, (qm) null);
            }
            this.a(0, param3 + 23123, this.field_k, 0, param2, param0, param1, this.field_c);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "jm.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final int a(qm param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 17 % ((-9 - param1) / 44);
            stackIn_1_0 = -this.field_m + (param0.field_v + -this.field_l);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("jm.N(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    String a(boolean param0, qm param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              stackIn_4_0 = param1.field_g;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jm.K(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final int a(byte param0, qm param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a(param1, -123);
            var3_int = -79 / ((76 - param0) / 39);
            stackIn_1_0 = param1.field_s.b((byte) 71) + this.field_m + this.field_l;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("jm.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    jm(dj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        this(param0, param1, param1, param2, param2, param3, param4, param5, param6, param7, -1, 2147483647, false);
    }

    private final void b(byte param0, qm param1) {
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != param1.field_s) {
                break L1;
              } else {
                param1.field_s = (kh) ((Object) new re());
                break L1;
              }
            }
            var3_int = this.a(param1, (byte) 71);
            var4 = this.a(param1, false);
            if (param0 == -33) {
              L2: {
                var6 = this.field_a;
                if (var6 != 0) {
                  if (-3 != (var6 ^ -1)) {
                    L3: {
                      if (-4 != (var6 ^ -1)) {
                        if ((var6 ^ -1) != -2) {
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var5 = (-this.field_g.field_C + (var4 + -this.field_g.field_m) >> -532114239) + this.field_g.field_C;
                    break L2;
                  } else {
                    var5 = -this.field_g.field_m + var4;
                    break L2;
                  }
                } else {
                  var5 = this.field_g.field_C;
                  break L2;
                }
              }
              L4: {
                L5: {
                  L6: {
                    var6 = this.field_i;
                    if (0 != var6) {
                      if (3 == var6) {
                        break L6;
                      } else {
                        if (1 == var6) {
                          if (param1.field_s instanceof re) {
                            ((re) ((Object) param1.field_s)).a(this.a(false, param1), var3_int >> 635293025, var5, (byte) -18, this.field_g);
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          if ((var6 ^ -1) == -3) {
                            if (param1.field_s instanceof re) {
                              ((re) ((Object) param1.field_s)).a(var3_int, (byte) -105, this.field_g, var5, this.a(false, param1));
                              break L5;
                            } else {
                              break L4;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  if (!(param1.field_s instanceof re)) {
                    break L5;
                  } else {
                    ((re) ((Object) param1.field_s)).a(this.a(false, param1), (byte) -123, this.field_g, var5, 0);
                    break L4;
                  }
                }
                break L4;
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
          L7: {
            var3 = decompiledCaughtException;
            stackIn_33_0 = (RuntimeException) (var3);

            stackIn_33_1 = new StringBuilder().append("jm.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L7;
            } else {
              stackIn_34_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L7;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, qm param4, int param5, int param6, int param7) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              da.a(param4.field_v + (param4.field_n + param6), param5 - (-param4.field_j + -param4.field_k), 121, param6 - -param4.field_n, param4.field_j + param5);
              if (param1 == 23034) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              var9_int = this.a(param4, (byte) 56);
              var10 = this.a(param4, false);
              if (this.field_n) {
                this.field_g.a(this.a(false, param4), this.a(param6, 9293, param0, param4), this.a(param5, param3, (byte) 120, param4), var9_int, var10, param2, param7, this.field_i, this.field_a, this.field_h);
                break L2;
              } else {
                L3: {
                  var12 = this.field_a;
                  if (0 == var12) {
                    var11 = this.field_g.field_C;
                    break L3;
                  } else {
                    if (-3 == (var12 ^ -1)) {
                      var11 = -this.field_g.field_m + var10;
                      break L3;
                    } else {
                      L4: {
                        if ((var12 ^ -1) != -4) {
                          if (-2 != (var12 ^ -1)) {
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      }
                      var11 = (-this.field_g.field_C + var10 + -this.field_g.field_m >> -731991935) + this.field_g.field_C;
                      break L3;
                    }
                  }
                }
                L5: {
                  var12 = this.field_i;
                  if (-1 != (var12 ^ -1)) {
                    if (-4 == (var12 ^ -1)) {
                      break L5;
                    } else {
                      if (var12 == 1) {
                        this.field_g.b(this.a(false, param4), (var9_int >> -1518191711) + this.a(param6, 9293, param0, param4), this.a(param5, param3, (byte) 120, param4) + var11, param2, param7);
                        break L2;
                      } else {
                        if ((var12 ^ -1) != -3) {
                          break L2;
                        } else {
                          this.field_g.c(this.a(false, param4), this.a(param6, param1 + -13741, param0, param4) + var9_int, var11 + this.a(param5, param3, (byte) 120, param4), param2, param7);
                          break L2;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
                this.field_g.a(this.a(false, param4), this.a(param6, 9293, param0, param4), var11 + this.a(param5, param3, (byte) 120, param4), param2, param7);
                break L2;
              }
            }
            oo.c(param1 + -38439);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var9);

            stackIn_27_1 = new StringBuilder().append("jm.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    public final kh a(qm param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        kh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = 58 % ((-83 - param1) / 35);
              if (param0.field_s == null) {
                param0.field_s = (kh) ((Object) new re());
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (this.field_n) {
                ((re) ((Object) param0.field_s)).a((byte) 119, this.field_g, this.a(param0, false), this.field_h, this.field_i, this.field_a, this.a(false, param0), this.a(param0, (byte) -62));
                break L2;
              } else {
                this.b((byte) -33, param0);
                break L2;
              }
            }
            stackIn_7_0 = param0.field_s;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("jm.L(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    public final int b(qm param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.a(param0, 6);
            if (param1 == 1) {
              stackIn_4_0 = param0.field_s.a((byte) -54) + (this.field_f + this.field_d);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -42;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jm.P(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void b(int param0) {
        int var1 = 0;
        if (-33 <= (ul.field_A ^ -1)) {
            eb.a(0, false);
        } else {
            var1 = ul.field_A % 32;
            if (!(var1 != 0)) {
                var1 = 32;
            }
            eb.a(ul.field_A + -var1, false);
        }
        if (param0 < 29) {
            jm.b(-66);
        }
    }

    private final int a(qm param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param1) {
              stackIn_4_0 = -this.field_d + (-this.field_f + param0.field_k);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 122;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jm.R(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    protected jm() {
    }

    private final int a(int param0, int param1, byte param2, qm param3) {
        RuntimeException var5 = null;
        qm var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 120) {
                break L1;
              } else {
                var6 = (qm) null;
                this.a((qm) null, (byte) 0, -49);
                break L1;
              }
            }
            stackIn_3_0 = param1 + (this.field_f + param0) + param3.field_j + param3.field_i;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("jm.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    public final int a(qm param0, byte param1, int param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -88) {
              stackIn_4_0 = this.a(param2, 9293, 0, param0);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = 53;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("jm.S(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    jm(dj param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, boolean param12) {
        try {
            this.field_g = param0;
            this.field_f = param3;
            this.field_o = param10;
            this.field_e = param11;
            this.field_l = param2;
            this.field_n = param12 ? true : false;
            this.field_a = param8;
            this.field_d = param4;
            this.field_i = param7;
            this.field_h = param9;
            this.field_c = param6;
            this.field_m = param1;
            this.field_k = param5;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "jm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ',' + param11 + ',' + param12 + ')');
        }
    }

    public static void c(int param0) {
        field_b = null;
        int var1 = -67 % ((param0 - 25) / 37);
    }

    static {
        field_j = false;
    }
}
