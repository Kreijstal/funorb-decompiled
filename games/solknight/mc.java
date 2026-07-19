/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    private int[] field_a;

    final static String a(int param0) {
        if (kj.field_R >= 2) {
          if (param0 <= -98) {
            if (af.field_c != null) {
              if (!af.field_c.c((byte) -121)) {
                return wa.field_a;
              } else {
                return uf.field_r;
              }
            } else {
              if (lh.field_o.c((byte) -121)) {
                if (!lh.field_o.a(2, "commonui")) {
                  return vb.field_i + " - " + lh.field_o.d(-1, "commonui") + "%";
                } else {
                  if (wk.field_c.c((byte) -121)) {
                    if (!wk.field_c.a(2, "commonui")) {
                      return qb.field_bb + " - " + wk.field_c.d(-1, "commonui") + "%";
                    } else {
                      if (jk.field_ub.c((byte) -121)) {
                        if (!jk.field_ub.b(true)) {
                          return li.field_j + " - " + jk.field_ub.b((byte) -66) + "%";
                        } else {
                          return qf.field_g;
                        }
                      } else {
                        return bg.field_t;
                      }
                    }
                  } else {
                    return ri.field_d;
                  }
                }
              } else {
                return r.field_e;
              }
            }
          } else {
            return (String) null;
          }
        } else {
          return jf.field_b;
        }
    }

    final int a(int param0, int param1, int param2, byte[] param3, int param4, byte[] param5) {
        int discarded$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_73_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (0 != param4) {
              L1: {
                var7_int = 0;
                if (param2 == 4) {
                  break L1;
                } else {
                  var12 = (byte[]) null;
                  discarded$9 = this.a(71, -42, -78, (byte[]) null, -81, (byte[]) null);
                  break L1;
                }
              }
              param4 = param4 + param0;
              var8 = param1;
              L2: while (true) {
                L3: {
                  L4: {
                    var9 = param5[var8];
                    if ((var9 ^ -1) <= -1) {
                      break L4;
                    } else {
                      var7_int = this.field_a[var7_int];
                      if (var11 != 0) {
                        break L3;
                      } else {
                        if (var11 == 0) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var7_int++;
                  break L3;
                }
                L5: {
                  L6: {
                    var10 = this.field_a[var7_int];
                    if (this.field_a[var7_int] >= 0) {
                      break L6;
                    } else {
                      incrementValue$10 = param0;
                      param0++;
                      param3[incrementValue$10] = (byte)(var10 ^ -1);
                      if (param4 <= param0) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L6;
                      }
                    }
                  }
                  L7: {
                    if (0 != (64 & var9)) {
                      var7_int = this.field_a[var7_int];
                      if (var11 == 0) {
                        break L7;
                      } else {
                        var7_int++;
                        break L7;
                      }
                    } else {
                      var7_int++;
                      break L7;
                    }
                  }
                  L8: {
                    var10 = this.field_a[var7_int];
                    if (this.field_a[var7_int] >= 0) {
                      break L8;
                    } else {
                      incrementValue$11 = param0;
                      param0++;
                      param3[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param4 <= param0) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L8;
                      }
                    }
                  }
                  L9: {
                    L10: {
                      if ((var9 & 32) != 0) {
                        break L10;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L9;
                        } else {
                          break L10;
                        }
                      }
                    }
                    var7_int = this.field_a[var7_int];
                    break L9;
                  }
                  L11: {
                    var10 = this.field_a[var7_int];
                    if (this.field_a[var7_int] >= 0) {
                      break L11;
                    } else {
                      L12: {
                        incrementValue$12 = param0;
                        param0++;
                        param3[incrementValue$12] = (byte)(var10 ^ -1);
                        if (param4 > param0) {
                          break L12;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L12;
                          }
                        }
                      }
                      var7_int = 0;
                      break L11;
                    }
                  }
                  L13: {
                    L14: {
                      if ((var9 & 16) != 0) {
                        break L14;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    var7_int = this.field_a[var7_int];
                    break L13;
                  }
                  L15: {
                    var10 = this.field_a[var7_int];
                    if (this.field_a[var7_int] >= 0) {
                      break L15;
                    } else {
                      incrementValue$13 = param0;
                      param0++;
                      param3[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param0 >= param4) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L15;
                      }
                    }
                  }
                  L16: {
                    L17: {
                      if ((8 & var9) != 0) {
                        break L17;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    var7_int = this.field_a[var7_int];
                    break L16;
                  }
                  L18: {
                    var10 = this.field_a[var7_int];
                    if (this.field_a[var7_int] >= 0) {
                      break L18;
                    } else {
                      L19: {
                        incrementValue$14 = param0;
                        param0++;
                        param3[incrementValue$14] = (byte)(var10 ^ -1);
                        if (param0 < param4) {
                          break L19;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L19;
                          }
                        }
                      }
                      var7_int = 0;
                      break L18;
                    }
                  }
                  L20: {
                    if ((var9 & 4) != 0) {
                      var7_int = this.field_a[var7_int];
                      if (var11 == 0) {
                        break L20;
                      } else {
                        var7_int++;
                        break L20;
                      }
                    } else {
                      var7_int++;
                      break L20;
                    }
                  }
                  L21: {
                    var10 = this.field_a[var7_int];
                    if (this.field_a[var7_int] < 0) {
                      L22: {
                        incrementValue$15 = param0;
                        param0++;
                        param3[incrementValue$15] = (byte)(var10 ^ -1);
                        if (param0 < param4) {
                          break L22;
                        } else {
                          if (var11 == 0) {
                            break L5;
                          } else {
                            break L22;
                          }
                        }
                      }
                      var7_int = 0;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L23: {
                    L24: {
                      if ((2 & var9) != 0) {
                        break L24;
                      } else {
                        var7_int++;
                        if (var11 == 0) {
                          break L23;
                        } else {
                          break L24;
                        }
                      }
                    }
                    var7_int = this.field_a[var7_int];
                    break L23;
                  }
                  L25: {
                    var10 = this.field_a[var7_int];
                    if (this.field_a[var7_int] >= 0) {
                      break L25;
                    } else {
                      incrementValue$16 = param0;
                      param0++;
                      param3[incrementValue$16] = (byte)(var10 ^ -1);
                      if (param4 <= param0) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L25;
                      }
                    }
                  }
                  L26: {
                    if (0 != (var9 & 1)) {
                      var7_int = this.field_a[var7_int];
                      if (var11 == 0) {
                        break L26;
                      } else {
                        var7_int++;
                        break L26;
                      }
                    } else {
                      var7_int++;
                      break L26;
                    }
                  }
                  L27: {
                    var10 = this.field_a[var7_int];
                    if (-1 < (this.field_a[var7_int] ^ -1)) {
                      incrementValue$17 = param0;
                      param0++;
                      param3[incrementValue$17] = (byte)(var10 ^ -1);
                      if (param4 <= param0) {
                        break L5;
                      } else {
                        var7_int = 0;
                        break L27;
                      }
                    } else {
                      break L27;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackOut_73_0 = var8 - (-1 - -param1);
                stackIn_74_0 = stackOut_73_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var7 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) (var7);
            stackOut_75_1 = new StringBuilder().append("mc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param3 == null) {
              stackOut_77_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackOut_77_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L28;
            } else {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L28;
            }
          }
          L29: {
            stackOut_78_0 = (RuntimeException) ((Object) stackIn_78_0);
            stackOut_78_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param4).append(',');
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param5 == null) {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L29;
            } else {
              stackOut_79_0 = (RuntimeException) ((Object) stackIn_79_0);
              stackOut_79_1 = (StringBuilder) ((Object) stackIn_79_1);
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L29;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_74_0;
        }
    }

    final static ia a(String param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ia var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ia stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        ia stackIn_19_0 = null;
        Object stackIn_22_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_21_0 = null;
        ia stackOut_18_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_9_0 = null;
        ia stackOut_2_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (param1 == 105) {
              if (null != ok.field_a) {
                if (param0 != null) {
                  if (param0.length() != 0) {
                    var6 = (CharSequence) ((Object) param0);
                    var2 = jg.a(var6, -2);
                    if (var2 != null) {
                      var3 = (ia) ((Object) ok.field_a.a((long)var2.hashCode(), true));
                      L1: while (true) {
                        if (var3 != null) {
                          var7 = (CharSequence) ((Object) var3.field_ib);
                          var4 = jg.a(var7, param1 ^ -105);
                          if (!var4.equals(var2)) {
                            var3 = (ia) ((Object) ok.field_a.a((byte) -9));
                            if (var5 == 0) {
                              continue L1;
                            } else {
                              stackOut_21_0 = null;
                              stackIn_22_0 = stackOut_21_0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          } else {
                            stackOut_18_0 = (ia) (var3);
                            stackIn_19_0 = stackOut_18_0;
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      stackOut_12_0 = null;
                      stackIn_13_0 = stackOut_12_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackOut_9_0 = null;
                    stackIn_10_0 = stackOut_9_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              stackOut_2_0 = (ia) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var2_ref);
            stackOut_23_1 = new StringBuilder().append("mc.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L2;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (ia) ((Object) stackIn_10_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (ia) ((Object) stackIn_13_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_19_0;
              } else {
                return (ia) ((Object) stackIn_22_0);
              }
            }
          }
        }
    }

    private mc() throws Throwable {
        throw new Error();
    }

    static {
    }
}
