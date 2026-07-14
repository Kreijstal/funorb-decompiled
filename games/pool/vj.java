/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj {
    int field_i;
    int field_e;
    static ui field_j;
    static int[] field_a;
    static String field_b;
    static int field_d;
    static boolean[] field_c;
    static String field_g;
    int[] field_h;
    static String field_f;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Pool.field_O;
        if (((vj) this).field_h != null) {
          if (((vj) this).field_h.length != 0) {
            if (param0 < -108) {
              var3 = 1;
              L0: while (true) {
                if (((vj) this).field_h.length > var3) {
                  if (param1 < ((vj) this).field_h[var3] + ((vj) this).field_h[var3 - 1] >> 1823761889) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L0;
                  }
                } else {
                  return ((vj) this).field_h.length - 1;
                }
              }
            } else {
              var5 = null;
              ij discarded$5 = vj.a((String) null, (byte) -110, (String) null, 52);
              var3 = 1;
              L1: while (true) {
                if (((vj) this).field_h.length > var3) {
                  if (param1 < ((vj) this).field_h[var3] + ((vj) this).field_h[var3 - 1] >> 1823761889) {
                    return -1 + var3;
                  } else {
                    var3++;
                    continue L1;
                  }
                } else {
                  return ((vj) this).field_h.length - 1;
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    final static java.awt.Canvas a(byte param0) {
        if (param0 > -34) {
            return null;
        }
        return (java.awt.Canvas) (null == ne.field_u ? pa.field_K : ne.field_u);
    }

    final static void a(ma param0, byte param1, ma param2) {
        L0: {
          if (null != param0.field_k) {
            param0.a((byte) -117);
            break L0;
          } else {
            break L0;
          }
        }
        param0.field_k = param2.field_k;
        if (param1 != -119) {
          field_g = null;
          param0.field_d = param2;
          param0.field_k.field_d = param0;
          param0.field_d.field_k = param0;
          return;
        } else {
          param0.field_d = param2;
          param0.field_k.field_d = param0;
          param0.field_d.field_k = param0;
          return;
        }
    }

    final static ij a(String param0, byte param1, String param2, int param3) {
        ij var4 = null;
        ij var5 = null;
        ij var6 = null;
        if (param1 == 18) {
          if (!nd.field_i.c(0)) {
            var6 = (ij) (Object) nd.field_i.c((byte) -88);
            if (param3 == var6.field_m) {
              if (var6.field_H <= kg.field_m) {
                if (var6.field_H + var6.field_B <= kg.field_m) {
                  return var6;
                } else {
                  kg.field_m = var6.field_H;
                  return var6;
                }
              } else {
                return var6;
              }
            } else {
              return var6;
            }
          } else {
            return gi.a(true, param3, param2, param0);
          }
        } else {
          java.awt.Canvas discarded$1 = vj.a((byte) -44);
          if (!nd.field_i.c(0)) {
            var5 = (ij) (Object) nd.field_i.c((byte) -88);
            var4 = var5;
            if (param3 == var5.field_m) {
              if (var5.field_H <= kg.field_m) {
                if (var5.field_H + var5.field_B <= kg.field_m) {
                  return var5;
                } else {
                  kg.field_m = var5.field_H;
                  return var5;
                }
              } else {
                return var5;
              }
            } else {
              return var5;
            }
          } else {
            return gi.a(true, param3, param2, param0);
          }
        }
    }

    final static boolean a(int param0, di param1, int param2, byte param3) {
        byte[] var4 = null;
        byte[] var5 = null;
        var5 = param1.a(param3 ^ 44, param2, param0);
        var4 = var5;
        if (var5 == null) {
          return false;
        } else {
          oa.a(true, var5);
          if (param3 != 121) {
            field_b = null;
            return true;
          } else {
            return true;
          }
        }
    }

    final static kf a(byte param0, jg param1) {
        if (param0 != -27) {
          field_b = null;
          return mn.a(param0 ^ 24317, nb.b(param1, 100, 96));
        } else {
          return mn.a(param0 ^ 24317, nb.b(param1, 100, 96));
        }
    }

    final int a(int param0) {
        Object var3 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 <= -9) {
          if (null != ((vj) this).field_h) {
            if (((vj) this).field_h.length == 0) {
              return 0;
            } else {
              return ((vj) this).field_h[((vj) this).field_h.length - 1];
            }
          } else {
            stackOut_9_0 = 0;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0;
          }
        } else {
          var3 = null;
          boolean discarded$6 = vj.a(-35, (di) null, 64, (byte) 45);
          if (null == ((vj) this).field_h) {
            return 0;
          } else {
            L0: {
              if (((vj) this).field_h.length != 0) {
                stackOut_4_0 = ((vj) this).field_h[((vj) this).field_h.length - 1];
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 0;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0;
          }
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_g = null;
        field_f = null;
        field_a = null;
        field_b = null;
        field_c = null;
        if (param0 != -27731) {
            vj.b(-11);
        }
    }

    vj(int param0, int param1, int param2) {
        ((vj) this).field_h = new int[1 + param2];
        ((vj) this).field_e = param0;
        ((vj) this).field_i = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
        field_b = "Won";
        field_g = "You are out of lives!";
        field_c = new boolean[112];
        field_f = "That concludes the Basics Tutorial. You can now experiment freely some more on your own, click >> to go to the Eight-ball Tutorial, or press <img=3> to go to the options menu to end the tutorial.";
    }
}
