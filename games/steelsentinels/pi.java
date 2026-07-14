/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pi extends java.awt.Canvas {
    private java.awt.Component field_d;
    static dk field_a;
    static char[] field_b;
    static int[] field_e;
    static int field_c;
    static String[] field_f;

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
        field_f = null;
        if (param0 != 61) {
            Object var2 = null;
            int discarded$0 = pi.a((byte) 56, (gh) null, -94, true);
        }
        field_e = null;
    }

    pi(java.awt.Component param0) {
        ((pi) this).field_d = param0;
    }

    final static int a(byte param0, gh param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var11 = null;
        gh var12 = null;
        int var13 = 0;
        gh var14 = null;
        gh var15 = null;
        gh var16 = null;
        String stackIn_32_0 = null;
        String stackOut_31_0 = null;
        String stackOut_30_0 = null;
        var13 = SteelSentinels.field_G;
        if (!he.a((byte) 116)) {
          return param2;
        } else {
          L0: {
            if (param0 <= -17) {
              break L0;
            } else {
              field_a = null;
              break L0;
            }
          }
          var4 = qa.field_O;
          var6 = 1;
          var7 = 0;
          L1: while (true) {
            if (var7 >= 8) {
              return param2;
            } else {
              var8 = 0;
              var9 = 0;
              L2: while (true) {
                if (35 <= var9) {
                  var7++;
                  continue L1;
                } else {
                  if (var7 == pe.field_O[var9]) {
                    L3: {
                      var5 = 2;
                      if (t.a(fe.field_D, var9, -20370)) {
                        var5 = 0;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      if (!param3) {
                        if (var5 != 0) {
                          if (ad.a(var9, nk.f((byte) -28), fe.field_D, (byte) 84, ge.field_m, rn.field_D)) {
                            break L4;
                          } else {
                            var9++;
                            continue L2;
                          }
                        } else {
                          var9++;
                          continue L2;
                        }
                      } else {
                        if (var5 == 0) {
                          break L4;
                        } else {
                          var9++;
                          continue L2;
                        }
                      }
                    }
                    L5: {
                      if (var5 == 0) {
                        break L5;
                      } else {
                        if (qf.field_h[var9] <= li.field_v) {
                          var5 = 1;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var6 != 0) {
                        L7: {
                          var6 = 0;
                          var14 = new gh(-1L, (gh) null);
                          var14.field_Pb = gj.field_a;
                          var14.field_Kb = 2;
                          var14.a(0, param2, 18, 0, var4);
                          param1.a(var14, 126);
                          if (!param3) {
                            stackOut_31_0 = he.field_h;
                            stackIn_32_0 = stackOut_31_0;
                            break L7;
                          } else {
                            stackOut_30_0 = qj.field_c;
                            stackIn_32_0 = stackOut_30_0;
                            break L7;
                          }
                        }
                        var11 = stackIn_32_0;
                        var12 = new gh(-1L, kh.field_s, var11);
                        var12.field_nb = 0;
                        var12.field_L = (mi) (Object) pl.field_U;
                        var12.a(0, param2, 18, 0, var4);
                        var12.field_Fb = 1;
                        var12.field_sb = 1;
                        var12.field_I = null;
                        var12.field_Kb = 1;
                        param1.a(var12, 125);
                        param2 = param2 + var12.field_Lb;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L8: {
                      if (var8 != 0) {
                        break L8;
                      } else {
                        var8 = 1;
                        var15 = new gh(-1L, kh.field_s, si.field_D[var7]);
                        var15.field_Kb = 1;
                        var15.field_nb = 11119017;
                        param2 += 2;
                        var15.field_I = lj.field_b;
                        var15.a(0, param2, 15, 0, var4);
                        param2 += 15;
                        param1.a(var15, 121);
                        break L8;
                      }
                    }
                    param2 += 2;
                    var16 = lj.a(var4, var9, true, param3, var5, 49);
                    var16.a(0, param2, 49, 0, var4);
                    param2 += 49;
                    param1.a(var16, 126);
                    var9++;
                    continue L2;
                  } else {
                    var9++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    public final void paint(java.awt.Graphics param0) {
        ((pi) this).field_d.paint(param0);
    }

    final static a a(byte param0) {
        try {
            Throwable var1 = null;
            a stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            a stackOut_2_0 = null;
            try {
              L0: {
                if (param0 > 14) {
                  break L0;
                } else {
                  field_e = null;
                  break L0;
                }
              }
              stackOut_2_0 = (a) Class.forName("mk").newInstance();
              stackIn_3_0 = stackOut_2_0;
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    public final void update(java.awt.Graphics param0) {
        ((pi) this).field_d.update(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
        field_b = new char[128];
        field_f = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_c = 0;
    }
}
