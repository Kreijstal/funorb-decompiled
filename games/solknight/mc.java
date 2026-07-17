/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    private int[] field_a;

    final static String a() {
        if (kj.field_R >= 2) {
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
          return jf.field_b;
        }
    }

    final int a(int param0, int param1, int param2, byte[] param3, int param4, byte[] param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int stackIn_3_0 = 0;
        int stackIn_62_0 = 0;
        RuntimeException stackIn_64_0 = null;
        StringBuilder stackIn_64_1 = null;
        RuntimeException stackIn_65_0 = null;
        StringBuilder stackIn_65_1 = null;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_66_2 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_61_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_63_0 = null;
        StringBuilder stackOut_63_1 = null;
        RuntimeException stackOut_65_0 = null;
        StringBuilder stackOut_65_1 = null;
        String stackOut_65_2 = null;
        RuntimeException stackOut_64_0 = null;
        StringBuilder stackOut_64_1 = null;
        String stackOut_64_2 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        String stackOut_68_2 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        var11 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            if (0 != param4) {
              L1: {
                var7_int = 0;
                if (param2 == 4) {
                  break L1;
                } else {
                  var12 = null;
                  int discarded$9 = ((mc) this).a(71, -42, -78, (byte[]) null, -81, (byte[]) null);
                  break L1;
                }
              }
              param4 = param4 + param0;
              var8 = param1;
              L2: while (true) {
                L3: {
                  var9 = param5[var8];
                  if (var9 >= 0) {
                    var7_int++;
                    break L3;
                  } else {
                    var7_int = ((mc) this).field_a[var7_int];
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    var10 = ((mc) this).field_a[var7_int];
                    if (((mc) this).field_a[var7_int] >= 0) {
                      break L5;
                    } else {
                      int incrementValue$10 = param0;
                      param0++;
                      param3[incrementValue$10] = (byte)(~var10);
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
                      var7_int = ((mc) this).field_a[var7_int];
                      break L6;
                    }
                  }
                  L7: {
                    var10 = ((mc) this).field_a[var7_int];
                    if (((mc) this).field_a[var7_int] >= 0) {
                      break L7;
                    } else {
                      int incrementValue$11 = param0;
                      param0++;
                      param3[incrementValue$11] = (byte)(~var10);
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
                      var7_int = ((mc) this).field_a[var7_int];
                      break L8;
                    } else {
                      var7_int++;
                      break L8;
                    }
                  }
                  L9: {
                    var10 = ((mc) this).field_a[var7_int];
                    if (((mc) this).field_a[var7_int] >= 0) {
                      break L9;
                    } else {
                      int incrementValue$12 = param0;
                      param0++;
                      param3[incrementValue$12] = (byte)(~var10);
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
                      var7_int = ((mc) this).field_a[var7_int];
                      break L10;
                    } else {
                      var7_int++;
                      break L10;
                    }
                  }
                  L11: {
                    var10 = ((mc) this).field_a[var7_int];
                    if (((mc) this).field_a[var7_int] >= 0) {
                      break L11;
                    } else {
                      int incrementValue$13 = param0;
                      param0++;
                      param3[incrementValue$13] = (byte)(~var10);
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
                      var7_int = ((mc) this).field_a[var7_int];
                      break L12;
                    } else {
                      var7_int++;
                      break L12;
                    }
                  }
                  L13: {
                    var10 = ((mc) this).field_a[var7_int];
                    if (((mc) this).field_a[var7_int] >= 0) {
                      break L13;
                    } else {
                      int incrementValue$14 = param0;
                      param0++;
                      param3[incrementValue$14] = (byte)(~var10);
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
                      var7_int = ((mc) this).field_a[var7_int];
                      break L14;
                    }
                  }
                  L15: {
                    var10 = ((mc) this).field_a[var7_int];
                    if (((mc) this).field_a[var7_int] < 0) {
                      int incrementValue$15 = param0;
                      param0++;
                      param3[incrementValue$15] = (byte)(~var10);
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
                      var7_int = ((mc) this).field_a[var7_int];
                      break L16;
                    } else {
                      var7_int++;
                      break L16;
                    }
                  }
                  L17: {
                    var10 = ((mc) this).field_a[var7_int];
                    if (((mc) this).field_a[var7_int] >= 0) {
                      break L17;
                    } else {
                      int incrementValue$16 = param0;
                      param0++;
                      param3[incrementValue$16] = (byte)(~var10);
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
                      var7_int = ((mc) this).field_a[var7_int];
                      break L18;
                    }
                  }
                  L19: {
                    var10 = ((mc) this).field_a[var7_int];
                    if (((mc) this).field_a[var7_int] < 0) {
                      int incrementValue$17 = param0;
                      param0++;
                      param3[incrementValue$17] = (byte)(~var10);
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
                stackOut_61_0 = var8 - (-1 - -param1);
                stackIn_62_0 = stackOut_61_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var7 = decompiledCaughtException;
            stackOut_63_0 = (RuntimeException) var7;
            stackOut_63_1 = new StringBuilder().append("mc.C(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_65_0 = stackOut_63_0;
            stackIn_65_1 = stackOut_63_1;
            stackIn_64_0 = stackOut_63_0;
            stackIn_64_1 = stackOut_63_1;
            if (param3 == null) {
              stackOut_65_0 = (RuntimeException) (Object) stackIn_65_0;
              stackOut_65_1 = (StringBuilder) (Object) stackIn_65_1;
              stackOut_65_2 = "null";
              stackIn_66_0 = stackOut_65_0;
              stackIn_66_1 = stackOut_65_1;
              stackIn_66_2 = stackOut_65_2;
              break L20;
            } else {
              stackOut_64_0 = (RuntimeException) (Object) stackIn_64_0;
              stackOut_64_1 = (StringBuilder) (Object) stackIn_64_1;
              stackOut_64_2 = "{...}";
              stackIn_66_0 = stackOut_64_0;
              stackIn_66_1 = stackOut_64_1;
              stackIn_66_2 = stackOut_64_2;
              break L20;
            }
          }
          L21: {
            stackOut_66_0 = (RuntimeException) (Object) stackIn_66_0;
            stackOut_66_1 = ((StringBuilder) (Object) stackIn_66_1).append(stackIn_66_2).append(44).append(param4).append(44);
            stackIn_68_0 = stackOut_66_0;
            stackIn_68_1 = stackOut_66_1;
            stackIn_67_0 = stackOut_66_0;
            stackIn_67_1 = stackOut_66_1;
            if (param5 == null) {
              stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
              stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
              stackOut_68_2 = "null";
              stackIn_69_0 = stackOut_68_0;
              stackIn_69_1 = stackOut_68_1;
              stackIn_69_2 = stackOut_68_2;
              break L21;
            } else {
              stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
              stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
              stackOut_67_2 = "{...}";
              stackIn_69_0 = stackOut_67_0;
              stackIn_69_1 = stackOut_67_1;
              stackIn_69_2 = stackOut_67_2;
              break L21;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 41);
        }
        return stackIn_62_0;
    }

    final static ia a(String param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        ia var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_9_0 = null;
        Object stackIn_12_0 = null;
        ia stackIn_18_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ia stackOut_17_0 = null;
        Object stackOut_11_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          if (null != ok.field_a) {
            if (param0 != null) {
              if (param0.length() != 0) {
                var6 = (CharSequence) (Object) param0;
                int discarded$4 = -2;
                var2 = jg.a(var6);
                if (var2 != null) {
                  var3 = (ia) (Object) ok.field_a.a((long)var2.hashCode(), true);
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_ib;
                      int discarded$5 = -2;
                      var4 = jg.a(var7);
                      if (!var4.equals((Object) (Object) var2)) {
                        var3 = (ia) (Object) ok.field_a.a((byte) -9);
                        continue L0;
                      } else {
                        stackOut_17_0 = (ia) var3;
                        stackIn_18_0 = stackOut_17_0;
                        return stackIn_18_0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_11_0 = null;
                  stackIn_12_0 = stackOut_11_0;
                  return (ia) (Object) stackIn_12_0;
                }
              } else {
                stackOut_8_0 = null;
                stackIn_9_0 = stackOut_8_0;
                return (ia) (Object) stackIn_9_0;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2_ref;
            stackOut_21_1 = new StringBuilder().append("mc.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L1;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + 105 + 41);
        }
    }

    private mc() throws Throwable {
        throw new Error();
    }

    static {
    }
}
