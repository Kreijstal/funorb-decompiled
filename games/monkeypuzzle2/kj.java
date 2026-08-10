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
            var3.a((we) (this), false);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "kj.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public kj() {
        super(0, 0, tf.field_b, uj.field_l, (ml) null, (of) null);
        this.field_D = new pj();
    }

    final static void a(boolean param0, int param1) {
        jk.field_u = jk.field_u + uj.field_h;
        if (!((jk.field_u ^ -1) <= param1)) {
            ck.field_b = -1;
        }
        if (-31 > (jk.field_u ^ -1) && 0 <= ck.field_b && param0) {
            uj.field_h = uj.field_h * -1;
            jk.field_u = 30;
        }
    }

    final static le a(int param0, ad param1, int param2, int param3) {
        RuntimeException var4 = null;
        ad var5 = null;
        le stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 == 17196) {
                break L1;
              } else {
                var5 = (ad) null;
                kj.a(4, (ad) null, 48, 57);
                break L1;
              }
            }
            if (wg.a(param3, param0, param1, -3)) {
              stackIn_6_0 = od.b(param2 + -17093);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("kj.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final void k(int param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(this.field_D);
        rh var3 = (rh) ((Object) var2.a((byte) -37));
        while (var3 != null) {
            var3.field_z = false;
            var3 = (rh) ((Object) var2.a(true));
        }
        if (param0 <= 43) {
            return;
        }
        this.field_v = null;
    }

    final we a(int param0) {
        ck var2;
        rh var3;
        int var4;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == -1) {
          var2 = new ck(this.field_D);
          var3 = (rh) ((Object) var2.a((byte) -37));
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_z) {
                return var3.a(true);
              } else {
                var3 = (rh) ((Object) var2.a(true));
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return (we) null;
        }
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
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (i) ((Object) ua.field_v.a((byte) -117));
            var1 = var4;
            if (var1 == null) {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = param0;
              L1: while (true) {
                if (var2 >= var1.field_e) {
                  stackIn_21_0 = 1;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  L2: {
                    if (null != var4.field_k[var2]) {
                      if (var4.field_k[var2].field_g == 0) {
                        stackIn_12_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (var4.field_s[var2] != null) {
                      if (0 == var4.field_s[var2].field_g) {
                        stackIn_18_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  var2++;
                  continue L1;
                }
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
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 30) {
            we var8 = (we) null;
            this.b((byte) -88, (we) null);
        }
        if (this.field_h != null) {
            this.field_h.a(true, (we) (this), param2, param3, 55);
        }
        ck var5 = new ck(this.field_D);
        we var6 = (we) ((Object) var5.b((byte) -103));
        while (var6 != null) {
            var6.a(30, param1, this.field_e + param2, param3 - -this.field_r);
            var6 = (we) ((Object) var5.a(param0 + -3733));
        }
    }

    final void a(boolean param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!param0) {
            field_F = (le) null;
        }
        ck var2 = new ck(this.field_D);
        rh var3 = (rh) ((Object) var2.a((byte) -37));
        while (var3 != null) {
            if (!(!var3.b(false))) {
                var3.c(-19822);
            }
            var3 = (rh) ((Object) var2.a(true));
        }
    }

    final void l(int param0) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var4 = -104 / ((75 - param0) / 44);
        ck var2 = new ck(this.field_D);
        rh var3 = (rh) ((Object) var2.a((byte) -37));
        while (var3 != null) {
            if (var3.k(-23913)) {
                var3.c(-19822);
            }
            var3 = (rh) ((Object) var2.a(true));
        }
        this.field_v = (we) ((Object) this.j(-73));
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, String param6, long param7, boolean param8, int param9, int param10, byte param11, int param12, md param13) {
        try {
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            StringBuilder stackIn_18_1 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            IOException var15 = null;
            RuntimeException var15_ref = null;
            try {
              L0: {
                L1: {
                  MonkeyPuzzle2.field_D = new hb(param9);
                  gf.field_c = new hb(param3);
                  pj.field_g = param13;
                  j.field_a = param10;
                  if (!param2) {
                    stackIn_3_0 = 0;
                    break L1;
                  } else {
                    stackIn_3_0 = 1;
                    break L1;
                  }
                }
                L2: {
                  mb.field_c = stackIn_3_0 != 0;
                  if (!param8) {
                    stackIn_6_0 = 0;
                    break L2;
                  } else {
                    stackIn_6_0 = 1;
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
                stackIn_15_0 = (RuntimeException) (var15_ref);

                stackIn_15_1 = new StringBuilder().append("kj.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');

                if (param6 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L6;
                }
              }
              L7: {


                stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',');

                if (param13 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L7;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L7;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rh j(int param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(this.field_D);
        rh var3 = (rh) ((Object) var2.a((byte) -37));
        while (var3 != null) {
            if (!(!var3.field_z)) {
                return var3;
            }
            var3 = (rh) ((Object) var2.a(true));
        }
        if (param0 <= -32) {
            return null;
        }
        this.a(false);
        return null;
    }

    static {
        field_E = "Connection timed out. Please try using a different server.";
    }
}
