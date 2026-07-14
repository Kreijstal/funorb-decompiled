/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class nb {
    static String field_e;
    static String field_c;
    private java.util.zip.Inflater field_b;
    static int field_a;
    static String field_f;
    static boolean field_d;

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 == 5) {
          L0: {
            if ((ah.field_c ^ -1) < -1) {
              L1: {
                if (ob.field_Y != null) {
                  ka.field_m = ob.field_Y.a(param1 + 122);
                  li.a(2, 0);
                  break L1;
                } else {
                  ka.field_m = ol.a(0, 0, false, fi.field_d, 480, 640);
                  break L1;
                }
              }
              if (null == ka.field_m) {
                var2 = 3;
                break L0;
              } else {
                n.a((java.awt.Canvas) (Object) ka.field_m, (byte) 118);
                var2 = 2;
                break L0;
              }
            } else {
              if (lc.a((byte) 112)) {
                var2 = 0;
                break L0;
              } else {
                var2 = 1;
                break L0;
              }
            }
          }
          L2: {
            if (null != ob.field_Y) {
              break L2;
            } else {
              if (!ri.field_f) {
                break L2;
              } else {
                qa.a(param0, -4693, var2);
                break L2;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        int var1 = 80 % ((8 - param0) / 56);
        field_f = null;
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        if (param3 < param5) {
          if (param4 <= param3 + 1) {
            return;
          } else {
            L0: {
              if (param4 <= 5 + param3) {
                break L0;
              } else {
                if (param6 == param1) {
                  break L0;
                } else {
                  var7 = (1 & (param6 & param1)) + (param6 >> 1820773505) + (param1 >> 309323329);
                  var8 = param3;
                  var9 = param6;
                  var10 = param1;
                  var11 = param3;
                  L1: while (true) {
                    if (var11 >= param4) {
                      nb.a(param0, var9, param2, param3, var8, param5, param6);
                      nb.a(param0, param1, param2 + 0, var8, param4, param5, var10);
                      return;
                    } else {
                      L2: {
                        var12 = ki.field_r[var11];
                        if (!param0) {
                          stackOut_22_0 = lm.field_i[var12];
                          stackIn_23_0 = stackOut_22_0;
                          break L2;
                        } else {
                          stackOut_21_0 = nf.field_z[var12];
                          stackIn_23_0 = stackOut_21_0;
                          break L2;
                        }
                      }
                      var13 = stackIn_23_0;
                      if (var13 <= var7) {
                        if (var10 < var13) {
                          var10 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      } else {
                        ki.field_r[var11] = ki.field_r[var8];
                        var8++;
                        ki.field_r[var8] = var12;
                        if (var9 > var13) {
                          var9 = var13;
                          var11++;
                          continue L1;
                        } else {
                          var11++;
                          continue L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            var7 = param4 - 1;
            L3: while (true) {
              if (param3 >= var7) {
                return;
              } else {
                var8 = param3;
                L4: while (true) {
                  if (var7 <= var8) {
                    var7--;
                    continue L3;
                  } else {
                    var9 = ki.field_r[var8];
                    var10 = ki.field_r[var8 - -1];
                    if (bo.a(param0, var9, (byte) -76, var10)) {
                      ki.field_r[var8] = var10;
                      ki.field_r[var8 - -1] = var9;
                      var8++;
                      continue L4;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static void a(String param0, long param1, int param2) {
        nj.field_c = 2;
        so.field_p = param0;
        if (param2 != -26510) {
            field_a = -55;
        }
        CharSequence var5 = (CharSequence) (Object) param0;
        ua.field_S = gk.a(var5, -13);
        gg.field_e = param1;
        ef.field_r = true;
    }

    final void a(int param0, byte[] param1, wk param2) {
        try {
            if (31 == param2.field_j[param2.field_g]) {
                // if_icmpne L45
            } else {
                throw new RuntimeException("");
            }
            if (!(null != ((nb) this).field_b)) {
                ((nb) this).field_b = new java.util.zip.Inflater(true);
            }
            int var4 = -109 % ((0 - param0) / 58);
            try {
                ((nb) this).field_b.setInput(param2.field_j, 10 + param2.field_g, -18 + (-param2.field_g + param2.field_j.length));
                int discarded$0 = ((nb) this).field_b.inflate(param1);
            } catch (Exception exception) {
                ((nb) this).field_b.reset();
                throw new RuntimeException("");
            }
            ((nb) this).field_b.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private nb(int param0, int param1, int param2) {
    }

    public nb() {
        this(-1, 1000000, 1000000);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "On";
        field_c = "  When you bring a full spellbook, other than the arcane one, into a game, you gain the option of summoning that spellbook's familiar to help you out. Each familiar has a different effect that enchances your Arcanist and/or minions.";
        field_f = "Now for some fun: select the Rain of Fire spell.";
    }
}
