/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gw extends kna {
    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            super.a(param0, param1);
            if (!param0) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var3);
            stackOut_2_1 = new StringBuilder().append("gw.V(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        mfa var5 = null;
        int var6 = 0;
        int var7_int = 0;
        ki var7 = null;
        int var8 = 0;
        fsa var9 = null;
        fsa stackIn_18_0 = null;
        fsa stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_19_0 = null;
        fsa stackOut_17_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        var9 = new fsa(param2, param0);
                        var9.b((byte) -11, this.field_k, this.field_l);
                        var9.a((byte) -3, 0);
                        var9.b((byte) 17, true);
                        var5 = rm.field_a;
                        var7_int = this.r(12);
                        if (38 != var7_int) {
                          break L6;
                        } else {
                          if (var8 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if ((var7_int ^ -1) != -40) {
                          break L7;
                        } else {
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                      L8: {
                        if (var7_int != 40) {
                          break L8;
                        } else {
                          if (var8 == 0) {
                            break L3;
                          } else {
                            break L8;
                          }
                        }
                      }
                      if (41 == var7_int) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                    var6 = 1;
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L4;
                    }
                  }
                  var6 = 0;
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
                var6 = 2;
                if (var8 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var6 = 3;
              break L1;
            }
            if (param1 == 3) {
              var7 = (ki) ((Object) var5.a(14, 82));
              var7.a(true, var6);
              var9.a((gr) null, (byte) 124, var7);
              stackOut_19_0 = (fsa) (var9);
              stackIn_20_0 = stackOut_19_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_17_0 = (fsa) null;
              stackIn_18_0 = stackOut_17_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4);
            stackOut_21_1 = new StringBuilder().append("gw.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L9;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L9;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_18_0;
        } else {
          return stackIn_20_0;
        }
    }

    final boolean v(int param0) {
        int discarded$0 = 0;
        if (param0 != 555277520) {
            discarded$0 = gw.A(-113);
            return false;
        }
        return false;
    }

    final static void a(int param0, int param1, int param2, int param3, float[] param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_37_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 <= (param5 ^ -1)) {
                break L1;
              } else {
                if (cla.a(9181, param5)) {
                  break L1;
                } else {
                  throw new IllegalArgumentException("");
                }
              }
            }
            L2: {
              if ((param6 ^ -1) >= -1) {
                break L2;
              } else {
                if (!cla.a(9181, param6)) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            L3: {
              var7_int = jj.a(param0, (byte) -119);
              var8 = 0;
              if (param6 > param5) {
                stackOut_10_0 = param5;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              } else {
                stackOut_9_0 = param6;
                stackIn_11_0 = stackOut_9_0;
                break L3;
              }
            }
            var9 = stackIn_11_0;
            if (param1 > 81) {
              var10 = param5 >> -37472415;
              var11 = param6 >> -826171103;
              var12 = param4;
              var13 = new float[var11 * var10 * var7_int];
              L4: while (true) {
                jaggl.OpenGL.glTexImage2Df(param2, var8, param3, param5, param6, 0, param0, 5126, var12, 0);
                stackOut_14_0 = 1;
                stackIn_15_0 = stackOut_14_0;
                L5: while (true) {
                  L6: {
                    L7: {
                      if (stackIn_15_0 < var9) {
                        break L7;
                      } else {
                        if (var23 == 0) {
                          break L6;
                        } else {
                          break L7;
                        }
                      }
                    }
                    var16 = param5 * var7_int;
                    var17 = 0;
                    L8: while (true) {
                      stackOut_18_0 = var17 ^ -1;
                      stackIn_19_0 = stackOut_18_0;
                      L9: while (true) {
                        L10: {
                          if (stackIn_19_0 <= (var7_int ^ -1)) {
                            break L10;
                          } else {
                            var18 = var17;
                            var19 = var17;
                            var20 = var19 - -var16;
                            stackOut_20_0 = 0;
                            stackIn_15_0 = stackOut_20_0;
                            stackIn_21_0 = stackOut_20_0;
                            if (var23 != 0) {
                              continue L5;
                            } else {
                              var21 = stackIn_21_0;
                              L11: while (true) {
                                L12: {
                                  if (var21 >= var11) {
                                    break L12;
                                  } else {
                                    stackOut_23_0 = 0;
                                    stackIn_19_0 = stackOut_23_0;
                                    stackIn_24_0 = stackOut_23_0;
                                    if (var23 != 0) {
                                      continue L9;
                                    } else {
                                      var22 = stackIn_24_0;
                                      L13: while (true) {
                                        L14: {
                                          if (var10 <= var22) {
                                            var19 = var19 + var16;
                                            var20 = var20 + var16;
                                            var21++;
                                            break L14;
                                          } else {
                                            var15 = param4[var19];
                                            var19 = var19 + var7_int;
                                            var15 = var15 + param4[var19];
                                            var15 = var15 + param4[var20];
                                            var19 = var19 + var7_int;
                                            var20 = var20 + var7_int;
                                            var15 = var15 + param4[var20];
                                            var13[var18] = var15 * 0.25f;
                                            var20 = var20 + var7_int;
                                            var18 = var18 + var7_int;
                                            var22++;
                                            if (var23 != 0) {
                                              break L14;
                                            } else {
                                              continue L13;
                                            }
                                          }
                                        }
                                        if (var23 == 0) {
                                          continue L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                }
                                var17++;
                                if (var23 == 0) {
                                  continue L8;
                                } else {
                                  break L10;
                                }
                              }
                            }
                          }
                        }
                        var14 = var13;
                        var13 = var12;
                        param5 = var10;
                        var12 = var14;
                        param6 = var11;
                        var9 = var9 >> 1;
                        var8++;
                        var11 = var11 >> 1;
                        var10 = var10 >> 1;
                        if (var23 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var7 = decompiledCaughtException;
            stackOut_34_0 = (RuntimeException) (var7);
            stackOut_34_1 = new StringBuilder().append("gw.UB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_36_0 = stackOut_34_0;
            stackIn_36_1 = stackOut_34_1;
            stackIn_35_0 = stackOut_34_0;
            stackIn_35_1 = stackOut_34_1;
            if (param4 == null) {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "null";
              stackIn_37_0 = stackOut_36_0;
              stackIn_37_1 = stackOut_36_1;
              stackIn_37_2 = stackOut_36_2;
              break L15;
            } else {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "{...}";
              stackIn_37_0 = stackOut_35_0;
              stackIn_37_1 = stackOut_35_1;
              stackIn_37_2 = stackOut_35_2;
              break L15;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_37_0), stackIn_37_2 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void q(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        super.q(param0);
        var4 = this.r(12);
        if (38 != var4) {
          if ((var4 ^ -1) != -40) {
            if (40 != var4) {
              if (-42 == (var4 ^ -1)) {
                if (var5 != 0) {
                  var3 = 2;
                  var2 = 2;
                  var2 = 1;
                  var3 = 1;
                  this.b(param0 + 243, var2 * 2097152, 2097152 * var3);
                  return;
                } else {
                  var2 = 1;
                  var3 = 1;
                  this.b(param0 + 243, var2 * 2097152, 2097152 * var3);
                  return;
                }
              } else {
                var2 = 1;
                var3 = 1;
                this.b(param0 + 243, var2 * 2097152, 2097152 * var3);
                return;
              }
            } else {
              var2 = 1;
              var3 = 1;
              this.b(param0 + 243, var2 * 2097152, 2097152 * var3);
              return;
            }
          } else {
            L0: {
              var3 = 2;
              var2 = 2;
              if (var5 == 0) {
                break L0;
              } else {
                var2 = 1;
                var3 = 1;
                break L0;
              }
            }
            this.b(param0 + 243, var2 * 2097152, 2097152 * var3);
            return;
          }
        } else {
          L1: {
            var3 = 2;
            var2 = 2;
            if (var5 == 0) {
              break L1;
            } else {
              var2 = 1;
              var3 = 1;
              break L1;
            }
          }
          this.b(param0 + 243, var2 * 2097152, 2097152 * var3);
          return;
        }
    }

    final int t(int param0) {
        if (param0 != 8) {
            return -83;
        }
        return 7;
    }

    final static int A(int param0) {
        int discarded$5 = 0;
        if (param0 == -1) {
          if (lca.a(false)) {
            if (wu.field_a.a((byte) 70) == null) {
              return -1;
            } else {
              return wu.field_a.a((byte) 101).field_n;
            }
          } else {
            return -1;
          }
        } else {
          discarded$5 = gw.A(33);
          if (lca.a(false)) {
            if (wu.field_a.a((byte) 70) == null) {
              return -1;
            } else {
              return wu.field_a.a((byte) 101).field_n;
            }
          } else {
            return -1;
          }
        }
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return false;
    }

    final static void b(int param0, int param1) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        sda var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var5 = (sda) ((Object) qd.field_a.f(-80));
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = param1;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      oia.a(stackIn_4_0, var5, 127);
                      var5 = (sda) ((Object) qd.field_a.e(111));
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = 22 / ((param0 - -35) / 63);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              var3 = stackIn_6_0;
              var2 = wma.field_n.f(-80);
              L4: while (true) {
                if (var2 == null) {
                  break L0;
                } else {
                  dr.a(param1, -75);
                  var2 = wma.field_n.e(116);
                  if (var4 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2_ref), "gw.TB(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return false;
        }
        return true;
    }

    gw(la param0, int param1) {
        super(param0, param1);
    }

    gw(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    static {
    }
}
