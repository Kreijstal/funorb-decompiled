/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ub {
    private int field_c;
    private jr[] field_b;
    static boolean field_e;
    static String field_a;
    private int field_f;
    static int field_d;

    final static te a(byte param0, sn param1) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        te stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        te stackOut_3_0 = null;
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
            if (param0 > 24) {
              stackOut_3_0 = ne.a(-69, aa.a(param1, 100, 96));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (te) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ub.F(").append(param0).append(',');
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
          throw ig.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final boolean b(byte param0, int param1, int param2, int param3, int param4) {
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        int var6 = 0;
        if (param0 != 117) {
            Object var8 = null;
            te discarded$0 = ub.a((byte) 7, (sn) null);
        }
        while (((ub) this).field_c > var6) {
            if (((ub) this).field_b[var6].b(42, param4, param2, param3, param1)) {
                return ((ub) this).field_c >> 1 < var6 ? true : false;
            }
            var6++;
        }
        return false;
    }

    final int a(byte param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 >= -92) {
            field_d = 33;
        }
        for (var6 = 0; ((ub) this).field_c > var6; var6++) {
            if (!(!((ub) this).field_b[var6].b(71, param3, param4, param2, param1))) {
                return ((ub) this).field_b[var6].field_i;
            }
        }
        return -1;
    }

    final void a(int param0, int param1, int[] param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        jr stackIn_7_0 = null;
        jr stackIn_8_0 = null;
        jr stackIn_9_0 = null;
        jr stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        jr stackOut_6_0 = null;
        jr stackOut_7_0 = null;
        jr stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        jr stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var6_int = param2[6];
            var7 = 0;
            L1: while (true) {
              if (((ub) this).field_c <= var7) {
                L2: {
                  if (param1 == -23451) {
                    break L2;
                  } else {
                    boolean discarded$1 = ((ub) this).b((byte) 112, 3, 116, -86, -110);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  if (!((ub) this).field_b[var7].field_a) {
                    if (((ub) this).field_b[var7].field_c == 0) {
                      ((ub) this).field_b[var7].a(var6_int, param4 + 16, false, param3 + 16);
                      break L3;
                    } else {
                      ((ub) this).field_b[var7].a(param2[-1 + ((ub) this).field_b[var7].field_c], param4 + 16, false, param3 + 16);
                      break L3;
                    }
                  } else {
                    L4: {
                      if (-1 == bw.field_m[((ub) this).field_b[var7].field_i][1]) {
                        break L4;
                      } else {
                        var6_int = param2[bw.field_m[((ub) this).field_b[var7].field_i][1]];
                        break L4;
                      }
                    }
                    L5: {
                      L6: {
                        stackOut_6_0 = ((ub) this).field_b[var7];
                        stackIn_9_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (param0 < bw.field_m[((ub) this).field_b[var7].field_i][8]) {
                          break L6;
                        } else {
                          stackOut_7_0 = (jr) (Object) stackIn_7_0;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_8_0 = stackOut_7_0;
                          if (var6_int < bw.field_m[((ub) this).field_b[var7].field_i][2]) {
                            break L6;
                          } else {
                            stackOut_8_0 = (jr) (Object) stackIn_8_0;
                            stackOut_8_1 = 1;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            break L5;
                          }
                        }
                      }
                      stackOut_9_0 = (jr) (Object) stackIn_9_0;
                      stackOut_9_1 = 0;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      break L5;
                    }
                    ((jr) (Object) stackIn_10_0).a(stackIn_10_1, 16 + param4, false, param3 - -16);
                    break L3;
                  }
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var6;
            stackOut_18_1 = new StringBuilder().append("ub.E(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static String a(byte param0, int param1) {
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (0 > param1) {
            break L0;
          } else {
            if (param1 < 3) {
              var2 = "";
              var3 = 0;
              L1: while (true) {
                if (var3 >= cd.field_a[param1].field_n.length) {
                  return var2;
                } else {
                  var2 = var2 + var3 + ": " + cd.field_a[param1].field_n[var3].field_J + "\n";
                  var3++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        return "Unkown Campaign " + param1;
    }

    final jr a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = ArmiesOfGielinor.field_M ? 1 : 0;
          var3 = 0;
          if (param1 == -15050) {
            break L0;
          } else {
            field_a = null;
            break L0;
          }
        }
        L1: while (true) {
          if (var3 < ((ub) this).field_c) {
            if (param0 != ((ub) this).field_b[var3].field_i) {
              var3++;
              continue L1;
            } else {
              return ((ub) this).field_b[var3];
            }
          } else {
            return null;
          }
        }
    }

    final static void a(boolean param0, boolean param1) {
        ij.field_w = !param1 ? new ea(ob.field_O, eb.field_c) : new ea(ur.field_x, uj.field_l);
        lk.field_a = new je(0L, (je) null);
        lk.field_a.a((je) (Object) ij.field_w.field_a, 126);
        lk.field_a.a(mp.field_Lb, 97);
        ta.field_R = new je(0L, jm.field_b);
        df.field_K = new je(0L, (je) null);
        ta.field_R.a(bk.field_f, 54);
        ta.field_R.a(df.field_K, 70);
        df.field_K.a(nf.field_Kb, 112);
        df.field_K.a(dv.field_m, 74);
        je.a(27, param1);
    }

    public static void a(byte param0) {
        field_a = null;
    }

    ub(int param0, jr[] param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        jr stackIn_4_0 = null;
        jr stackIn_5_0 = null;
        jr stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        jr stackOut_3_0 = null;
        jr stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        jr stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            ((ub) this).field_c = param1.length;
            ((ub) this).field_f = param0;
            ((ub) this).field_b = param1;
            var4_int = 0;
            L1: while (true) {
              if (var4_int >= ((ub) this).field_c) {
                break L0;
              } else {
                L2: {
                  stackOut_3_0 = ((ub) this).field_b[var4_int];
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (!param2) {
                    stackOut_5_0 = (jr) (Object) stackIn_5_0;
                    stackOut_5_1 = -1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    break L2;
                  } else {
                    stackOut_4_0 = (jr) (Object) stackIn_4_0;
                    stackOut_4_1 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_6_1 = stackOut_4_1;
                    break L2;
                  }
                }
                stackIn_6_0.field_b = stackIn_6_1 * (int)(Math.sin(2.0 * (3.141592653589793 * (double)var4_int) / (double)((ub) this).field_c) * (double)((ub) this).field_f);
                ((ub) this).field_b[var4_int].field_g = -(int)(Math.cos(2.0 * (3.141592653589793 * (double)var4_int) / (double)((ub) this).field_c) * (double)((ub) this).field_f);
                var4_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("ub.<init>(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param2 + ')');
        }
    }

    final static vb a(oj param0, ha param1, boolean param2, int param3, ic param4, int param5, int param6, eo param7) {
        int var8_int = 0;
        RuntimeException var8 = null;
        vb var9 = null;
        Object stackIn_2_0 = null;
        vb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        vb stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            var8_int = 13;
            var9 = new vb(param4, param1, param7, param0, param6, param3, param2);
            if (var9.b(param6, param3, true)) {
              stackOut_3_0 = (vb) var9;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (vb) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var8 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var8;
            stackOut_5_1 = new StringBuilder().append("ub.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
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
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          L4: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(17).append(',').append(param6).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param7 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Portal";
    }
}
