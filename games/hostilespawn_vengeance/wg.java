/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends dg implements qk {
    private boolean field_wb;
    private boolean field_vb;
    private mk field_xb;
    static bd field_zb;
    static boolean field_ub;
    static long field_yb;

    public final void a(int param0, int param1, int param2, ph param3, byte param4) {
        if (!(!((wg) this).field_wb)) {
            pc.a(false, true, false);
            return;
        }
        ul.e((byte) -25);
        ((wg) this).g((byte) -5);
        int var6 = 22 % ((param4 - -63) / 52);
    }

    final static void c(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          var2 = 0;
          var3 = tk.field_e;
          if ((var3 ^ -1) <= -6) {
            if ((var3 ^ -1) <= -106) {
              if ((var3 ^ -1) > -121) {
                var3 = 120 + -var3;
                var2 = 8192 + -(var3 * (var3 * 8192) / 3300);
                break L0;
              } else {
                break L0;
              }
            } else {
              var2 = (var3 * 16384 - 40960) / 220;
              break L0;
            }
          } else {
            var2 = 8192 * var3 * var3 / 1100;
            break L0;
          }
        }
        L1: {
          if (param1 == -5878) {
            break L1;
          } else {
            field_zb = null;
            break L1;
          }
        }
        L2: {
          var4 = 1;
          var5 = 0;
          if (-4 == (param0 ^ -1)) {
            var4 = -1;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (1 != param0) {
            break L3;
          } else {
            var5 = 1;
            break L3;
          }
        }
        L4: {
          if ((param0 ^ -1) != -5) {
            break L4;
          } else {
            var5 = 1;
            var4 = 1;
            break L4;
          }
        }
        L5: {
          if (5 == param0) {
            var4 = -1;
            var5 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          if (6 == param0) {
            var5 = -1;
            var4 = 1;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          L8: {
            if (param0 == 7) {
              break L8;
            } else {
              if ((param0 ^ -1) == -9) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L7;
        }
        L9: {
          if ((param0 ^ -1) == -12) {
            var4 = -1;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (12 != param0) {
            break L10;
          } else {
            var5 = -1;
            var4 = -1;
            break L10;
          }
        }
        L11: {
          if ((param0 ^ -1) != -14) {
            break L11;
          } else {
            var5 = -1;
            var4 = 1;
            break L11;
          }
        }
        L12: {
          if (14 != param0) {
            break L12;
          } else {
            var5 = 1;
            var4 = -1;
            break L12;
          }
        }
        L13: {
          if ((param0 ^ -1) == -16) {
            var4 = 1;
            var5 = 1;
            break L13;
          } else {
            break L13;
          }
        }
        vg.field_a = jd.a(var5 * var2, var2 * var4, (byte) -79);
    }

    final static kc a(Throwable param0, String param1) {
        kc var2_ref = null;
        kc var2 = null;
        if (param0 instanceof kc) {
            var2 = (kc) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        } else {
            var2_ref = new kc(param0, param1);
        }
        return var2_ref;
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_ub = false;
        }
        field_zb = null;
    }

    final static String a(byte param0, CharSequence[] param1) {
        if (param0 != -21) {
            return null;
        }
        return ig.a((byte) 28, param1, 0, param1.length);
    }

    final void r(int param0) {
        this.a(an.a(248, -10, dg.field_sb), true, true);
        if (param0 >= -60) {
            Object var3 = null;
            String discarded$0 = wg.a((byte) -124, (CharSequence[]) null);
        }
    }

    final static int[] a(boolean param0, int param1, int param2) {
        int var10 = 0;
        int var11 = 0;
        int var12 = HostileSpawn.field_I ? 1 : 0;
        int[] var14 = new int[256];
        int[] var3 = var14;
        int var4 = (16713328 & param1) >> -2138583056;
        int var5 = (65487 & param1) >> -517893528;
        if (!param0) {
            Object var13 = null;
            String discarded$0 = wg.a((byte) -45, (CharSequence[]) null);
        }
        int var6 = param1 & 255;
        int var7 = (param2 & 16754703) >> 14741968;
        int var8 = (65393 & param2) >> -1655900728;
        int var9 = 255 & param2;
        for (var10 = 0; var10 < 256; var10++) {
            var11 = -var10 + 256;
            var14[var10] = (var9 * var11 >> 1325880424) - -(var6 * var10 >> -1116179896) + (((var4 * var10 >> 1430281032) + (var7 * var11 >> 1669879592) << 1108166928) + ((var8 * var11 >> -1835618136) + (var10 * var5 >> -205609784) << 543264072));
        }
        return var3;
    }

    final boolean l(int param0) {
        jj var2 = null;
        if (param0 != 65393) {
            field_zb = null;
        }
        if (((wg) this).field_F) {
            if (!((wg) this).field_vb) {
                var2 = jc.a(false);
                if (var2 != null) {
                    this.a(var2, true, false);
                }
            }
        }
        return super.l(65393);
    }

    final static void d(int param0, int param1) {
        if (param0 != -9420) {
            field_yb = -95L;
        }
        en var2 = s.field_b;
        var2.i(param0 + 28739, param1);
        var2.d(90, 1);
        var2.d(param0 ^ -9403, 2);
    }

    private final void a(jj param0, boolean param1, boolean param2) {
        String var4 = null;
        qi var5 = null;
        int var6 = 0;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        mk stackIn_8_0 = null;
        mk stackIn_9_0 = null;
        mk stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        mk stackOut_7_0 = null;
        mk stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        mk stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        L0: {
          var6 = HostileSpawn.field_I ? 1 : 0;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((wg) this).field_vb = stackIn_3_1 != 0;
          if (param0.field_b) {
            var4 = vf.field_J;
            break L1;
          } else {
            if (null == param0.field_e) {
              var4 = param0.field_l;
              if (248 == param0.field_a) {
                L2: {
                  if (!param2) {
                    md.c(-125);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                ((wg) this).field_wb = true;
                var4 = dg.field_sb;
                break L1;
              } else {
                break L1;
              }
            } else {
              var4 = om.field_f;
              if (null != ((wg) this).field_xb) {
                L3: {
                  stackOut_7_0 = ((wg) this).field_xb;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (param1) {
                    stackOut_9_0 = (mk) (Object) stackIn_9_0;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L3;
                  } else {
                    stackOut_8_0 = (mk) (Object) stackIn_8_0;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L3;
                  }
                }
                ((mk) (Object) stackIn_10_0).a(stackIn_10_1 != 0);
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L4: {
          var5 = new qi((dg) this, pe.field_eb, var4);
          if (!param0.field_b) {
            L5: {
              if (((wg) this).field_wb) {
                ph discarded$2 = var5.a((mh) this, jf.field_e, 30);
                break L5;
              } else {
                if (-6 == (param0.field_a ^ -1)) {
                  var5.a(22770, 11, im.field_b);
                  var5.a(22770, 17, sc.field_k);
                  break L5;
                } else {
                  var5.a(22770, -1, hg.field_d);
                  break L5;
                }
              }
            }
            if ((param0.field_a ^ -1) != -4) {
              if (6 == param0.field_a) {
                var5.a(22770, 9, wc.field_k);
                break L4;
              } else {
                break L4;
              }
            } else {
              var5.a(22770, 7, pf.field_N);
              break L4;
            }
          } else {
            if (param0.field_c) {
              ((wg) this).b((ag) (Object) new te((wg) this), (byte) 110);
              return;
            } else {
              ph discarded$3 = var5.a((mh) this, jf.field_e, 30);
              break L4;
            }
          }
        }
        ((wg) this).b((ag) (Object) var5, (byte) 110);
    }

    wg(gg param0, mk param1) {
        super(param0, pe.field_eb, ud.field_a, false, false);
        ((wg) this).field_xb = param1;
    }

    static {
    }
}
