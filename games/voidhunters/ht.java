/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ht extends f {
    static String field_h;
    ij field_k;
    private hbb field_i;
    qkb field_j;

    final f a() {
        fkb var1 = null;
        L0: while (true) {
          var1 = (fkb) (Object) ((ht) this).field_k.a((byte) 30);
          if (var1 != null) {
            if (null != var1.field_j) {
              return (f) (Object) var1.field_j;
            } else {
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    final static float[] a(int param0, int param1, float[] param2) {
        float[] var4 = new float[param0];
        float[] var3 = var4;
        cua.a(param2, 0, var4, param1, param0);
        return var4;
    }

    final f c() {
        fkb var1 = (fkb) (Object) ((ht) this).field_k.d(0);
        if (var1 == null) {
            return null;
        }
        if (!(var1.field_j == null)) {
            return (f) (Object) var1.field_j;
        }
        return ((ht) this).a();
    }

    final int d() {
        return 0;
    }

    private final void a(fkb param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        hbb stackIn_17_0 = null;
        fkb stackIn_17_1 = null;
        hbb stackIn_18_0 = null;
        fkb stackIn_18_1 = null;
        hbb stackIn_19_0 = null;
        fkb stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        hbb stackOut_16_0 = null;
        fkb stackOut_16_1 = null;
        hbb stackOut_18_0 = null;
        fkb stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        hbb stackOut_17_0 = null;
        fkb stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        if ((4 & ((ht) this).field_i.field_v[param0.field_o]) != 0) {
          if (-1 < (param0.field_v ^ -1)) {
            var4 = ((ht) this).field_i.field_l[param0.field_o] / vka.field_s;
            var5 = (-param0.field_p + var4 + 1048575) / var4;
            param0.field_p = 1048575 & param0.field_p + param2 * var4;
            if (param2 >= var5) {
              if (((ht) this).field_i.field_j[param0.field_o] == 0) {
                L0: {
                  param0.field_j = fga.b(param0.field_y, param0.field_j.k(), param0.field_j.f(), param0.field_j.h());
                  if ((param0.field_n.field_e[param0.field_x] ^ -1) > -1) {
                    param0.field_j.d(-1);
                    break L0;
                  } else {
                    break L0;
                  }
                }
                param2 = param0.field_p / var4;
                param0.field_j.a(param2);
                if (param1 == -1) {
                  return;
                } else {
                  field_h = null;
                  return;
                }
              } else {
                L1: {
                  param0.field_j = fga.b(param0.field_y, param0.field_j.k(), 0, param0.field_j.h());
                  stackOut_16_0 = ((ht) this).field_i;
                  stackOut_16_1 = (fkb) param0;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  if (-1 >= (param0.field_n.field_e[param0.field_x] ^ -1)) {
                    stackOut_18_0 = (hbb) (Object) stackIn_18_0;
                    stackOut_18_1 = (fkb) (Object) stackIn_18_1;
                    stackOut_18_2 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    stackIn_19_2 = stackOut_18_2;
                    break L1;
                  } else {
                    stackOut_17_0 = (hbb) (Object) stackIn_17_0;
                    stackOut_17_1 = (fkb) (Object) stackIn_17_1;
                    stackOut_17_2 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    stackIn_19_2 = stackOut_17_2;
                    break L1;
                  }
                }
                L2: {
                  ((hbb) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2 != 0, true);
                  if ((param0.field_n.field_e[param0.field_x] ^ -1) > -1) {
                    param0.field_j.d(-1);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param2 = param0.field_p / var4;
                param0.field_j.a(param2);
                if (param1 == -1) {
                  return;
                } else {
                  field_h = null;
                  return;
                }
              }
            } else {
              param0.field_j.a(param2);
              if (param1 == -1) {
                return;
              } else {
                field_h = null;
                return;
              }
            }
          } else {
            param0.field_j.a(param2);
            if (param1 == -1) {
              return;
            } else {
              field_h = null;
              return;
            }
          }
        } else {
          param0.field_j.a(param2);
          if (param1 == -1) {
            return;
          } else {
            field_h = null;
            return;
          }
        }
    }

    final void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        fkb var6 = null;
        int var7 = 0;
        var7 = VoidHunters.field_G;
        ((ht) this).field_j.a(param0, param1, param2);
        var6 = (fkb) (Object) ((ht) this).field_k.d(0);
        L0: while (true) {
          if (var6 != null) {
            L1: {
              if (!((ht) this).field_i.a(var6, 0)) {
                var5 = param2;
                var4 = param1;
                L2: while (true) {
                  if (var5 <= var6.field_k) {
                    this.a(var4, var5 + var4, var6, param0, var5, (byte) 12);
                    var6.field_k = var6.field_k - var5;
                    break L1;
                  } else {
                    this.a(var4, var5 + var4, var6, param0, var6.field_k, (byte) 26);
                    var5 = var5 - var6.field_k;
                    var4 = var4 + var6.field_k;
                    if (((ht) this).field_i.a(var4, param0, var5, var6, (byte) -12)) {
                      break L1;
                    } else {
                      continue L2;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var6 = (fkb) (Object) ((ht) this).field_k.a((byte) 103);
            continue L0;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, int param1, fkb param2, int[] param3, int param4, byte param5) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        fga var11 = null;
        int var12 = 0;
        hbb stackIn_17_0 = null;
        fkb stackIn_17_1 = null;
        hbb stackIn_18_0 = null;
        fkb stackIn_18_1 = null;
        hbb stackIn_19_0 = null;
        fkb stackIn_19_1 = null;
        int stackIn_19_2 = 0;
        hbb stackOut_16_0 = null;
        fkb stackOut_16_1 = null;
        hbb stackOut_18_0 = null;
        fkb stackOut_18_1 = null;
        int stackOut_18_2 = 0;
        hbb stackOut_17_0 = null;
        fkb stackOut_17_1 = null;
        int stackOut_17_2 = 0;
        var12 = VoidHunters.field_G;
        if (0 != (((ht) this).field_i.field_v[param2.field_o] & 4)) {
          if (param2.field_v < 0) {
            var7 = ((ht) this).field_i.field_l[param2.field_o] / vka.field_s;
            L0: while (true) {
              var8 = (1048575 + (var7 - param2.field_p)) / var7;
              if (param4 < var8) {
                param2.field_p = param2.field_p + param4 * var7;
                param2.field_j.a(param3, param0, param4);
                if (param5 < 11) {
                  ((ht) this).field_j = null;
                  return;
                } else {
                  return;
                }
              } else {
                L1: {
                  param2.field_j.a(param3, param0, var8);
                  param2.field_p = param2.field_p + (var7 * var8 + -1048576);
                  param0 = param0 + var8;
                  param4 = param4 - var8;
                  var9 = vka.field_s / 100;
                  var10 = 262144 / var7;
                  if (var9 > var10) {
                    var9 = var10;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  var11 = param2.field_j;
                  if (((ht) this).field_i.field_j[param2.field_o] == 0) {
                    param2.field_j = fga.b(param2.field_y, var11.k(), var11.f(), var11.h());
                    break L2;
                  } else {
                    L3: {
                      param2.field_j = fga.b(param2.field_y, var11.k(), 0, var11.h());
                      stackOut_16_0 = ((ht) this).field_i;
                      stackOut_16_1 = (fkb) param2;
                      stackIn_18_0 = stackOut_16_0;
                      stackIn_18_1 = stackOut_16_1;
                      stackIn_17_0 = stackOut_16_0;
                      stackIn_17_1 = stackOut_16_1;
                      if (0 <= param2.field_n.field_e[param2.field_x]) {
                        stackOut_18_0 = (hbb) (Object) stackIn_18_0;
                        stackOut_18_1 = (fkb) (Object) stackIn_18_1;
                        stackOut_18_2 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        break L3;
                      } else {
                        stackOut_17_0 = (hbb) (Object) stackIn_17_0;
                        stackOut_17_1 = (fkb) (Object) stackIn_17_1;
                        stackOut_17_2 = 1;
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_19_2 = stackOut_17_2;
                        break L3;
                      }
                    }
                    ((hbb) (Object) stackIn_19_0).a(stackIn_19_1, stackIn_19_2 != 0, true);
                    param2.field_j.d(var9, var11.f());
                    break L2;
                  }
                }
                L4: {
                  if ((param2.field_n.field_e[param2.field_x] ^ -1) > -1) {
                    param2.field_j.d(-1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var11.f(var9);
                var11.a(param3, param0, param1 - param0);
                if (var11.g()) {
                  ((ht) this).field_j.b((f) (Object) var11);
                  continue L0;
                } else {
                  continue L0;
                }
              }
            }
          } else {
            param2.field_j.a(param3, param0, param4);
            if (param5 < 11) {
              ((ht) this).field_j = null;
              return;
            } else {
              return;
            }
          }
        } else {
          param2.field_j.a(param3, param0, param4);
          if (param5 < 11) {
            ((ht) this).field_j = null;
            return;
          } else {
            return;
          }
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        if (!param0) {
            return;
        }
        Object var2 = null;
        float[] discarded$0 = ht.a(-65, -20, (float[]) null);
    }

    final void a(int param0) {
        int var2 = 0;
        fkb var3 = null;
        int var4 = 0;
        var4 = VoidHunters.field_G;
        ((ht) this).field_j.a(param0);
        var3 = (fkb) (Object) ((ht) this).field_k.d(0);
        L0: while (true) {
          if (var3 != null) {
            L1: {
              if (!((ht) this).field_i.a(var3, 0)) {
                var2 = param0;
                L2: while (true) {
                  if (var3.field_k >= var2) {
                    this.a(var3, -1, var2);
                    var3.field_k = var3.field_k - var2;
                    break L1;
                  } else {
                    this.a(var3, -1, var3.field_k);
                    var2 = var2 - var3.field_k;
                    if (!((ht) this).field_i.a(0, (int[]) null, var2, var3, (byte) -68)) {
                      continue L2;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            var3 = (fkb) (Object) ((ht) this).field_k.a((byte) 99);
            continue L0;
          } else {
            return;
          }
        }
    }

    ht(hbb param0) {
        ((ht) this).field_k = new ij();
        ((ht) this).field_j = new qkb();
        ((ht) this).field_i = param0;
    }

    static {
    }
}
