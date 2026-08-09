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
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_3_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        StringBuilder stackIn_80_1 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
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
                  this.a(71, -42, -78, (byte[]) null, -81, (byte[]) null);
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
                    dupTemp$0 = this.field_a[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L6;
                    } else {
                      incrementValue$1 = param0;
                      param0++;
                      param3[incrementValue$1] = (byte)(var10 ^ -1);
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
                    dupTemp$2 = this.field_a[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L8;
                    } else {
                      incrementValue$3 = param0;
                      param0++;
                      param3[incrementValue$3] = (byte)(var10 ^ -1);
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
                    dupTemp$4 = this.field_a[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 >= 0) {
                      break L11;
                    } else {
                      L12: {
                        incrementValue$5 = param0;
                        param0++;
                        param3[incrementValue$5] = (byte)(var10 ^ -1);
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
                    dupTemp$6 = this.field_a[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 >= 0) {
                      break L15;
                    } else {
                      incrementValue$7 = param0;
                      param0++;
                      param3[incrementValue$7] = (byte)(var10 ^ -1);
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
                    dupTemp$8 = this.field_a[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 >= 0) {
                      break L18;
                    } else {
                      L19: {
                        incrementValue$9 = param0;
                        param0++;
                        param3[incrementValue$9] = (byte)(var10 ^ -1);
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
                    dupTemp$10 = this.field_a[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 < 0) {
                      L22: {
                        incrementValue$11 = param0;
                        param0++;
                        param3[incrementValue$11] = (byte)(var10 ^ -1);
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
                    dupTemp$12 = this.field_a[var7_int];
                    var10 = dupTemp$12;
                    if (dupTemp$12 >= 0) {
                      break L25;
                    } else {
                      incrementValue$13 = param0;
                      param0++;
                      param3[incrementValue$13] = (byte)(var10 ^ -1);
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
                    dupTemp$14 = this.field_a[var7_int];
                    var10 = dupTemp$14;
                    if (-1 < (dupTemp$14 ^ -1)) {
                      incrementValue$15 = param0;
                      param0++;
                      param3[incrementValue$15] = (byte)(var10 ^ -1);
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
                  if (var11 == 0) {
                    continue L2;
                  } else {
                    break L5;
                  }
                }
                stackIn_74_0 = var8 - (-1 - -param1);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L28: {
            var7 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var7);

            stackIn_77_1 = new StringBuilder().append("mc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L28;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L28;
            }
          }
          L29: {


            stackIn_80_1 = ((StringBuilder) (Object) stackIn_78_1).append(stackIn_78_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L29;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_78_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L29;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_78_0), stackIn_81_2 + ')');
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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                              stackIn_22_0 = null;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          } else {
                            stackIn_19_0 = (ia) (var3);
                            decompiledRegionSelector0 = 3;
                            break L0;
                          }
                        } else {
                          return null;
                        }
                      }
                    } else {
                      stackIn_13_0 = null;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    }
                  } else {
                    stackIn_10_0 = null;
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
              stackIn_3_0 = (ia) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2_ref);

            stackIn_25_1 = new StringBuilder().append("mc.A(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L2;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
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
