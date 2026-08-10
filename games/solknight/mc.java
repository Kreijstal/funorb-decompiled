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
        int stackIn_62_0 = 0;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        StringBuilder stackIn_68_1 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
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
                  var9 = param5[var8];
                  if ((var9 ^ -1) <= -1) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = this.field_a[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    dupTemp$0 = this.field_a[var7_int];
                    var10 = dupTemp$0;
                    if (dupTemp$0 >= 0) {
                      break L5;
                    } else {
                      incrementValue$1 = param0;
                      param0++;
                      param3[incrementValue$1] = (byte)(var10 ^ -1);
                      if (param4 <= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (0 == (64 & var9)) {
                      var7_int++;
                      break L6;
                    } else {
                      var7_int = this.field_a[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    dupTemp$2 = this.field_a[var7_int];
                    var10 = dupTemp$2;
                    if (dupTemp$2 >= 0) {
                      break L7;
                    } else {
                      incrementValue$3 = param0;
                      param0++;
                      param3[incrementValue$3] = (byte)(var10 ^ -1);
                      if (param4 <= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    if ((var9 & 32) != 0) {
                      var7_int = this.field_a[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    dupTemp$4 = this.field_a[var7_int];
                    var10 = dupTemp$4;
                    if (dupTemp$4 >= 0) {
                      break L9;
                    } else {
                      incrementValue$5 = param0;
                      param0++;
                      param3[incrementValue$5] = (byte)(var10 ^ -1);
                      if (param4 > param0) {
                        var7_int = 0;
                        break L9;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L10: {
                    if ((var9 & 16) != 0) {
                      var7_int = this.field_a[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    dupTemp$6 = this.field_a[var7_int];
                    var10 = dupTemp$6;
                    if (dupTemp$6 >= 0) {
                      break L11;
                    } else {
                      incrementValue$7 = param0;
                      param0++;
                      param3[incrementValue$7] = (byte)(var10 ^ -1);
                      if (param0 >= param4) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    if ((8 & var9) != 0) {
                      var7_int = this.field_a[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    dupTemp$8 = this.field_a[var7_int];
                    var10 = dupTemp$8;
                    if (dupTemp$8 >= 0) {
                      break L13;
                    } else {
                      incrementValue$9 = param0;
                      param0++;
                      param3[incrementValue$9] = (byte)(var10 ^ -1);
                      if (param0 < param4) {
                        var7_int = 0;
                        break L13;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L14: {
                    if ((var9 & 4) == 0) {
                      var7_int++;
                      break L14;
                    } else {
                      var7_int = this.field_a[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    dupTemp$10 = this.field_a[var7_int];
                    var10 = dupTemp$10;
                    if (dupTemp$10 < 0) {
                      incrementValue$11 = param0;
                      param0++;
                      param3[incrementValue$11] = (byte)(var10 ^ -1);
                      if (param0 < param4) {
                        var7_int = 0;
                        break L15;
                      } else {
                        return var8 - (-1 - -param1);
                      }
                    } else {
                      break L15;
                    }
                  }
                  L16: {
                    if ((2 & var9) != 0) {
                      var7_int = this.field_a[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    dupTemp$12 = this.field_a[var7_int];
                    var10 = dupTemp$12;
                    if (dupTemp$12 >= 0) {
                      break L17;
                    } else {
                      incrementValue$13 = param0;
                      param0++;
                      param3[incrementValue$13] = (byte)(var10 ^ -1);
                      if (param4 <= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L17;
                      }
                    }
                  }
                  L18: {
                    if (0 == (var9 & 1)) {
                      var7_int++;
                      break L18;
                    } else {
                      var7_int = this.field_a[var7_int];
                      break L18;
                    }
                  }
                  L19: {
                    dupTemp$14 = this.field_a[var7_int];
                    var10 = dupTemp$14;
                    if (-1 < (dupTemp$14 ^ -1)) {
                      incrementValue$15 = param0;
                      param0++;
                      param3[incrementValue$15] = (byte)(var10 ^ -1);
                      if (param4 <= param0) {
                        break L4;
                      } else {
                        var7_int = 0;
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  var8++;
                  continue L2;
                }
                stackIn_62_0 = var8 - (-1 - -param1);
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
          L20: {
            var7 = decompiledCaughtException;
            stackIn_65_0 = (RuntimeException) (var7);

            stackIn_65_1 = new StringBuilder().append("mc.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "null";
              break L20;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_65_0);
              stackIn_66_1 = (StringBuilder) ((Object) stackIn_65_1);
              stackIn_66_2 = "{...}";
              break L20;
            }
          }
          L21: {


            stackIn_68_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "null";
              break L21;
            } else {
              stackIn_66_0 = (RuntimeException) ((Object) stackIn_66_0);
              stackIn_69_1 = (StringBuilder) ((Object) stackIn_68_1);
              stackIn_69_2 = "{...}";
              break L21;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_66_0), stackIn_69_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_62_0;
        }
    }

    final static ia a(String param0, byte param1) {
        String var2 = null;
        ia var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        ia stackIn_3_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        ia stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
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
                            continue L1;
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
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("mc.A(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L2;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L2;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
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
              return stackIn_19_0;
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
