/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lc extends cj {
    static pb field_l;
    eaa field_k;

    final void a(jm param0, byte param1) {
        ((lc) this).field_k.a((bw) (Object) param0, true);
        if (param1 <= 37) {
            Object var4 = null;
            ((lc) this).a((jm) null, (byte) -11);
        }
    }

    final void a(op param0, boolean param1) {
        int var4 = 0;
        Object var5 = null;
        jm var6 = null;
        var4 = BachelorFridge.field_y;
        var6 = (jm) (Object) ((lc) this).field_k.b((byte) 90);
        L0: while (true) {
          if (var6 == null) {
            if (param1) {
              var5 = null;
              ((lc) this).a((jm) null, (byte) 97);
              return;
            } else {
              return;
            }
          } else {
            var6.a(param1, param0);
            var6 = (jm) (Object) ((lc) this).field_k.c(0);
            continue L0;
          }
        }
    }

    final at a(int param0, gj param1) {
        if (param0 != 5) {
          ((lc) this).field_k = null;
          return (at) (Object) new ub(param1, (lc) this);
        } else {
          return (at) (Object) new ub(param1, (lc) this);
        }
    }

    final void a(lu param0, int param1) {
        int var4 = 0;
        jm var5 = null;
        var4 = BachelorFridge.field_y;
        param0.d(((lc) this).field_k.g(0), 0);
        if (param1 == -9) {
          var5 = (jm) (Object) ((lc) this).field_k.b((byte) 90);
          L0: while (true) {
            if (var5 == null) {
              return;
            } else {
              var5.a(param0, (byte) -63);
              var5 = (jm) (Object) ((lc) this).field_k.c(0);
              continue L0;
            }
          }
        } else {
          ((lc) this).field_k = null;
          var5 = (jm) (Object) ((lc) this).field_k.b((byte) 90);
          L1: while (true) {
            if (var5 == null) {
              return;
            } else {
              var5.a(param0, (byte) -63);
              var5 = (jm) (Object) ((lc) this).field_k.c(0);
              continue L1;
            }
          }
        }
    }

    public static void c(boolean param0) {
        field_l = null;
        if (param0) {
            field_l = null;
        }
    }

    lc(lu param0) {
        super(6);
        int var2 = 0;
        int var3 = 0;
        ((lc) this).field_k = new eaa();
        var2 = param0.b(16711935);
        L0: while (true) {
          var2--;
          if (var2 < 0) {
          } else {
            var3 = param0.b(16711935);
            if (var3 == -2) {
              ((lc) this).field_k.a((bw) (Object) new oca(param0), true);
              continue L0;
            } else {
              if (-1 != var3) {
                if (var3 == 2) {
                  ((lc) this).field_k.a((bw) (Object) new tga(param0), true);
                  continue L0;
                } else {
                  if (3 == var3) {
                    ((lc) this).field_k.a((bw) (Object) new wp(param0), true);
                    continue L0;
                  } else {
                    if (var3 == 4) {
                      ((lc) this).field_k.a((bw) (Object) new fi(param0), true);
                      continue L0;
                    } else {
                      if (var3 == 5) {
                        ((lc) this).field_k.a((bw) (Object) new bg(param0), true);
                        continue L0;
                      } else {
                        if (var3 == 6) {
                          ((lc) this).field_k.a((bw) (Object) new bja(param0), true);
                          continue L0;
                        } else {
                          if (var3 == 7) {
                            ((lc) this).field_k.a((bw) (Object) new ej(param0), true);
                            continue L0;
                          } else {
                            if ((var3 ^ -1) == -9) {
                              ((lc) this).field_k.a((bw) (Object) new ns(param0), true);
                              continue L0;
                            } else {
                              if ((var3 ^ -1) == -10) {
                                ((lc) this).field_k.a((bw) (Object) new ow(param0), true);
                                continue L0;
                              } else {
                                throw new IllegalStateException();
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              } else {
                ((lc) this).field_k.a((bw) (Object) new iia(param0), true);
                continue L0;
              }
            }
          }
        }
    }

    public lc() {
        super(6);
        ((lc) this).field_k = new eaa();
    }

    final static void b(int param0) {
        if (param0 != -1) {
          L0: {
            field_l = null;
            if (gm.field_k) {
              ki.g(param0 + -25);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (gm.field_k) {
              ki.g(param0 + -25);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
    }
}
