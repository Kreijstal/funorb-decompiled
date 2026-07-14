/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rb {
    static he[] field_c;
    private boolean field_b;
    static int[] field_e;
    private int field_a;
    private int field_f;
    private int[] field_d;

    final static boolean a(String param0, String param1, int param2) {
        String var3 = null;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        var3 = vj.a(param0, -115);
        if (param1.indexOf(param0) == param2) {
          if (-1 == param1.indexOf(var3)) {
            if (!param1.startsWith(param0)) {
              if (!param1.startsWith(var3)) {
                if (!param1.endsWith(param0)) {
                  if (param1.endsWith(var3)) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  return stackIn_11_0 != 0;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final void d(int param0, int param1) {
        if (param0 < -11) {
          if (-1 >= (param1 ^ -1)) {
            if (param1 > ((rb) this).field_a) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L0: {
                if (param1 != ((rb) this).field_a) {
                  kg.a(((rb) this).field_d, 1 + param1, ((rb) this).field_d, param1, -param1 + ((rb) this).field_a);
                  break L0;
                } else {
                  break L0;
                }
              }
              ((rb) this).field_a = ((rb) this).field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        } else {
          ((rb) this).d(-66, 80);
          if (-1 >= (param1 ^ -1)) {
            if (param1 > ((rb) this).field_a) {
              throw new ArrayIndexOutOfBoundsException(param1);
            } else {
              L1: {
                if (param1 != ((rb) this).field_a) {
                  kg.a(((rb) this).field_d, 1 + param1, ((rb) this).field_d, param1, -param1 + ((rb) this).field_a);
                  break L1;
                } else {
                  break L1;
                }
              }
              ((rb) this).field_a = ((rb) this).field_a - 1;
              return;
            }
          } else {
            throw new ArrayIndexOutOfBoundsException(param1);
          }
        }
    }

    final static void a(int param0, String[] param1, String param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        String[] var10 = null;
        String[] var11 = null;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param3 == 105) {
          lc.field_h = wg.field_u;
          if (param0 != 255) {
            if (100 <= param0) {
              if (param0 > 105) {
                kf.field_a = kj.a(param0, 4, param2);
                return;
              } else {
                var11 = param1;
                pi.a(true, var11);
                kf.field_a = sa.a((byte) 3, param1);
                return;
              }
            } else {
              kf.field_a = kj.a(param0, 4, param2);
              return;
            }
          } else {
            L0: {
              if (13 <= rd.field_z) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            kf.field_a = b.a(stackIn_16_0 != 0, 93);
            var6 = null;
            pi.a(true, (String[]) null);
            return;
          }
        } else {
          field_e = null;
          lc.field_h = wg.field_u;
          if (param0 != 255) {
            if (100 <= param0) {
              if (param0 > 105) {
                kf.field_a = kj.a(param0, 4, param2);
                return;
              } else {
                var10 = param1;
                pi.a(true, var10);
                kf.field_a = sa.a((byte) 3, param1);
                return;
              }
            } else {
              kf.field_a = kj.a(param0, 4, param2);
              return;
            }
          } else {
            L1: {
              if (13 <= rd.field_z) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            kf.field_a = b.a(stackIn_5_0 != 0, 93);
            var6 = null;
            pi.a(true, (String[]) null);
            return;
          }
        }
    }

    final static void a(byte param0) {
        pi.field_Q = -1;
        em.field_c = false;
        dd.field_l = 0;
        ie.field_C = null;
        if (param0 != -102) {
            return;
        }
        oh.field_e = -1;
    }

    final void c(int param0, int param1) {
        int var3 = 69 % ((param1 - 69) / 56);
        this.a(21125, ((rb) this).field_a + 1, param0);
    }

    private final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param1) {
          return 83;
        } else {
          var3 = ((rb) this).field_d.length;
          L0: while (true) {
            if (var3 > param0) {
              return var3;
            } else {
              if (((rb) this).field_b) {
                if (-1 != (var3 ^ -1)) {
                  var3 = var3 * ((rb) this).field_f;
                  continue L0;
                } else {
                  var3 = 1;
                  continue L0;
                }
              } else {
                var3 = var3 + ((rb) this).field_f;
                continue L0;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 != 0) {
            field_c = null;
        }
    }

    private final void a(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = new int[this.a(param0, true)];
        var3 = var4;
        if (param1 != -1) {
          return;
        } else {
          kg.a(((rb) this).field_d, 0, var4, 0, ((rb) this).field_d.length);
          ((rb) this).field_d = var4;
          return;
        }
    }

    final int b(int param0, int param1) {
        if (((rb) this).field_a >= param1) {
          if (param0 > -30) {
            ((rb) this).d(-4, -55);
            return ((rb) this).field_d[param1];
          } else {
            return ((rb) this).field_d[param1];
          }
        } else {
          throw new ArrayIndexOutOfBoundsException(param1);
        }
    }

    final int a(boolean param0) {
        if (param0) {
            int discarded$0 = ((rb) this).a(true);
            return ((rb) this).field_a + 1;
        }
        return ((rb) this).field_a + 1;
    }

    private rb() throws Throwable {
        throw new Error();
    }

    private final void a(int param0, int param1, int param2) {
        Object var5 = null;
        if (((rb) this).field_a >= param1) {
          L0: {
            if (param1 >= ((rb) this).field_d.length) {
              this.a(param1, -1);
              break L0;
            } else {
              break L0;
            }
          }
          ((rb) this).field_d[param1] = param2;
          if (param0 != 21125) {
            var5 = null;
            boolean discarded$4 = rb.a((String) null, (String) null, -54);
            return;
          } else {
            return;
          }
        } else {
          L1: {
            ((rb) this).field_a = param1;
            if (param1 >= ((rb) this).field_d.length) {
              this.a(param1, -1);
              break L1;
            } else {
              break L1;
            }
          }
          ((rb) this).field_d[param1] = param2;
          if (param0 == 21125) {
            return;
          } else {
            var5 = null;
            boolean discarded$5 = rb.a((String) null, (String) null, -54);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[4];
    }
}
