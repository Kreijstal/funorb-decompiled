/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kj extends jk {
    static int field_G;
    static String field_E;
    static le field_F;
    private pj field_D;

    final void b(byte param0, we param1) {
        rh var3 = null;
        boolean discarded$0 = false;
        try {
            if (!(param1 instanceof rh)) {
                throw new IllegalArgumentException();
            }
            if (param0 >= -32) {
                field_F = (le) null;
            }
            var3 = (rh) ((Object) param1);
            this.field_D.a(var3, (byte) 13);
            var3.field_z = true;
            discarded$0 = var3.a((we) (this), false);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "kj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public kj() {
        super(0, 0, tf.field_b, uj.field_l, (ml) null, (of) null);
        this.field_D = new pj();
    }

    final static void a(boolean param0, int param1) {
        L0: {
          jk.field_u = jk.field_u + uj.field_h;
          if ((jk.field_u ^ -1) > param1) {
            ck.field_b = -1;
            break L0;
          } else {
            break L0;
          }
        }
        if (-31 > (jk.field_u ^ -1)) {
          if (0 <= ck.field_b) {
            if (param0) {
              uj.field_h = uj.field_h * -1;
              jk.field_u = 30;
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

    final static le a(int param0, ad param1, int param2, int param3) {
        le discarded$2 = null;
        RuntimeException var4 = null;
        ad var5 = null;
        le stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        le stackOut_5_0 = null;
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
              if (param2 == 17196) {
                break L1;
              } else {
                var5 = (ad) null;
                discarded$2 = kj.a(4, (ad) null, 48, 57);
                break L1;
              }
            }
            if (wg.a(param3, param0, param1, -3)) {
              stackOut_5_0 = od.b(param2 + -17093);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("kj.DA(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
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
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final void k(int param0) {
        ck var2 = null;
        rh var3 = null;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = new ck(this.field_D);
        var3 = (rh) ((Object) var2.a((byte) -37));
        L0: while (true) {
          if (var3 == null) {
            if (param0 <= 43) {
              return;
            } else {
              this.field_v = null;
              return;
            }
          } else {
            var3.field_z = false;
            var3 = (rh) ((Object) var2.a(true));
            if (var4 == 0) {
              continue L0;
            } else {
              return;
            }
          }
        }
    }

    final we a(int param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != -1) {
            return (we) null;
        }
        ck var2 = new ck(this.field_D);
        rh var3 = (rh) ((Object) var2.a((byte) -37));
        do {
            if (var3 == null) {
                return null;
            }
            if (!(!var3.field_z)) {
                return var3.a(true);
            }
            var3 = (rh) ((Object) var2.a(true));
        } while (var4 == 0);
        return null;
    }

    final static boolean m(int param0) {
        i var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        i var4 = null;
        int stackIn_4_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (i) ((Object) ua.field_v.a((byte) -117));
            var1 = var4;
            if (var1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = param0;
              L1: while (true) {
                L2: {
                  if (var2 >= var1.field_e) {
                    break L2;
                  } else {
                    L3: {
                      if (null != var4.field_k[var2]) {
                        if (var4.field_k[var2].field_g == 0) {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (var4.field_s[var2] != null) {
                        if (0 == var4.field_s[var2].field_g) {
                          stackOut_17_0 = 0;
                          stackIn_18_0 = stackOut_17_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        } else {
                          break L4;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    if (var3 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_20_0 = 1;
                stackIn_21_0 = stackOut_20_0;
                decompiledRegionSelector0 = 3;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "kj.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    public static void d(byte param0) {
        int var1 = 86 / ((63 - param0) / 57);
        field_E = null;
        field_F = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        ck var5 = null;
        we var6 = null;
        int var7 = 0;
        we var8 = null;
        ck var9 = null;
        ck var10 = null;
        ck var11 = null;
        ck var12 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == 30) {
          if (this.field_h == null) {
            var11 = new ck(this.field_D);
            var5 = var11;
            var6 = (we) ((Object) var11.b((byte) -103));
            L0: while (true) {
              if (var6 != null) {
                var6.a(30, param1, this.field_e + param2, param3 - -this.field_r);
                var6 = (we) ((Object) var11.a(param0 + -3733));
                if (var7 == 0) {
                  continue L0;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            this.field_h.a(true, (we) (this), param2, param3, 55);
            var12 = new ck(this.field_D);
            var5 = var12;
            var6 = (we) ((Object) var12.b((byte) -103));
            L1: while (true) {
              if (var6 == null) {
                return;
              } else {
                var6.a(30, param1, this.field_e + param2, param3 - -this.field_r);
                var6 = (we) ((Object) var12.a(param0 + -3733));
                if (var7 == 0) {
                  continue L1;
                } else {
                  return;
                }
              }
            }
          }
        } else {
          var8 = (we) null;
          this.b((byte) -88, (we) null);
          if (this.field_h == null) {
            var9 = new ck(this.field_D);
            var5 = var9;
            var6 = (we) ((Object) var9.b((byte) -103));
            L2: while (true) {
              if (var6 != null) {
                var6.a(30, param1, this.field_e + param2, param3 - -this.field_r);
                var6 = (we) ((Object) var9.a(param0 + -3733));
                if (var7 == 0) {
                  continue L2;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            this.field_h.a(true, (we) (this), param2, param3, 55);
            var10 = new ck(this.field_D);
            var5 = var10;
            var6 = (we) ((Object) var10.b((byte) -103));
            L3: while (true) {
              if (var6 != null) {
                var6.a(30, param1, this.field_e + param2, param3 - -this.field_r);
                var6 = (we) ((Object) var10.a(param0 + -3733));
                if (var7 == 0) {
                  continue L3;
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
    }

    final void a(boolean param0) {
        ck var2 = null;
        rh var3 = null;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0) {
          var2 = new ck(this.field_D);
          var3 = (rh) ((Object) var2.a((byte) -37));
          L0: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L1: {
                  if (var3.b(false)) {
                    var3.c(-19822);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3 = (rh) ((Object) var2.a(true));
                continue L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          field_F = (le) null;
          var2 = new ck(this.field_D);
          var3 = (rh) ((Object) var2.a((byte) -37));
          L2: while (true) {
            if (var3 != null) {
              if (var4 == 0) {
                L3: {
                  if (var3.b(false)) {
                    var3.c(-19822);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = (rh) ((Object) var2.a(true));
                continue L2;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final void l(int param0) {
        ck var2 = null;
        rh var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = -104 / ((75 - param0) / 44);
        var2 = new ck(this.field_D);
        var3 = (rh) ((Object) var2.a((byte) -37));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                if (var5 != 0) {
                  break L1;
                } else {
                  L3: {
                    if (!var3.k(-23913)) {
                      break L3;
                    } else {
                      var3.c(-19822);
                      break L3;
                    }
                  }
                  var3 = (rh) ((Object) var2.a(true));
                  if (var5 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            this.field_v = (we) ((Object) this.j(-73));
            break L1;
          }
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, String param6, long param7, boolean param8, int param9, int param10, byte param11, int param12, md param13) {
        try {
            IOException var15 = null;
            RuntimeException var15_ref = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            try {
              L0: {
                L1: {
                  MonkeyPuzzle2.field_D = new hb(param9);
                  gf.field_c = new hb(param3);
                  pj.field_g = param13;
                  j.field_a = param10;
                  if (!param2) {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    break L1;
                  } else {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    break L1;
                  }
                }
                L2: {
                  mb.field_c = stackIn_3_0 != 0;
                  if (!param8) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  me.field_e = stackIn_6_0 != 0;
                  od.field_l = param7;
                  kc.field_c = param4;
                  mk.field_h = param5;
                  rl.field_a = param0;
                  di.field_d = param6;
                  if (param11 <= -105) {
                    break L3;
                  } else {
                    kj.a(true, -74);
                    break L3;
                  }
                }
                L4: {
                  cg.field_g = param12;
                  id.field_m = param1;
                  if (null == pj.field_g.field_x) {
                    break L4;
                  } else {
                    try {
                      L5: {
                        hj.field_D = new ch(pj.field_g.field_x, 64, 0);
                        break L5;
                      }
                    } catch (java.io.IOException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var15 = (IOException) (Object) decompiledCaughtException;
                      throw new RuntimeException(var15.toString());
                    }
                    break L4;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var15_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) (var15_ref);
                stackOut_13_1 = new StringBuilder().append("kj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param6 == null) {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L6;
                }
              }
              L7: {
                stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param13 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L7;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L7;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rh j(int param0) {
        ck var2 = null;
        rh var3 = null;
        int var4 = 0;
        boolean stackIn_3_0 = false;
        int stackIn_8_0 = 0;
        boolean stackOut_2_0 = false;
        int stackOut_7_0 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = new ck(this.field_D);
        var3 = (rh) ((Object) var2.a((byte) -37));
        L0: while (true) {
          L1: {
            L2: {
              if (var3 == null) {
                break L2;
              } else {
                stackOut_2_0 = var3.field_z;
                stackIn_8_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var4 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0) {
                    return var3;
                  } else {
                    var3 = (rh) ((Object) var2.a(true));
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_7_0 = param0;
            stackIn_8_0 = stackOut_7_0;
            break L1;
          }
          if (stackIn_8_0 <= -32) {
            return null;
          } else {
            this.a(false);
            return null;
          }
        }
    }

    static {
        field_E = "Connection timed out. Please try using a different server.";
    }
}
