/*
 * Decompiled by CFR-JS 0.4.0.
 */
class db extends qm {
    static String field_N;
    private String[] field_O;
    static int field_R;
    static boolean field_U;
    static byte[][] field_S;
    static int[] field_T;
    private bb field_Q;
    private ni field_P;

    void a(int param0, int param1, int param2, byte param3) {
        int var8 = 0;
        int var9 = 0;
        super.a(param0, param1, param2, (byte) 119);
        if (0 != param1) {
            return;
        }
        int var5 = -12 % ((70 - param3) / 49);
        af var6 = (af) (Object) ((db) this).field_y;
        ni var7 = ((db) this).field_P;
        if (var7 == null) {
        } else {
            var8 = var6.a((byte) 69, (ng) this, param2);
            var9 = var6.a(param0, (ng) this, (byte) -119);
            do {
                gk.a(var7.field_k + var8 + -2, -2 + var7.field_r + var9, (byte) -128, 2 + var7.field_t, 2 + var7.field_u);
                var7 = var7.field_l;
            } while (var7 != null);
        }
    }

    final void a(int param0) {
        int var2 = 0;
        af var3 = null;
        kd var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        mn var12 = null;
        int var13 = 0;
        int var14 = 0;
        ni var15 = null;
        int var16 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = Pixelate.field_H ? 1 : 0;
          ((db) this).field_Q = new bb();
          var2 = 0;
          if (param0 == 1829) {
            break L0;
          } else {
            ni discarded$1 = this.b(64, -98, -83);
            break L0;
          }
        }
        var3 = (af) (Object) ((db) this).field_y;
        var4 = var3.b(-124, (ng) this);
        L1: while (true) {
          var5 = ((db) this).field_q.indexOf("<hotspot=", var2);
          if (0 != (var5 ^ -1)) {
            var7 = ((db) this).field_q.indexOf(">", var5);
            var6 = ((db) this).field_q.substring(var5 - -9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((db) this).field_q.indexOf("</hotspot>", var5);
            var8 = var4.a(false, var5);
            var9 = var4.a(false, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_b[var11];
                  if (var11 == var8) {
                    stackOut_9_0 = var4.b(true, var5);
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = var12.field_g[0];
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var9 != var11) {
                    if (var12 == null) {
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = var12.field_g[-1 + var12.field_g.length];
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = var4.b(true, var2);
                    stackIn_15_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_15_0;
                  var15 = new ni(var7, var13, var12.field_b, -var13 + var14, Math.max(var3.a(param0 ^ -1832), -var12.field_b + var12.field_d));
                  if (var10 != null) {
                    ((ni) var10).field_l = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((db) this).field_Q.a(22125, (fa) (Object) var15);
                var10 = (Object) (Object) var15;
                var11++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    final void a(String param0, int param1, int param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        L0: {
          L1: {
            var6 = Pixelate.field_H ? 1 : 0;
            if (((db) this).field_O == null) {
              break L1;
            } else {
              if (((db) this).field_O.length <= param2) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            var7 = new String[param2 + 1];
            var4 = var7;
            if (null != ((db) this).field_O) {
              var5 = 0;
              L3: while (true) {
                if (((db) this).field_O.length <= var5) {
                  break L2;
                } else {
                  var7[var5] = ((db) this).field_O[var5];
                  var5++;
                  continue L3;
                }
              }
            } else {
              break L2;
            }
          }
          ((db) this).field_O = var4;
          break L0;
        }
        L4: {
          ((db) this).field_O[param2] = param0;
          if (param1 == 0) {
            break L4;
          } else {
            ni discarded$2 = this.b(70, 115, -84);
            break L4;
          }
        }
    }

    boolean a(ng param0, int param1) {
        if (param1 != 27) {
            ((db) this).a(123);
        }
        return false;
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) 53, param2, param3, param4);
        ((db) this).a(1829);
        if (param1 < 19) {
            ((db) this).field_Q = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5 = 70 / ((-33 - param3) / 58);
        ((db) this).a(param1, (byte) 28, param2, param0, ((af) (Object) ((db) this).field_y).a((ng) this, 4592));
    }

    final static void a(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 == -94) {
          L0: {
            if (null == fj.field_c) {
              break L0;
            } else {
              var1 = (Object) (Object) fj.field_c;
              synchronized (var1) {
                L1: {
                  fj.field_c = null;
                  break L1;
                }
              }
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    db(String param0, eb param1) {
        super(param0, (fn) null);
        ((db) this).field_P = null;
        ((db) this).field_y = param1;
    }

    public static void k(int param0) {
        if (param0 != 1861726552) {
            return;
        }
        field_T = null;
        field_S = null;
        field_N = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        if (!param0) {
            ((db) this).a(false, 78, -112, 21);
        }
        super.a(param0, param1, param2, param3);
        int var5 = -((db) this).field_z + param3;
        int var6 = -((db) this).field_p + param1;
        ni var7 = this.b(var5, -22562, var6);
        if (var7 != null) {
            if (!(((db) this).field_n == null)) {
                ((om) (Object) ((db) this).field_n).a(var7.field_n, param2, -8894, (db) this);
            }
        }
    }

    final static byte[] a(byte[] param0, int param1, int param2, int param3) {
        byte[] var4 = null;
        int var5_int = 0;
        ca var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        L0: {
          var7 = Pixelate.field_H ? 1 : 0;
          if (-1 <= (param1 ^ -1)) {
            var4 = param0;
            break L0;
          } else {
            var8 = new byte[param3];
            var4 = var8;
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param3) {
                break L0;
              } else {
                var8[var5_int] = param0[param1 + var5_int];
                var5_int++;
                continue L1;
              }
            }
          }
        }
        L2: {
          var5 = new ca();
          var5.a((byte) 123);
          if (param2 == 1761872464) {
            break L2;
          } else {
            field_N = null;
            break L2;
          }
        }
        var5.a(var4, (long)(8 * param3), (byte) 115);
        var6 = new byte[64];
        var5.a(0, var6, param2 + -1761856307);
        return var6;
    }

    String b(byte param0) {
        if (null == ((db) this).field_P) {
            return null;
        }
        if (((db) this).field_O == null) {
            return null;
        }
        if (param0 <= 16) {
            ((db) this).field_P = null;
        }
        if (((db) this).field_P.field_n >= ((db) this).field_O.length) {
            return null;
        }
        return ((db) this).field_O[((db) this).field_P.field_n];
    }

    private final ni b(int param0, int param1, int param2) {
        ni var4 = null;
        ni var5 = null;
        int var6 = 0;
        L0: {
          var6 = Pixelate.field_H ? 1 : 0;
          if (param1 == -22562) {
            break L0;
          } else {
            field_R = 126;
            break L0;
          }
        }
        var4 = (ni) (Object) ((db) this).field_Q.c(1504642273);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (ni) (Object) ((db) this).field_Q.f(1504642273);
                continue L1;
              } else {
                L3: {
                  if (param0 < var5.field_k) {
                    break L3;
                  } else {
                    if (param2 < var5.field_r) {
                      break L3;
                    } else {
                      if (var5.field_k + var5.field_t <= param0) {
                        break L3;
                      } else {
                        if (var5.field_r + var5.field_u >= param2) {
                          return var4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_l;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    final static tf[] a(int param0, tf param1) {
        if (param0 != 24414) {
            field_N = null;
        }
        tf[] var3 = new tf[9];
        tf[] var2 = var3;
        var3[4] = param1;
        return var2;
    }

    final static void a(boolean param0, byte[] param1) {
        L0: {
          if (param1 == null) {
            break L0;
          } else {
            if (param1.length != 8) {
              break L0;
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  field_T = null;
                  break L1;
                }
              }
              jo.field_h = jo.field_h | ((255L & (long)param1[1]) << -191922872 | (16711680L & (long)param1[2] << 1761872464 | ((long)param1[4] << -1323342112 & 1095216660480L | ((255L & (long)param1[5]) << 1996161768 | ((long)param1[6] << 247172144 & 71776119061217280L | (long)param1[7] << -144576392 & -72057594037927936L)) | (255L & (long)param1[3]) << 1861726552)) | (long)param1[0] << 1571270848 & 255L);
              return;
            }
          }
        }
    }

    void a(int param0, int param1, int param2, ng param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((db) this).field_P = null;
        if (((db) this).field_D) {
            var5 = uf.field_d - (param2 - -((db) this).field_z);
            var6 = -param1 + (bg.field_k + -((db) this).field_p);
            ((db) this).field_P = this.b(var5, -22562, var6);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = "Played";
        field_T = new int[]{8};
        field_R = 0;
        field_S = new byte[250][];
    }
}
