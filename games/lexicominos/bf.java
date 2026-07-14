/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf {
    private int field_d;
    private int field_e;
    static int[] field_a;
    static int field_g;
    private ji field_b;
    private bg field_c;
    static String field_f;

    final static void b(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) hh.field_M;
                    // monitorenter hh.field_M
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ul.field_o = bb.field_I;
                        uc.field_eb = uc.field_eb + 1;
                        bk.field_b = cj.field_i;
                        sh.field_e = ij.field_h;
                        ob.field_c = ql.field_K;
                        ql.field_K = false;
                        nk.field_z = lj.field_a;
                        ef.field_a = qb.field_j;
                        ck.field_a = gk.field_b;
                        lj.field_a = 0;
                        var2 = -8 / ((param0 - 30) / 41);
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var3;
                }
                case 5: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(Object param0, int param1, long param2) {
        this.a(param2, (byte) 62, 1, param0);
        if (param1 != -25253) {
            field_g = -94;
        }
    }

    final static jb a(int[] param0, jb param1, int param2) {
        jb var3 = new jb(param2, 0, 0);
        var3.field_h = param1.field_h;
        var3.field_e = param1.field_e;
        var3.field_c = param1.field_c;
        var3.field_j = param0;
        var3.field_g = param1.field_g;
        var3.field_f = param1.field_f;
        var3.field_b = param1.field_b;
        var3.field_i = param1.field_i;
        return var3;
    }

    final Object a(long param0, int param1) {
        gj var6 = null;
        Object var7 = null;
        rh var9 = null;
        Object var10 = null;
        rh var11 = null;
        Object var12 = null;
        if (param1 == 0) {
          var11 = (rh) (Object) ((bf) this).field_b.a((byte) 42, param0);
          if (var11 != null) {
            var12 = var11.c((byte) 30);
            if (var12 == null) {
              var11.b((byte) -124);
              var11.b(param1 ^ 12);
              ((bf) this).field_d = ((bf) this).field_d + var11.field_q;
              return null;
            } else {
              L0: {
                if (var11.d((byte) -90)) {
                  var6 = new gj(var12, var11.field_q);
                  ((bf) this).field_b.a((kd) (Object) var6, 1, var11.field_d);
                  ((bf) this).field_c.a((ca) (Object) var6, (byte) 25);
                  ((rh) (Object) var6).field_j = 0L;
                  var11.b((byte) -122);
                  var11.b(12);
                  break L0;
                } else {
                  ((bf) this).field_c.a((ca) (Object) var11, (byte) 25);
                  var11.field_j = 0L;
                  break L0;
                }
              }
              return var12;
            }
          } else {
            return null;
          }
        } else {
          var7 = null;
          this.a((rh) null, (byte) 68);
          var9 = (rh) (Object) ((bf) this).field_b.a((byte) 42, param0);
          if (var9 != null) {
            var10 = var9.c((byte) 30);
            if (var10 == null) {
              var9.b((byte) -124);
              var9.b(param1 ^ 12);
              ((bf) this).field_d = ((bf) this).field_d + var9.field_q;
              return null;
            } else {
              L1: {
                if (var9.d((byte) -90)) {
                  var6 = new gj(var10, var9.field_q);
                  ((bf) this).field_b.a((kd) (Object) var6, 1, var9.field_d);
                  ((bf) this).field_c.a((ca) (Object) var6, (byte) 25);
                  ((rh) (Object) var6).field_j = 0L;
                  var9.b((byte) -122);
                  var9.b(12);
                  break L1;
                } else {
                  ((bf) this).field_c.a((ca) (Object) var9, (byte) 25);
                  var9.field_j = 0L;
                  break L1;
                }
              }
              return var10;
            }
          } else {
            return null;
          }
        }
    }

    private final void a(long param0, byte param1, int param2, Object param3) {
        rh var6 = null;
        gj var6_ref = null;
        int var7 = 0;
        var7 = Lexicominos.field_L ? 1 : 0;
        if (((bf) this).field_e >= param2) {
          this.b(param0, 111);
          ((bf) this).field_d = ((bf) this).field_d - param2;
          L0: while (true) {
            if (((bf) this).field_d >= 0) {
              var6_ref = new gj(param3, param2);
              ((bf) this).field_b.a((kd) (Object) var6_ref, 1, param0);
              ((bf) this).field_c.a((ca) (Object) var6_ref, (byte) 25);
              if (param1 != 62) {
                bf.a((byte) 17);
                ((rh) (Object) var6_ref).field_j = 0L;
                return;
              } else {
                ((rh) (Object) var6_ref).field_j = 0L;
                return;
              }
            } else {
              var6 = (rh) (Object) ((bf) this).field_c.b((byte) 112);
              this.a(var6, (byte) 9);
              continue L0;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    private final void b(long param0, int param1) {
        rh var4 = (rh) (Object) ((bf) this).field_b.a((byte) 42, param0);
        if (param1 <= 46) {
            return;
        }
        this.a(var4, (byte) 9);
    }

    private bf() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_a = null;
        field_f = null;
        if (param0 > -51) {
            Object var2 = null;
            jb discarded$0 = bf.a((int[]) null, (jb) null, 69);
        }
    }

    private final void a(rh param0, byte param1) {
        if (param1 != 9) {
          L0: {
            ((bf) this).field_d = 77;
            if (param0 != null) {
              param0.b((byte) -122);
              param0.b(param1 + 3);
              ((bf) this).field_d = ((bf) this).field_d + param0.field_q;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (param0 != null) {
              param0.b((byte) -122);
              param0.b(param1 + 3);
              ((bf) this).field_d = ((bf) this).field_d + param0.field_q;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = -1;
        field_a = new int[16384];
        field_f = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
