/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ed implements Iterable {
    static bd field_a;
    private am field_c;
    static String field_e;
    am[] field_f;
    static String field_d;
    int field_b;

    final static void a(ln param0, boolean param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (3 <= var2_int) {
                var2_int = 0;
                L2: while (true) {
                  if (qb.field_i <= var2_int) {
                    L3: {
                      int dupTemp$4 = param0.a(param1);
                      ra.field_i[dupTemp$4] = ra.field_i[dupTemp$4] + 1;
                      var2_int = 0;
                      if (!param1) {
                        break L3;
                      } else {
                        ed.b(-18);
                        break L3;
                      }
                    }
                    var3 = 0;
                    L4: while (true) {
                      if (var3 >= qb.field_i) {
                        qb.field_i = var2_int;
                        int fieldTemp$5 = qb.field_i;
                        qb.field_i = qb.field_i + 1;
                        rj.field_J[fieldTemp$5] = param0;
                        break L0;
                      } else {
                        L5: {
                          L6: {
                            if (rj.field_J[var3].field_f != param0.field_f) {
                              break L6;
                            } else {
                              var4 = rj.field_J[var3].a(false);
                              if (ra.field_i[var4] <= uj.field_n) {
                                break L6;
                              } else {
                                ra.field_i[var4] = ra.field_i[var4] - 1;
                                break L5;
                              }
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          rj.field_J[incrementValue$6] = rj.field_J[var3];
                          break L5;
                        }
                        var3++;
                        continue L4;
                      }
                    }
                  } else {
                    L7: {
                      if (param0.field_f != rj.field_J[var2_int].field_f) {
                        break L7;
                      } else {
                        int dupTemp$7 = rj.field_J[var2_int].a(false);
                        ra.field_i[dupTemp$7] = ra.field_i[dupTemp$7] + 1;
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                ra.field_i[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("ed.C(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L8;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L8;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new oe((ed) this);
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static void b(int param0) {
        if (!li.field_o) {
            throw new IllegalStateException();
        }
        if (param0 != 0) {
            Object var2 = null;
            ed.a((ln) null, true);
        }
        if (null != jj.field_d) {
            jj.field_d.g((byte) -19);
        }
        String var1 = bn.b(-104);
        ib.field_e = new lk(var1, (String) null, true, false, false);
        im.field_e.c((ag) (Object) ke.field_s, 86);
        ke.field_s.b((ag) (Object) ib.field_e, (byte) 110);
        ke.field_s.m(param0 ^ -108);
    }

    final am a(long param0, int param1) {
        am var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        am var4 = ((ed) this).field_f[(int)(param0 & (long)(((ed) this).field_b + param1))];
        ((ed) this).field_c = var4.field_g;
        while (((ed) this).field_c != var4) {
            if (!(param0 != ((ed) this).field_c.field_c)) {
                var5 = ((ed) this).field_c;
                ((ed) this).field_c = ((ed) this).field_c.field_g;
                return var5;
            }
            ((ed) this).field_c = ((ed) this).field_c.field_g;
        }
        ((ed) this).field_c = null;
        return null;
    }

    final void a(byte param0, long param1, am param2) {
        if (null != param2.field_f) {
            param2.b(120);
        }
        am var5 = ((ed) this).field_f[(int)(param1 & (long)(-1 + ((ed) this).field_b))];
        if (param0 <= 59) {
            return;
        }
        try {
            param2.field_g = var5;
            param2.field_f = var5.field_f;
            param2.field_f.field_g = param2;
            param2.field_c = param1;
            param2.field_g.field_f = param2;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ed.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, byte param1) {
        qb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            wj.field_O = param0;
            if (param1 < -22) {
              var2 = (qb) (Object) jn.field_H.g(-9);
              L1: while (true) {
                if (var2 == null) {
                  L2: {
                    if (ej.field_g != null) {
                      var2 = (qb) (Object) ej.field_g.g(-69);
                      L3: while (true) {
                        if (var2 == null) {
                          break L2;
                        } else {
                          L4: {
                            if (var2.field_j.a(3000)) {
                              var2.field_h.f(var2.field_l * wj.field_O - -128 >> 8);
                              break L4;
                            } else {
                              var2.b(119);
                              break L4;
                            }
                          }
                          var2 = (qb) (Object) ej.field_g.a(12684);
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  break L0;
                } else {
                  L5: {
                    if (!var2.field_j.a(3000)) {
                      var2.b(-69);
                      break L5;
                    } else {
                      var2.field_h.f(var2.field_l * wj.field_O + 128 >> 8);
                      break L5;
                    }
                  }
                  var2 = (qb) (Object) jn.field_H.a(12684);
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var2_ref, "ed.F(" + param0 + 44 + param1 + 41);
        }
    }

    private ed() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Log in / Create account";
        field_e = null;
    }
}
