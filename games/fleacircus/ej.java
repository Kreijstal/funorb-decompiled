/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej {
    static String field_b;
    static ok[] field_a;
    private ag field_e;
    private rh field_f;
    static int[] field_c;
    private rh field_d;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        param1 = param1 * 16;
        param0 = param0 * 16;
        param5 = param5 * 16;
        param4 = param4 * 16;
        gb.g(param4, param1, param0, param5, 16711680, param2 + 96);
        gb.e(param4, param1, param0, param5, 16711680, param2 + 128);
        int var6 = 1 / ((17 - param3) / 34);
    }

    final aj a(int param0, int param1) {
        aj var3 = null;
        byte[] var4 = null;
        var3 = (aj) (this.field_e.a((byte) -92, (long)param1));
        if (var3 == null) {
          L0: {
            L1: {
              if (param1 < 32768) {
                break L1;
              } else {
                var4 = this.field_f.a(1, (byte) 123, 32767 & param1);
                if (!fleas.field_A) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = this.field_d.a(1, (byte) 124, param1);
            break L0;
          }
          var3 = new aj();
          if (var4 == null) {
            if (param1 >= param0) {
              var3.h(0);
              this.field_e.a(var3, (byte) -122, (long)param1);
              return var3;
            } else {
              this.field_e.a(var3, (byte) -122, (long)param1);
              return var3;
            }
          } else {
            var3.a(new ni(var4), 4);
            if (param1 < param0) {
              this.field_e.a(var3, (byte) -122, (long)param1);
              return var3;
            } else {
              var3.h(0);
              this.field_e.a(var3, (byte) -122, (long)param1);
              return var3;
            }
          }
        } else {
          return var3;
        }
    }

    final static void a(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              j.field_f = wi.field_p.field_b;
              if (-1 != (fleas.field_E ^ -1)) {
                break L1;
              } else {
                if (tj.field_a < 15) {
                  break L1;
                } else {
                  L2: {
                    if (qh.c((byte) 55)) {
                      break L2;
                    } else {
                      if (-1 > (wc.field_q ^ -1)) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  bj.field_m = bc.field_V;
                  oa.a(7, false, -72);
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L3: {
              var1_int = tj.field_a;
              if (tj.field_a >= nl.field_c[fleas.field_E].length) {
                var1_int = -1 + nl.field_c[fleas.field_E].length;
                break L3;
              } else {
                break L3;
              }
            }
            var2 = hf.field_e.length * var1_int / ia.field_m[fleas.field_E].length;
            if (param0 == -39) {
              k.a(0, hf.field_e[var2]);
              lk.field_D.field_k = false;
              si.field_y.field_k = true;
              c.field_U = false;
              uc.b((byte) 84);
              rg.b(4);
              em.field_b = 6000;
              fb.field_e = new int[100];
              oa.field_n = true;
              pg.field_f = -60;
              qh.field_y = -250;
              jk.field_l = 0;
              lj.field_c = new int[100];
              mg.field_d = -1;
              nc.field_a = new int[100];
              uf.field_h = 0;
              mh.field_u = 1;
              var3 = 0;
              L4: while (true) {
                if (100 <= var3) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  nc.field_a[var3] = -1000;
                  var3++;
                  if (var4 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "ej.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0) {
        ak.field_a.d(new rb(), 26034);
        if (param0 != 16) {
            ej.a(17);
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 1) {
            return;
        }
        field_c = null;
    }

    private ej() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "You are unable to access this level yet.";
        field_a = new ok[15];
        field_c = new int[8192];
    }
}
