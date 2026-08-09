/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cja {
    private vna field_a;

    final void a(byte param0) {
        no var2 = (no) ((Object) this.field_a.f(-80));
        if (param0 >= -76) {
            int[] var3 = (int[]) null;
            this.a((byte) -64, (int[]) null);
        }
        if (var2 == null) {
            return;
        }
        var2.b((byte) -38);
    }

    final static void a(int param0, int param1, ht param2, int param3, int param4, int param5, int param6, boolean param7) {
        tv[][] stackIn_32_0 = null;
        tv[][] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_76_0 = 0;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_99_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tv[] var8 = null;
        int var8_int = 0;
        RuntimeException var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        tv var13 = null;
        int var13_int = 0;
        int var14 = 0;
        int var15 = 0;
        tv[] var16 = null;
        int[] var17 = null;
        tv[] var18 = null;
        int[] var19 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > param5) {
                L2: {
                  stackIn_32_0 = bf.field_b;

                  if (0 == (param5 ^ -1)) {
                    stackIn_33_0 = (tv[][]) ((Object) stackIn_32_0);
                    stackIn_33_1 = 1;
                    break L2;
                  } else {
                    stackIn_33_0 = (tv[][]) ((Object) stackIn_32_0);
                    stackIn_33_1 = 4 - -param5;
                    break L2;
                  }
                }
                L3: {
                  var16 = stackIn_33_0[stackIn_33_1];
                  var18 = var16;
                  var8 = var18;
                  var9 = 1;
                  if (!param7) {
                    break L3;
                  } else {
                    if ((param5 ^ -1) == 0) {
                      var10 = 0;
                      L4: while (true) {
                        if (sg.field_u.length <= var10) {
                          break L3;
                        } else {
                          if (-1 != (vk.field_b[var10 / 8] & 1 << (7 & var10) ^ -1)) {
                            var9 = 0;
                            break L3;
                          } else {
                            var10++;
                            continue L4;
                          }
                        }
                      }
                    } else {
                      var10 = 0;
                      L5: while (true) {
                        L6: {
                          if (var10 >= -1 + var16.length) {
                            break L6;
                          } else {
                            if (0 != (tqa.field_e[(var10 + param3) / 8] & 1 << (param3 - -var10 & 7))) {
                              var9 = 0;
                              break L6;
                            } else {
                              var10++;
                              continue L5;
                            }
                          }
                        }
                        param3 = param3 + (um.field_m[param5] & 255);
                        break L3;
                      }
                    }
                  }
                }
                var10 = 0;
                var11 = 0;
                L7: while (true) {
                  L8: {
                    if ((param5 ^ -1) != 0) {
                      stackIn_52_0 = var18.length - 1;
                      break L8;
                    } else {
                      stackIn_52_0 = sg.field_u.length;
                      break L8;
                    }
                  }
                  if (stackIn_52_0 <= var11) {
                    if (var10 == 0) {
                      var11 = 0;
                      L9: while (true) {
                        if (var11 >= -1 + var18.length) {
                          break L1;
                        } else {
                          L10: {
                            if (param5 != -1) {
                              tba.field_m[param5] = (byte)var11;
                              break L10;
                            } else {
                              param6 = var11;
                              break L10;
                            }
                          }
                          cja.a(24, param1, param2, param3, param4, param5 + 1, param6, param7);
                          if (!rh.field_s) {
                            var11++;
                            continue L9;
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L11: {
                      if (0 == (param5 ^ -1)) {
                        param6 = var11;
                        break L11;
                      } else {
                        tba.field_m[param5] = (byte)var11;
                        break L11;
                      }
                    }
                    L12: {
                      L13: {
                        if (-1 != param5) {
                          break L13;
                        } else {
                          if (1 == sg.field_u.length) {
                            var12 = 1;
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      var13 = var8[var11 + 1];
                      if (param7) {
                        L14: {
                          if (!var13.field_cb) {
                            if (var9 != 0) {
                              if (var13.field_X) {
                                stackIn_76_0 = 1;
                                break L14;
                              } else {
                                stackIn_76_0 = 0;
                                break L14;
                              }
                            } else {
                              stackIn_76_0 = 0;
                              break L14;
                            }
                          } else {
                            stackIn_76_0 = 1;
                            break L14;
                          }
                        }
                        var12 = stackIn_76_0;
                        break L12;
                      } else {
                        L15: {
                          if (-1 == param5) {
                            if (sg.field_u[var11] != uu.field_a.field_Jb) {
                              stackIn_67_0 = 0;
                              break L15;
                            } else {
                              stackIn_67_0 = 1;
                              break L15;
                            }
                          } else {
                            if (var11 != (255 & uu.field_a.field_ac[param5])) {
                              stackIn_67_0 = 0;
                              break L15;
                            } else {
                              stackIn_67_0 = 1;
                              break L15;
                            }
                          }
                        }
                        var12 = stackIn_67_0;
                        break L12;
                      }
                    }
                    L16: {
                      if (var12 == 0) {
                        break L16;
                      } else {
                        cja.a(127, param1, param2, param3, param4, 1 + param5, param6, param7);
                        var10 = 1;
                        break L16;
                      }
                    }
                    if (rh.field_s) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var11++;
                      continue L7;
                    }
                  }
                }
              } else {
                var8_int = 1;
                var9 = 0;
                L17: while (true) {
                  if (var9 >= ce.field_A.length) {
                    if (var8_int == 0) {
                      break L1;
                    } else {
                      rh.field_s = true;
                      break L1;
                    }
                  } else {
                    var19 = ce.field_A[var9];
                    var17 = var19;
                    var10_ref_int__ = var17;
                    var11 = 0;
                    var12 = 0;
                    L18: while (true) {
                      L19: {
                        if (var12 >= var19.length) {
                          L20: {
                            if (var11 != 0) {
                              break L20;
                            } else {
                              if (param5 != fk.field_b) {
                                break L19;
                              } else {
                                break L20;
                              }
                            }
                          }
                          var8_int = 0;
                          var12 = 0;
                          L21: while (true) {
                            if (var19.length <= var12) {
                              break L19;
                            } else {
                              L22: {
                                var13_int = var19[var12];
                                if ((var13_int ^ -1) == 0) {
                                  mm.field_g = true;
                                  break L22;
                                } else {
                                  if (var13_int >= param5) {
                                    break L22;
                                  } else {
                                    sda.field_f[var13_int] = true;
                                    break L22;
                                  }
                                }
                              }
                              var12 += 2;
                              continue L21;
                            }
                          }
                        } else {
                          L23: {
                            var13_int = var19[var12];
                            var14 = var10_ref_int__[var12 + 1];
                            if (0 == (var13_int ^ -1)) {
                              if (sg.field_u[param6] != var14) {
                                break L19;
                              } else {
                                break L23;
                              }
                            } else {
                              L24: {
                                if (var13_int != param5) {
                                  break L24;
                                } else {
                                  if (param4 == var14) {
                                    var11 = 1;
                                    break L23;
                                  } else {
                                    break L24;
                                  }
                                }
                              }
                              if (var13_int >= param5) {
                                break L19;
                              } else {
                                if (var14 == (tba.field_m[var13_int] & 255)) {
                                  break L23;
                                } else {
                                  break L19;
                                }
                              }
                            }
                          }
                          var12 += 2;
                          continue L18;
                        }
                      }
                      var9++;
                      continue L17;
                    }
                  }
                }
              }
            }
            if (param0 >= 1) {
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L25: {
            var8_ref = decompiledCaughtException;
            stackIn_98_0 = (RuntimeException) (var8_ref);

            stackIn_98_1 = new StringBuilder().append("cja.D(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "null";
              break L25;
            } else {
              stackIn_99_0 = (RuntimeException) ((Object) stackIn_98_0);
              stackIn_99_1 = (StringBuilder) ((Object) stackIn_98_1);
              stackIn_99_2 = "{...}";
              break L25;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_99_0), stackIn_99_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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

    final static String a(int param0) {
        if (param0 != 0) {
            cja.a(117);
        }
        if (!(gsa.field_y != kl.field_a)) {
            return osa.field_p;
        }
        return rsa.field_u;
    }

    final void a(byte param0, int[] param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 5) {
                break L1;
              } else {
                this.field_a = (vna) null;
                break L1;
              }
            }
            var7 = param1;
            var3 = var7;
            var4 = 0;
            L2: while (true) {
              if (var7.length <= var4) {
                break L0;
              } else {
                var5 = var7[var4];
                this.field_a.b((byte) -104, new no(rba.field_a, var5));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3_ref);

            stackIn_9_1 = new StringBuilder().append("cja.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void b(byte param0) {
        if (vpa.a(param0 ^ -48) || !dma.field_l.a(param0 + -60)) {
            return;
        }
        qh var2 = rba.field_a;
        if (var2 == null) {
            return;
        }
        if (param0 != -66) {
            return;
        }
        no var3 = (no) ((Object) this.field_a.f(param0 + -14));
        if (!(var3 != null)) {
            return;
        }
        var3.a((byte) -109);
    }

    cja() {
        this.field_a = new vna();
    }

    static {
    }
}
