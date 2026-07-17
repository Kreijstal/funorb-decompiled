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
            int discarded$0 = 0;
            pc.a(false, true);
            return;
        }
        try {
            int discarded$1 = -25;
            ul.e();
            ((wg) this).g((byte) -5);
            int var6_int = 22 % ((param4 - -63) / 52);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "wg.E(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
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
          if (var3 >= 5) {
            if (var3 >= 105) {
              if (var3 < 120) {
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
          var4 = 1;
          var5 = 0;
          if (param0 == 3) {
            var4 = -1;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (1 != param0) {
            break L2;
          } else {
            var5 = 1;
            break L2;
          }
        }
        L3: {
          if (param0 != 4) {
            break L3;
          } else {
            var5 = 1;
            var4 = 1;
            break L3;
          }
        }
        L4: {
          if (5 == param0) {
            var4 = -1;
            var5 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (6 == param0) {
            var5 = -1;
            var4 = 1;
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if (param0 == 7) {
              break L7;
            } else {
              if (param0 == 8) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L6;
        }
        L8: {
          if (param0 == 11) {
            var4 = -1;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (12 != param0) {
            break L9;
          } else {
            var5 = -1;
            var4 = -1;
            break L9;
          }
        }
        L10: {
          if (param0 != 13) {
            break L10;
          } else {
            var5 = -1;
            var4 = 1;
            break L10;
          }
        }
        L11: {
          if (14 != param0) {
            break L11;
          } else {
            var5 = 1;
            var4 = -1;
            break L11;
          }
        }
        L12: {
          if (param0 == 15) {
            var4 = 1;
            var5 = 1;
            break L12;
          } else {
            break L12;
          }
        }
        vg.field_a = jd.a(var5 * var2, var2 * var4, (byte) -79);
    }

    final static kc a(Throwable param0, String param1) {
        kc var2 = null;
        if (param0 instanceof kc) {
            var2 = (kc) (Object) param0;
            var2.field_a = var2.field_a + 32 + param1;
        } else {
            var2 = new kc(param0, param1);
        }
        return var2;
    }

    public static void b() {
        field_zb = null;
    }

    final static String a(byte param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 == -21) {
              stackOut_3_0 = ig.a((byte) 28, param1, 0, param1.length);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("wg.O(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
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
        int[] var13 = new int[256];
        int[] var3 = var13;
        int var4 = (16713328 & param1) >> 16;
        int var5 = (65487 & param1) >> 8;
        int var6 = param1 & 255;
        int var7 = (param2 & 16754703) >> 16;
        int var8 = (65393 & param2) >> 8;
        int var9 = 255 & param2;
        for (var10 = 0; var10 < 256; var10++) {
            var11 = -var10 + 256;
            var13[var10] = (var9 * var11 >> 8) - -(var6 * var10 >> 8) + (((var4 * var10 >> 8) + (var7 * var11 >> 8) << 16) + ((var8 * var11 >> 8) + (var10 * var5 >> 8) << 8));
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
        en var2 = s.field_b;
        var2.i(19319, 4);
        var2.d(90, 1);
        var2.d(113, 2);
    }

    private final void a(jj param0, boolean param1, boolean param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        qi var5 = null;
        int var6 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              ((wg) this).field_vb = true;
              if (param0.field_b) {
                var4_ref = vf.field_J;
                break L1;
              } else {
                if (null == param0.field_e) {
                  var4_ref = param0.field_l;
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
                    var4_ref = dg.field_sb;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = om.field_f;
                  if (null != ((wg) this).field_xb) {
                    ((wg) this).field_xb.a(false);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              var5 = new qi((dg) this, pe.field_eb, var4_ref);
              if (!param0.field_b) {
                L4: {
                  if (((wg) this).field_wb) {
                    ph discarded$2 = var5.a((mh) this, jf.field_e, 30);
                    break L4;
                  } else {
                    if (param0.field_a == 5) {
                      var5.a(22770, 11, im.field_b);
                      var5.a(22770, 17, sc.field_k);
                      break L4;
                    } else {
                      var5.a(22770, -1, hg.field_d);
                      break L4;
                    }
                  }
                }
                if (param0.field_a != 3) {
                  if (6 == param0.field_a) {
                    var5.a(22770, 9, wc.field_k);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  var5.a(22770, 7, pf.field_N);
                  break L3;
                }
              } else {
                if (param0.field_c) {
                  ((wg) this).b((ag) (Object) new te((wg) this), (byte) 110);
                  return;
                } else {
                  ph discarded$3 = var5.a((mh) this, jf.field_e, 30);
                  break L3;
                }
              }
            }
            ((wg) this).b((ag) (Object) var5, (byte) 110);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("wg.B(");
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L5;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L5;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + 1 + 44 + param2 + 41);
        }
    }

    wg(gg param0, mk param1) {
        super(param0, pe.field_eb, ud.field_a, false, false);
        try {
            ((wg) this).field_xb = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "wg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
    }
}
