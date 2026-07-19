/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fh {
    static String field_b;
    int field_f;
    java.awt.Image field_a;
    int[] field_d;
    static boolean field_c;
    int field_e;

    final void a(int param0) {
        if (param0 != -40) {
          this.field_e = -67;
          ul.a(this.field_d, this.field_e, this.field_f);
          return;
        } else {
          ul.a(this.field_d, this.field_e, this.field_f);
          return;
        }
    }

    final static gj a(int param0, int param1, int param2, int param3, byte param4) {
        gj var5 = null;
        int var6 = 0;
        int var7 = 0;
        gj var8 = null;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        var5 = (gj) ((Object) cb.field_b.b((byte) -106));
        L0: while (true) {
          if (var5 != null) {
            stackOut_3_0 = var5.field_o;
            stackOut_3_1 = param2;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (var7 == 0) {
              if (stackIn_5_0 == stackIn_5_1) {
                return var5;
              } else {
                var5 = (gj) ((Object) cb.field_b.d(853));
                continue L0;
              }
            } else {
              var6 = stackIn_4_0 / stackIn_4_1;
              var5.field_m = param3;
              var5.field_n = param0;
              cb.field_b.a(-92, var5);
              se.a(var5, param1, -38);
              return var5;
            }
          } else {
            var8 = new gj();
            var5 = var8;
            var8.field_o = param2;
            var6 = 102 / ((41 - param4) / 45);
            var5.field_m = param3;
            var5.field_n = param0;
            cb.field_b.a(-92, var5);
            se.a(var5, param1, -38);
            return var5;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            Object discarded$1 = null;
            Throwable var2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (param0 == 17489) {
                  discarded$1 = gm.a(true, "resizing", new Object[]{new Integer(param1)}, uj.b((byte) -120));
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L1: {
                var2 = decompiledCaughtException;
                decompiledRegionSelector0 = 1;
                break L1;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(int param0, int param1, java.awt.Graphics param2, boolean param3);

    public static void a(byte param0) {
        field_b = null;
        if (param0 > -26) {
            field_c = true;
        }
    }

    final static void a(ki param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        wd var5 = null;
        int[] var6 = null;
        int var7 = 0;
        se var8 = null;
        se var9 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var8 = new se(param0.a("", 1, "logo.fo3d"));
              var9 = var8;
              var3 = var9.b((byte) 90);
              var9.n(9471);
              cg.field_c = mc.a(12, var9);
              if (param1 == -237) {
                break L1;
              } else {
                fh.a((byte) -39);
                break L1;
              }
            }
            tc.field_a = new wd[var3];
            ne.field_a = new int[var3][];
            var4 = 0;
            L2: while (true) {
              L3: {
                if (var3 <= var4) {
                  var9.m(param1 ^ -236);
                  break L3;
                } else {
                  tc.field_a[var4] = f.a(var8, 16);
                  var4++;
                  if (var7 != 0) {
                    break L3;
                  } else {
                    continue L2;
                  }
                }
              }
              var4 = 0;
              L4: while (true) {
                if (var3 <= var4) {
                  break L0;
                } else {
                  var5 = tc.field_a[var4];
                  var5.a(3940, 6, 6, 6, 1);
                  var5.a(2);
                  var6 = new int[]{var5.field_d + var5.field_P >> -1872967935, var5.field_J + var5.field_F >> -1580754783, var5.field_v - -var5.field_z >> -619516767};
                  ne.field_a[var4] = var6;
                  var5.a((byte) 7, -var6[1], -var6[2], -var6[0]);
                  var4++;
                  if (var7 == 0) {
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
          L5: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("fh.I(");
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
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
    }

    abstract void a(int param0, int param1, int param2, java.awt.Component param3);

    final static void a(byte param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        ki var5 = null;
        bl.field_n.c(param3, param1);
        if (param0 != 8) {
          L0: {
            var5 = (ki) null;
            fh.a((ki) null, 88);
            if (param2) {
              L1: {
                var4 = 2 * (le.field_c % bl.field_n.field_o);
                if (bl.field_n.field_o > var4) {
                  break L1;
                } else {
                  var4 = -var4 + bl.field_n.field_o + bl.field_n.field_o;
                  break L1;
                }
              }
              L2: {
                L3: {
                  if (10 > var4) {
                    break L3;
                  } else {
                    if (-40 + bl.field_n.field_o >= var4) {
                      break L2;
                    } else {
                      var4 = -40 + bl.field_n.field_o;
                      if (!OrbDefence.field_D) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4 = 10;
                break L2;
              }
              hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L4: {
            if (param2) {
              L5: {
                var4 = 2 * (le.field_c % bl.field_n.field_o);
                if (bl.field_n.field_o > var4) {
                  break L5;
                } else {
                  var4 = -var4 + bl.field_n.field_o + bl.field_n.field_o;
                  break L5;
                }
              }
              L6: {
                L7: {
                  if (10 > var4) {
                    break L7;
                  } else {
                    if (-40 + bl.field_n.field_o >= var4) {
                      break L6;
                    } else {
                      var4 = -40 + bl.field_n.field_o;
                      if (!OrbDefence.field_D) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                var4 = 10;
                break L6;
              }
              hb.a(0, var4, 0, 80, param0 ^ -9, param3, 30, param1, bl.field_n);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    final static hj[] a(ki param0, int param1, byte param2, int param3) {
        hj[] discarded$2 = null;
        RuntimeException var4 = null;
        ki var5 = null;
        Object stackIn_4_0 = null;
        hj[] stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        hj[] stackOut_5_0 = null;
        Object stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              if (param2 <= -74) {
                break L1;
              } else {
                var5 = (ki) null;
                discarded$2 = fh.a((ki) null, -76, (byte) -18, -119);
                break L1;
              }
            }
            if (pk.a(-128, param3, param0, param1)) {
              stackOut_5_0 = lm.a(-127);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("fh.G(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (hj[]) ((Object) stackIn_4_0);
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_b = "You are not currently logged in to the<nbsp>game.";
        field_c = true;
    }
}
