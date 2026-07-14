/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class pn extends f {
    boolean field_j;
    f field_l;
    boolean field_k;
    static wj[] field_i;

    void a(int param0, int param1, int param2, f[][] param3, int param4, int param5, int param6, int param7) {
        ((pn) this).field_l.a(99, param1, param2, param3, param4, param5, param6, param7);
        if (param0 < 92) {
            field_i = null;
        }
    }

    final void b(boolean param0, boolean param1) {
        ((pn) this).c(param0, param1);
        ((pn) this).field_l.b(true, param1);
    }

    final void a(boolean param0, int param1, boolean param2, int param3, int param4, int param5) {
        ((pn) this).field_l.a(param0, param1, param2, param3, param4, param5);
    }

    void c(boolean param0, boolean param1) {
        if (!param0) {
            field_i = null;
        }
    }

    final static boolean a(boolean param0, char param1) {
        char[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        char[] var8 = null;
        char[] var17 = null;
        char[] var20 = null;
        char[] var21 = null;
        char[] var24 = null;
        char[] var33 = null;
        char[] var36 = null;
        char[] var37 = null;
        var5 = CrazyCrystals.field_B;
        if (0 >= param1) {
          if (param1 >= 160) {
            if (param1 <= 255) {
              return true;
            } else {
              if (param0) {
                if (param1 != 0) {
                  var37 = tg.field_d;
                  var21 = var37;
                  var6 = var21;
                  var2 = var6;
                  var3 = 0;
                  L0: while (true) {
                    if (var37.length <= var3) {
                      return false;
                    } else {
                      var4 = var37[var3];
                      if (var4 != param1) {
                        var3++;
                        continue L0;
                      } else {
                        return true;
                      }
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            if (param0) {
              if (param1 != 0) {
                var36 = tg.field_d;
                var20 = var36;
                var6 = var20;
                var2 = var6;
                var3 = 0;
                L1: while (true) {
                  if (var36.length <= var3) {
                    return false;
                  } else {
                    var4 = var36[var3];
                    if (var4 != param1) {
                      var3++;
                      continue L1;
                    } else {
                      return true;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          if (param1 >= 128) {
            if (param1 >= 160) {
              if (param1 > 255) {
                if (param0) {
                  if (param1 != 0) {
                    var33 = tg.field_d;
                    var17 = var33;
                    var6 = var17;
                    var2 = var6;
                    var3 = 0;
                    L2: while (true) {
                      if (var33.length <= var3) {
                        return false;
                      } else {
                        var4 = var33[var3];
                        if (var4 != param1) {
                          var3++;
                          continue L2;
                        } else {
                          return true;
                        }
                      }
                    }
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              if (param0) {
                if (param1 != 0) {
                  var24 = tg.field_d;
                  var8 = var24;
                  var6 = var8;
                  var2 = var6;
                  var3 = 0;
                  L3: while (true) {
                    if (var24.length > var3) {
                      var4 = var24[var3];
                      if (var4 != param1) {
                        var3++;
                        continue L3;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
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
    }

    final static int b(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = param0 >> -1561565680;
        var4 = 65535 & param0;
        var5 = param2 >> 1978595920;
        var6 = param2 & 65535;
        if (param1 != 160) {
          boolean discarded$2 = pn.a(false, 't');
          return var5 * var4 + param2 * var3 - -(var6 * var4 >> -1320975440);
        } else {
          return var5 * var4 + param2 * var3 - -(var6 * var4 >> -1320975440);
        }
    }

    nj a(int param0, nj param1) {
        if (param0 != 23525) {
            ((pn) this).field_k = true;
            return ((pn) this).field_l.a(23525, param1);
        }
        return ((pn) this).field_l.a(23525, param1);
    }

    int d(byte param0) {
        if (param0 > -40) {
            f discarded$0 = ((pn) this).b((f[][]) null, -105, (byte) 127, 83);
            return -1;
        }
        return -1;
    }

    public static void c(byte param0) {
        if (param0 < 105) {
            return;
        }
        field_i = null;
    }

    final void a(int param0, int param1, int param2, DataInputStream param3, byte param4) throws IOException {
        if (param4 != -35) {
          return;
        } else {
          ((pn) this).field_l = ff.a(param0, param1, param4 + 36, param2, param3);
          ((pn) this).a(param1, param3, param2, (byte) -78, param0);
          return;
        }
    }

    void a(f[][] param0, int param1, int param2, boolean param3) {
        if (param3) {
            field_i = null;
        }
    }

    void a(int param0, DataInputStream param1, int param2, byte param3, int param4) throws IOException {
        if (param3 >= -69) {
            ((pn) this).field_j = false;
            return;
        }
    }

    f b(f[][] param0, int param1, byte param2, int param3) {
        int var5 = 65 % ((-43 - param2) / 51);
        return (f) this;
    }

    void a(fq param0, int param1) {
        if (param1 <= 126) {
            field_i = null;
            ((pn) this).field_l.a(param0, 127);
            return;
        }
        ((pn) this).field_l.a(param0, 127);
    }

    final void a(f[][] param0, int param1, int param2, int param3) {
        ((pn) this).field_l.a(param0, param1, param2, -93);
        if (((pn) this).field_j) {
          return;
        } else {
          if (param3 > -8) {
            field_i = null;
            ((pn) this).a(param0, param1, param2, false);
            return;
          } else {
            ((pn) this).a(param0, param1, param2, false);
            return;
          }
        }
    }

    protected Object clone() {
        pn var1 = (pn) super.clone();
        var1.field_l = (f) var1.field_l.clone();
        return (Object) (Object) var1;
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        ((pn) this).field_l.a(-116, param1, param2, param3, param4, param5);
        ((pn) this).b(-94, param2, param5, param1, param3, param4);
        if (param0 > -104) {
            ((pn) this).a(-25, -57, 24);
        }
    }

    final void a(int param0, int param1, int param2) {
        ((pn) this).field_l.a(param0, param1, param2);
    }

    void a(int param0, f[][] param1, int param2, int param3) {
        if (param0 != -35) {
            ((pn) this).field_j = false;
        }
    }

    final void a(int param0, int param1, int param2, f[][] param3) {
        ((pn) this).field_l.a(param0 ^ 0, param1, param2, param3);
        if (param0 != 393989) {
          return;
        } else {
          ((pn) this).a(-35, param3, param2, param1);
          return;
        }
    }

    final int d(int param0) {
        if (param0 > -77) {
          f discarded$2 = ((pn) this).a(-116, (f[][]) null, true, 66);
          return ((pn) this).field_l.d(-79) & ((pn) this).d((byte) -50);
        } else {
          return ((pn) this).field_l.d(-79) & ((pn) this).d((byte) -50);
        }
    }

    final void b(int param0, int param1, f[][] param2, int param3) {
        ((pn) this).field_l.b(127, param1, param2, param3);
        if (param0 < 24) {
          ((pn) this).a(-115, -9, -27, (f[][]) null, -113, -120, -81, -14);
          ((pn) this).c(param1, 0, param2, param3);
          return;
        } else {
          ((pn) this).c(param1, 0, param2, param3);
          return;
        }
    }

    f a(int param0, f[][] param1, boolean param2, int param3) {
        ((pn) this).field_j = false;
        ((pn) this).field_k = false;
        ((pn) this).field_l = ((pn) this).field_l.a(param0, param1, param2, param3);
        return (f) this;
    }

    abstract void b(int param0, int param1, int param2, boolean param3, int param4, int param5);

    final int a(int param0, int param1, int param2, fq param3, int param4) {
        if (param0 != -9352) {
          f discarded$2 = ((pn) this).a(103, (byte) 60, 20);
          return ((pn) this).field_l.a(-9352, param1, param2, param3, param4);
        } else {
          return ((pn) this).field_l.a(-9352, param1, param2, param3, param4);
        }
    }

    final f a(int param0, int param1, f[][] param2, int param3) {
        ((pn) this).field_l = ((pn) this).field_l.a(110, param1, param2, param3);
        if (param0 > 106) {
          if (!((pn) this).field_j) {
            if (((pn) this).field_k) {
              return (f) this;
            } else {
              return ((pn) this).b(param2, param1, (byte) -98, param3);
            }
          } else {
            return (f) this;
          }
        } else {
          f discarded$12 = ((pn) this).a(-114, (f[][]) null, false, 61);
          if (!((pn) this).field_j) {
            if (((pn) this).field_k) {
              return (f) this;
            } else {
              return ((pn) this).b(param2, param1, (byte) -98, param3);
            }
          } else {
            return (f) this;
          }
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5) {
        int var7 = 56 / ((-70 - param1) / 33);
        ((pn) this).field_l.a(param0, -18, param2, param3, param4, param5);
        ((pn) this).b(-9, param2, param0, param3, param5, param4);
    }

    f c(int param0) {
        ((pn) this).field_l = ((pn) this).field_l.c(param0);
        return (f) this;
    }

    void a(f[][] param0, int param1, byte param2, int param3) {
        ((pn) this).field_l.a(param0, param1, param2, param3);
    }

    f a(int param0, byte param1, int param2) {
        ((pn) this).field_l = ((pn) this).field_l.a(param0, param1, param2);
        return (f) this;
    }

    void c(int param0, int param1, f[][] param2, int param3) {
        if (param1 != 0) {
            f discarded$0 = ((pn) this).a(3, (byte) -106, -30);
        }
    }

    pn(f param0) {
        ((pn) this).field_l = param0;
    }

    static {
    }
}
