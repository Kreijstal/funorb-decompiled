/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends vk implements vo {
    private boolean field_yb;
    private boolean field_xb;
    static int[] field_zb;
    private pl field_Ab;
    static int field_Cb;
    static int field_Bb;

    final static void i() {
        if (!(null == to.field_r)) {
            to.field_r.p(-108);
        }
        aa.field_c = new fh();
        ph.field_l.c((ng) (Object) aa.field_c, -125);
    }

    dm(kn param0, pl param1) {
        super(param0, ba.field_d, hm.field_e, false, false);
        try {
            ((dm) this).field_Ab = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "dm.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static boolean q() {
        return ga.field_f > 250;
    }

    final boolean c(boolean param0) {
        id var2 = null;
        if (!param0) {
          if (((dm) this).field_N) {
            if (!((dm) this).field_xb) {
              var2 = gg.d((byte) 52);
              if (var2 == null) {
                return super.c(false);
              } else {
                this.a(var2, -127, false);
                return super.c(false);
              }
            } else {
              return super.c(false);
            }
          } else {
            return super.c(false);
          }
        } else {
          ((dm) this).h((byte) -120);
          if (((dm) this).field_N) {
            if (!((dm) this).field_xb) {
              var2 = gg.d((byte) 52);
              if (var2 == null) {
                return super.c(false);
              } else {
                this.a(var2, -127, false);
                return super.c(false);
              }
            } else {
              return super.c(false);
            }
          } else {
            return super.c(false);
          }
        }
    }

    public static void r() {
        field_zb = null;
    }

    private final void a(id param0, int param1, boolean param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        vl var5 = null;
        int var6 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              ((dm) this).field_xb = true;
              if (!param0.field_g) {
                if (null == param0.field_f) {
                  var4_ref = param0.field_c;
                  if (param0.field_a == 248) {
                    L2: {
                      if (param2) {
                        break L2;
                      } else {
                        fq.g((byte) -73);
                        break L2;
                      }
                    }
                    ((dm) this).field_yb = true;
                    var4_ref = ao.field_b;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = ek.field_e;
                  if (((dm) this).field_Ab != null) {
                    ((dm) this).field_Ab.a((byte) 103);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                var4_ref = gk.field_jb;
                break L1;
              }
            }
            L3: {
              var5 = new vl((vk) this, ba.field_d, var4_ref);
              if (!param0.field_g) {
                L4: {
                  if (!((dm) this).field_yb) {
                    if (param0.field_a != 5) {
                      var5.a(-1, -1, bo.field_f);
                      break L4;
                    } else {
                      var5.a(11, -1, jj.field_c);
                      var5.a(17, -1, mk.field_e);
                      break L4;
                    }
                  } else {
                    qm discarded$2 = var5.a(1707, (fn) this, vi.field_J);
                    break L4;
                  }
                }
                if (3 != param0.field_a) {
                  if (param0.field_a != 6) {
                    break L3;
                  } else {
                    var5.a(9, -1, ho.field_d);
                    break L3;
                  }
                } else {
                  var5.a(7, -1, gd.field_d);
                  break L3;
                }
              } else {
                if (param0.field_e) {
                  ((dm) this).c((ng) (Object) new hc((dm) this), -113);
                  return;
                } else {
                  qm discarded$3 = var5.a(1707, (fn) this, vi.field_J);
                  break L3;
                }
              }
            }
            ((dm) this).c((ng) (Object) var5, -115);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var4;
            stackOut_29_1 = new StringBuilder().append("dm.OB(");
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param0 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L5;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L5;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + -127 + 44 + param2 + 41);
        }
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (param0) {
          t.a(0, 0, t.field_j, t.field_d, 0, 192);
          if (param2 == 0) {
            rj.a(param2 ^ 91, param0);
            return;
          } else {
            dm.a(true, false, -123);
            rj.a(param2 ^ 91, param0);
            return;
          }
        } else {
          t.d();
          if (param2 == 0) {
            rj.a(param2 ^ 91, param0);
            return;
          } else {
            dm.a(true, false, -123);
            rj.a(param2 ^ 91, param0);
            return;
          }
        }
    }

    public final void a(qm param0, int param1, int param2, int param3, int param4) {
        if (((dm) this).field_yb) {
            rd.a(false, -17130, true);
            return;
        }
        th.a(param2 ^ 8180);
        if (param2 != 11) {
            return;
        }
        try {
            ((dm) this).p(-119);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "dm.Q(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void h(byte param0) {
        if (param0 > -96) {
          dm.a(true, false, -97);
          this.a(pa.a(248, ao.field_b, (byte) -121), -127, true);
          return;
        } else {
          this.a(pa.a(248, ao.field_b, (byte) -121), -127, true);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_zb = new int[256];
        var1 = 0;
        L0: while (true) {
          if (256 <= var1) {
            field_Cb = 300;
            return;
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (var2 >= 8) {
                field_zb[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((1 & var0) == 1) {
                  var0 = -306674912 ^ var0 >>> 1;
                  var2++;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  var2++;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
