/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cb {
    static ri field_e;
    private ms field_f;
    static boolean field_b;
    static wc[] field_a;
    private jn field_d;
    static int field_c;

    final ms b(byte param0) {
        ms discarded$2 = null;
        ms var2 = null;
        var2 = this.field_d.field_e.field_b;
        if (this.field_d.field_e != var2) {
          this.field_f = var2.field_b;
          if (param0 != -80) {
            discarded$2 = this.b((byte) -128);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_f = null;
          return null;
        }
    }

    final ms a(byte param0) {
        ms discarded$2 = null;
        ms var2 = null;
        var2 = this.field_d.field_e.field_g;
        if (this.field_d.field_e != var2) {
          this.field_f = var2.field_g;
          if (param0 >= -13) {
            discarded$2 = this.a((byte) -67);
            return var2;
          } else {
            return var2;
          }
        } else {
          this.field_f = null;
          return null;
        }
    }

    final ms c(byte param0) {
        ms var2 = null;
        var2 = this.field_f;
        if (this.field_d.field_e != var2) {
          this.field_f = var2.field_g;
          if (param0 != 87) {
            return (ms) null;
          } else {
            return var2;
          }
        } else {
          this.field_f = null;
          return null;
        }
    }

    final ms b(int param0) {
        ms var2 = null;
        if (param0 == 0) {
          var2 = this.field_f;
          if (this.field_d.field_e == var2) {
            this.field_f = null;
            return null;
          } else {
            this.field_f = var2.field_b;
            return var2;
          }
        } else {
          return (ms) null;
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          L1: {
            var6 = Sumoblitz.field_L ? 1 : 0;
            var2 = 0;
            var3 = td.field_u;
            if ((var3 ^ -1) <= -6) {
              break L1;
            } else {
              var2 = var3 * var3 * 8192 / 1100;
              if (var6 == 0) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (-106 < (var3 ^ -1)) {
              break L2;
            } else {
              if ((var3 ^ -1) <= -121) {
                break L0;
              } else {
                var3 = -var3 + 120;
                var2 = -(var3 * var3 * 8192 / 3300) + 8192;
                if (var6 == 0) {
                  break L0;
                } else {
                  break L2;
                }
              }
            }
          }
          var2 = (-40960 + var3 * 16384) / 220;
          break L0;
        }
        if (param0 == 79) {
          L3: {
            var4 = 1;
            var5 = 0;
            if ((param1 ^ -1) == -4) {
              var4 = -1;
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (param1 != 1) {
              break L4;
            } else {
              var5 = 1;
              break L4;
            }
          }
          L5: {
            if (param1 == 4) {
              var5 = 1;
              var4 = 1;
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (5 == param1) {
              var4 = -1;
              var5 = 1;
              break L6;
            } else {
              break L6;
            }
          }
          L7: {
            if (-7 == (param1 ^ -1)) {
              var4 = 1;
              var5 = -1;
              break L7;
            } else {
              break L7;
            }
          }
          if ((param1 ^ -1) != -8) {
            if (8 == param1) {
              L8: {
                var5 = -1;
                var4 = -1;
                if (-12 == (param1 ^ -1)) {
                  var4 = -1;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if ((param1 ^ -1) == -13) {
                  var4 = -1;
                  var5 = -1;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (-14 == (param1 ^ -1)) {
                  var4 = 1;
                  var5 = -1;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (-15 == (param1 ^ -1)) {
                  var5 = 1;
                  var4 = -1;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if ((param1 ^ -1) != -16) {
                  break L12;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L12;
                }
              }
              uc.field_b = pm.a(83, var2 * var5, var4 * var2);
              return;
            } else {
              L13: {
                if (-12 == (param1 ^ -1)) {
                  var4 = -1;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if ((param1 ^ -1) == -13) {
                  var4 = -1;
                  var5 = -1;
                  break L14;
                } else {
                  break L14;
                }
              }
              L15: {
                if (-14 == (param1 ^ -1)) {
                  var4 = 1;
                  var5 = -1;
                  break L15;
                } else {
                  break L15;
                }
              }
              L16: {
                if (-15 == (param1 ^ -1)) {
                  var5 = 1;
                  var4 = -1;
                  break L16;
                } else {
                  break L16;
                }
              }
              L17: {
                if ((param1 ^ -1) != -16) {
                  break L17;
                } else {
                  var5 = 1;
                  var4 = 1;
                  break L17;
                }
              }
              uc.field_b = pm.a(83, var2 * var5, var4 * var2);
              return;
            }
          } else {
            L18: {
              var5 = -1;
              var4 = -1;
              if (-12 == (param1 ^ -1)) {
                var4 = -1;
                break L18;
              } else {
                break L18;
              }
            }
            L19: {
              if ((param1 ^ -1) == -13) {
                var4 = -1;
                var5 = -1;
                break L19;
              } else {
                break L19;
              }
            }
            L20: {
              if (-14 == (param1 ^ -1)) {
                var4 = 1;
                var5 = -1;
                break L20;
              } else {
                break L20;
              }
            }
            L21: {
              if (-15 == (param1 ^ -1)) {
                var5 = 1;
                var4 = -1;
                break L21;
              } else {
                break L21;
              }
            }
            L22: {
              if ((param1 ^ -1) != -16) {
                break L22;
              } else {
                var5 = 1;
                var4 = 1;
                break L22;
              }
            }
            uc.field_b = pm.a(83, var2 * var5, var4 * var2);
            return;
          }
        } else {
          return;
        }
    }

    final static void a(cd[] param0, boolean param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        cd var4 = null;
        int var5 = 0;
        int var6 = 0;
        cd[] var7 = null;
        int stackIn_5_0 = 0;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_10_0 = false;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var6 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = param0.length;
              if (param1) {
                break L1;
              } else {
                var7 = (cd[]) null;
                cb.a((cd[]) null, true);
                break L1;
              }
            }
            var3 = 1;
            L2: while (true) {
              stackOut_4_0 = var2_int ^ -1;
              stackIn_5_0 = stackOut_4_0;
              L3: while (true) {
                if (stackIn_5_0 >= (var3 ^ -1)) {
                  break L0;
                } else {
                  var4 = param0[var3];
                  if (var6 == 0) {
                    var5 = var3 + -1;
                    L4: while (true) {
                      L5: {
                        if (-1 < (var5 ^ -1)) {
                          break L5;
                        } else {
                          stackOut_10_0 = da.a(param0[var5], -114, var4);
                          stackIn_5_0 = stackOut_10_0 ? 1 : 0;
                          stackIn_11_0 = stackOut_10_0;
                          if (var6 != 0) {
                            continue L3;
                          } else {
                            if (!stackIn_11_0) {
                              break L5;
                            } else {
                              param0[var5 - -1] = param0[var5];
                              var5--;
                              continue L4;
                            }
                          }
                        }
                      }
                      param0[1 + var5] = var4;
                      var3++;
                      continue L2;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("cb.A(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
    }

    final ms a(int param0, ms param1) {
        ms var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_6_0 = null;
        ms stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        ms stackOut_7_0 = null;
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
              L2: {
                var4 = 2 / ((57 - param0) / 41);
                if (param1 != null) {
                  break L2;
                } else {
                  var3 = this.field_d.field_e.field_b;
                  if (!Sumoblitz.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = param1;
              break L1;
            }
            if (var3 == this.field_d.field_e) {
              this.field_f = null;
              stackOut_5_0 = null;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              this.field_f = var3.field_b;
              stackOut_7_0 = (ms) (var3);
              stackIn_8_0 = stackOut_7_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3_ref);
            stackOut_9_1 = new StringBuilder().append("cb.K(").append(param0).append(',');
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
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ms) ((Object) stackIn_6_0);
        } else {
          return stackIn_8_0;
        }
    }

    final ms a(byte param0, ms param1) {
        ms var3 = null;
        RuntimeException var3_ref = null;
        ms stackIn_5_0 = null;
        Object stackIn_9_0 = null;
        ms stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_8_0 = null;
        ms stackOut_10_0 = null;
        ms stackOut_4_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 == null) {
                  break L2;
                } else {
                  var3 = param1;
                  if (!Sumoblitz.field_L) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              var3 = this.field_d.field_e.field_g;
              break L1;
            }
            if (param0 == -70) {
              if (var3 == this.field_d.field_e) {
                this.field_f = null;
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                this.field_f = var3.field_g;
                stackOut_10_0 = (ms) (var3);
                stackIn_11_0 = stackOut_10_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_4_0 = (ms) null;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("cb.D(").append(param0).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ms) ((Object) stackIn_9_0);
          } else {
            return stackIn_11_0;
          }
        }
    }

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Sumoblitz.field_L ? 1 : 0;
        var2 = in.field_z;
        te.field_c = te.field_c + param0;
        if (param1 == -1372239541) {
          in.field_z = in.field_z + param0;
          if (-6 >= (gj.a((byte) -84, 10) ^ -1)) {
            if (gj.a((byte) -84, 10) >= 5) {
              L0: {
                ha.field_f = ha.field_f - param0;
                if (-50001 >= (var2 ^ -1)) {
                  break L0;
                } else {
                  if ((in.field_z ^ -1) > -50001) {
                    break L0;
                  } else {
                    if (!gt.field_bb) {
                      th.b(24753, 241, 14);
                      break L0;
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            } else {
              fb.field_a = fb.field_a - param0;
              if (var3 == 0) {
                L1: {
                  if (-50001 >= (var2 ^ -1)) {
                    break L1;
                  } else {
                    if ((in.field_z ^ -1) > -50001) {
                      break L1;
                    } else {
                      if (!gt.field_bb) {
                        th.b(24753, 241, 14);
                        break L1;
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                L2: {
                  ha.field_f = ha.field_f - param0;
                  if (-50001 >= (var2 ^ -1)) {
                    break L2;
                  } else {
                    if ((in.field_z ^ -1) > -50001) {
                      break L2;
                    } else {
                      if (!gt.field_bb) {
                        th.b(24753, 241, 14);
                        break L2;
                      } else {
                        return;
                      }
                    }
                  }
                }
                return;
              }
            }
          } else {
            if (5 > gj.a((byte) -84, 10)) {
              ts.field_a = ts.field_a + param0;
              if (var3 != 0) {
                if (gj.a((byte) -84, 10) >= 5) {
                  ha.field_f = ha.field_f - param0;
                  if (-50001 < (var2 ^ -1)) {
                    L3: {
                      if ((in.field_z ^ -1) > -50001) {
                        break L3;
                      } else {
                        if (!gt.field_bb) {
                          th.b(24753, 241, 14);
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                    return;
                  } else {
                    return;
                  }
                } else {
                  fb.field_a = fb.field_a - param0;
                  if (var3 == 0) {
                    L4: {
                      if (-50001 >= (var2 ^ -1)) {
                        break L4;
                      } else {
                        if ((in.field_z ^ -1) > -50001) {
                          break L4;
                        } else {
                          if (!gt.field_bb) {
                            th.b(24753, 241, 14);
                            break L4;
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    return;
                  } else {
                    ha.field_f = ha.field_f - param0;
                    if (-50001 < (var2 ^ -1)) {
                      if ((in.field_z ^ -1) <= -50001) {
                        if (!gt.field_bb) {
                          th.b(24753, 241, 14);
                          return;
                        } else {
                          return;
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
                if (-50001 < (var2 ^ -1)) {
                  if ((in.field_z ^ -1) <= -50001) {
                    if (!gt.field_bb) {
                      th.b(24753, 241, 14);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              kn.field_b = kn.field_b + param0;
              if (var3 != 0) {
                ts.field_a = ts.field_a + param0;
                if (var3 != 0) {
                  if (gj.a((byte) -84, 10) >= 5) {
                    ha.field_f = ha.field_f - param0;
                    if (-50001 < (var2 ^ -1)) {
                      if ((in.field_z ^ -1) <= -50001) {
                        if (gt.field_bb) {
                          return;
                        } else {
                          th.b(24753, 241, 14);
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    fb.field_a = fb.field_a - param0;
                    if (var3 == 0) {
                      if (-50001 < (var2 ^ -1)) {
                        if ((in.field_z ^ -1) <= -50001) {
                          if (!gt.field_bb) {
                            th.b(24753, 241, 14);
                            return;
                          } else {
                            return;
                          }
                        } else {
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      ha.field_f = ha.field_f - param0;
                      if (-50001 < (var2 ^ -1)) {
                        if ((in.field_z ^ -1) <= -50001) {
                          if (gt.field_bb) {
                            return;
                          } else {
                            th.b(24753, 241, 14);
                            return;
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
                  if (-50001 < (var2 ^ -1)) {
                    if ((in.field_z ^ -1) <= -50001) {
                      if (gt.field_bb) {
                        return;
                      } else {
                        th.b(24753, 241, 14);
                        return;
                      }
                    } else {
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                if (-50001 < (var2 ^ -1)) {
                  if ((in.field_z ^ -1) <= -50001) {
                    if (gt.field_bb) {
                      return;
                    } else {
                      th.b(24753, 241, 14);
                      return;
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
        } else {
          return;
        }
    }

    final static int b(int param0, int param1) {
        L0: {
          if (param0 == -22415) {
            break L0;
          } else {
            cb.a((byte) 82, -115);
            break L0;
          }
        }
        if (65536L <= (long)param1) {
          if (16777216L > (long)param1) {
            if (-1048577L >= ((long)param1 ^ -1L)) {
              if ((long)param1 < 4194304L) {
                return hu.field_f[param1 >> -746475698] >> -535806395;
              } else {
                return hu.field_f[param1 >> 1444537168] >> 1080564932;
              }
            } else {
              if (262144L > (long)param1) {
                return hu.field_f[param1 >> -2121967222] >> -614625401;
              } else {
                return hu.field_f[param1 >> 1963359212] >> -528172346;
              }
            }
          } else {
            if ((long)param1 >= 268435456L) {
              if (1073741824L > (long)param1) {
                return hu.field_f[param1 >> 1338504022] >> 1691900129;
              } else {
                return hu.field_f[param1 >> -891168296];
              }
            } else {
              if ((long)param1 < 67108864L) {
                return hu.field_f[param1 >> -853248078] >> -425801949;
              } else {
                return hu.field_f[param1 >> -1384583532] >> -1719810270;
              }
            }
          }
        } else {
          if ((long)param1 >= 256L) {
            if (((long)param1 ^ -1L) <= -4097L) {
              if (-16385L >= ((long)param1 ^ -1L)) {
                return hu.field_f[param1 >> 961492648] >> -1940505240;
              } else {
                return hu.field_f[param1 >> 1120969414] >> 300181609;
              }
            } else {
              if (((long)param1 ^ -1L) <= -1025L) {
                return hu.field_f[param1 >> -1246279388] >> 2141391498;
              } else {
                return hu.field_f[param1 >> 1343968610] >> -1372239541;
              }
            }
          } else {
            if (0 <= param1) {
              return hu.field_f[param1] >> -1983039732;
            } else {
              return -1;
            }
          }
        }
    }

    public static void a(int param0) {
        int discarded$0 = 0;
        field_e = null;
        if (param0 != -1384583532) {
            discarded$0 = cb.b(67, -59);
            field_a = null;
            return;
        }
        field_a = null;
    }

    cb(jn param0) {
        try {
            this.field_d = param0;
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "cb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = true;
    }
}
