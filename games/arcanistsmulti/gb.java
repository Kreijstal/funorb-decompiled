/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class gb implements Iterable {
    static ll[] field_c;
    static String field_b;
    tf field_g;
    static byte[] field_d;
    static int field_f;
    static String field_e;
    static String field_a;

    final static void a(byte param0) {
        hf.a(29, new int[]{0, 1, 27, 5, 14, 4, 22, 15, 19}, param0 ^ -9, 0, 146, 577, 250);
        hf.a(31, new int[]{2, 20, 21, 5, 9}, 0, 1, 320, 288, 32);
        hf.a(31, new int[]{2, 20, 21, 5, 10, 11, 13}, 0, 2, 320, 288, 32);
        hf.a(31, new int[]{12, 13}, 0, 3, 32, 288, 32);
        hf.a(31, new int[]{2, 20, 21, 5, 13}, 0, 4, 320, 288, 32);
        hf.a(31, new int[]{29}, 0, 5, 410, 480, 160);
        hf.a(31, new int[]{23, 8}, 0, 6, 410, 480, 160);
        hf.a(31, new int[]{25, 8, 26}, param0 ^ -9, 7, 430, 540, 70);
        hf.a(31, new int[]{25, 8, 26, 23}, param0 ^ -9, 8, 400, 480, 160);
        hf.a(31, new int[]{7}, 0, 9, 400, 540, 290);
        hf.a(31, new int[]{7, 23}, 0, 10, 200, 540, 50);
        hf.a(31, new int[]{7, 28}, 0, 11, 430, 540, 110);
        hf.a(31, new int[]{7, 27}, param0 + 9, 12, 430, 540, 110);
        hf.a(31, new int[]{7}, 0, 13, 430, 420, 220);
        if (param0 != -9) {
          return;
        } else {
          hf.a(31, new int[]{25, 26, 30, 29, 7}, 0, 14, 430, 420, 220);
          hf.a(29, new int[]{20, 21, 6, 7}, 0, 15, 146, 577, 250);
          hf.a(31, new int[]{7}, 0, 16, 200, 540, 50);
          return;
        }
    }

    final tf b(int param0) {
        tf var2 = null;
        if (param0 == 31) {
          var2 = this.field_g.field_l;
          if (var2 == this.field_g) {
            return null;
          } else {
            var2.a((byte) 88);
            return var2;
          }
        } else {
          field_a = (String) null;
          var2 = this.field_g.field_l;
          if (var2 == this.field_g) {
            return null;
          } else {
            var2.a((byte) 88);
            return var2;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new fh((gb) (this)));
    }

    final static String a(java.applet.Applet param0, int param1) {
        try {
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            String var9 = null;
            String stackIn_3_0 = null;
            String stackIn_9_0 = null;
            String stackIn_15_0 = null;
            String stackIn_17_0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            String stackIn_21_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            String stackOut_8_0 = null;
            String stackOut_16_0 = null;
            String stackOut_14_0 = null;
            String stackOut_2_0 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            var8 = ArcanistsMulti.field_G ? 1 : 0;
            try {
              L0: {
                if (param1 < -119) {
                  try {
                    L1: {
                      var9 = param0.getParameter("cookieprefix");
                      var3 = var9 + "settings";
                      var4 = (String) (ei.a(param0, 119, "getcookies"));
                      var5 = eh.a(false, ';', var4);
                      var6 = 0;
                      L2: while (true) {
                        if (var5.length <= var6) {
                          decompiledRegionSelector0 = 0;
                          break L1;
                        } else {
                          L3: {
                            var7 = var5[var6].indexOf('=');
                            if (-1 < (var7 ^ -1)) {
                              break L3;
                            } else {
                              if (!var5[var6].substring(0, var7).trim().equals(var3)) {
                                break L3;
                              } else {
                                stackOut_8_0 = var5[var6].substring(1 + var7).trim();
                                stackIn_9_0 = stackOut_8_0;
                                decompiledRegionSelector0 = 1;
                                break L1;
                              }
                            }
                          }
                          var6++;
                          continue L2;
                        }
                      }
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L4: {
                      var2 = decompiledCaughtException;
                      decompiledRegionSelector0 = 0;
                      break L4;
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    if (vm.field_b == null) {
                      stackOut_16_0 = param0.getParameter("settings");
                      stackIn_17_0 = stackOut_16_0;
                      decompiledRegionSelector1 = 2;
                      break L0;
                    } else {
                      stackOut_14_0 = vm.field_b;
                      stackIn_15_0 = stackOut_14_0;
                      decompiledRegionSelector1 = 1;
                      break L0;
                    }
                  } else {
                    decompiledRegionSelector1 = 3;
                    break L0;
                  }
                } else {
                  stackOut_2_0 = (String) null;
                  stackIn_3_0 = stackOut_2_0;
                  decompiledRegionSelector1 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) (var2_ref);
                stackOut_18_1 = new StringBuilder().append("gb.C(");
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param0 == null) {
                  stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
                  stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
                  stackOut_20_2 = "null";
                  stackIn_21_0 = stackOut_20_0;
                  stackIn_21_1 = stackOut_20_1;
                  stackIn_21_2 = stackOut_20_2;
                  break L5;
                } else {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "{...}";
                  stackIn_21_0 = stackOut_19_0;
                  stackIn_21_1 = stackOut_19_1;
                  stackIn_21_2 = stackOut_19_2;
                  break L5;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_3_0;
            } else {
              if (decompiledRegionSelector1 == 1) {
                return stackIn_15_0;
              } else {
                if (decompiledRegionSelector1 == 2) {
                  return stackIn_17_0;
                } else {
                  return stackIn_9_0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, boolean param1) {
        ab var2 = null;
        if (!param1) {
          return;
        } else {
          var2 = he.field_e;
          var2.b((byte) -124, param0);
          var2.f(1, (byte) -54);
          var2.f(2, (byte) -47);
          return;
        }
    }

    final void a(byte param0, tf param1) {
        if (!(null == param1.field_i)) {
            param1.a((byte) 88);
        }
        param1.field_l = this.field_g;
        param1.field_i = this.field_g.field_i;
        if (param0 != 37) {
            return;
        }
        try {
            param1.field_i.field_l = param1;
            param1.field_l.field_i = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "gb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    gb() {
        this.field_g = new tf();
        this.field_g.field_l = this.field_g;
        this.field_g.field_i = this.field_g;
    }

    public static void b(byte param0) {
        field_d = null;
        field_e = null;
        field_b = null;
        field_c = null;
        int var1 = 2 % ((76 - param0) / 36);
        field_a = null;
    }

    final static void a(int param0) {
        String discarded$5 = null;
        java.applet.Applet var2 = null;
        L0: {
          oj.field_i = false;
          if (nn.field_q != null) {
            nn.field_q.e(-111);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 14) {
          if (nj.field_c != 0) {
            ue.b(10);
            ng.field_K = 0;
            return;
          } else {
            ng.field_K = 0;
            return;
          }
        } else {
          var2 = (java.applet.Applet) null;
          discarded$5 = gb.a((java.applet.Applet) null, 114);
          if (nj.field_c == 0) {
            ng.field_K = 0;
            return;
          } else {
            ue.b(10);
            ng.field_K = 0;
            return;
          }
        }
    }

    static {
        field_b = "Allow spectators?";
        field_a = "Return to lobby";
        field_e = "Click the mouse to summon the minion. You can only summon within the shown summoning circle and clear of the landscape. Minions are either living, arcane or undead.";
    }
}
