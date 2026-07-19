/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    static le field_e;
    private int field_b;
    static String field_a;
    private boolean field_f;
    private int field_d;
    private int[] field_c;

    final static String a(int param0) {
        if (!((vh.field_n ^ -1) <= -3)) {
            return nc.field_Z;
        }
        if (!(null == lf.field_a)) {
            if (!(lf.field_a.b(-1))) {
                return de.field_b;
            }
            return mi.field_e;
        }
        if (!(og.field_g.b(-1))) {
            return jj.field_B;
        }
        if (!og.field_g.b((byte) 91, "commonui")) {
            return kj.field_z + " - " + og.field_g.a((byte) -41, "commonui") + "%";
        }
        if (!(am.field_b.b(-1))) {
            return bk.field_a;
        }
        if (!am.field_b.b((byte) -103, "commonui")) {
            return hi.field_e + " - " + am.field_b.a((byte) -97, "commonui") + "%";
        }
        int var1 = 87 % ((param0 - -3) / 57);
        if (!wb.field_b.b(-1)) {
            return ge.field_i;
        }
        if (!(wb.field_b.c(7715))) {
            return fa.field_c + " - " + wb.field_b.a(20147) + "%";
        }
        return ql.field_f;
    }

    final int b(int param0) {
        if (param0 != 1) {
            field_e = (le) null;
            return this.field_b + 1;
        }
        return this.field_b + 1;
    }

    private final void a(int param0, int param1, int param2) {
        L0: {
          if (param0 > this.field_b) {
            this.field_b = param0;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (this.field_c.length <= param0) {
            this.a(param0, true);
            break L1;
          } else {
            break L1;
          }
        }
        this.field_c[param0] = param1;
        if (param2 != -11784) {
          this.field_f = true;
          return;
        } else {
          return;
        }
    }

    private final int c(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_10_0 = 0;
        boolean stackIn_14_0 = false;
        int stackIn_20_0 = 0;
        int stackOut_19_0 = 0;
        boolean stackOut_13_0 = false;
        int stackOut_9_0 = 0;
        boolean stackOut_3_0 = false;
        var4 = OrbDefence.field_D ? 1 : 0;
        if (param1 != -1) {
          field_e = (le) null;
          var3 = this.field_c.length;
          L0: while (true) {
            L1: {
              if (var3 > param0) {
                stackOut_19_0 = var3;
                stackIn_20_0 = stackOut_19_0;
                break L1;
              } else {
                stackOut_13_0 = this.field_f;
                stackIn_20_0 = stackOut_13_0 ? 1 : 0;
                stackIn_14_0 = stackOut_13_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_14_0) {
                    if (0 == var3) {
                      var3 = 1;
                      continue L0;
                    } else {
                      var3 = var3 * this.field_d;
                      continue L0;
                    }
                  } else {
                    var3 = var3 + this.field_d;
                    continue L0;
                  }
                }
              }
            }
            return stackIn_20_0;
          }
        } else {
          var3 = this.field_c.length;
          L2: while (true) {
            L3: {
              if (var3 > param0) {
                stackOut_9_0 = var3;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_3_0 = this.field_f;
                stackIn_10_0 = stackOut_3_0 ? 1 : 0;
                stackIn_4_0 = stackOut_3_0;
                if (var4 != 0) {
                  break L3;
                } else {
                  if (stackIn_4_0) {
                    if (0 == var3) {
                      var3 = 1;
                      continue L2;
                    } else {
                      var3 = var3 * this.field_d;
                      continue L2;
                    }
                  } else {
                    var3 = var3 + this.field_d;
                    continue L2;
                  }
                }
              }
            }
            return stackIn_10_0;
          }
        }
    }

    final int a(boolean param0, int param1) {
        if (param0) {
          if (this.field_b < param1) {
            throw new ArrayIndexOutOfBoundsException(param1);
          } else {
            return this.field_c[param1];
          }
        } else {
          this.field_b = -70;
          if (this.field_b < param1) {
            throw new ArrayIndexOutOfBoundsException(param1);
          } else {
            return this.field_c[param1];
          }
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        var4 = 0;
        if (!param2) {
          if (!param1) {
            if (param0 != -14189) {
              return (String) null;
            } else {
              L0: {
                if (param3) {
                  var4++;
                  break L0;
                } else {
                  break L0;
                }
              }
              return ee.field_d[var4];
            }
          } else {
            var4 += 2;
            if (param0 != -14189) {
              return (String) null;
            } else {
              L1: {
                if (param3) {
                  var4++;
                  break L1;
                } else {
                  break L1;
                }
              }
              return ee.field_d[var4];
            }
          }
        } else {
          var4 += 4;
          if (param1) {
            var4 += 2;
            if (param0 != -14189) {
              return (String) null;
            } else {
              L2: {
                if (param3) {
                  var4++;
                  break L2;
                } else {
                  break L2;
                }
              }
              return ee.field_d[var4];
            }
          } else {
            if (param0 != -14189) {
              return (String) null;
            } else {
              L3: {
                if (param3) {
                  var4++;
                  break L3;
                } else {
                  break L3;
                }
              }
              return ee.field_d[var4];
            }
          }
        }
    }

    final static void a(be param0, java.awt.Frame param1, int param2) {
        boolean discarded$1 = false;
        eb var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        CharSequence var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3 = param0.a((byte) -120, param1);
              L2: while (true) {
                L3: {
                  L4: {
                    L5: {
                      if (-1 != (var3.field_a ^ -1)) {
                        break L5;
                      } else {
                        hb.a(10L, 109);
                        if (var4 != 0) {
                          break L4;
                        } else {
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    if ((var3.field_a ^ -1) != -2) {
                      hb.a(100L, 101);
                      break L4;
                    } else {
                      if (var4 == 0) {
                        break L3;
                      } else {
                        hb.a(100L, 101);
                        break L4;
                      }
                    }
                  }
                  if (var4 == 0) {
                    continue L1;
                  } else {
                    break L3;
                  }
                }
                param1.setVisible(false);
                param1.dispose();
                if (param2 == -23144) {
                  break L0;
                } else {
                  var5 = (CharSequence) null;
                  discarded$1 = tj.a(false, -4, (CharSequence) null);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var3_ref);
            stackOut_15_1 = new StringBuilder().append("tj.F(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        int[] var3 = null;
        int[] var4 = null;
        if (!param1) {
          field_a = (String) null;
          var4 = new int[this.c(param0, -1)];
          var3 = var4;
          mk.a(this.field_c, 0, var4, 0, this.field_c.length);
          this.field_c = var4;
          return;
        } else {
          var4 = new int[this.c(param0, -1)];
          var3 = var4;
          mk.a(this.field_c, 0, var4, 0, this.field_c.length);
          this.field_c = var4;
          return;
        }
    }

    public static void a(byte param0) {
        String discarded$0 = null;
        field_e = null;
        field_a = null;
        if (param0 != -58) {
            discarded$0 = tj.a(28);
        }
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        int incrementValue$2 = 0;
        char[] var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        String stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var12 = new char[param0];
            var11 = var12;
            var10 = var11;
            var4 = var10;
            var5 = 0;
            var6 = param2;
            L1: while (true) {
              if (var6 >= param0) {
                stackOut_14_0 = new String(var12, 0, var5);
                stackIn_15_0 = stackOut_14_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    var7 = 255 & param3[var6 + param1];
                    if (-1 != (var7 ^ -1)) {
                      break L3;
                    } else {
                      if (var9 == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (128 > var7) {
                      break L4;
                    } else {
                      if (var7 >= 160) {
                        break L4;
                      } else {
                        L5: {
                          var8 = fe.field_a[var7 - 128];
                          if (var8 == 0) {
                            var8 = 63;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        var7 = var8;
                        break L4;
                      }
                    }
                  }
                  incrementValue$2 = var5;
                  var5++;
                  var10[incrementValue$2] = (char)var7;
                  break L2;
                }
                var6++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var4_ref);
            stackOut_16_1 = new StringBuilder().append("tj.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
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
          throw dd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        return stackIn_15_0;
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_6_0 = false;
        int stackOut_9_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (vl.a(param0, param2, -125)) {
              var3_int = param1;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3_int >= param2.length()) {
                      break L3;
                    } else {
                      stackOut_6_0 = vg.a(param2.charAt(var3_int), -22118);
                      stackIn_13_0 = stackOut_6_0 ? 1 : 0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (!stackIn_7_0) {
                          stackOut_9_0 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          var3_int++;
                          if (var4 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = 1;
                  stackIn_13_0 = stackOut_12_0;
                  break L2;
                }
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
          L4: {
            var3 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3);
            stackOut_14_1 = new StringBuilder().append("tj.A(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final void b(int param0, int param1) {
        this.a(this.field_b + param0, param1, param0 ^ -11783);
    }

    final static hj c(int param0) {
        int var1 = 0;
        int[] var3 = null;
        int var4_int = 0;
        hj var4 = null;
        int var5 = 0;
        byte[] var7 = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        var1 = wh.field_b[0] * m.field_a[0];
        var7 = fl.field_a[0];
        var3 = new int[var1];
        if (param0 < 95) {
          field_a = (String) null;
          var4_int = 0;
          L0: while (true) {
            L1: {
              if (var4_int >= var1) {
                break L1;
              } else {
                var3[var4_int] = vc.field_g[vi.a(255, (int) var7[var4_int])];
                var4_int++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = new hj(sg.field_B, he.field_r, jd.field_g[0], wc.field_a[0], wh.field_b[0], m.field_a[0], var3);
            md.a((byte) -125);
            return var4;
          }
        } else {
          var4_int = 0;
          L2: while (true) {
            L3: {
              if (var4_int >= var1) {
                break L3;
              } else {
                var3[var4_int] = vc.field_g[vi.a(255, (int) var7[var4_int])];
                var4_int++;
                if (var5 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = new hj(sg.field_B, he.field_r, jd.field_g[0], wc.field_a[0], wh.field_b[0], m.field_a[0], var3);
            md.a((byte) -125);
            return var4;
          }
        }
    }

    private tj() throws Throwable {
        throw new Error();
    }

    final void a(int param0, int param1) {
        String discarded$1 = null;
        if (-1 >= (param0 ^ -1)) {
          if (this.field_b >= param0) {
            if (param1 == -3344) {
              if (param0 != this.field_b) {
                mk.a(this.field_c, 1 + param0, this.field_c, param0, this.field_b + -param0);
                this.field_b = this.field_b - 1;
                return;
              } else {
                this.field_b = this.field_b - 1;
                return;
              }
            } else {
              discarded$1 = tj.a(-117);
              if (param0 != this.field_b) {
                mk.a(this.field_c, 1 + param0, this.field_c, param0, this.field_b + -param0);
                this.field_b = this.field_b - 1;
                return;
              } else {
                this.field_b = this.field_b - 1;
                return;
              }
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param0);
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param0);
        }
    }

    static {
        field_a = null;
        field_e = new le();
    }
}
