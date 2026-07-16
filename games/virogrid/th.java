/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th extends wb {
    static dl field_t;
    int[] field_u;
    private int[][] field_v;
    private int[] field_x;
    static int field_z;
    private String[] field_w;
    static String field_r;
    static String[][] field_p;
    static il field_y;
    static km[] field_o;
    static String field_s;
    static boolean field_q;

    final void d(boolean param0) {
        int var2 = 0;
        int var3 = Virogrid.field_F ? 1 : 0;
        if (!(((th) this).field_u == null)) {
            for (var2 = 0; var2 < ((th) this).field_u.length; var2++) {
                ((th) this).field_u[var2] = oh.a(((th) this).field_u[var2], 32768);
            }
        }
        if (param0) {
            field_q = false;
        }
    }

    final void a(jc param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Virogrid.field_F ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            field_r = null;
            break L0;
          }
        }
        L1: while (true) {
          var3 = param0.g(11132);
          if (var3 != 0) {
            this.a(var3, 60, param0);
            continue L1;
          } else {
            return;
          }
        }
    }

    final String d(int param0) {
        int var3 = 0;
        int var4 = Virogrid.field_F ? 1 : 0;
        if (param0 < 113) {
            return null;
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((th) this).field_w == null) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((th) this).field_w[0]);
        for (var3 = 1; ((th) this).field_w.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((th) this).field_w[var3]);
        }
        return var2.toString();
    }

    public static void e(int param0) {
        field_p = null;
        field_t = null;
        field_o = null;
        if (param0 != -5) {
            return;
        }
        field_r = null;
        field_y = null;
        field_s = null;
    }

    final static Object a(int param0, byte[] param1, boolean param2) {
        tl var3 = null;
        if (param1 == null) {
            return null;
        }
        if (!(136 >= param1.length)) {
            var3 = new tl();
            ((wh) (Object) var3).a(param1, (byte) -4);
            return (Object) (Object) var3;
        }
        if (param0 != -3) {
            boolean discarded$0 = th.a((byte) 34, -128, -119, 34);
        }
        if (param2) {
            return (Object) (Object) va.a(param1, 0);
        }
        return (Object) (Object) param1;
    }

    final static void b(byte param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        var1 = (Object) (Object) w.field_L;
        synchronized (var1) {
          L0: {
            L1: {
              ph.field_h = re.field_l;
              um.field_Fb = um.field_Fb + 1;
              if (ch.field_f >= 0) {
                L2: while (true) {
                  if (ch.field_f == bf.field_i) {
                    break L1;
                  } else {
                    var2 = ab.field_H[bf.field_i];
                    bf.field_i = bf.field_i - -1 & 127;
                    if ((var2 ^ -1) > -1) {
                      dc.field_Y[var2 ^ -1] = false;
                      continue L2;
                    } else {
                      dc.field_Y[var2] = true;
                      continue L2;
                    }
                  }
                }
              } else {
                var2 = 0;
                L3: while (true) {
                  if (112 <= var2) {
                    ch.field_f = bf.field_i;
                    break L1;
                  } else {
                    dc.field_Y[var2] = false;
                    var2++;
                    continue L3;
                  }
                }
              }
            }
            re.field_l = hh.field_e;
            break L0;
          }
        }
        L4: {
          if (param0 == 112) {
            break L4;
          } else {
            field_z = 45;
            break L4;
          }
        }
    }

    final static boolean a(byte param0, int param1, int param2, int param3) {
        int var4 = 0;
        L0: {
          var4 = -93 % ((13 - param0) / 45);
          if (-1 < (param3 ^ -1)) {
            break L0;
          } else {
            if ((param3 ^ -1) < -12) {
              break L0;
            } else {
              if (-2 < (param2 ^ -1)) {
                return false;
              } else {
                if ((kb.a(false, param1, param3) ^ -1) <= (param2 ^ -1)) {
                  return true;
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    private final void a(int param0, int param1, jc param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        lc var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Virogrid.field_F ? 1 : 0;
          if ((param0 ^ -1) == -2) {
            ((th) this).field_w = ql.a(param2.h(-122), (byte) -123, '<');
            break L0;
          } else {
            if ((param0 ^ -1) == -3) {
              var4 = param2.g(11132);
              ((th) this).field_u = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  ((th) this).field_u[var5] = param2.c((byte) 110);
                  var5++;
                  continue L1;
                }
              }
            } else {
              if ((param0 ^ -1) == -4) {
                var4 = param2.g(11132);
                ((th) this).field_x = new int[var4];
                ((th) this).field_v = new int[var4][];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    var6 = param2.c((byte) 97);
                    var7 = vb.a((byte) 0, var6);
                    if (var7 != null) {
                      ((th) this).field_x[var5] = var6;
                      ((th) this).field_v[var5] = new int[var7.field_g];
                      var8 = 0;
                      L3: while (true) {
                        if (var7.field_g > var8) {
                          ((th) this).field_v[var5][var8] = param2.c((byte) 50);
                          var8++;
                          continue L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                if ((param0 ^ -1) == -5) {
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          }
        }
        L4: {
          if (param1 == 60) {
            break L4;
          } else {
            field_t = null;
            break L4;
          }
        }
    }

    th() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new dl();
        field_r = "Average rating";
        field_s = "Resign";
    }
}
