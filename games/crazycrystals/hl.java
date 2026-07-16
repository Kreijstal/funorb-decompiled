/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends l {
    static int field_h;
    private r field_f;
    static String field_e;
    static int field_g;

    final l b(byte param0) {
        if (param0 != -90) {
            return null;
        }
        return (l) (Object) new fe(((hl) this).field_f);
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_9_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_15_0 = 0;
            var7 = CrazyCrystals.field_B;
            if (wg.field_P) {
              return true;
            } else {
              try {
                L0: {
                  L1: {
                    var2 = "tuhstatbut";
                    var3 = (String) hi.a(param0, "getcookies", 16);
                    var4 = ik.a(var3, (byte) -76, ';');
                    if (param1 <= -39) {
                      break L1;
                    } else {
                      uf discarded$2 = hl.a(-13, true);
                      break L1;
                    }
                  }
                  var5 = 0;
                  L2: while (true) {
                    if (var5 >= var4.length) {
                      break L0;
                    } else {
                      L3: {
                        var6 = var4[var5].indexOf('=');
                        if ((var6 ^ -1) > -1) {
                          break L3;
                        } else {
                          if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                            break L3;
                          } else {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            return stackIn_10_0 != 0;
                          }
                        }
                      }
                      var5++;
                      continue L2;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var2_ref = decompiledCaughtException;
                  break L4;
                }
              }
              L5: {
                if (null == param0.getParameter("tuhstatbut")) {
                  stackOut_16_0 = 0;
                  stackIn_17_0 = stackOut_16_0;
                  break L5;
                } else {
                  stackOut_15_0 = 1;
                  stackIn_17_0 = stackOut_15_0;
                  break L5;
                }
              }
              return stackIn_17_0 != 0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final l a(int param0) {
        jj.field_b = jj.field_b + 16;
        if (!(jj.field_b >= 0)) {
            return (l) this;
        }
        if (param0 != -2) {
            ((hl) this).field_f = null;
        }
        jj.field_b = 0;
        return (l) (Object) new o(30, (l) (Object) new fe(((hl) this).field_f));
    }

    final static uf a(int param0, boolean param1) {
        md var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        Object var8 = null;
        md var9 = null;
        mp var10 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_23_0 = null;
        int[] stackOut_22_0 = null;
        L0: {
          var7 = CrazyCrystals.field_B;
          var9 = kd.field_n;
          var2 = var9;
          var3 = var9.h(255);
          lj.field_b = var3 & 127;
          if ((128 & var3 ^ -1) == -1) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          om.field_u = stackIn_3_0 != 0;
          dd.field_b = var9.h(255);
          vf.field_d = var9.d(true);
          if ((lj.field_b ^ -1) == -3) {
            na.field_kb = var9.c((byte) -7);
            ca.field_m = var9.b(false);
            break L1;
          } else {
            na.field_kb = 0;
            ca.field_m = 0;
            break L1;
          }
        }
        L2: {
          if ((var9.h(255) ^ -1) != -2) {
            stackOut_8_0 = 0;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = 1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var4 = stackIn_9_0;
          pc.field_w = var9.i(110);
          if (var4 == 0) {
            md.field_s = pc.field_w;
            break L3;
          } else {
            md.field_s = var9.i(121);
            break L3;
          }
        }
        L4: {
          if (param0 == 16) {
            break L4;
          } else {
            var8 = null;
            boolean discarded$5 = hl.a((java.applet.Applet) null, 102);
            break L4;
          }
        }
        L5: {
          if (-2 == (lj.field_b ^ -1)) {
            int discarded$6 = var9.c((byte) -7);
            String discarded$7 = var9.i(111);
            break L5;
          } else {
            if (-5 != (lj.field_b ^ -1)) {
              break L5;
            } else {
              int discarded$8 = var9.c((byte) -7);
              String discarded$9 = var9.i(111);
              break L5;
            }
          }
        }
        L6: {
          if (!param1) {
            fb.field_b = s.a((ng) (Object) var9, 116, 80);
            so.field_f = null;
            break L6;
          } else {
            var5 = var9.c((byte) -7);
            try {
              L7: {
                L8: {
                  var10 = bn.field_g.a(127, var5);
                  fb.field_b = var10.e(60);
                  if (md.field_s.equals((Object) (Object) je.field_g)) {
                    stackOut_23_0 = null;
                    stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                    break L8;
                  } else {
                    stackOut_22_0 = var10.field_o;
                    stackIn_24_0 = stackOut_22_0;
                    break L8;
                  }
                }
                so.field_f = stackIn_24_0;
                break L7;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                wp.a((Throwable) (Object) var6, "CC1", 21862);
                fb.field_b = null;
                so.field_f = null;
                break L9;
              }
            }
            break L6;
          }
        }
        return new uf(param1);
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 != 25648) {
            Object var2 = null;
            boolean discarded$0 = hl.a((java.applet.Applet) null, -82);
        }
    }

    hl(r param0) {
        ((hl) this).field_f = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "This is a hole.<br><br>Watch out! You can fall<br>into holes - unless they<br>have been filled.";
        field_g = 0;
    }
}
