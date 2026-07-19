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
                n.a(ka.field_m, (byte) 118);
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
        int incrementValue$1 = 0;
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_23_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param3 < param5) {
              if (param4 <= param3 + 1) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param4 <= 5 + param3) {
                    break L1;
                  } else {
                    if (param6 == param1) {
                      break L1;
                    } else {
                      var7_int = (1 & (param6 & param1)) + (param6 >> 1820773505) + (param1 >> 309323329);
                      var8 = param3;
                      var9 = param6;
                      var10 = param1;
                      var11 = param3;
                      L2: while (true) {
                        if (var11 >= param4) {
                          nb.a(param0, var9, param2, param3, var8, param5, param6);
                          nb.a(param0, param1, param2 + 0, var8, param4, param5, var10);
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          L3: {
                            var12 = ki.field_r[var11];
                            if (!param0) {
                              stackOut_22_0 = lm.field_i[var12];
                              stackIn_23_0 = stackOut_22_0;
                              break L3;
                            } else {
                              stackOut_21_0 = nf.field_z[var12];
                              stackIn_23_0 = stackOut_21_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_23_0;
                            if (var13 <= var7_int) {
                              if (var10 < var13) {
                                var10 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              ki.field_r[var11] = ki.field_r[var8];
                              incrementValue$1 = var8;
                              var8++;
                              ki.field_r[incrementValue$1] = var12;
                              if (var9 > var13) {
                                var9 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = param4 - 1;
                L5: while (true) {
                  if (param3 >= var7_int) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var8 = param3;
                    L6: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = ki.field_r[var8];
                          var10 = ki.field_r[var8 - -1];
                          if (!bo.a(param0, var9, (byte) -76, var10)) {
                            break L7;
                          } else {
                            ki.field_r[var8] = var10;
                            ki.field_r[var8 - -1] = var9;
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
                      }
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var7), "nb.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    final static void a(String param0, long param1, int param2) {
        CharSequence var5 = null;
        try {
            nj.field_c = 2;
            so.field_p = param0;
            if (param2 != -26510) {
                field_a = -55;
            }
            var5 = (CharSequence) ((Object) param0);
            ua.field_S = gk.a(var5, -13);
            gg.field_e = param1;
            ef.field_r = true;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "nb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, byte[] param1, wk param2) {
        try {
            int discarded$2 = 0;
            Exception exception = null;
            RuntimeException runtimeException = null;
            int var4_int = 0;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
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
                  if (31 != param2.field_j[param2.field_g]) {
                    break L1;
                  } else {
                    if (param2.field_j[1 + param2.field_g] != -117) {
                      break L1;
                    } else {
                      L2: {
                        if (null == this.field_b) {
                          this.field_b = new java.util.zip.Inflater(true);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var4_int = -109 % ((0 - param0) / 58);
                      try {
                        L3: {
                          this.field_b.setInput(param2.field_j, 10 + param2.field_g, -18 + (-param2.field_g + param2.field_j.length));
                          discarded$2 = this.field_b.inflate(param1);
                          break L3;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        exception = (Exception) (Object) decompiledCaughtException;
                        this.field_b.reset();
                        throw new RuntimeException("");
                      }
                      this.field_b.reset();
                      break L0;
                    }
                  }
                }
                throw new RuntimeException("");
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) (runtimeException);
                stackOut_13_1 = new StringBuilder().append("nb.A(").append(param0).append(',');
                stackIn_15_0 = stackOut_13_0;
                stackIn_15_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param1 == null) {
                  stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L4;
                } else {
                  stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackOut_14_2 = "{...}";
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_16_1 = stackOut_14_1;
                  stackIn_16_2 = stackOut_14_2;
                  break L4;
                }
              }
              L5: {
                stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
                stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param2 == null) {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L5;
                } else {
                  stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
                  stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L5;
                }
              }
              throw aa.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
            }
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
        field_e = "On";
        field_c = "  When you bring a full spellbook, other than the arcane one, into a game, you gain the option of summoning that spellbook's familiar to help you out. Each familiar has a different effect that enchances your Arcanist and/or minions.";
        field_f = "Now for some fun: select the Rain of Fire spell.";
    }
}
