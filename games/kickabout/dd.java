/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    int field_b;
    private int field_j;
    private nm field_e;
    private nm[] field_d;
    private int field_a;
    static int field_f;
    private int[] field_g;
    private int field_h;
    static long field_c;
    private int field_i;

    final boolean a(int param0) {
        int var2 = 0;
        if (null != ((dd) this).field_d) {
          if (0 <= ((dd) this).field_i) {
            L0: {
              ((dd) this).field_g[((dd) this).field_i] = ((dd) this).field_g[((dd) this).field_i] - 1;
              if (((dd) this).field_g[((dd) this).field_i] >= 0) {
                break L0;
              } else {
                L1: {
                  var2 = ((dd) this).field_i;
                  ((dd) this).a(((dd) this).field_d[((dd) this).field_i], (byte) -107);
                  ((dd) this).field_i = var2;
                  ((dd) this).field_d[((dd) this).field_i] = null;
                  ((dd) this).field_i = ((dd) this).field_i + 1;
                  if (((dd) this).field_i == ((dd) this).field_d.length) {
                    ((dd) this).field_i = 0;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                if (((dd) this).field_d[((dd) this).field_i] == null) {
                  ((dd) this).field_i = -1;
                  break L0;
                } else {
                  if (param0 >= 121) {
                    if (null == ((dd) this).field_e) {
                      return true;
                    } else {
                      ((dd) this).field_h = ((dd) this).field_h - 1;
                      if ((((dd) this).field_h ^ -1) >= -1) {
                        return this.c(0);
                      } else {
                        return false;
                      }
                    }
                  } else {
                    return true;
                  }
                }
              }
            }
            if (param0 >= 121) {
              if (null == ((dd) this).field_e) {
                return true;
              } else {
                ((dd) this).field_h = ((dd) this).field_h - 1;
                if ((((dd) this).field_h ^ -1) >= -1) {
                  return this.c(0);
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          } else {
            if (param0 >= 121) {
              if (null == ((dd) this).field_e) {
                return true;
              } else {
                ((dd) this).field_h = ((dd) this).field_h - 1;
                if ((((dd) this).field_h ^ -1) >= -1) {
                  return this.c(0);
                } else {
                  return false;
                }
              }
            } else {
              return true;
            }
          }
        } else {
          if (param0 >= 121) {
            if (null == ((dd) this).field_e) {
              return true;
            } else {
              ((dd) this).field_h = ((dd) this).field_h - 1;
              if ((((dd) this).field_h ^ -1) < -1) {
                return false;
              } else {
                return this.c(0);
              }
            }
          } else {
            return true;
          }
        }
    }

    private final void b(boolean param0) {
        ((dd) this).field_h = 0;
        ((dd) this).field_j = 0;
        ((dd) this).field_a = 0;
        if (!param0) {
          ((dd) this).field_h = -23;
          ((dd) this).field_b = 0;
          return;
        } else {
          ((dd) this).field_b = 0;
          return;
        }
    }

    final static hd b(int param0) {
        if (param0 > -108) {
            return null;
        }
        return bs.field_c.field_Ab;
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Kickabout.field_G;
        e.field_k.b(-1);
        var1 = 0;
        L0: while (true) {
          if (-33 >= var1) {
            if (param0 <= 40) {
              dd.a((byte) 120);
              var1 = 0;
              L1: while (true) {
                if (-33 <= var1) {
                  qh.field_b = 0;
                  return;
                } else {
                  cp.field_d[var1] = 0L;
                  var1++;
                  continue L1;
                }
              }
            } else {
              var1 = 0;
              L2: while (true) {
                if (-33 >= (var1 ^ -1)) {
                  qh.field_b = 0;
                  return;
                } else {
                  cp.field_d[var1] = 0L;
                  var1++;
                  continue L2;
                }
              }
            }
          } else {
            mi.field_b[var1] = 0L;
            var1++;
            continue L0;
          }
        }
    }

    final int a(boolean param0) {
        if (!param0) {
            return -113;
        }
        return ((dd) this).field_e.field_e.length;
    }

    private final boolean c(int param0) {
        ((dd) this).field_b = ((dd) this).field_b + 1;
        if (((dd) this).field_e.field_e.length <= ((dd) this).field_b) {
          ((dd) this).field_a = ((dd) this).field_a + 1;
          if (((dd) this).field_e.field_j) {
            if (-1 < (((dd) this).field_e.field_h ^ -1)) {
              ((dd) this).field_b = 0;
              ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
              if (param0 != 0) {
                hd discarded$14 = dd.b(-93);
                ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                return false;
              } else {
                ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                return false;
              }
            } else {
              if (((dd) this).field_e.field_h < ((dd) this).field_e.field_e.length) {
                ((dd) this).field_b = ((dd) this).field_e.field_h;
                ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
                if (param0 != 0) {
                  hd discarded$15 = dd.b(-93);
                  ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                  return false;
                } else {
                  ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                  return false;
                }
              } else {
                ((dd) this).field_b = 0;
                ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
                if (param0 != 0) {
                  hd discarded$16 = dd.b(-93);
                  ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                  return false;
                } else {
                  ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                  return false;
                }
              }
            }
          } else {
            if (((dd) this).field_e.field_f > ((dd) this).field_a) {
              if (-1 < (((dd) this).field_e.field_h ^ -1)) {
                ((dd) this).field_b = 0;
                ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
                if (param0 == 0) {
                  ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                  return false;
                } else {
                  hd discarded$17 = dd.b(-93);
                  ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                  return false;
                }
              } else {
                if (((dd) this).field_e.field_h < ((dd) this).field_e.field_e.length) {
                  ((dd) this).field_b = ((dd) this).field_e.field_h;
                  ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
                  if (param0 == 0) {
                    ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                    return false;
                  } else {
                    hd discarded$18 = dd.b(-93);
                    ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                    return false;
                  }
                } else {
                  ((dd) this).field_b = 0;
                  ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
                  if (param0 == 0) {
                    ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                    return false;
                  } else {
                    hd discarded$19 = dd.b(-93);
                    ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
                    return false;
                  }
                }
              }
            } else {
              return true;
            }
          }
        } else {
          ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
          if (param0 == 0) {
            ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
            return false;
          } else {
            hd discarded$20 = dd.b(-93);
            ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
            return false;
          }
        }
    }

    final void a(int param0, int param1) {
        ((dd) this).field_b = param0;
        int var3 = 124 % ((28 - param1) / 60);
        ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
        ((dd) this).field_h = 0;
    }

    final void a(nm param0, byte param1) {
        this.b(true);
        ((dd) this).field_e = param0;
        if (param1 != -107) {
          ((dd) this).field_h = -20;
          ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
          ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
          ((dd) this).field_i = -1;
          return;
        } else {
          ((dd) this).field_j = ((dd) this).field_e.field_e[((dd) this).field_b];
          ((dd) this).field_h = ((dd) this).field_e.field_c[((dd) this).field_b];
          ((dd) this).field_i = -1;
          return;
        }
    }

    final qc a(qc param0, boolean param1, boolean param2, boolean param3) {
        qc var5 = null;
        qc stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        int stackIn_2_2 = 0;
        qc stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        int stackIn_3_2 = 0;
        qc stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        qc stackOut_1_0 = null;
        boolean stackOut_1_1 = false;
        int stackOut_1_2 = 0;
        qc stackOut_3_0 = null;
        boolean stackOut_3_1 = false;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        qc stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        if (!param3) {
          return null;
        } else {
          L0: {
            stackOut_1_0 = (qc) param0;
            stackOut_1_1 = param2;
            stackOut_1_2 = 0;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            stackIn_2_2 = stackOut_1_2;
            if (param1) {
              stackOut_3_0 = (qc) (Object) stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = stackIn_3_2;
              stackOut_3_3 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              break L0;
            } else {
              stackOut_2_0 = (qc) (Object) stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = stackIn_2_2;
              stackOut_2_3 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              stackIn_4_3 = stackOut_2_3;
              break L0;
            }
          }
          var5 = ((qc) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0, stackIn_4_3 != 0);
          var5.a(se.field_C, ((dd) this).field_j, (ef) null, -1, 0, 0, param1);
          return var5;
        }
    }

    public dd() {
    }

    dd(int param0) {
        ((dd) this).field_i = -1;
        ((dd) this).field_d = new nm[param0];
        ((dd) this).field_g = new int[param0];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
    }
}
