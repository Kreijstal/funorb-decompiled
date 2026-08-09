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
        if (!(!this.field_wb)) {
            pc.a(false, true, false);
            return;
        }
        try {
            ul.e((byte) -25);
            this.g((byte) -5);
            int var6_int = 22 % ((param4 - -63) / 52);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "wg.E(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void c(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
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
            field_zb = (bd) null;
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
        kc var2 = null;
        if (param0 instanceof kc) {
            var2 = (kc) ((Object) param0);
            var2.field_a = var2.field_a + ' ' + param1;
        } else {
            var2 = new kc(param0, param1);
        }
        return var2;
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_ub = false;
        }
        field_zb = null;
    }

    final static String a(byte param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -21) {
              stackIn_4_0 = ig.a((byte) 28, param1, 0, param1.length);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("wg.O(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final void r(int param0) {
        this.a(an.a(248, -10, dg.field_sb), true, true);
        if (param0 >= -60) {
            CharSequence[] var3 = (CharSequence[]) null;
            wg.a((byte) -124, (CharSequence[]) null);
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
            CharSequence[] var13 = (CharSequence[]) null;
            wg.a((byte) -45, (CharSequence[]) null);
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
            field_zb = (bd) null;
        }
        if (this.field_F && !this.field_vb) {
            var2 = jc.a(false);
            if (var2 != null) {
                this.a(var2, true, false);
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
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        mk stackIn_10_0 = null;
        mk stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String var4 = null;
        RuntimeException var4_ref = null;
        qi var5 = null;
        int var6 = 0;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = this;

              if (!param1) {
                stackIn_4_0 = this;
                stackIn_4_1 = 0;
                break L1;
              } else {
                stackIn_4_0 = this;
                stackIn_4_1 = 1;
                break L1;
              }
            }
            L2: {
              ((wg) (this)).field_vb = stackIn_4_1 != 0;
              if (param0.field_b) {
                var4 = vf.field_J;
                break L2;
              } else {
                if (null == param0.field_e) {
                  var4 = param0.field_l;
                  if (248 == param0.field_a) {
                    L3: {
                      if (!param2) {
                        md.c(-125);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    this.field_wb = true;
                    var4 = dg.field_sb;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  var4 = om.field_f;
                  if (null != this.field_xb) {
                    L4: {
                      stackIn_10_0 = this.field_xb;

                      if (param1) {
                        stackIn_11_0 = (mk) ((Object) stackIn_10_0);
                        stackIn_11_1 = 0;
                        break L4;
                      } else {
                        stackIn_11_0 = (mk) ((Object) stackIn_10_0);
                        stackIn_11_1 = 1;
                        break L4;
                      }
                    }
                    ((mk) (Object) stackIn_11_0).a(stackIn_11_1 != 0);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            L5: {
              var5 = new qi((dg) (this), pe.field_eb, var4);
              if (!param0.field_b) {
                L6: {
                  if (this.field_wb) {
                    var5.a((mh) (this), jf.field_e, 30);
                    break L6;
                  } else {
                    if (-6 == (param0.field_a ^ -1)) {
                      var5.a(22770, 11, im.field_b);
                      var5.a(22770, 17, sc.field_k);
                      break L6;
                    } else {
                      var5.a(22770, -1, hg.field_d);
                      break L6;
                    }
                  }
                }
                if ((param0.field_a ^ -1) != -4) {
                  if (6 == param0.field_a) {
                    var5.a(22770, 9, wc.field_k);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  var5.a(22770, 7, pf.field_N);
                  break L5;
                }
              } else {
                if (param0.field_c) {
                  this.b(new te((wg) (this)), (byte) 110);
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var5.a((mh) (this), jf.field_e, 30);
                  break L5;
                }
              }
            }
            this.b(var5, (byte) 110);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = decompiledCaughtException;
            stackIn_39_0 = (RuntimeException) (var4_ref);

            stackIn_39_1 = new StringBuilder().append("wg.B(");

            if (param0 == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_40_0), stackIn_40_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    wg(gg param0, mk param1) {
        super(param0, pe.field_eb, ud.field_a, false, false);
        try {
            this.field_xb = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
