/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dd {
    ab field_d;
    static w field_k;
    ab field_g;
    static String field_m;
    static int[] field_a;
    ab field_n;
    ab field_l;
    wl field_i;
    int field_b;
    long field_e;
    volatile int field_o;
    volatile int field_j;
    wl field_c;
    byte field_f;
    pj field_h;

    final static String b(String param0, int param1, int param2) {
        CharSequence var7 = (CharSequence) (Object) param0;
        if (!dc.a(var7, (byte) -70)) {
            return ge.field_d;
        }
        if (k.a(param0, true)) {
            return si.field_i;
        }
        if (!(-3 == (jj.field_b ^ -1))) {
            return qe.field_h;
        }
        if (!(!ik.a(param0, (byte) -118))) {
            return cm.a((byte) 114, ph.field_Bb, new String[1]);
        }
        if ((ed.field_g ^ -1) <= -101) {
            return ca.field_ob;
        }
        if (!(!qe.a(param0, 3))) {
            return cm.a((byte) 116, nn.field_b, new String[1]);
        }
        uf var6 = we.field_b;
        var6.f(param2, -4);
        var6.field_n = var6.field_n + 1;
        int var4 = -88 % ((param1 - 84) / 41);
        int var5 = var6.field_n;
        var6.a(true, 2);
        var6.a(0, param0);
        var6.b(var6.field_n + -var5, true);
        return null;
    }

    abstract void a(Object param0, byte param1, boolean param2);

    final int c(byte param0) {
        if (param0 >= -73) {
          field_a = null;
          return ((dd) this).field_d.a(0) + ((dd) this).field_g.a(0);
        } else {
          return ((dd) this).field_d.a(0) + ((dd) this).field_g.a(0);
        }
    }

    final static void a(String param0, int param1, int param2) {
        int var3 = 0;
        Object var4 = null;
        tj.field_Vb = false;
        mg.field_Nb = false;
        if (cl.field_r != null) {
          if (cl.field_r.field_S) {
            L0: {
              var3 = 1;
              if ((param2 ^ -1) == -9) {
                L1: {
                  param2 = 2;
                  if (vb.field_Z) {
                    param0 = wa.field_b;
                    break L1;
                  } else {
                    param0 = di.field_A;
                    break L1;
                  }
                }
                dm.field_c.a(hb.field_Ob, 30534);
                break L0;
              } else {
                break L0;
              }
            }
            L2: {
              if (param2 != 10) {
                break L2;
              } else {
                var3 = 0;
                si.d(-31842);
                break L2;
              }
            }
            L3: {
              if (var3 == 0) {
                break L3;
              } else {
                L4: {
                  if (!tj.field_Vb) {
                    break L4;
                  } else {
                    param0 = cm.a((byte) 103, cm.field_d, new String[1]);
                    break L4;
                  }
                }
                L5: {
                  if (!dc.field_d) {
                    break L5;
                  } else {
                    param0 = rg.field_d;
                    break L5;
                  }
                }
                cl.field_r.a((byte) 48, param0, param2);
                break L3;
              }
            }
            if (-257 != (param2 ^ -1)) {
              if (param2 != 10) {
                if (!vb.field_Z) {
                  dm.field_c.a(51);
                  if (param1 != 0) {
                    var4 = null;
                    String discarded$6 = dd.b((String) null, 52, 86);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (param1 != 0) {
                    var4 = null;
                    String discarded$7 = dd.b((String) null, 52, 86);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param1 != 0) {
                  var4 = null;
                  String discarded$8 = dd.b((String) null, 52, 86);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 != 0) {
                var4 = null;
                String discarded$9 = dd.b((String) null, 52, 86);
                return;
              } else {
                return;
              }
            }
          } else {
            if (param1 == 0) {
              return;
            } else {
              var4 = null;
              String discarded$10 = dd.b((String) null, 52, 86);
              return;
            }
          }
        } else {
          if (param1 != 0) {
            var4 = null;
            String discarded$11 = dd.b((String) null, 52, 86);
            return;
          } else {
            return;
          }
        }
    }

    abstract void d(byte param0);

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 0) {
          L0: {
            ((dd) this).field_j = -70;
            if (-21 < ((dd) this).c(0)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-21 > ((dd) this).c(0)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final pj a(boolean param0, byte param1, boolean param2, int param3, int param4) {
        long var6 = ((long)param3 << 440232928) - -(long)param4;
        if (!param2) {
            return null;
        }
        pj var8 = new pj();
        var8.field_r = var6;
        var8.field_D = param0 ? true : false;
        var8.field_M = param1;
        if (param0) {
            if (!((((dd) this).c((byte) -109) ^ -1) > -21)) {
                throw new RuntimeException();
            }
            ((dd) this).field_d.a((be) (Object) var8, -7267);
        } else {
            if (!(20 > ((dd) this).c(0))) {
                throw new RuntimeException();
            }
            ((dd) this).field_n.a((be) (Object) var8, -7267);
        }
        return var8;
    }

    abstract boolean a(byte param0);

    final int c(int param0) {
        if (param0 != 0) {
          ((dd) this).field_h = null;
          return ((dd) this).field_n.a(0) + ((dd) this).field_l.a(0);
        } else {
          return ((dd) this).field_n.a(0) + ((dd) this).field_l.a(0);
        }
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        Object var4 = null;
        if (param2 != 66) {
          field_k = null;
          var4 = null;
          rb.a(param0, (byte) -85, (String) null, param1);
          return;
        } else {
          var4 = null;
          rb.a(param0, (byte) -85, (String) null, param1);
          return;
        }
    }

    public static void b(byte param0) {
        field_k = null;
        field_m = null;
        field_a = null;
        int var1 = -6 % ((-1 - param0) / 47);
    }

    final boolean a(boolean param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (!param0) {
          L0: {
            ((dd) this).field_i = null;
            if (((dd) this).c((byte) -95) < 20) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((dd) this).c((byte) -95) < 20) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void a(int param0);

    dd() {
        ((dd) this).field_d = new ab();
        ((dd) this).field_g = new ab();
        ((dd) this).field_n = new ab();
        ((dd) this).field_l = new ab();
        ((dd) this).field_i = new wl(6);
        ((dd) this).field_j = 0;
        ((dd) this).field_o = 0;
        ((dd) this).field_f = (byte) 0;
        ((dd) this).field_c = new wl(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Email address is unavailable";
        field_a = new int[8192];
    }
}
