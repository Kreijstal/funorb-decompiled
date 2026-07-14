/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ep extends f implements Cloneable {
    private int field_k;
    private f field_j;
    private int field_i;

    final void b(int param0, int param1, f[][] param2, int param3) {
        ((ep) this).field_j.b(101, param1, param2, param3);
        if (param0 <= 24) {
            int discarded$0 = ((ep) this).a((byte) 0);
        }
    }

    final int d(int param0) {
        if (param0 >= -77) {
            ((ep) this).field_k = 30;
            return ((ep) this).field_j.d(-82);
        }
        return ((ep) this).field_j.d(-82);
    }

    final static boolean a(char param0, byte param1) {
        if (param1 == -14) {
          if (65 > param0) {
            if (param0 >= 97) {
              if (param0 <= 122) {
                return true;
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            if (param0 > 90) {
              if (param0 >= 97) {
                if (param0 > 122) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return true;
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            return -79;
        }
        return 0;
    }

    final static wj[] a(db param0, String param1, String param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param0.a(param2, -1);
        if (param3) {
          int discarded$2 = ep.c((byte) -89);
          var5 = param0.a(-2862, param1, var4);
          return qk.a(false, var4, param0, var5);
        } else {
          var5 = param0.a(-2862, param1, var4);
          return qk.a(false, var4, param0, var5);
        }
    }

    protected final Object clone() {
        ep var1 = (ep) super.clone();
        var1.field_j = (f) var1.field_j.clone();
        return (Object) (Object) var1;
    }

    final void a(int param0, int param1, int param2, DataInputStream param3, byte param4) throws IOException {
        ((ep) this).field_j = ff.a(param0, param1, 1, param2, param3);
        if (param4 != -35) {
            int discarded$0 = ((ep) this).a((byte) 87);
            return;
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 != -29660) {
            ((ep) this).field_i = -116;
        }
    }

    final static int c(byte param0) {
        if (param0 != 112) {
            return -103;
        }
        return lg.field_b;
    }

    final void b(boolean param0, boolean param1) {
        ((ep) this).field_j.b(param0, param1);
    }

    final int a(byte param0) {
        if (param0 > -34) {
            ((ep) this).field_i = -99;
            return ((ep) this).field_j.a((byte) -39);
        }
        return ((ep) this).field_j.a((byte) -39);
    }

    final int a(int param0, int param1, int param2, fq param3, int param4) {
        if (((ep) this).field_k == param4) {
          if (0 != ((ep) this).field_i) {
            if (param0 != -9352) {
              int discarded$2 = ((ep) this).d(-6);
              return 0;
            } else {
              return 0;
            }
          } else {
            mb.field_g = mb.field_g - 128;
            fn.field_j = fn.field_j - 128;
            fp.field_a = fp.field_a + 2;
            we.field_h = we.field_h + 2;
            je.field_j = je.field_j + 1;
            b.field_a = b.field_a + 1;
            fn.field_j = fn.field_j + ob.field_l;
            wd.field_j = wd.field_j - 1;
            pm.field_b.a(128, param1 * 12, 12 * param2, 0, (byte) -111);
            ((ep) this).field_i = 1;
            ((ep) this).a((byte) 74, (f) (Object) param3);
            ((ep) this).field_j.a((byte) 87, (f) (Object) param3);
            return 1;
          }
        } else {
          if (param0 != -9352) {
            int discarded$3 = ((ep) this).d(-6);
            return 0;
          } else {
            return 0;
          }
        }
    }

    final void a(int param0, int param1) {
        if (param1 < 61) {
          ((ep) this).a(-85, 60, 47, false, -57, 25);
          ((ep) this).field_k = param0;
          return;
        } else {
          ((ep) this).field_k = param0;
          return;
        }
    }

    final void a(int param0, int param1, int param2, f[][] param3) {
        ((ep) this).field_j.a(param0, param1, param2, param3);
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          ((ep) this).field_j.a(param3, param4, false, param0, param5, param2);
          if (!param3) {
            stackOut_2_0 = ((ep) this).field_i;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 18;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var7 = stackIn_3_0;
        if (24 == param2) {
          if (param0 == 24) {
            if (var7 > 1) {
              bb.field_y[var7 / 2].c(param5, param4 + -param0, f.field_g[((ep) this).field_k]);
              var8 = ((24 - var7) * param2 + 23) / 24;
              var9 = (param0 * (-var7 + 24) - -23) / 24;
              if (var8 < param2) {
                if (param0 <= var9) {
                  v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[((ep) this).field_k]);
                  var8 = 32 % ((param1 - -70) / 33);
                  return;
                } else {
                  ((ep) this).field_j.a(-125, param3, param2 - var8, var8 + param5, param4 - -var9, param0 + -var9);
                  v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[((ep) this).field_k]);
                  var8 = 32 % ((param1 - -70) / 33);
                  return;
                }
              } else {
                v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[((ep) this).field_k]);
                var8 = 32 % ((param1 - -70) / 33);
                return;
              }
            } else {
              v.field_b[var7 / 2].c(param5, param4 - param0, f.field_g[((ep) this).field_k]);
              var8 = 32 % ((param1 - -70) / 33);
              return;
            }
          } else {
            if (var7 > 1) {
              bb.field_y[var7 / 2].b(param5, param4 - param0, 2 * param2, param0 * 3, f.field_g[((ep) this).field_k]);
              var8 = ((24 + -var7) * param2 - -23) / 24;
              var9 = (param0 * (24 + -var7) + 23) / 24;
              if (param2 > var8) {
                if (param0 <= var9) {
                  v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
                  var8 = 32 % ((param1 - -70) / 33);
                  return;
                } else {
                  ((ep) this).field_j.a(-128, param3, param2 - var8, param5 + var8, param4 - -var9, param0 + -var9);
                  v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
                  var8 = 32 % ((param1 - -70) / 33);
                  return;
                }
              } else {
                v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
                var8 = 32 % ((param1 - -70) / 33);
                return;
              }
            } else {
              v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
              var8 = 32 % ((param1 - -70) / 33);
              return;
            }
          }
        } else {
          if (var7 > 1) {
            bb.field_y[var7 / 2].b(param5, param4 - param0, 2 * param2, param0 * 3, f.field_g[((ep) this).field_k]);
            var8 = ((24 + -var7) * param2 - -23) / 24;
            var9 = (param0 * (24 + -var7) + 23) / 24;
            if (param2 > var8) {
              if (param0 <= var9) {
                v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
                var8 = 32 % ((param1 - -70) / 33);
                return;
              } else {
                ((ep) this).field_j.a(-128, param3, param2 - var8, param5 + var8, param4 - -var9, param0 + -var9);
                v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
                var8 = 32 % ((param1 - -70) / 33);
                return;
              }
            } else {
              v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
              var8 = 32 % ((param1 - -70) / 33);
              return;
            }
          } else {
            v.field_b[var7 / 2].b(param5, param4 + -param0, 2 * param2, 3 * param0, f.field_g[((ep) this).field_k]);
            var8 = 32 % ((param1 - -70) / 33);
            return;
          }
        }
    }

    final nj a(int param0, nj param1) {
        if (param0 != 23525) {
          ((ep) this).a(-24, -83, 51, true, 50, -127);
          return ng.a(qh.field_g, param1, (f) (Object) new ep((f) (Object) new kp(-1), ((ep) this).field_k), (byte) -83, rb.field_j);
        } else {
          return ng.a(qh.field_g, param1, (f) (Object) new ep((f) (Object) new kp(-1), ((ep) this).field_k), (byte) -83, rb.field_j);
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3) {
        if (param0 > 106) {
          if (((ep) this).field_i > 0) {
            ((ep) this).field_i = ((ep) this).field_i + 1;
            if (24 != ((ep) this).field_i) {
              return (f) this;
            } else {
              return ((ep) this).field_j;
            }
          } else {
            return (f) this;
          }
        } else {
          return null;
        }
    }

    ep(f param0, int param1) {
        ((ep) this).field_i = 0;
        ((ep) this).field_j = param0;
        ((ep) this).field_k = param1;
    }

    static {
    }
}
