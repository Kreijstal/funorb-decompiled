/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends ne {
    static String field_k;
    gd field_l;
    private md field_m;
    private boolean field_i;
    static int[] field_j;

    final void a(byte param0) {
        ie var2 = null;
        int var3 = 0;
        var3 = DungeonAssault.field_K;
        if (param0 != 80) {
          return;
        } else {
          var2 = (ie) (Object) ((nn) this).field_m.e(param0 ^ -24124);
          L0: while (true) {
            if (var2 == null) {
              ((nn) this).field_l = null;
              return;
            } else {
              L1: {
                var2.field_m.field_p = mo.field_a;
                var2.field_m.field_m = -256 + mo.field_a;
                if (var2.field_m.field_B) {
                  var2.field_m.field_L = mo.field_a;
                  break L1;
                } else {
                  break L1;
                }
              }
              var2.field_m.field_B = false;
              var2 = (ie) (Object) ((nn) this).field_m.a(4);
              continue L0;
            }
          }
        }
    }

    nn(boolean param0) {
        ((nn) this).field_m = new md();
        ((nn) this).field_i = param0 ? true : false;
    }

    final void a(gd param0, int param1) {
        ie var3 = null;
        int var4 = 0;
        var4 = DungeonAssault.field_K;
        var3 = (ie) (Object) ((nn) this).field_m.e(-24172);
        if (param1 == -256) {
          L0: while (true) {
            if (var3 == null) {
              param0.field_C = mo.field_a;
              param0.field_B = true;
              ((nn) this).field_l = param0;
              return;
            } else {
              L1: {
                var3.field_m.field_m = mo.field_a + -256;
                var3.field_m.field_p = mo.field_a;
                if (var3.field_m == param0) {
                  break L1;
                } else {
                  if (var3.field_m.field_B) {
                    var3.field_m.field_B = false;
                    var3.field_m.field_L = mo.field_a;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              var3 = (ie) (Object) ((nn) this).field_m.a(4);
              continue L0;
            }
          }
        } else {
          ((nn) this).field_l = null;
          L2: while (true) {
            if (var3 == null) {
              param0.field_C = mo.field_a;
              param0.field_B = true;
              ((nn) this).field_l = param0;
              return;
            } else {
              L3: {
                var3.field_m.field_m = mo.field_a + -256;
                var3.field_m.field_p = mo.field_a;
                if (var3.field_m == param0) {
                  break L3;
                } else {
                  if (var3.field_m.field_B) {
                    var3.field_m.field_B = false;
                    var3.field_m.field_L = mo.field_a;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              var3 = (ie) (Object) ((nn) this).field_m.a(4);
              continue L2;
            }
          }
        }
    }

    private final void b(gd param0, int param1) {
        Object var3 = null;
        ie var3_ref = null;
        int var4 = 0;
        var3 = null;
        var4 = DungeonAssault.field_K;
        if (this != (Object) (Object) param0.field_M) {
          throw new RuntimeException();
        } else {
          if (param1 == 29339) {
            var3_ref = (ie) (Object) ((nn) this).field_m.e(-24172);
            L0: while (true) {
              if (var3_ref == null) {
                param0.field_M = null;
                return;
              } else {
                L1: {
                  if (var3_ref.field_m == param0) {
                    var3_ref.a(false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                var3_ref = (ie) (Object) ((nn) this).field_m.a(4);
                continue L0;
              }
            }
          } else {
            field_k = null;
            var3_ref = (ie) (Object) ((nn) this).field_m.e(-24172);
            L2: while (true) {
              if (var3_ref == null) {
                param0.field_M = null;
                return;
              } else {
                L3: {
                  if (var3_ref.field_m == param0) {
                    var3_ref.a(false);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3_ref = (ie) (Object) ((nn) this).field_m.a(4);
                continue L2;
              }
            }
          }
        }
    }

    final void a(gd param0, byte param1) {
        ie var3 = null;
        int var4 = 0;
        L0: {
          var4 = DungeonAssault.field_K;
          if (param0.field_M != null) {
            param0.field_M.b(param0, 29339);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_M = (nn) this;
        var3 = (ie) (Object) ((nn) this).field_m.e(param1 ^ 24184);
        L1: while (true) {
          if (var3 == null) {
            ((nn) this).field_m.a((ne) (Object) new ie(param0), false);
            if (param1 == -20) {
              return;
            } else {
              ((nn) this).field_l = null;
              return;
            }
          } else {
            if (param0 != var3.field_m) {
              var3 = (ie) (Object) ((nn) this).field_m.a(param1 + 24);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    public static void b(byte param0) {
        field_k = null;
        field_j = null;
        if (param0 == -80) {
            return;
        }
        nn.b((byte) 94);
    }

    final void a(byte param0, gd param1) {
        int var5 = DungeonAssault.field_K;
        if (!((nn) this).field_i) {
            return;
        }
        ie var3 = (ie) (Object) ((nn) this).field_m.e(-24172);
        while (var3 != null) {
            var3.field_m.field_m = -256 + mo.field_a;
            var3.field_m.field_p = mo.field_a;
            var3 = (ie) (Object) ((nn) this).field_m.a(4);
        }
        param1.field_L = mo.field_a;
        int var4 = 43 / ((param0 - -7) / 51);
        if (param1 == ((nn) this).field_l) {
            ((nn) this).field_l = null;
        } else {
            param1.field_B = false;
            return;
        }
        param1.field_B = false;
    }

    static {
    }
}
