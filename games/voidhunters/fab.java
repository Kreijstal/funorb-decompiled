/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fab {
    static String field_b;
    bra field_e;
    private fs[] field_c;
    private boolean field_d;
    private d field_a;

    final static void a(int param0, byte[] param1) {
        String var4 = null;
        kc var2_ref = null;
        nkb.a(false, "Reading gamedata from server");
        Object var2 = null;
        try {
            var2_ref = (kc) ((Object) beb.a(param1, 6429, jpa.field_c));
        } catch (Exception exception) {
            var4 = ila.a(param1, param0 ^ 29411);
            var2_ref = new kc();
            eg.e((byte) -69);
            gna.a((Throwable) ((Object) exception), "Gamedata is corrupted - " + var4, 0);
        }
        if (!(var2_ref != null)) {
            return;
        }
        if (!(1 >= var2_ref.field_d)) {
            gna.a((Throwable) null, "Gamedata is for a version that doesn't exist yet (" + var2_ref.field_d + ")! The clientdata is probably corrupted.", 0);
            return;
        }
        try {
            nkb.a(false, "Player gamedata=" + var2_ref);
            if (var2_ref != null) {
                nkb.a(false, "Player gamedata blueprint=" + var2_ref.field_f);
            }
            if (param0 != -29365) {
                field_b = (String) null;
            }
            es.field_b = var2_ref;
            dt.a(-118);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "fab.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static arb a(asb param0, String param1, int param2, asb param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        arb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        arb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
              var5_int = param3.b(param4, -95);
              var6 = param3.a(true, var5_int, param1);
              if (param2 == 0) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            stackOut_2_0 = le.a(param3, (byte) -35, param0, var6, var5_int);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5);
            stackOut_4_1 = new StringBuilder().append("fab.A(");
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          L5: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param4 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        return stackIn_3_0;
    }

    private final void a(java.awt.Canvas param0, byte param1) {
        Object var3 = null;
        fs[] var4 = null;
        int var5 = 0;
        Object var6 = null;
        fs var6_ref = null;
        RuntimeException var7 = null;
        int var7_int = 0;
        bra var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        ha var11 = null;
        Object stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        Object stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        Object stackIn_119_0 = null;
        StringBuilder stackIn_119_1 = null;
        String stackIn_119_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        Object stackOut_118_0 = null;
        StringBuilder stackOut_118_1 = null;
        String stackOut_118_2 = null;
        Object stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        String stackOut_117_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            var3 = null;
            if (param1 < -77) {
              var4 = this.field_c;
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4.length) {
                  decompiledRegionSelector1 = 1;
                  break L0;
                } else {
                  L2: {
                    var6_ref = var4[var5];
                    if (var6_ref.field_b) {
                      L3: {
                        var7_int = var6_ref.field_a;
                        if ((var7_int ^ -1) == -1) {
                          break L3;
                        } else {
                          if (-6 != (var7_int ^ -1)) {
                            if (var7_int == 1) {
                              if (!akb.field_a.b((byte) 87)) {
                                decompiledRegionSelector1 = 6;
                                break L0;
                              } else {
                                var7_int = ada.a("jaclib", true);
                                if ((var7_int ^ -1) != 0) {
                                  if (100 <= var7_int) {
                                    var8_int = ada.a("jaggl", true);
                                    if (0 == (var8_int ^ -1)) {
                                      var6_ref.field_b = false;
                                      break L2;
                                    } else {
                                      if (-101 >= (var8_int ^ -1)) {
                                        break L3;
                                      } else {
                                        decompiledRegionSelector1 = 8;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    decompiledRegionSelector1 = 7;
                                    break L0;
                                  }
                                } else {
                                  var6_ref.field_b = false;
                                  break L2;
                                }
                              }
                            } else {
                              if (3 == var7_int) {
                                if (akb.field_a.b((byte) -57)) {
                                  var7_int = ada.a("jaclib", true);
                                  if (var7_int == -1) {
                                    var6_ref.field_b = false;
                                    break L2;
                                  } else {
                                    if (-101 >= (var7_int ^ -1)) {
                                      var8_int = ada.a("jagdx", true);
                                      if (-1 == var8_int) {
                                        var6_ref.field_b = false;
                                        break L2;
                                      } else {
                                        if (100 <= var8_int) {
                                          var9 = ada.a("hw3d", true);
                                          if (var9 != -1) {
                                            if (var9 < 100) {
                                              decompiledRegionSelector1 = 12;
                                              break L0;
                                            } else {
                                              break L3;
                                            }
                                          } else {
                                            var6_ref.field_b = false;
                                            break L2;
                                          }
                                        } else {
                                          decompiledRegionSelector1 = 11;
                                          break L0;
                                        }
                                      }
                                    } else {
                                      decompiledRegionSelector1 = 10;
                                      break L0;
                                    }
                                  }
                                } else {
                                  decompiledRegionSelector1 = 9;
                                  break L0;
                                }
                              } else {
                                if ((var7_int ^ -1) == -3) {
                                  if (akb.field_a.b((byte) -83)) {
                                    var7_int = ada.a("jaclib", true);
                                    if (-1 == var7_int) {
                                      var6_ref.field_b = false;
                                      break L2;
                                    } else {
                                      if (-101 < (var7_int ^ -1)) {
                                        decompiledRegionSelector1 = 14;
                                        break L0;
                                      } else {
                                        var8_int = ada.a("sw3d", true);
                                        if (var8_int == -1) {
                                          var6_ref.field_b = false;
                                          break L2;
                                        } else {
                                          if (var8_int >= 100) {
                                            break L3;
                                          } else {
                                            decompiledRegionSelector1 = 15;
                                            break L0;
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    decompiledRegionSelector1 = 13;
                                    break L0;
                                  }
                                } else {
                                  throw new IllegalStateException("UT" + var6_ref.field_a);
                                }
                              }
                            }
                          } else {
                            if (!akb.field_a.b((byte) 121)) {
                              decompiledRegionSelector1 = 2;
                              break L0;
                            } else {
                              var7_int = ada.a("hw3d", true);
                              if (var7_int == -1) {
                                var6_ref.field_b = false;
                                break L2;
                              } else {
                                if (-101 >= (var7_int ^ -1)) {
                                  var8_int = ada.a("jaclib", true);
                                  if (-1 != var8_int) {
                                    if ((var8_int ^ -1) > -101) {
                                      decompiledRegionSelector1 = 4;
                                      break L0;
                                    } else {
                                      var9 = ada.a("jaggl", true);
                                      if (-1 == var9) {
                                        var6_ref.field_b = false;
                                        break L2;
                                      } else {
                                        if (var9 < 100) {
                                          decompiledRegionSelector1 = 5;
                                          break L0;
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                  } else {
                                    var6_ref.field_b = false;
                                    break L2;
                                  }
                                } else {
                                  decompiledRegionSelector1 = 3;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                      L4: {
                        if (null != this.field_e) {
                          L5: {
                            if (!this.field_e.field_b.a((byte) -94, var6_ref)) {
                              break L5;
                            } else {
                              if (null == this.field_e.field_g) {
                                break L5;
                              } else {
                                if (this.field_e.field_a != param0) {
                                  break L5;
                                } else {
                                  if (var6_ref.a(this.field_e, -78)) {
                                    this.field_d = true;
                                    decompiledRegionSelector1 = 16;
                                    break L0;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                          if (var6_ref.field_a != this.field_e.field_b.field_a) {
                            break L4;
                          } else {
                            if (this.field_e.field_g != null) {
                              var3 = this.field_e.a((byte) -126);
                              this.field_e.field_g.a((byte) 30);
                              this.field_e = null;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      try {
                        L6: {
                          L7: {
                            var11 = hr.a(false, param0, var6_ref.field_c, this.field_a, lwa.field_xb, var6_ref.field_a);
                            if (var11 == null) {
                              break L7;
                            } else {
                              var8 = new bra(var11, var6_ref, param0);
                              if (!var6_ref.a(var8, -97)) {
                                break L7;
                              } else {
                                L8: {
                                  if (this.field_e == null) {
                                    break L8;
                                  } else {
                                    L9: {
                                      if (this.field_e.field_g != var8.field_g) {
                                        break L9;
                                      } else {
                                        if (this.field_e.field_a != var8.field_a) {
                                          break L9;
                                        } else {
                                          this.field_d = true;
                                          this.field_e = var8;
                                          decompiledRegionSelector0 = 0;
                                          break L6;
                                        }
                                      }
                                    }
                                    var3 = this.field_e.a((byte) -114);
                                    this.field_e.field_g.a((byte) 30);
                                    break L8;
                                  }
                                }
                                L10: {
                                  if (var8.field_g.a()) {
                                    var8.field_g.a(var8.field_g.e(100663296));
                                    break L10;
                                  } else {
                                    break L10;
                                  }
                                }
                                L11: {
                                  if (var3 == null) {
                                    var8.field_e = wt.a(false);
                                    break L11;
                                  } else {
                                    ((t) (var3)).b(1, var8);
                                    break L11;
                                  }
                                }
                                this.field_e = var8;
                                this.field_d = true;
                                decompiledRegionSelector0 = 1;
                                break L6;
                              }
                            }
                          }
                          decompiledRegionSelector0 = 2;
                          break L6;
                        }
                      } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L12: {
                          var7 = decompiledCaughtException;
                          var7.printStackTrace();
                          decompiledRegionSelector0 = 2;
                          break L12;
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        decompiledRegionSelector1 = 17;
                        break L0;
                      } else {
                        if (decompiledRegionSelector0 == 1) {
                          decompiledRegionSelector1 = 18;
                          break L0;
                        } else {
                          var6_ref.field_b = false;
                          break L2;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector1 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L13: {
            var3 = decompiledCaughtException;
            stackOut_116_0 = var3;
            stackOut_116_1 = new StringBuilder().append("fab.E(");
            stackIn_118_0 = stackOut_116_0;
            stackIn_118_1 = stackOut_116_1;
            stackIn_117_0 = stackOut_116_0;
            stackIn_117_1 = stackOut_116_1;
            if (param0 == null) {
              stackOut_118_0 = stackIn_118_0;
              stackOut_118_1 = (StringBuilder) ((Object) stackIn_118_1);
              stackOut_118_2 = "null";
              stackIn_119_0 = stackOut_118_0;
              stackIn_119_1 = stackOut_118_1;
              stackIn_119_2 = stackOut_118_2;
              break L13;
            } else {
              stackOut_117_0 = stackIn_117_0;
              stackOut_117_1 = (StringBuilder) ((Object) stackIn_117_1);
              stackOut_117_2 = "{...}";
              stackIn_119_0 = stackOut_117_0;
              stackIn_119_1 = stackOut_117_1;
              stackIn_119_2 = stackOut_117_2;
              break L13;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_119_0), stackIn_119_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return;
            } else {
              if (decompiledRegionSelector1 == 3) {
                return;
              } else {
                if (decompiledRegionSelector1 == 4) {
                  return;
                } else {
                  if (decompiledRegionSelector1 == 5) {
                    return;
                  } else {
                    if (decompiledRegionSelector1 == 6) {
                      return;
                    } else {
                      if (decompiledRegionSelector1 == 7) {
                        return;
                      } else {
                        if (decompiledRegionSelector1 == 8) {
                          return;
                        } else {
                          if (decompiledRegionSelector1 == 9) {
                            return;
                          } else {
                            if (decompiledRegionSelector1 == 10) {
                              return;
                            } else {
                              if (decompiledRegionSelector1 == 11) {
                                return;
                              } else {
                                if (decompiledRegionSelector1 == 12) {
                                  return;
                                } else {
                                  if (decompiledRegionSelector1 == 13) {
                                    return;
                                  } else {
                                    if (decompiledRegionSelector1 == 14) {
                                      return;
                                    } else {
                                      if (decompiledRegionSelector1 == 15) {
                                        return;
                                      } else {
                                        if (decompiledRegionSelector1 == 16) {
                                          return;
                                        } else {
                                          if (decompiledRegionSelector1 == 17) {
                                            return;
                                          } else {
                                            return;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 10970) {
            field_b = (String) null;
        }
    }

    final static void a(int param0, int param1, ds param2, byte[] param3, java.math.BigInteger param4, byte param5, java.math.BigInteger param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var10 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var7_int = kob.a(param1, -18262);
              if (jo.field_a == null) {
                jo.field_a = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var13 = new int[4];
              var12 = var13;
              var8 = var12;
              if (param5 == 47) {
                break L2;
              } else {
                field_b = (String) null;
                break L2;
              }
            }
            var9 = 0;
            L3: while (true) {
              if (4 <= var9) {
                L4: {
                  L5: {
                    if (null == bt.field_a) {
                      break L5;
                    } else {
                      if (bt.field_a.field_h.length < var7_int) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  bt.field_a = new ds(var7_int);
                  break L4;
                }
                L6: {
                  L7: {
                    bt.field_a.field_e = 0;
                    bt.field_a.a(param0, param3, -1, param1);
                    bt.field_a.b(var7_int, (byte) 66);
                    bt.field_a.a(var13, (byte) 127);
                    if (null == pha.field_o) {
                      break L7;
                    } else {
                      if (pha.field_o.field_h.length < 100) {
                        break L7;
                      } else {
                        break L6;
                      }
                    }
                  }
                  pha.field_o = new ds(100);
                  break L6;
                }
                pha.field_o.field_e = 0;
                pha.field_o.c(param5 ^ 47, 10);
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if (-5 >= (var11 ^ -1)) {
                    pha.field_o.a(param1, true);
                    pha.field_o.a(param6, param4, 16711680);
                    param2.a(0, pha.field_o.field_h, -1, pha.field_o.field_e);
                    param2.a(0, bt.field_a.field_h, param5 + -48, bt.field_a.field_e);
                    break L0;
                  } else {
                    pha.field_o.d(var13[var11], param5 ^ 332614567);
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = jo.field_a.nextInt();
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var7);
            stackOut_22_1 = new StringBuilder().append("fab.G(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L9;
            }
          }
          L10: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          L11: {
            stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
            stackOut_28_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param4 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L11;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L11;
            }
          }
          L12: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param5).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param6 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L12;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L12;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ')');
        }
    }

    final void a(boolean param0, fs[] param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (!param0) {
                break L1;
              } else {
                fab.a(23);
                break L1;
              }
            }
            L2: {
              if (param1 != this.field_c) {
                if (param1.length != 0) {
                  this.field_d = false;
                  this.field_c = param1;
                  break L2;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("fab.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    fab(d param0, fs[] param1) {
        this(g.a(0), qc.b(0), param0, bm.field_o, param1);
    }

    private fab(asb param0, asb param1, d param2, eab param3, fs[] param4) {
        this.field_d = false;
        try {
            lwa.field_xb = param1;
            akb.field_a = param0;
            this.field_a = param2;
            eu.a(param3, (byte) 127, param0);
            this.a(false, param4);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "fab.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(byte param0, java.awt.Canvas param1) {
        bra var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_15_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param0 < -110) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = this.field_e;
                if (var3 == null) {
                  break L3;
                } else {
                  if (!this.field_d) {
                    break L3;
                  } else {
                    if (var3.field_a == param1) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              this.a(param1, (byte) -119);
              break L2;
            }
            L4: {
              if (null == this.field_e) {
                break L4;
              } else {
                this.field_e.field_g.c((int)(wt.a(false) + -this.field_e.field_e));
                break L4;
              }
            }
            L5: {
              L6: {
                if (this.field_e == null) {
                  break L6;
                } else {
                  L7: {
                    if (var3 == null) {
                      break L7;
                    } else {
                      if (var3.field_g == this.field_e.field_g) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  stackOut_13_0 = 1;
                  stackIn_15_0 = stackOut_13_0;
                  break L5;
                }
              }
              stackOut_14_0 = 0;
              stackIn_15_0 = stackOut_14_0;
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("fab.B(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        return stackIn_15_0 != 0;
    }

    static {
        field_b = "You cannot chat to <%0> because <%0> is not in your friend list.";
    }
}
