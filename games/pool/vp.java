/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vp extends sq {
    static int field_f;
    static String field_e;

    final boolean f(int param0) {
        if (param0 <= 113) {
            return true;
        }
        return false;
    }

    final boolean a(int param0, byte param1, qe param2) {
        if (param1 != 9) {
            field_f = 88;
        }
        return param2.field_z == ((vp) this).b(param0, 30554) ? true : false;
    }

    vp(al param0) {
        super(param0);
    }

    final int[] a(int param0, byte param1) {
        if (param1 != -32) {
            int discarded$0 = ((vp) this).b(79);
        }
        return uj.field_a;
    }

    final boolean a(int param0, int param1) {
        if (param1 >= -28) {
            field_f = -107;
            return false;
        }
        return false;
    }

    final int b(int param0) {
        int var2 = -28 % ((-79 - param0) / 38);
        return 1;
    }

    private final boolean o(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pool.field_O;
        var2 = 1;
        L0: while (true) {
          if (((vp) this).field_d.field_l.length <= var2) {
            if (param0 == 24812) {
              return true;
            } else {
              return true;
            }
          } else {
            if (var2 != 8) {
              if (((vp) this).field_d.field_l[var2].field_s) {
                return false;
              } else {
                var2++;
                continue L0;
              }
            } else {
              var2++;
              continue L0;
            }
          }
        }
    }

    final boolean c(qe param0, int param1) {
        if (param1 > -33) {
            field_f = -113;
        }
        return param0.field_z == ((vp) this).b(param0.field_n, 30554) ? true : false;
    }

    final boolean a(int param0, byte param1, int param2) {
        if (param1 < 122) {
            return true;
        }
        return this.a(param0, param2, (byte) -111);
    }

    final int a(int param0) {
        if (param0 != -1) {
            field_f = -63;
        }
        return this.o(24812) ? 2 : 0;
    }

    final int a(qe param0, int param1) {
        int var3 = -51 % ((-32 - param1) / 40);
        return -1;
    }

    final void c(int param0) {
        if (param0 >= -25) {
            field_f = -12;
        }
    }

    final int i(int param0) {
        if (param0 != 26840) {
            Object var3 = null;
            int discarded$0 = ((vp) this).a((qe) null, 33);
        }
        return 16;
    }

    final int h(int param0) {
        if (param0 != -1) {
            ((vp) this).c(-66);
        }
        return 0;
    }

    final int a(boolean param0) {
        if (param0) {
            field_f = -51;
            return 1;
        }
        return 1;
    }

    final static void a(int param0, int param1, byte param2, boolean param3, int param4, int param5, boolean param6, String param7, sj param8, int param9, int param10, int param11, int param12, long param13) {
        try {
            kn.field_e = new oq(param9);
            ej.field_j = new oq(param11);
            vj.field_d = param0;
            kh.field_uc = param4;
            nd.field_a = param8;
            if (param2 < 71) {
                return;
            }
            cq.field_a = param5;
            kc.field_c = param12;
            hk.field_s = param6 ? true : false;
            kn.field_j = param13;
            mp.field_S = param7;
            bf.field_g = param3 ? true : false;
            lf.field_b = param10;
            im.field_ec = param1;
            if (!(nd.field_a.field_b == null)) {
                try {
                    nl.field_c = new ir(nd.field_a.field_b, 64, 0);
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString());
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void p(int param0) {
        field_e = null;
        if (param0 != -9) {
            vp.a(89, 15, (byte) -50, true, -63, 93, true, (String) null, (sj) null, -10, -14, -81, -56, -98L);
        }
    }

    final dd b(qe param0, int param1) {
        if (param1 != 1) {
            return null;
        }
        return (param0.field_z ^ -1) == 0 ? dq.field_a.field_e[0] : dq.field_a.field_e[2];
    }

    private final boolean a(int param0, int param1, byte param2) {
        if (param2 != -111) {
            field_f = 46;
        }
        return param0 == ((vp) this).b(param1, 30554) ? true : false;
    }

    final byte b(int param0, int param1) {
        if (!(param0 != 0)) {
            return (byte) -1;
        }
        if ((param0 ^ -1) == -9) {
            return (byte) 2;
        }
        if (param1 != 30554) {
            field_f = -105;
            return (byte) 0;
        }
        return (byte) 0;
    }

    final int a(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aa var7 = null;
        cr var8 = null;
        int var9 = 0;
        qe var10 = null;
        qe var11 = null;
        var9 = Pool.field_O;
        var10 = ((vp) this).field_d.j(90);
        var11 = var10;
        var3 = -60 / ((-37 - param0) / 60);
        if (var11 == null) {
          throw new IllegalStateException("Couldn't get the last shot to examine!");
        } else {
          if ((var11.field_q ^ -1) != -3) {
            throw new IllegalStateException("Shot not finished yet, foo!");
          } else {
            L0: {
              var4 = var11.field_z;
              var5 = 0;
              if (!((vp) this).field_d.d((byte) 74)) {
                break L0;
              } else {
                var11.a(3, -14, new int[1]);
                var11.field_w = (byte)(var11.field_w - 1);
                var11.field_t = true;
                var5 = var5 | (nr.field_R | (um.field_c | be.field_I));
                break L0;
              }
            }
            L1: {
              L2: {
                if (8 != var11.field_n) {
                  break L2;
                } else {
                  if ((var4 ^ -1) == -3) {
                    break L2;
                  } else {
                    var11.a(2, -14, new int[1]);
                    var5 = var5 | be.field_I;
                    var11.field_w = (byte)(var11.field_w - 1);
                    var11.field_t = true;
                    break L1;
                  }
                }
              }
              if ((var11.field_n ^ -1) == 0) {
                var11.a(7, -14, new int[1]);
                var11.field_t = true;
                var11.field_w = (byte)(var11.field_w - 1);
                var5 = var5 | be.field_I;
                break L1;
              } else {
                break L1;
              }
            }
            L3: {
              var6 = var11.field_m.a(30);
              if (var5 != 0) {
                break L3;
              } else {
                if (var6 != 1) {
                  break L3;
                } else {
                  if (((cr) (Object) var11.field_m.c((byte) 62)).field_n != -9) {
                    break L3;
                  } else {
                    if (-3 == var4) {
                      return ag.field_e;
                    } else {
                      break L3;
                    }
                  }
                }
              }
            }
            var7 = new aa(var11.field_m);
            var8 = (cr) (Object) var7.b((byte) -92);
            L4: while (true) {
              if (var8 == null) {
                return var5;
              } else {
                if ((var8.field_n ^ -1) == -9) {
                  var11.a(5, -14, new int[1]);
                  return hm.field_e;
                } else {
                  L5: {
                    if (0 != var8.field_n) {
                      var11.field_w = (byte)(var11.field_w + 1);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  var8 = (cr) (Object) var7.b(-101);
                  continue L4;
                }
              }
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0>: You have an extra shot!";
    }
}
