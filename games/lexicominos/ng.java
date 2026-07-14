/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    kd field_b;
    private kd field_a;

    final static void a(int param0, le param1, byte param2, le param3) {
        int var4 = 88 % ((35 - param2) / 55);
        nb.field_x = param0;
        fb.field_m = param1;
        pb.field_i = param3;
        Lexicominos.a(lf.field_f / 2, 67, lf.field_a / 2);
        vc.a(-5094, param1.field_t, param1.field_t + param1.field_G, param3.field_t, param3.field_G + param3.field_t);
    }

    final kd a(byte param0) {
        kd var2 = null;
        int var3 = 0;
        var3 = -7 / ((param0 - 3) / 33);
        var2 = ((ng) this).field_b.field_f;
        if (var2 == ((ng) this).field_b) {
          return null;
        } else {
          var2.b((byte) -120);
          return var2;
        }
    }

    private final void a(kd param0, ng param1, byte param2) {
        kd var4 = null;
        if (param2 != -9) {
          L0: {
            ((ng) this).g(-7);
            var4 = ((ng) this).field_b.field_c;
            ((ng) this).field_b.field_c = param0.field_c;
            param0.field_c.field_f = ((ng) this).field_b;
            if (param0 != ((ng) this).field_b) {
              param0.field_c = param1.field_b.field_c;
              param0.field_c.field_f = param0;
              param1.field_b.field_c = var4;
              var4.field_f = param1.field_b;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            var4 = ((ng) this).field_b.field_c;
            ((ng) this).field_b.field_c = param0.field_c;
            param0.field_c.field_f = ((ng) this).field_b;
            if (param0 != ((ng) this).field_b) {
              param0.field_c = param1.field_b.field_c;
              param0.field_c.field_f = param0;
              param1.field_b.field_c = var4;
              var4.field_f = param1.field_b;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final static int a(byte param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        var3 = 1;
        L0: while (true) {
          if (1 >= param1) {
            if (param0 == -11) {
              if (param1 == 1) {
                return var3 * param2;
              } else {
                return var3;
              }
            } else {
              var5 = null;
              ng.a(56, (le) null, (byte) 99, (le) null);
              if (param1 == 1) {
                return var3 * param2;
              } else {
                return var3;
              }
            }
          } else {
            L1: {
              if (0 != (param1 & 1)) {
                var3 = var3 * param2;
                break L1;
              } else {
                break L1;
              }
            }
            param2 = param2 * param2;
            param1 = param1 >> 1;
            continue L0;
          }
        }
    }

    final kd d(int param0) {
        kd var2 = null;
        var2 = ((ng) this).field_a;
        if (var2 == ((ng) this).field_b) {
          ((ng) this).field_a = null;
          return null;
        } else {
          if (param0 != 0) {
            return null;
          } else {
            ((ng) this).field_a = var2.field_c;
            return var2;
          }
        }
    }

    final void a(ng param0, int param1) {
        int var3 = -10 / ((-70 - param1) / 50);
        this.a(((ng) this).field_b.field_f, param0, (byte) -9);
    }

    final void g(int param0) {
        kd var2 = null;
        int var3 = 0;
        Object var4 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        L0: while (true) {
          var2 = ((ng) this).field_b.field_f;
          if (((ng) this).field_b == var2) {
            ((ng) this).field_a = null;
            if (param0 <= -74) {
              return;
            } else {
              var4 = null;
              ((ng) this).a((ng) null, 9);
              return;
            }
          } else {
            var2.b((byte) -117);
            continue L0;
          }
        }
    }

    final kd a(int param0) {
        kd var2 = null;
        if (param0 == 31334) {
          var2 = ((ng) this).field_b.field_c;
          if (var2 == ((ng) this).field_b) {
            return null;
          } else {
            var2.b((byte) -126);
            return var2;
          }
        } else {
          kd discarded$2 = ((ng) this).f(-3);
          var2 = ((ng) this).field_b.field_c;
          if (var2 == ((ng) this).field_b) {
            return null;
          } else {
            var2.b((byte) -126);
            return var2;
          }
        }
    }

    final void b(int param0, kd param1) {
        L0: {
          if (param1.field_c != null) {
            param1.b((byte) -117);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 < 98) {
          return;
        } else {
          param1.field_c = ((ng) this).field_b.field_c;
          param1.field_f = ((ng) this).field_b;
          param1.field_c.field_f = param1;
          param1.field_f.field_c = param1;
          return;
        }
    }

    final void a(int param0, kd param1) {
        L0: {
          if (null != param1.field_c) {
            param1.b((byte) -128);
            break L0;
          } else {
            break L0;
          }
        }
        param1.field_f = ((ng) this).field_b.field_f;
        param1.field_c = ((ng) this).field_b;
        param1.field_c.field_f = param1;
        param1.field_f.field_c = param1;
        if (param0 <= -56) {
          return;
        } else {
          ((ng) this).field_b = null;
          return;
        }
    }

    final kd c(int param0) {
        kd var2 = null;
        var2 = ((ng) this).field_b.field_c;
        if (param0 == 2) {
          if (((ng) this).field_b == var2) {
            ((ng) this).field_a = null;
            return null;
          } else {
            ((ng) this).field_a = var2.field_c;
            return var2;
          }
        } else {
          ((ng) this).field_a = null;
          if (((ng) this).field_b == var2) {
            ((ng) this).field_a = null;
            return null;
          } else {
            ((ng) this).field_a = var2.field_c;
            return var2;
          }
        }
    }

    final kd f(int param0) {
        kd var2 = null;
        if (param0 == 2) {
          var2 = ((ng) this).field_a;
          if (((ng) this).field_b == var2) {
            ((ng) this).field_a = null;
            return null;
          } else {
            ((ng) this).field_a = var2.field_f;
            return var2;
          }
        } else {
          ((ng) this).field_a = null;
          var2 = ((ng) this).field_a;
          if (((ng) this).field_b == var2) {
            ((ng) this).field_a = null;
            return null;
          } else {
            ((ng) this).field_a = var2.field_f;
            return var2;
          }
        }
    }

    final boolean e(int param0) {
        int var2 = 113 / ((31 - param0) / 57);
        return ((ng) this).field_b.field_f == ((ng) this).field_b ? true : false;
    }

    final kd a(boolean param0) {
        kd var2 = null;
        var2 = ((ng) this).field_b.field_f;
        if (param0) {
          if (((ng) this).field_b == var2) {
            ((ng) this).field_a = null;
            return null;
          } else {
            ((ng) this).field_a = var2.field_f;
            return var2;
          }
        } else {
          ((ng) this).field_a = null;
          if (((ng) this).field_b == var2) {
            ((ng) this).field_a = null;
            return null;
          } else {
            ((ng) this).field_a = var2.field_f;
            return var2;
          }
        }
    }

    final int b(int param0) {
        int var2 = 0;
        kd var3 = null;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        var2 = 0;
        var3 = ((ng) this).field_b.field_f;
        if (param0 == 2) {
          L0: while (true) {
            if (var3 == ((ng) this).field_b) {
              return var2;
            } else {
              var3 = var3.field_f;
              var2++;
              continue L0;
            }
          }
        } else {
          return 80;
        }
    }

    public ng() {
        ((ng) this).field_b = new kd();
        ((ng) this).field_b.field_c = ((ng) this).field_b;
        ((ng) this).field_b.field_f = ((ng) this).field_b;
    }

    static {
    }
}
