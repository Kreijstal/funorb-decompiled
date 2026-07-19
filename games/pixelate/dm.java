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

    final static void i(byte param0) {
        L0: {
          if (null != to.field_r) {
            to.field_r.p(-108);
            break L0;
          } else {
            break L0;
          }
        }
        aa.field_c = new fh();
        ph.field_l.c(aa.field_c, -125);
        if (param0 != -51) {
          field_zb = (int[]) null;
          return;
        } else {
          return;
        }
    }

    dm(kn param0, pl param1) {
        super(param0, ba.field_d, hm.field_e, false, false);
        try {
            this.field_Ab = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "dm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean q(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 22452) {
          L0: {
            dm.r(-8);
            if (ga.field_f <= 250) {
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
            if (ga.field_f <= 250) {
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

    final boolean c(boolean param0) {
        id var2 = null;
        if (!param0) {
          if (this.field_N) {
            if (!this.field_xb) {
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
          this.h((byte) -120);
          if (this.field_N) {
            if (!this.field_xb) {
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

    public static void r(int param0) {
        field_zb = null;
        if (param0 > -19) {
            field_zb = (int[]) null;
        }
    }

    private final void a(id param0, int param1, boolean param2) {
        qm discarded$2 = null;
        qm discarded$3 = null;
        RuntimeException var4 = null;
        String var4_ref = null;
        vl var5 = null;
        int var6 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              this.field_xb = true;
              if (param1 < -121) {
                break L1;
              } else {
                this.field_yb = true;
                break L1;
              }
            }
            L2: {
              if (!param0.field_g) {
                if (null == param0.field_f) {
                  var4_ref = param0.field_c;
                  if ((param0.field_a ^ -1) == -249) {
                    L3: {
                      if (param2) {
                        break L3;
                      } else {
                        fq.g((byte) -73);
                        break L3;
                      }
                    }
                    this.field_yb = true;
                    var4_ref = ao.field_b;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4_ref = ek.field_e;
                  if (this.field_Ab != null) {
                    this.field_Ab.a((byte) 103);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              } else {
                var4_ref = gk.field_jb;
                break L2;
              }
            }
            L4: {
              var5 = new vl((vk) (this), ba.field_d, var4_ref);
              if (!param0.field_g) {
                L5: {
                  if (!this.field_yb) {
                    if (-6 != (param0.field_a ^ -1)) {
                      var5.a(-1, -1, bo.field_f);
                      break L5;
                    } else {
                      var5.a(11, -1, jj.field_c);
                      var5.a(17, -1, mk.field_e);
                      break L5;
                    }
                  } else {
                    discarded$2 = var5.a(1707, (fn) (this), vi.field_J);
                    break L5;
                  }
                }
                if (3 != param0.field_a) {
                  if (-7 != (param0.field_a ^ -1)) {
                    break L4;
                  } else {
                    var5.a(9, -1, ho.field_d);
                    break L4;
                  }
                } else {
                  var5.a(7, -1, gd.field_d);
                  break L4;
                }
              } else {
                if (param0.field_e) {
                  this.c(new hc((dm) (this)), -113);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  discarded$3 = var5.a(1707, (fn) (this), vi.field_J);
                  break L4;
                }
              }
            }
            this.c(var5, -115);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var4);
            stackOut_31_1 = new StringBuilder().append("dm.OB(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L6;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        if (this.field_yb) {
            rd.a(false, -17130, true);
            return;
        }
        th.a(param2 ^ 8180);
        if (param2 != 11) {
            return;
        }
        try {
            this.p(-119);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "dm.Q(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
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
        $cfr$clinit: {
            int var0 = 0;
            int var1 = 0;
            int var2 = 0;
            field_zb = new int[256];
            var1 = 0;
            L0: while (true) {
              if (256 <= var1) {
                field_Cb = 300;
                break $cfr$clinit;
              } else {
                var0 = var1;
                var2 = 0;
                L1: while (true) {
                  if (-9 >= (var2 ^ -1)) {
                    field_zb[var1] = var0;
                    var1++;
                    continue L0;
                  } else {
                    if (-2 == (1 & var0 ^ -1)) {
                      var0 = -306674912 ^ var0 >>> -1602097567;
                      var2++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1;
                      var2++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
