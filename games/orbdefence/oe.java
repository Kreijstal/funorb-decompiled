/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oe extends o {
    private int[][] field_l;
    private int[] field_k;
    private int[] field_o;
    static boolean field_p;
    static String field_q;
    private String[] field_n;
    static String field_m;

    final void a(byte param0, mg param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        Object var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              var3_int = param1.b((byte) 90);
              if (var3_int == 0) {
                L2: {
                  if (param0 == 67) {
                    break L2;
                  } else {
                    var5 = null;
                    qj discarded$4 = oe.a(-111, (String) null, -88);
                    break L2;
                  }
                }
                break L0;
              } else {
                int discarded$5 = -3;
                this.a(param1, var3_int);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var3;
            stackOut_6_1 = new StringBuilder().append("oe.F(").append(param0).append(44);
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
    }

    private final void a(mg param0, int param1) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        ba var7 = null;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 1) {
                ((oe) this).field_n = g.a(87, '<', param0.g(2));
                break L1;
              } else {
                if (param1 != 2) {
                  if (param1 == 3) {
                    var4_int = param0.b((byte) 90);
                    ((oe) this).field_k = new int[var4_int];
                    ((oe) this).field_l = new int[var4_int][];
                    var5 = 0;
                    L2: while (true) {
                      if (var4_int <= var5) {
                        break L1;
                      } else {
                        L3: {
                          var6 = param0.j(98203176);
                          var7 = wg.a(var6, -128);
                          if (var7 != null) {
                            ((oe) this).field_k[var5] = var6;
                            ((oe) this).field_l[var5] = new int[var7.field_f];
                            var8 = 0;
                            L4: while (true) {
                              if (var8 >= var7.field_f) {
                                break L3;
                              } else {
                                ((oe) this).field_l[var5][var8] = param0.j(98203176);
                                var8++;
                                continue L4;
                              }
                            }
                          } else {
                            break L3;
                          }
                        }
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    if (param1 != 4) {
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  var4_int = param0.b((byte) 90);
                  ((oe) this).field_o = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= var4_int) {
                      break L1;
                    } else {
                      ((oe) this).field_o[var5] = param0.j(98203176);
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("oe.C(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + -3 + 41);
        }
    }

    public static void f() {
        field_m = null;
        field_q = null;
    }

    private final String e() {
        int var3 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((oe) this).field_n) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((oe) this).field_n[0]);
        for (var3 = 1; ((oe) this).field_n.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((oe) this).field_n[var3]);
        }
        return var2.toString();
    }

    final static og a(boolean param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        se var8 = null;
        oe var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_22_0 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        Object stackOut_21_0 = null;
        int[] stackOut_20_0 = null;
        L0: {
          var7 = OrbDefence.field_D ? 1 : 0;
          var8 = cd.field_t;
          var3 = var8.b((byte) 90);
          if ((128 & var3) == 0) {
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
          ja.field_e = stackIn_3_0 != 0;
          wb.field_d = var3 & 127;
          bh.field_c = var8.b((byte) 90);
          tf.field_l = var8.c((byte) -89);
          if (wb.field_d == 2) {
            pc.field_X = var8.j(98203176);
            gb.field_b = var8.a((byte) -30);
            break L1;
          } else {
            pc.field_X = 0;
            gb.field_b = 0;
            break L1;
          }
        }
        L2: {
          if (var8.b((byte) 90) != 1) {
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
          l.field_f = var8.g(2);
          if (var4 != 0) {
            vk.field_v = var8.g(2);
            break L3;
          } else {
            vk.field_v = l.field_f;
            break L3;
          }
        }
        L4: {
          L5: {
            if (wb.field_d == 1) {
              break L5;
            } else {
              if (4 == wb.field_d) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          int discarded$3 = var8.j(98203176);
          String discarded$4 = var8.g(2);
          break L4;
        }
        L6: {
          if (param0) {
            var5 = var8.j(98203176);
            try {
              L7: {
                L8: {
                  var9 = aa.field_d.b(-11244, var5);
                  int discarded$5 = -50;
                  vj.field_a = var9.e();
                  if (vk.field_v.equals((Object) (Object) gb.field_h)) {
                    stackOut_21_0 = null;
                    stackIn_22_0 = (int[]) (Object) stackOut_21_0;
                    break L8;
                  } else {
                    stackOut_20_0 = var9.field_o;
                    stackIn_22_0 = stackOut_20_0;
                    break L8;
                  }
                }
                n.field_c = stackIn_22_0;
                break L7;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                pe.a((byte) -13, (Throwable) (Object) var6, "CC1");
                n.field_c = null;
                vj.field_a = null;
                break L9;
              }
            }
            break L6;
          } else {
            vj.field_a = hi.a(80, -111, (mg) (Object) var8);
            n.field_c = null;
            break L6;
          }
        }
        return new og(param0);
    }

    oe() {
    }

    final static qj a(int param0, String param1, int param2) {
        qj var3 = null;
        RuntimeException var3_ref = null;
        qj stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        qj stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param2 == -3) {
                break L1;
              } else {
                field_q = null;
                break L1;
              }
            }
            var3 = new qj(false);
            var3.field_e = param1;
            var3.field_b = param0;
            stackOut_2_0 = (qj) var3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("oe.E(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    final void b(byte param0) {
        int var2 = 0;
        int var3 = OrbDefence.field_D ? 1 : 0;
        if (((oe) this).field_o != null) {
            for (var2 = 0; var2 < ((oe) this).field_o.length; var2++) {
                ((oe) this).field_o[var2] = ge.a(((oe) this).field_o[var2], 32768);
            }
        }
        var2 = 73 / ((64 - param0) / 47);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Orbsome";
        field_m = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_p = false;
    }
}
