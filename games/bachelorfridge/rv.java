/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rv extends cj {
    static uha field_n;
    eaa field_m;
    static kv[] field_k;
    static sna field_l;

    final at a(int param0, gj param1) {
        if (param0 != 5) {
            return null;
        }
        return (at) (Object) new jma(param1, (rv) this);
    }

    final void a(boolean param0, pp param1) {
        ((rv) this).field_m.a((bw) (Object) param1, param0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        var8 = 15 % ((-53 - param3) / 36);
        if (param2 == param4) {
          ur.a(param4, param7, param5, param0, param1, param6, 512);
          return;
        } else {
          if (param7 - param4 >= eo.field_l) {
            if (pw.field_x >= param4 + param7) {
              if (param5 - param2 >= an.field_q) {
                if (param2 + param5 <= ha.field_n) {
                  pw.a(true, param4, param1, param6, param5, param2, param0, param7);
                  return;
                } else {
                  eia.a(param0, param1, (byte) -95, param2, param6, param5, param7, param4);
                  return;
                }
              } else {
                eia.a(param0, param1, (byte) -95, param2, param6, param5, param7, param4);
                return;
              }
            } else {
              eia.a(param0, param1, (byte) -95, param2, param6, param5, param7, param4);
              return;
            }
          } else {
            eia.a(param0, param1, (byte) -95, param2, param6, param5, param7, param4);
            return;
          }
        }
    }

    final void a(op param0, boolean param1) {
        int var4 = 0;
        pp var5 = null;
        var4 = BachelorFridge.field_y;
        if (!param1) {
          var5 = (pp) (Object) ((rv) this).field_m.b((byte) 90);
          L0: while (true) {
            if (var5 == null) {
              return;
            } else {
              var5.a((aga) null, param0, 12);
              var5 = (pp) (Object) ((rv) this).field_m.c(0);
              continue L0;
            }
          }
        } else {
          rv.a(120, 93, 90, -30, -60, 118, -97, -20);
          var5 = (pp) (Object) ((rv) this).field_m.b((byte) 90);
          L1: while (true) {
            if (var5 == null) {
              return;
            } else {
              var5.a((aga) null, param0, 12);
              var5 = (pp) (Object) ((rv) this).field_m.c(0);
              continue L1;
            }
          }
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != -4) {
            return;
        }
        field_l = null;
        field_n = null;
    }

    rv(lu param0) {
        super(5);
        int var2 = 0;
        int var3 = 0;
        ((rv) this).field_m = new eaa();
        var2 = param0.b(16711935);
        L0: while (true) {
          var2--;
          if (var2 > -1) {
          } else {
            var3 = param0.b(16711935);
            if (-2 != var3) {
              if (var3 == 2) {
                ((rv) this).field_m.a((bw) (Object) db.a(param0, 95), true);
                continue L0;
              } else {
                if ((var3 ^ -1) == -4) {
                  ((rv) this).field_m.a((bw) (Object) hea.b(16866, param0), true);
                  continue L0;
                } else {
                  if ((var3 ^ -1) == -5) {
                    ((rv) this).field_m.a((bw) (Object) uha.b(param0, -7), true);
                    continue L0;
                  } else {
                    if (5 != var3) {
                      if ((var3 ^ -1) == -7) {
                        ((rv) this).field_m.a((bw) (Object) eo.a(param0, -4479), true);
                        continue L0;
                      } else {
                        if (var3 == 7) {
                          ((rv) this).field_m.a((bw) (Object) bea.a(-1547040176, param0), true);
                          continue L0;
                        } else {
                          throw new RuntimeException();
                        }
                      }
                    } else {
                      ((rv) this).field_m.a((bw) (Object) k.a(false, param0), true);
                      continue L0;
                    }
                  }
                }
              }
            } else {
              ((rv) this).field_m.a((bw) (Object) vo.a(-44, param0), true);
              continue L0;
            }
          }
        }
    }

    final void a(lu param0, int param1) {
        pp var3 = null;
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        param0.d(((rv) this).field_m.g(0), 0);
        if (param1 == -9) {
          var3 = (pp) (Object) ((rv) this).field_m.b((byte) 90);
          L0: while (true) {
            if (var3 != null) {
              L1: {
                if (!(var3 instanceof lia)) {
                  if (!(var3 instanceof qq)) {
                    if (var3 instanceof ks) {
                      param0.d(3, 0);
                      break L1;
                    } else {
                      if (!(var3 instanceof mh)) {
                        if (var3 instanceof kt) {
                          param0.d(5, 0);
                          break L1;
                        } else {
                          if (var3 instanceof fda) {
                            param0.d(6, param1 ^ -9);
                            break L1;
                          } else {
                            if (var3 instanceof ic) {
                              param0.d(7, 0);
                              break L1;
                            } else {
                              throw new RuntimeException();
                            }
                          }
                        }
                      } else {
                        param0.d(4, 0);
                        break L1;
                      }
                    }
                  } else {
                    param0.d(2, param1 ^ -9);
                    break L1;
                  }
                } else {
                  param0.d(1, 0);
                  break L1;
                }
              }
              var3.a(param0, (byte) -56);
              var3 = (pp) (Object) ((rv) this).field_m.c(param1 ^ -9);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public rv() {
        super(5);
        ((rv) this).field_m = new eaa();
    }

    static {
    }
}
