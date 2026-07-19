/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cja {
    private vna field_a;

    final void a(byte param0) {
        no var2 = (no) ((Object) this.field_a.f(-80));
        if (param0 >= -76) {
            this.a((byte) -64, (int[]) null);
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
        int var10 = 0;
        int[] var10_ref_int__ = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        tv var13 = null;
        int var14 = 0;
        int var15 = 0;
        tv[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_37_0 = 0;
        tv[][] stackIn_41_0 = null;
        tv[][] stackIn_42_0 = null;
        tv[][] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_48_0 = 0;
        int stackIn_48_1 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackIn_58_0 = 0;
        int stackIn_58_1 = 0;
        int stackIn_66_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        RuntimeException stackIn_116_0 = null;
        StringBuilder stackIn_116_1 = null;
        RuntimeException stackIn_117_0 = null;
        StringBuilder stackIn_117_1 = null;
        RuntimeException stackIn_118_0 = null;
        StringBuilder stackIn_118_1 = null;
        String stackIn_118_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_36_0 = 0;
        tv[][] stackOut_40_0 = null;
        tv[][] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        tv[][] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_47_1 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_57_0 = 0;
        int stackOut_57_1 = 0;
        int stackOut_67_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        RuntimeException stackOut_115_0 = null;
        StringBuilder stackOut_115_1 = null;
        RuntimeException stackOut_117_0 = null;
        StringBuilder stackOut_117_1 = null;
        String stackOut_117_2 = null;
        RuntimeException stackOut_116_0 = null;
        StringBuilder stackOut_116_1 = null;
        String stackOut_116_2 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  if (param1 > param5) {
                    break L3;
                  } else {
                    var8_int = 1;
                    var9 = 0;
                    L4: while (true) {
                      stackOut_3_0 = var9 ^ -1;
                      stackIn_4_0 = stackOut_3_0;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (stackIn_4_0 <= (ce.field_A.length ^ -1)) {
                              break L7;
                            } else {
                              var18 = ce.field_A[var9];
                              var17 = var18;
                              var10_ref_int__ = var17;
                              var11 = 0;
                              stackOut_5_0 = 0;
                              stackIn_37_0 = stackOut_5_0;
                              stackIn_6_0 = stackOut_5_0;
                              if (var15 != 0) {
                                break L6;
                              } else {
                                var12 = stackIn_6_0;
                                L8: while (true) {
                                  L9: {
                                    L10: {
                                      L11: {
                                        if ((var12 ^ -1) <= (var18.length ^ -1)) {
                                          break L11;
                                        } else {
                                          var13_int = var18[var12];
                                          var14 = var10_ref_int__[var12 + 1];
                                          stackOut_8_0 = 0;
                                          stackOut_8_1 = var13_int ^ -1;
                                          stackIn_27_0 = stackOut_8_0;
                                          stackIn_27_1 = stackOut_8_1;
                                          stackIn_9_0 = stackOut_8_0;
                                          stackIn_9_1 = stackOut_8_1;
                                          if (var15 != 0) {
                                            break L10;
                                          } else {
                                            L12: {
                                              L13: {
                                                if (stackIn_9_0 == stackIn_9_1) {
                                                  break L13;
                                                } else {
                                                  L14: {
                                                    L15: {
                                                      if ((var13_int ^ -1) != (param5 ^ -1)) {
                                                        break L15;
                                                      } else {
                                                        if (param4 == var14) {
                                                          break L14;
                                                        } else {
                                                          break L15;
                                                        }
                                                      }
                                                    }
                                                    if ((var13_int ^ -1) <= (param5 ^ -1)) {
                                                      break L9;
                                                    } else {
                                                      if ((var14 ^ -1) == (tba.field_m[var13_int] & 255 ^ -1)) {
                                                        break L12;
                                                      } else {
                                                        if (var15 == 0) {
                                                          break L9;
                                                        } else {
                                                          break L14;
                                                        }
                                                      }
                                                    }
                                                  }
                                                  var11 = 1;
                                                  if (var15 == 0) {
                                                    break L12;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                              if (sg.field_u[param6] != var14) {
                                                break L9;
                                              } else {
                                                break L12;
                                              }
                                            }
                                            var12 += 2;
                                            if (var15 == 0) {
                                              continue L8;
                                            } else {
                                              break L11;
                                            }
                                          }
                                        }
                                      }
                                      L16: {
                                        if (var11 != 0) {
                                          break L16;
                                        } else {
                                          if (param5 != fk.field_b) {
                                            break L9;
                                          } else {
                                            break L16;
                                          }
                                        }
                                      }
                                      var8_int = 0;
                                      var12 = 0;
                                      stackOut_26_0 = var18.length;
                                      stackOut_26_1 = var12;
                                      stackIn_27_0 = stackOut_26_0;
                                      stackIn_27_1 = stackOut_26_1;
                                      break L10;
                                    }
                                    L17: while (true) {
                                      if (stackIn_27_0 <= stackIn_27_1) {
                                        break L9;
                                      } else {
                                        var13_int = var18[var12];
                                        stackOut_28_0 = var13_int ^ -1;
                                        stackIn_4_0 = stackOut_28_0;
                                        stackIn_29_0 = stackOut_28_0;
                                        if (var15 != 0) {
                                          continue L5;
                                        } else {
                                          L18: {
                                            L19: {
                                              if (stackIn_29_0 == 0) {
                                                break L19;
                                              } else {
                                                if ((var13_int ^ -1) <= (param5 ^ -1)) {
                                                  break L18;
                                                } else {
                                                  sda.field_f[var13_int] = true;
                                                  if (var15 == 0) {
                                                    break L18;
                                                  } else {
                                                    break L19;
                                                  }
                                                }
                                              }
                                            }
                                            mm.field_g = true;
                                            break L18;
                                          }
                                          var12 += 2;
                                          if (var15 == 0) {
                                            stackOut_26_0 = var18.length;
                                            stackOut_26_1 = var12;
                                            stackIn_27_0 = stackOut_26_0;
                                            stackIn_27_1 = stackOut_26_1;
                                            continue L17;
                                          } else {
                                            break L9;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  var9++;
                                  if (var15 == 0) {
                                    continue L4;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_36_0 = var8_int;
                          stackIn_37_0 = stackOut_36_0;
                          break L6;
                        }
                        L20: {
                          if (stackIn_37_0 == 0) {
                            break L20;
                          } else {
                            rh.field_s = true;
                            break L20;
                          }
                        }
                        if (var15 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                L21: {
                  stackOut_40_0 = bf.field_b;
                  stackIn_42_0 = stackOut_40_0;
                  stackIn_41_0 = stackOut_40_0;
                  if (0 == (param5 ^ -1)) {
                    stackOut_42_0 = (tv[][]) ((Object) stackIn_42_0);
                    stackOut_42_1 = 1;
                    stackIn_43_0 = stackOut_42_0;
                    stackIn_43_1 = stackOut_42_1;
                    break L21;
                  } else {
                    stackOut_41_0 = (tv[][]) ((Object) stackIn_41_0);
                    stackOut_41_1 = 4 - -param5;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    break L21;
                  }
                }
                L22: {
                  var16 = stackIn_43_0[stackIn_43_1];
                  var8_array = var16;
                  var9 = 1;
                  if (!param7) {
                    break L22;
                  } else {
                    L23: {
                      if ((param5 ^ -1) == 0) {
                        break L23;
                      } else {
                        var10 = 0;
                        L24: while (true) {
                          L25: {
                            L26: {
                              if ((var10 ^ -1) <= (-1 + var16.length ^ -1)) {
                                break L26;
                              } else {
                                stackOut_47_0 = 0;
                                stackOut_47_1 = tqa.field_e[(var10 + param3) / 8] & 1 << (param3 - -var10 & 7);
                                stackIn_54_0 = stackOut_47_0;
                                stackIn_54_1 = stackOut_47_1;
                                stackIn_48_0 = stackOut_47_0;
                                stackIn_48_1 = stackOut_47_1;
                                if (var15 != 0) {
                                  break L25;
                                } else {
                                  L27: {
                                    if (stackIn_48_0 != stackIn_48_1) {
                                      var9 = 0;
                                      if (var15 == 0) {
                                        break L26;
                                      } else {
                                        break L27;
                                      }
                                    } else {
                                      break L27;
                                    }
                                  }
                                  var10++;
                                  if (var15 == 0) {
                                    continue L24;
                                  } else {
                                    break L26;
                                  }
                                }
                              }
                            }
                            stackOut_53_0 = param3;
                            stackOut_53_1 = um.field_m[param5] & 255;
                            stackIn_54_0 = stackOut_53_0;
                            stackIn_54_1 = stackOut_53_1;
                            break L25;
                          }
                          param3 = stackIn_54_0 + stackIn_54_1;
                          if (var15 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    var10 = 0;
                    L28: while (true) {
                      if ((sg.field_u.length ^ -1) >= (var10 ^ -1)) {
                        break L22;
                      } else {
                        stackOut_57_0 = -1;
                        stackOut_57_1 = vk.field_b[var10 / 8] & 1 << (7 & var10) ^ -1;
                        stackIn_113_0 = stackOut_57_0;
                        stackIn_113_1 = stackOut_57_1;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        if (var15 != 0) {
                          break L1;
                        } else {
                          L29: {
                            if (stackIn_58_0 != stackIn_58_1) {
                              var9 = 0;
                              if (var15 == 0) {
                                break L22;
                              } else {
                                break L29;
                              }
                            } else {
                              break L29;
                            }
                          }
                          var10++;
                          if (var15 == 0) {
                            continue L28;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                  }
                }
                var10 = 0;
                var11 = 0;
                L30: while (true) {
                  L31: {
                    L32: {
                      if ((param5 ^ -1) != 0) {
                        stackOut_67_0 = var16.length;
                        stackIn_68_0 = stackOut_67_0;
                        break L32;
                      } else {
                        stackOut_65_0 = sg.field_u.length;
                        stackIn_68_0 = stackOut_65_0;
                        stackIn_66_0 = stackOut_65_0;
                        if (var15 != 0) {
                          break L32;
                        } else {
                          stackOut_66_0 = stackIn_66_0;
                          stackIn_69_0 = stackOut_66_0;
                          break L31;
                        }
                      }
                    }
                    stackOut_68_0 = stackIn_68_0 - 1;
                    stackIn_69_0 = stackOut_68_0;
                    break L31;
                  }
                  L33: {
                    if (stackIn_69_0 <= var11) {
                      break L33;
                    } else {
                      L34: {
                        L35: {
                          if (0 == (param5 ^ -1)) {
                            break L35;
                          } else {
                            tba.field_m[param5] = (byte)var11;
                            if (var15 == 0) {
                              break L34;
                            } else {
                              break L35;
                            }
                          }
                        }
                        param6 = var11;
                        break L34;
                      }
                      L36: {
                        L37: {
                          L38: {
                            if (-1 != param5) {
                              break L38;
                            } else {
                              if (1 == sg.field_u.length) {
                                break L37;
                              } else {
                                break L38;
                              }
                            }
                          }
                          L39: {
                            L40: {
                              var13 = var16[var11 + 1];
                              if (param7) {
                                break L40;
                              } else {
                                L41: {
                                  if (-1 == param5) {
                                    if ((sg.field_u[var11] ^ -1) != (uu.field_a.field_Jb ^ -1)) {
                                      stackOut_84_0 = 0;
                                      stackIn_85_0 = stackOut_84_0;
                                      break L41;
                                    } else {
                                      stackOut_83_0 = 1;
                                      stackIn_85_0 = stackOut_83_0;
                                      break L41;
                                    }
                                  } else {
                                    if ((var11 ^ -1) != (255 & uu.field_a.field_ac[param5] ^ -1)) {
                                      stackOut_81_0 = 0;
                                      stackIn_85_0 = stackOut_81_0;
                                      break L41;
                                    } else {
                                      stackOut_80_0 = 1;
                                      stackIn_85_0 = stackOut_80_0;
                                      break L41;
                                    }
                                  }
                                }
                                var12 = stackIn_85_0;
                                if (var15 == 0) {
                                  break L39;
                                } else {
                                  break L40;
                                }
                              }
                            }
                            L42: {
                              L43: {
                                if (var13.field_cb) {
                                  break L43;
                                } else {
                                  L44: {
                                    if (var9 == 0) {
                                      break L44;
                                    } else {
                                      if (!var13.field_X) {
                                        break L44;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                  stackOut_91_0 = 0;
                                  stackIn_92_0 = stackOut_91_0;
                                  break L42;
                                }
                              }
                              stackOut_90_0 = 1;
                              stackIn_92_0 = stackOut_90_0;
                              break L42;
                            }
                            var12 = stackIn_92_0;
                            break L39;
                          }
                          if (var15 == 0) {
                            break L36;
                          } else {
                            break L37;
                          }
                        }
                        var12 = 1;
                        break L36;
                      }
                      L45: {
                        if (var12 == 0) {
                          break L45;
                        } else {
                          cja.a(127, param1, param2, param3, param4, 1 + param5, param6, param7);
                          var10 = 1;
                          break L45;
                        }
                      }
                      if (rh.field_s) {
                        decompiledRegionSelector0 = 0;
                        break L0;
                      } else {
                        var11++;
                        if (var15 == 0) {
                          continue L30;
                        } else {
                          break L33;
                        }
                      }
                    }
                  }
                  if (var10 == 0) {
                    var11 = 0;
                    L46: while (true) {
                      if ((var11 ^ -1) <= (-1 + var16.length ^ -1)) {
                        break L2;
                      } else {
                        stackOut_105_0 = param5;
                        stackOut_105_1 = -1;
                        stackIn_113_0 = stackOut_105_0;
                        stackIn_113_1 = stackOut_105_1;
                        stackIn_106_0 = stackOut_105_0;
                        stackIn_106_1 = stackOut_105_1;
                        if (var15 != 0) {
                          break L1;
                        } else {
                          L47: {
                            L48: {
                              if (stackIn_106_0 != stackIn_106_1) {
                                break L48;
                              } else {
                                param6 = var11;
                                if (var15 == 0) {
                                  break L47;
                                } else {
                                  break L48;
                                }
                              }
                            }
                            tba.field_m[param5] = (byte)var11;
                            break L47;
                          }
                          cja.a(24, param1, param2, param3, param4, param5 + 1, param6, param7);
                          if (!rh.field_s) {
                            var11++;
                            if (var15 == 0) {
                              continue L46;
                            } else {
                              break L2;
                            }
                          } else {
                            decompiledRegionSelector0 = 1;
                            break L0;
                          }
                        }
                      }
                    }
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_112_0 = param0;
              stackOut_112_1 = 1;
              stackIn_113_0 = stackOut_112_0;
              stackIn_113_1 = stackOut_112_1;
              break L1;
            }
            if (stackIn_113_0 >= stackIn_113_1) {
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 3;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L49: {
            var8 = decompiledCaughtException;
            stackOut_115_0 = (RuntimeException) (var8);
            stackOut_115_1 = new StringBuilder().append("cja.D(").append(param0).append(',').append(param1).append(',');
            stackIn_117_0 = stackOut_115_0;
            stackIn_117_1 = stackOut_115_1;
            stackIn_116_0 = stackOut_115_0;
            stackIn_116_1 = stackOut_115_1;
            if (param2 == null) {
              stackOut_117_0 = (RuntimeException) ((Object) stackIn_117_0);
              stackOut_117_1 = (StringBuilder) ((Object) stackIn_117_1);
              stackOut_117_2 = "null";
              stackIn_118_0 = stackOut_117_0;
              stackIn_118_1 = stackOut_117_1;
              stackIn_118_2 = stackOut_117_2;
              break L49;
            } else {
              stackOut_116_0 = (RuntimeException) ((Object) stackIn_116_0);
              stackOut_116_1 = (StringBuilder) ((Object) stackIn_116_1);
              stackOut_116_2 = "{...}";
              stackIn_118_0 = stackOut_116_0;
              stackIn_118_1 = stackOut_116_1;
              stackIn_118_2 = stackOut_116_2;
              break L49;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_118_0), stackIn_118_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
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
        String discarded$0 = null;
        if (param0 != 0) {
            discarded$0 = cja.a(117);
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
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
              L3: {
                if ((var7.length ^ -1) >= (var4 ^ -1)) {
                  break L3;
                } else {
                  var5 = var7[var4];
                  this.field_a.b((byte) -104, new no(rba.field_a, var5));
                  var4++;
                  if (var6 != 0) {
                    break L3;
                  } else {
                    if (var6 == 0) {
                      continue L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("cja.E(").append(param0).append(',');
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
          throw tba.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
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
                  var3 = (no) ((Object) this.field_a.f(param0 + -14));
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
        this.field_a = new vna();
    }

    static {
    }
}
