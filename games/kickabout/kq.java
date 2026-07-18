/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq extends hd {
    private gm field_Db;
    boolean field_Kb;
    static tf field_yb;
    boolean field_Gb;
    up field_Eb;
    static String field_Ib;
    static String field_Bb;
    static int field_Jb;
    static int field_Ab;
    boolean field_Hb;
    private ut field_Fb;
    private boolean field_Cb;
    boolean field_Lb;
    boolean field_zb;

    final void a(byte param0, gr param1, int param2) {
        cq var4 = null;
        try {
            var4 = param1.b((byte) 43, param2);
            if (var4 == null) {
                ((kq) this).field_Fb = null;
                ((kq) this).field_Gb = false;
            } else {
                ((kq) this).field_Fb = param1.a(1, var4.field_i) ? (ut) (Object) eq.field_h : (ut) (Object) ml.field_q;
                ((kq) this).field_Gb = true;
            }
            int var5 = -66 / ((-50 - param0) / 34);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "kq.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void h(byte param0) {
        int[] var2 = null;
        int[] var3 = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        if (!((kq) this).field_Eb.c(-2)) {
          if (null == ((kq) this).field_Db) {
            jr.a(((kq) this).field_F - -(((kq) this).field_q >> 1), -36, (((kq) this).field_mb >> 1) + ((kq) this).field_T);
            if (!((kq) this).field_Hb) {
              if (param0 < -114) {
                if (((kq) this).field_Fb != null) {
                  ((kq) this).field_Fb.c(18 + ((kq) this).field_F, 41 + ((kq) this).field_T);
                  return;
                } else {
                  return;
                }
              } else {
                ((kq) this).h((byte) -68);
                if (((kq) this).field_Fb != null) {
                  ((kq) this).field_Fb.c(18 + ((kq) this).field_F, 41 + ((kq) this).field_T);
                  return;
                } else {
                  return;
                }
              }
            } else {
              on.a(((kq) this).field_F - -1, -22 + ((kq) this).field_mb + ((kq) this).field_T, ((kq) this).field_q + -2, 19, 7, 65793, 170);
              uv.a(((kq) this).field_F - -12, (byte) 126, ((kq) this).field_T + (((kq) this).field_mb + -12));
              q.field_d.a(eq.field_b, ((kq) this).field_F - -23, ((kq) this).field_mb + (((kq) this).field_T + -8), 16763955, 65793);
              if (param0 < -114) {
                if (((kq) this).field_Fb != null) {
                  ((kq) this).field_Fb.c(18 + ((kq) this).field_F, 41 + ((kq) this).field_T);
                  return;
                } else {
                  return;
                }
              } else {
                L0: {
                  ((kq) this).h((byte) -68);
                  if (((kq) this).field_Fb == null) {
                    break L0;
                  } else {
                    ((kq) this).field_Fb.c(18 + ((kq) this).field_F, 41 + ((kq) this).field_T);
                    break L0;
                  }
                }
                return;
              }
            }
          } else {
            L1: {
              iw.a(85, dc.field_b);
              on.b();
              var7 = new int[4];
              var6 = var7;
              var5 = var6;
              var4 = var5;
              var3 = var4;
              var2 = var3;
              var7[0] = 1428;
              var7[3] = 1260;
              var7[2] = 1400;
              var7[1] = 1400;
              ((kq) this).field_Db.a(var3[((kq) this).field_Eb.field_q], 0, on.field_g >> 1, on.field_f - 8, (byte) -122);
              ta.e(117);
              if (((kq) this).field_zb) {
                eo.a(dc.field_b, 1);
                eo.a(dc.field_b, 2);
                break L1;
              } else {
                if (((kq) this).field_Kb) {
                  eo.a(dc.field_b, 1);
                  eo.a(dc.field_b, 2);
                  dc.field_b.f(((kq) this).field_F, ((kq) this).field_T);
                  if (((kq) this).field_Hb) {
                    on.a(((kq) this).field_F - -1, -22 + ((kq) this).field_mb + ((kq) this).field_T, ((kq) this).field_q + -2, 19, 7, 65793, 170);
                    uv.a(((kq) this).field_F - -12, (byte) 126, ((kq) this).field_T + (((kq) this).field_mb + -12));
                    q.field_d.a(eq.field_b, ((kq) this).field_F - -23, ((kq) this).field_mb + (((kq) this).field_T + -8), 16763955, 65793);
                    if (param0 < -114) {
                      L2: {
                        if (((kq) this).field_Fb == null) {
                          break L2;
                        } else {
                          ((kq) this).field_Fb.c(18 + ((kq) this).field_F, 41 + ((kq) this).field_T);
                          break L2;
                        }
                      }
                      return;
                    } else {
                      L3: {
                        ((kq) this).h((byte) -68);
                        if (((kq) this).field_Fb == null) {
                          break L3;
                        } else {
                          ((kq) this).field_Fb.c(18 + ((kq) this).field_F, 41 + ((kq) this).field_T);
                          break L3;
                        }
                      }
                      return;
                    }
                  } else {
                    L4: {
                      if (param0 < -114) {
                        break L4;
                      } else {
                        ((kq) this).h((byte) -68);
                        break L4;
                      }
                    }
                    L5: {
                      if (((kq) this).field_Fb == null) {
                        break L5;
                      } else {
                        ((kq) this).field_Fb.c(18 + ((kq) this).field_F, 41 + ((kq) this).field_T);
                        break L5;
                      }
                    }
                    return;
                  }
                } else {
                  break L1;
                }
              }
            }
            L6: {
              dc.field_b.f(((kq) this).field_F, ((kq) this).field_T);
              if (!((kq) this).field_Hb) {
                break L6;
              } else {
                on.a(((kq) this).field_F - -1, -22 + ((kq) this).field_mb + ((kq) this).field_T, ((kq) this).field_q + -2, 19, 7, 65793, 170);
                uv.a(((kq) this).field_F - -12, (byte) 126, ((kq) this).field_T + (((kq) this).field_mb + -12));
                q.field_d.a(eq.field_b, ((kq) this).field_F - -23, ((kq) this).field_mb + (((kq) this).field_T + -8), 16763955, 65793);
                break L6;
              }
            }
            L7: {
              if (param0 < -114) {
                break L7;
              } else {
                ((kq) this).h((byte) -68);
                break L7;
              }
            }
            if (((kq) this).field_Fb != null) {
              ((kq) this).field_Fb.c(18 + ((kq) this).field_F, 41 + ((kq) this).field_T);
              return;
            } else {
              return;
            }
          }
        } else {
          if (param0 < -114) {
            if (((kq) this).field_Fb != null) {
              ((kq) this).field_Fb.c(18 + ((kq) this).field_F, 41 + ((kq) this).field_T);
              return;
            } else {
              return;
            }
          } else {
            ((kq) this).h((byte) -68);
            if (((kq) this).field_Fb != null) {
              ((kq) this).field_Fb.c(18 + ((kq) this).field_F, 41 + ((kq) this).field_T);
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void i() {
        field_Ib = null;
        field_yb = null;
        field_Bb = null;
    }

    final void a(int param0, int param1, byte param2, int param3, up param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            L1: {
              if (param4.b((byte) -98, ((kq) this).field_Eb)) {
                break L1;
              } else {
                ((kq) this).field_Eb.a((byte) -95, param4);
                ((kq) this).field_Db = null;
                break L1;
              }
            }
            if (param2 >= 124) {
              L2: {
                if (((kq) this).field_Eb.c(-2)) {
                  break L2;
                } else {
                  if (!((kq) this).field_gb) {
                    break L2;
                  } else {
                    if (0 == ((kq) this).field_qb) {
                      io.a(param1, 0, ((kq) this).field_Cb, param0, ((kq) this).field_Eb, ((kq) this).field_Lb, param3);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (null == ((kq) this).field_Db) {
                  if (((kq) this).field_Eb.c(-2)) {
                    break L3;
                  } else {
                    if (null == ra.field_G) {
                      ((kq) this).field_Db = pg.a(param0, param1, ((kq) this).field_Eb, -79, param3);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                } else {
                  ((kq) this).field_Db.a(2, (la[]) null, false, false);
                  ((kq) this).field_Db.g((byte) 127);
                  break L3;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("kq.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    public kq() {
        ((kq) this).field_Cb = true;
        ((kq) this).field_Lb = false;
        ((kq) this).field_Eb = new up();
        ((kq) this).field_mb = 75;
        ((kq) this).field_q = 52;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Bb = "You are winning this auction.";
        field_Ib = "Invalid name";
        field_Jb = 105;
        field_Ab = -1;
    }
}
