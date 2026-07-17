/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cja {
    private vna field_a;

    final void a(byte param0) {
        no var2 = (no) (Object) ((cja) this).field_a.f(-80);
        if (param0 >= -76) {
            Object var3 = null;
            ((cja) this).a((byte) -64, (int[]) null);
        }
        if (var2 == null) {
            return;
        }
        var2.b((byte) -38);
    }

    final static void a(int param0, int param1, ht param2, int param3, int param4, int param5, int param6, boolean param7) {
        RuntimeException var8 = null;
        int var8_int = 0;
        tv[] var8_array = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        tv var13 = null;
        int var14 = 0;
        int var15 = 0;
        tv[] var16 = null;
        int[] var17 = null;
        tv[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        tv[][] stackIn_31_0 = null;
        tv[][] stackIn_32_0 = null;
        tv[][] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        String stackIn_97_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        tv[][] stackOut_30_0 = null;
        tv[][] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        tv[][] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > param5) {
                L2: {
                  stackOut_30_0 = bf.field_b;
                  stackIn_32_0 = stackOut_30_0;
                  stackIn_31_0 = stackOut_30_0;
                  if (param5 == -1) {
                    stackOut_32_0 = (tv[][]) (Object) stackIn_32_0;
                    stackOut_32_1 = 1;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    break L2;
                  } else {
                    stackOut_31_0 = (tv[][]) (Object) stackIn_31_0;
                    stackOut_31_1 = 4 - -param5;
                    stackIn_33_0 = stackOut_31_0;
                    stackIn_33_1 = stackOut_31_1;
                    break L2;
                  }
                }
                L3: {
                  var16 = stackIn_33_0[stackIn_33_1];
                  var18 = var16;
                  var8_array = var18;
                  var9 = 1;
                  if (!param7) {
                    break L3;
                  } else {
                    if (param5 == -1) {
                      var10 = 0;
                      L4: while (true) {
                        if (~sg.field_u.length >= ~var10) {
                          break L3;
                        } else {
                          if ((vk.field_b[var10 / 8] & 1 << (7 & var10)) != 0) {
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
                          if (~var10 <= ~(-1 + var16.length)) {
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
                    if (param5 != -1) {
                      stackOut_51_0 = var18.length - 1;
                      stackIn_52_0 = stackOut_51_0;
                      break L8;
                    } else {
                      stackOut_50_0 = sg.field_u.length;
                      stackIn_52_0 = stackOut_50_0;
                      break L8;
                    }
                  }
                  if (stackIn_52_0 <= var11) {
                    if (var10 == 0) {
                      var11 = 0;
                      L9: while (true) {
                        if (~var11 <= ~(-1 + var18.length)) {
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
                            return;
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    L11: {
                      if (param5 == -1) {
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
                      var13 = var8_array[var11 + 1];
                      if (param7) {
                        L14: {
                          L15: {
                            if (var13.field_cb) {
                              break L15;
                            } else {
                              L16: {
                                if (var9 == 0) {
                                  break L16;
                                } else {
                                  if (!var13.field_X) {
                                    break L16;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              stackOut_73_0 = 0;
                              stackIn_74_0 = stackOut_73_0;
                              break L14;
                            }
                          }
                          stackOut_72_0 = 1;
                          stackIn_74_0 = stackOut_72_0;
                          break L14;
                        }
                        var12 = stackIn_74_0;
                        break L12;
                      } else {
                        L17: {
                          if (-1 == param5) {
                            if (~sg.field_u[var11] != ~uu.field_a.field_Jb) {
                              stackOut_66_0 = 0;
                              stackIn_67_0 = stackOut_66_0;
                              break L17;
                            } else {
                              stackOut_65_0 = 1;
                              stackIn_67_0 = stackOut_65_0;
                              break L17;
                            }
                          } else {
                            if (~var11 != ~(255 & uu.field_a.field_ac[param5])) {
                              stackOut_63_0 = 0;
                              stackIn_67_0 = stackOut_63_0;
                              break L17;
                            } else {
                              stackOut_62_0 = 1;
                              stackIn_67_0 = stackOut_62_0;
                              break L17;
                            }
                          }
                        }
                        var12 = stackIn_67_0;
                        break L12;
                      }
                    }
                    L18: {
                      if (var12 == 0) {
                        break L18;
                      } else {
                        cja.a(127, param1, param2, param3, param4, 1 + param5, param6, param7);
                        var10 = 1;
                        break L18;
                      }
                    }
                    if (rh.field_s) {
                      return;
                    } else {
                      var11++;
                      continue L7;
                    }
                  }
                }
              } else {
                var8_int = 1;
                var9 = 0;
                L19: while (true) {
                  if (~var9 <= ~ce.field_A.length) {
                    if (var8_int == 0) {
                      break L1;
                    } else {
                      rh.field_s = true;
                      break L1;
                    }
                  } else {
                    var21 = ce.field_A[var9];
                    var20 = var21;
                    var19 = var20;
                    var17 = var19;
                    var10_ref_int__ = var17;
                    var11 = 0;
                    var12 = 0;
                    L20: while (true) {
                      L21: {
                        if (~var12 <= ~var21.length) {
                          L22: {
                            if (var11 != 0) {
                              break L22;
                            } else {
                              if (param5 != fk.field_b) {
                                break L21;
                              } else {
                                break L22;
                              }
                            }
                          }
                          var8_int = 0;
                          var12 = 0;
                          L23: while (true) {
                            if (var21.length <= var12) {
                              break L21;
                            } else {
                              L24: {
                                var13_int = var21[var12];
                                if (var13_int == -1) {
                                  mm.field_g = true;
                                  break L24;
                                } else {
                                  if (~var13_int <= ~param5) {
                                    break L24;
                                  } else {
                                    sda.field_f[var13_int] = true;
                                    break L24;
                                  }
                                }
                              }
                              var12 += 2;
                              continue L23;
                            }
                          }
                        } else {
                          L25: {
                            var13_int = var21[var12];
                            var14 = var10_ref_int__[var12 + 1];
                            if (var13_int == -1) {
                              if (sg.field_u[param6] != var14) {
                                break L21;
                              } else {
                                break L25;
                              }
                            } else {
                              L26: {
                                if (~var13_int != ~param5) {
                                  break L26;
                                } else {
                                  if (param4 == var14) {
                                    var11 = 1;
                                    break L25;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                              if (~var13_int <= ~param5) {
                                break L21;
                              } else {
                                if (~var14 == ~(tba.field_m[var13_int] & 255)) {
                                  break L25;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          var12 += 2;
                          continue L20;
                        }
                      }
                      var9++;
                      continue L19;
                    }
                  }
                }
              }
            }
            if (param0 >= 1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L27: {
            var8 = decompiledCaughtException;
            stackOut_94_0 = (RuntimeException) var8;
            stackOut_94_1 = new StringBuilder().append("cja.D(").append(param0).append(44).append(param1).append(44);
            stackIn_96_0 = stackOut_94_0;
            stackIn_96_1 = stackOut_94_1;
            stackIn_95_0 = stackOut_94_0;
            stackIn_95_1 = stackOut_94_1;
            if (param2 == null) {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "null";
              stackIn_97_0 = stackOut_96_0;
              stackIn_97_1 = stackOut_96_1;
              stackIn_97_2 = stackOut_96_2;
              break L27;
            } else {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "{...}";
              stackIn_97_0 = stackOut_95_0;
              stackIn_97_1 = stackOut_95_1;
              stackIn_97_2 = stackOut_95_2;
              break L27;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_97_0, stackIn_97_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 41);
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(int param0) {
        if (param0 != 0) {
            String discarded$0 = cja.a(117);
        }
        if (!(gsa.field_y != kl.field_a)) {
            return osa.field_p;
        }
        return rsa.field_u;
    }

    final void a(byte param0, int[] param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 > 5) {
                break L1;
              } else {
                ((cja) this).field_a = null;
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
                ((cja) this).field_a.b((byte) -104, (vg) (Object) new no(rba.field_a, var5));
                var4++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("cja.E(").append(param0).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
    }

    final void b(byte param0) {
        qh var2 = null;
        no var3 = null;
        L0: {
          if (vpa.a(param0 ^ -48)) {
            break L0;
          } else {
            if (dma.field_l.a(param0 + -60)) {
              var2 = rba.field_a;
              if (var2 != null) {
                if (param0 == -66) {
                  var3 = (no) (Object) ((cja) this).field_a.f(param0 + -14);
                  if (var3 == null) {
                    return;
                  } else {
                    var3.a((byte) -109);
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
    }

    cja() {
        ((cja) this).field_a = new vna();
    }

    static {
    }
}
