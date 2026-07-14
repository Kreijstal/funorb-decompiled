/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    static oc[] field_b;
    private hma field_f;
    private sk field_c;
    private int field_e;
    static boolean field_a;
    private int field_g;
    static int[] field_d;

    final Object a(byte param0) {
        pb var2 = null;
        Object var3 = null;
        int var5 = 0;
        pb var6 = null;
        pb var7 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        var2 = (pb) (Object) ((dd) this).field_c.a((byte) 55);
        if (param0 != 60) {
          this.a(43, (Object) null, -32, 102L);
          L0: while (true) {
            if (var2 != null) {
              var3 = var2.f(29243);
              if (var3 != null) {
                return var3;
              } else {
                var7 = var2;
                var2 = (pb) (Object) ((dd) this).field_c.a((byte) 55);
                var7.p(param0 ^ 21);
                var7.c(-7975);
                ((dd) this).field_e = ((dd) this).field_e + var7.field_m;
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          L1: while (true) {
            if (var2 != null) {
              var3 = var2.f(29243);
              if (var3 != null) {
                return var3;
              } else {
                var6 = var2;
                var2 = (pb) (Object) ((dd) this).field_c.a((byte) 55);
                var6.p(param0 ^ 21);
                var6.c(-7975);
                ((dd) this).field_e = ((dd) this).field_e + var6.field_m;
                continue L1;
              }
            } else {
              return null;
            }
          }
        }
    }

    final Object a(byte param0, long param1) {
        tja var6 = null;
        pb var7 = null;
        Object var8 = null;
        Object var9 = null;
        var7 = (pb) (Object) ((dd) this).field_c.a(param1, false);
        if (var7 != null) {
          if (param0 > 14) {
            var9 = var7.f(29243);
            if (var9 == null) {
              var7.p(69);
              var7.c(-7975);
              ((dd) this).field_e = ((dd) this).field_e + var7.field_m;
              return null;
            } else {
              L0: {
                if (var7.a(14646)) {
                  var6 = new tja(var9, var7.field_m);
                  ((dd) this).field_c.a((vg) (Object) var6, (byte) 125, var7.field_d);
                  ((dd) this).field_f.a((od) (Object) var6, -11396);
                  ((pb) (Object) var6).field_j = 0L;
                  var7.p(118);
                  var7.c(-7975);
                  break L0;
                } else {
                  ((dd) this).field_f.a((od) (Object) var7, -11396);
                  var7.field_j = 0L;
                  break L0;
                }
              }
              return var9;
            }
          } else {
            field_d = null;
            var8 = var7.f(29243);
            if (var8 == null) {
              var7.p(69);
              var7.c(-7975);
              ((dd) this).field_e = ((dd) this).field_e + var7.field_m;
              return null;
            } else {
              L1: {
                if (var7.a(14646)) {
                  var6 = new tja(var8, var7.field_m);
                  ((dd) this).field_c.a((vg) (Object) var6, (byte) 125, var7.field_d);
                  ((dd) this).field_f.a((od) (Object) var6, -11396);
                  ((pb) (Object) var6).field_j = 0L;
                  var7.p(118);
                  var7.c(-7975);
                  break L1;
                } else {
                  ((dd) this).field_f.a((od) (Object) var7, -11396);
                  var7.field_j = 0L;
                  break L1;
                }
              }
              return var8;
            }
          }
        } else {
          return null;
        }
    }

    final void c(byte param0) {
        if (param0 != -118) {
          ((dd) this).field_e = 108;
          ((dd) this).field_f.a((byte) 84);
          ((dd) this).field_c.a(param0 ^ -118);
          ((dd) this).field_e = ((dd) this).field_g;
          return;
        } else {
          ((dd) this).field_f.a((byte) 84);
          ((dd) this).field_c.a(param0 ^ -118);
          ((dd) this).field_e = ((dd) this).field_g;
          return;
        }
    }

    final Object b(byte param0) {
        pb var2 = null;
        Object var3 = null;
        int var5 = 0;
        pb var6 = null;
        pb var7 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 > 83) {
          var2 = (pb) (Object) ((dd) this).field_c.b((byte) 35);
          L0: while (true) {
            if (var2 != null) {
              var3 = var2.f(29243);
              if (var3 == null) {
                var6 = var2;
                var2 = (pb) (Object) ((dd) this).field_c.a((byte) 55);
                var6.p(121);
                var6.c(-7975);
                ((dd) this).field_e = ((dd) this).field_e + var6.field_m;
                continue L0;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          field_d = null;
          var2 = (pb) (Object) ((dd) this).field_c.b((byte) 35);
          L1: while (true) {
            if (var2 != null) {
              var3 = var2.f(29243);
              if (var3 == null) {
                var7 = var2;
                var2 = (pb) (Object) ((dd) this).field_c.a((byte) 55);
                var7.p(121);
                var7.c(-7975);
                ((dd) this).field_e = ((dd) this).field_e + var7.field_m;
                continue L1;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        }
    }

    final void b(int param0, int param1) {
        pb var3 = null;
        eba var4 = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        if (param0 >= 59) {
          var3 = (pb) (Object) ((dd) this).field_f.c(100);
          L0: while (true) {
            if (var3 != null) {
              L1: {
                if (!var3.a(14646)) {
                  var3.field_j = var3.field_j + 1L;
                  if (((long)param1 ^ -1L) > (var3.field_j + 1L ^ -1L)) {
                    var4 = new eba(var3.f(29243), var3.field_m);
                    ((dd) this).field_c.a((vg) (Object) var4, (byte) 124, var3.field_d);
                    ig.a(31, (od) (Object) var4, (od) (Object) var3);
                    var3.p(126);
                    var3.c(-7975);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  if (var3.f(29243) == null) {
                    var3.p(120);
                    var3.c(-7975);
                    ((dd) this).field_e = ((dd) this).field_e + var3.field_m;
                    break L1;
                  } else {
                    var3 = (pb) (Object) ((dd) this).field_f.a(-122);
                    continue L0;
                  }
                }
              }
              var3 = (pb) (Object) ((dd) this).field_f.a(-122);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(int param0, Object param1, long param2) {
        if (param0 != 29166) {
            return;
        }
        this.a(-1, param1, 1, param2);
    }

    final static cn a(int param0, int param1) {
        if (param1 != 1) {
          dd.a(10);
          return nt.a(param0, 1, 5200, false, false, true);
        } else {
          return nt.a(param0, 1, 5200, false, false, true);
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 8476) {
            return;
        }
        field_d = null;
    }

    private final void a(int param0, pb param1) {
        L0: {
          if (param1 != null) {
            param1.p(123);
            param1.c(param0 + -7976);
            ((dd) this).field_e = ((dd) this).field_e + param1.field_m;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 1) {
          return;
        } else {
          ((dd) this).a(85, (Object) null, 32L);
          return;
        }
    }

    private final void a(int param0, Object param1, int param2, long param3) {
        tja var6 = null;
        int var7 = 0;
        pb var8 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        if (param2 <= ((dd) this).field_g) {
          this.a(param3, 1);
          ((dd) this).field_e = ((dd) this).field_e - param2;
          L0: while (true) {
            if ((((dd) this).field_e ^ -1) <= -1) {
              var6 = new tja(param1, param2);
              ((dd) this).field_c.a((vg) (Object) var6, (byte) 114, param3);
              ((dd) this).field_f.a((od) (Object) var6, -11396);
              ((pb) (Object) var6).field_j = 0L;
              if (param0 == -1) {
                return;
              } else {
                this.a(6, (Object) null, 106, 15L);
                return;
              }
            } else {
              var8 = (pb) (Object) ((dd) this).field_f.b((byte) 60);
              this.a(param0 ^ -2, var8);
              continue L0;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    dd(int param0) {
        this(param0, param0);
    }

    private dd(int param0, int param1) {
        int var3 = 0;
        ((dd) this).field_f = new hma();
        ((dd) this).field_g = param0;
        ((dd) this).field_e = param0;
        var3 = 1;
        L0: while (true) {
          if (param0 > var3 + var3) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((dd) this).field_c = new sk(var3);
            }
          } else {
            ((dd) this).field_c = new sk(var3);
          }
        }
    }

    private final void a(long param0, int param1) {
        pb var4 = (pb) (Object) ((dd) this).field_c.a(param0, false);
        this.a(param1, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
    }
}
