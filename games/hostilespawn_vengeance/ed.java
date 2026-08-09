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
        int dupTemp$0 = 0;
        int fieldTemp$1 = 0;
        int incrementValue$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
                      dupTemp$0 = param0.a(param1);
                      ra.field_i[dupTemp$0] = ra.field_i[dupTemp$0] + 1;
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
                        fieldTemp$1 = qb.field_i;
                        qb.field_i = qb.field_i + 1;
                        rj.field_J[fieldTemp$1] = param0;
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
                          incrementValue$2 = var2_int;
                          var2_int++;
                          rj.field_J[incrementValue$2] = rj.field_J[var3];
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
                        dupTemp$3 = rj.field_J[var2_int].a(false);
                        ra.field_i[dupTemp$3] = ra.field_i[dupTemp$3] + 1;
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
            stackIn_22_0 = (RuntimeException) (var2);

            stackIn_22_1 = new StringBuilder().append("ed.C(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new oe((ed) (this)));
    }

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static void b(int param0) {
        if (!li.field_o) {
            throw new IllegalStateException();
        }
        if (param0 != 0) {
            ln var2 = (ln) null;
            ed.a((ln) null, true);
        }
        if (null != jj.field_d) {
            jj.field_d.g((byte) -19);
        }
        String var1 = bn.b(-104);
        ib.field_e = new lk(var1, (String) null, true, false, false);
        im.field_e.c(ke.field_s, 86);
        ke.field_s.b(ib.field_e, (byte) 110);
        ke.field_s.m(param0 ^ -108);
    }

    final am a(long param0, int param1) {
        am var5 = null;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        am var4 = this.field_f[(int)(param0 & (long)(this.field_b + param1))];
        this.field_c = var4.field_g;
        while (this.field_c != var4) {
            if (!(param0 != this.field_c.field_c)) {
                var5 = this.field_c;
                this.field_c = this.field_c.field_g;
                return var5;
            }
            this.field_c = this.field_c.field_g;
        }
        this.field_c = null;
        return null;
    }

    final void a(byte param0, long param1, am param2) {
        if (null != param2.field_f) {
            param2.b(120);
        }
        am var5 = this.field_f[(int)(param1 & (long)(-1 + this.field_b))];
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
            throw wg.a((Throwable) ((Object) runtimeException), "ed.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, byte param1) {
        qb var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            wj.field_O = param0;
            if (param1 < -22) {
              var2 = (qb) ((Object) jn.field_H.g(-9));
              L1: while (true) {
                if (var2 == null) {
                  L2: {
                    if (ej.field_g != null) {
                      var2 = (qb) ((Object) ej.field_g.g(-69));
                      L3: while (true) {
                        if (var2 == null) {
                          break L2;
                        } else {
                          stackIn_14_0 = var2.field_j.a(3000);
                          L4: {
                            if (stackIn_14_0) {
                              var2.field_h.f(var2.field_l * wj.field_O - -128 >> -13611768);
                              break L4;
                            } else {
                              var2.b(119);
                              break L4;
                            }
                          }
                          var2 = (qb) ((Object) ej.field_g.a(12684));
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L5: {
                    if (!var2.field_j.a(3000)) {
                      var2.b(-69);
                      break L5;
                    } else {
                      var2.field_h.f(var2.field_l * wj.field_O + 128 >> 22915208);
                      break L5;
                    }
                  }
                  var2 = (qb) ((Object) jn.field_H.a(12684));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2_ref), "ed.F(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private ed() throws Throwable {
        throw new Error();
    }

    static {
        field_d = "Log in / Create account";
        field_e = null;
    }
}
