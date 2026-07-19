/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ar extends wp {
    static te field_N;
    private s field_J;
    static String field_F;
    private String[] field_I;
    static int field_G;
    private jn field_H;
    static String field_M;
    static wb field_E;
    static tf field_L;

    final void a(int param0, boolean param1, int param2, int param3) {
        pk var6 = null;
        this.a(-50, param2, param0, ((de) ((Object) this.field_w)).b((pk) (this), (byte) 116), param3);
        if (!param1) {
          return;
        } else {
          var6 = (pk) null;
          this.a(-89, -87, (pk) null, -5);
          return;
        }
    }

    public static void f(byte param0) {
        field_E = null;
        field_M = null;
        field_N = null;
        if (param0 >= -115) {
          field_E = (wb) null;
          field_F = null;
          field_L = null;
          return;
        } else {
          field_F = null;
          field_L = null;
          return;
        }
    }

    void a(int param0, int param1, pk param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -117, param2, param3);
              var5_int = 65 % ((param1 - -25) / 45);
              this.field_J = null;
              if (this.field_k) {
                var6 = -this.field_r + (-param0 + ko.field_p);
                var7 = -param3 + (pi.field_e - this.field_v);
                this.field_J = this.b(-40, var6, var7);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("ar.U(").append(param0).append(',').append(param1).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param3 + ')');
        }
    }

    final static void e(byte param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        db var5_ref_db = null;
        Object var6 = null;
        int var7 = 0;
        byte[] var9 = null;
        lh var10 = null;
        pl var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        var7 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var11 = ig.field_a;
                var2 = var11.e(-31302);
                var3 = 99 / ((-33 - param0) / 36);
                if (var2 == 0) {
                  break L2;
                } else {
                  L3: {
                    if (-2 != (var2 ^ -1)) {
                      break L3;
                    } else {
                      var4 = var11.c(true);
                      var5_ref_db = (db) ((Object) jj.field_a.b(83));
                      L4: while (true) {
                        L5: {
                          L6: {
                            if (var5_ref_db == null) {
                              break L6;
                            } else {
                              stackOut_5_0 = var4;
                              stackIn_11_0 = stackOut_5_0;
                              stackIn_6_0 = stackOut_5_0;
                              if (var7 != 0) {
                                break L5;
                              } else {
                                if (stackIn_6_0 == var5_ref_db.field_m) {
                                  break L6;
                                } else {
                                  var5_ref_db = (db) ((Object) jj.field_a.d((byte) 18));
                                  if (var7 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                          }
                          if (var5_ref_db == null) {
                            stackOut_10_0 = -123;
                            stackIn_11_0 = stackOut_10_0;
                            break L5;
                          } else {
                            var5_ref_db.b(false);
                            if (var7 == 0) {
                              break L1;
                            } else {
                              break L3;
                            }
                          }
                        }
                        kk.a((byte) stackIn_11_0);
                        decompiledRegionSelector0 = 0;
                        break L0;
                      }
                    }
                  }
                  ms.a("A1: " + di.b((byte) -9), (Throwable) null, 0);
                  kk.a((byte) -128);
                  if (var7 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var10 = (lh) ((Object) no.field_d.b(-110));
              if (var10 != null) {
                L7: {
                  L8: {
                    var5 = var11.e(-31302);
                    if (var5 != 0) {
                      break L8;
                    } else {
                      var6 = null;
                      if (var7 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  var13 = new byte[var5];
                  var12 = var13;
                  var9 = var12;
                  var6 = var9;
                  var11.a(var13, var5, 0, (byte) -47);
                  break L7;
                }
                var11.field_p = var11.field_p + 4;
                if (!var11.e((byte) -9)) {
                  kk.a((byte) -127);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  var10.field_o = true;
                  var10.field_m = (byte[]) (var6);
                  var10.b(false);
                  break L1;
                }
              } else {
                kk.a((byte) -109);
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "ar.E(" + param0 + ')');
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

    final void a(int param0) {
        int var2 = 0;
        de var3 = null;
        ag var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        s var10_ref = null;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        String var17 = null;
        tk var18 = null;
        s var19 = null;
        String var26 = null;
        tk var27 = null;
        s var28 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_55_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_63_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_66_1 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        int stackOut_65_0 = 0;
        int stackOut_65_1 = 0;
        int stackOut_66_0 = 0;
        int stackOut_66_1 = 0;
        int stackOut_62_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        var16 = Sumoblitz.field_L ? 1 : 0;
        this.field_H = new jn();
        var2 = 0;
        var3 = (de) ((Object) this.field_w);
        var4 = var3.b(-3, (pk) (this));
        if (param0 != 9) {
          field_F = (String) null;
          L0: while (true) {
            var5 = this.field_m.indexOf("<hotspot=", var2);
            stackOut_76_0 = 0;
            stackOut_76_1 = var5 ^ -1;
            stackIn_74_0 = stackOut_76_0;
            stackIn_74_1 = stackOut_76_1;
            L1: while (true) {
              if (stackIn_74_0 != stackIn_74_1) {
                var7 = this.field_m.indexOf(">", var5);
                var26 = this.field_m.substring(9 + var5, var7);
                var7 = Integer.parseInt(var26);
                var2 = this.field_m.indexOf("</hotspot>", var5);
                var8 = var4.b(var5, -17500);
                var9 = var4.b(var2, param0 + -17509);
                var10 = null;
                if (var16 == 0) {
                  var11 = var8;
                  L2: while (true) {
                    if (var11 > var9) {
                      if (var16 == 0) {
                        continue L0;
                      } else {
                        return;
                      }
                    } else {
                      var27 = var4.field_a[var11];
                      stackOut_65_0 = var11 ^ -1;
                      stackOut_65_1 = var8 ^ -1;
                      stackIn_74_0 = stackOut_65_0;
                      stackIn_74_1 = stackOut_65_1;
                      stackIn_66_0 = stackOut_65_0;
                      stackIn_66_1 = stackOut_65_1;
                      if (var16 != 0) {
                        continue L1;
                      } else {
                        stackOut_66_0 = stackIn_66_0;
                        stackOut_66_1 = stackIn_66_1;
                        stackIn_63_0 = stackOut_66_0;
                        stackIn_63_1 = stackOut_66_1;
                        L3: {
                          if (stackIn_63_0 == stackIn_63_1) {
                            stackOut_62_0 = var4.a((byte) 125, var5);
                            stackIn_60_0 = stackOut_62_0;
                            break L3;
                          } else {
                            stackOut_49_0 = var27.field_b[0];
                            stackIn_60_0 = stackOut_49_0;
                            break L3;
                          }
                        }
                        L4: {
                          var13 = stackIn_60_0;
                          if (var9 != var11) {
                            if (var27 == null) {
                              stackOut_57_0 = 0;
                              stackIn_55_0 = stackOut_57_0;
                              break L4;
                            } else {
                              stackOut_51_0 = var27.field_b[-1 + var27.field_b.length];
                              stackIn_55_0 = stackOut_51_0;
                              break L4;
                            }
                          } else {
                            stackOut_50_0 = var4.a((byte) 126, var2);
                            stackIn_55_0 = stackOut_50_0;
                            break L4;
                          }
                        }
                        L5: {
                          var14 = stackIn_55_0;
                          var28 = new s(var7, var13, var27.field_d, -var13 + var14, Math.max(var3.a(14763), -var27.field_d + var27.field_a));
                          if (var10 != null) {
                            ((s) (var10)).field_r = var28;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        this.field_H.a((ms) (var28), (byte) 39);
                        var10_ref = var28;
                        var11++;
                        continue L2;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          L6: while (true) {
            var5 = this.field_m.indexOf("<hotspot=", var2);
            stackOut_1_0 = 0;
            stackOut_1_1 = var5 ^ -1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            L7: while (true) {
              if (stackIn_2_0 != stackIn_2_1) {
                var7 = this.field_m.indexOf(">", var5);
                var17 = this.field_m.substring(9 + var5, var7);
                var7 = Integer.parseInt(var17);
                var2 = this.field_m.indexOf("</hotspot>", var5);
                var8 = var4.b(var5, -17500);
                var9 = var4.b(var2, param0 + -17509);
                var10_ref = null;
                if (var16 == 0) {
                  var11 = var8;
                  L8: while (true) {
                    if (var11 > var9) {
                      if (var16 == 0) {
                        continue L6;
                      } else {
                        return;
                      }
                    } else {
                      var18 = var4.field_a[var11];
                      stackOut_8_0 = var11 ^ -1;
                      stackOut_8_1 = var8 ^ -1;
                      stackIn_2_0 = stackOut_8_0;
                      stackIn_2_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var16 != 0) {
                        continue L7;
                      } else {
                        L9: {
                          if (stackIn_9_0 == stackIn_9_1) {
                            stackOut_11_0 = var4.a((byte) 125, var5);
                            stackIn_12_0 = stackOut_11_0;
                            break L9;
                          } else {
                            stackOut_10_0 = var18.field_b[0];
                            stackIn_12_0 = stackOut_10_0;
                            break L9;
                          }
                        }
                        L10: {
                          var13 = stackIn_12_0;
                          if (var9 != var11) {
                            if (var18 == null) {
                              stackOut_16_0 = 0;
                              stackIn_17_0 = stackOut_16_0;
                              break L10;
                            } else {
                              stackOut_15_0 = var18.field_b[-1 + var18.field_b.length];
                              stackIn_17_0 = stackOut_15_0;
                              break L10;
                            }
                          } else {
                            stackOut_13_0 = var4.a((byte) 126, var2);
                            stackIn_17_0 = stackOut_13_0;
                            break L10;
                          }
                        }
                        L11: {
                          var14 = stackIn_17_0;
                          var19 = new s(var7, var13, var18.field_d, -var13 + var14, Math.max(var3.a(14763), -var18.field_d + var18.field_a));
                          if (var10_ref != null) {
                            var10_ref.field_r = var19;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        this.field_H.a((ms) (var19), (byte) 39);
                        var10_ref = var19;
                        var11++;
                        continue L8;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    ar(String param0, mh param1) {
        super(param0, (qm) null);
        this.field_J = null;
        try {
            this.field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "ar.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(-114, param1, param2, param3, param4);
        int var6 = -60 / ((param0 - 28) / 63);
        this.a(9);
    }

    boolean a(pk param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 == 61) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_N = (te) null;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("ar.Q(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    private final s b(int param0, int param1, int param2) {
        int var4 = 0;
        s var5 = null;
        s var6 = null;
        int var7 = 0;
        s stackIn_6_0 = null;
        s stackIn_14_0 = null;
        s stackOut_5_0 = null;
        s stackOut_13_0 = null;
        var7 = Sumoblitz.field_L ? 1 : 0;
        var4 = 22 / ((88 - param0) / 35);
        var5 = (s) ((Object) this.field_H.b(124));
        L0: while (true) {
          if (var5 != null) {
            var6 = var5;
            L1: while (true) {
              L2: {
                L3: {
                  if (var6 == null) {
                    break L3;
                  } else {
                    stackOut_5_0 = (s) (var6);
                    stackIn_14_0 = stackOut_5_0;
                    stackIn_6_0 = stackOut_5_0;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_6_0.field_s > param1) {
                          break L4;
                        } else {
                          if (var6.field_l > param2) {
                            break L4;
                          } else {
                            if (var6.field_t + var6.field_s <= param1) {
                              break L4;
                            } else {
                              if (param2 <= var6.field_l - -var6.field_p) {
                                return var5;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                      var6 = var6.field_r;
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_13_0 = (s) ((Object) this.field_H.d((byte) 18));
                stackIn_14_0 = stackOut_13_0;
                break L2;
              }
              var5 = stackIn_14_0;
              if (var7 == 0) {
                continue L0;
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        }
    }

    void a(int param0, int param1, byte param2, int param3) {
        s var6 = null;
        int var7 = 0;
        int var8 = 0;
        de var9 = null;
        super.a(param0, param1, (byte) -113, param3);
        if (param3 != 0) {
          return;
        } else {
          var9 = (de) ((Object) this.field_w);
          if (param2 < -35) {
            var6 = this.field_J;
            if (var6 == null) {
              return;
            } else {
              var7 = var9.a(param0, (pk) (this), 16098);
              var8 = var9.b(param1, (pk) (this), 0);
              L0: while (true) {
                pp.a(-2 + (var6.field_l + var8), var6.field_t + 2, -13181, -2 + (var7 + var6.field_s), 2 + var6.field_p);
                var6 = var6.field_r;
                if (var6 != null) {
                  continue L0;
                } else {
                  return;
                }
              }
            }
          } else {
            field_L = (tf) null;
            var6 = this.field_J;
            if (var6 == null) {
              return;
            } else {
              var7 = var9.a(param0, (pk) (this), 16098);
              var8 = var9.b(param1, (pk) (this), 0);
              L1: while (true) {
                pp.a(-2 + (var6.field_l + var8), var6.field_t + 2, -13181, -2 + (var7 + var6.field_s), 2 + var6.field_p);
                var6 = var6.field_r;
                if (var6 != null) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        }
    }

    final void a(int param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 <= -44) {
                break L1;
              } else {
                field_F = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                L4: {
                  if (null == this.field_I) {
                    break L4;
                  } else {
                    if (this.field_I.length <= param2) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
                L5: {
                  var7 = new String[1 + param2];
                  var4 = var7;
                  if (null == this.field_I) {
                    break L5;
                  } else {
                    var5 = 0;
                    L6: while (true) {
                      if (var5 >= this.field_I.length) {
                        break L5;
                      } else {
                        var7[var5] = this.field_I[var5];
                        var5++;
                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (var6 == 0) {
                            continue L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                }
                this.field_I = var7;
                break L3;
              }
              this.field_I[param2] = param1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("ar.H(").append(param0).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L7;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L7;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param2 + ')');
        }
    }

    final void b(int param0, int param1, boolean param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        s var7 = null;
        super.b(param0, param1, param2, param3);
        var5 = -this.field_r + param1;
        var6 = param3 + -this.field_v;
        var7 = this.b(126, var5, var6);
        if (var7 != null) {
          if (this.field_o != null) {
            ((ca) ((Object) this.field_o)).a(var7.field_q, (ar) (this), param0, -20036);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    String c(int param0) {
        if (null != this.field_J) {
          if (this.field_I != null) {
            if (param0 == -6696) {
              if (this.field_I.length <= this.field_J.field_q) {
                return null;
              } else {
                return this.field_I[this.field_J.field_q];
              }
            } else {
              field_F = (String) null;
              if (this.field_I.length <= this.field_J.field_q) {
                return null;
              } else {
                return this.field_I[this.field_J.field_q];
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        field_F = "Connection timed out. Please try using a different server.";
        field_G = 0;
        field_M = "points remaining: <%0>";
        field_N = new te(8);
        field_L = new tf();
    }
}
