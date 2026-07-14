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
        int var3 = 0;
        int var4 = OrbDefence.field_D ? 1 : 0;
        while (true) {
            var3 = param1.b((byte) 90);
            if (var3 == 0) {
                break;
            }
            this.a(param1, var3, -3);
        }
        if (param0 != 67) {
            Object var5 = null;
            qj discarded$0 = oe.a(-111, (String) null, -88);
        }
    }

    private final void a(mg param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ba var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = OrbDefence.field_D ? 1 : 0;
          if (param2 == -3) {
            break L0;
          } else {
            var10 = null;
            qj discarded$1 = oe.a(-30, (String) null, -63);
            break L0;
          }
        }
        L1: {
          if ((param1 ^ -1) == -2) {
            ((oe) this).field_n = g.a(87, '<', param0.g(2));
            break L1;
          } else {
            if ((param1 ^ -1) != -3) {
              if (param1 == 3) {
                var4 = param0.b((byte) 90);
                ((oe) this).field_k = new int[var4];
                ((oe) this).field_l = new int[var4][];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    break L1;
                  } else {
                    var6 = param0.j(98203176);
                    var7 = wg.a(var6, -128);
                    if (var7 != null) {
                      ((oe) this).field_k[var5] = var6;
                      ((oe) this).field_l[var5] = new int[var7.field_f];
                      var8 = 0;
                      L3: while (true) {
                        if (var8 < var7.field_f) {
                          ((oe) this).field_l[var5][var8] = param0.j(98203176);
                          var8++;
                          continue L3;
                        } else {
                          var5++;
                          continue L2;
                        }
                      }
                    } else {
                      var5++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (-5 != (param1 ^ -1)) {
                  break L1;
                } else {
                  break L1;
                }
              }
            } else {
              var4 = param0.b((byte) 90);
              ((oe) this).field_o = new int[var4];
              var5 = 0;
              L4: while (true) {
                if (var5 >= var4) {
                  break L1;
                } else {
                  ((oe) this).field_o[var5] = param0.j(param2 + 98203179);
                  var5++;
                  continue L4;
                }
              }
            }
          }
        }
    }

    public static void f(int param0) {
        if (param0 != -12563) {
            field_m = null;
        }
        field_m = null;
        field_q = null;
    }

    private final String e(int param0) {
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
        if (param0 >= -47) {
            return null;
        }
        return var2.toString();
    }

    final static og a(boolean param0, byte param1) {
        se var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        se var8 = null;
        oe var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = OrbDefence.field_D ? 1 : 0;
                    var8 = cd.field_t;
                    var2 = var8;
                    var3 = var8.b((byte) 90);
                    if ((128 & var3) == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    ja.field_e = stackIn_3_0 != 0;
                    wb.field_d = var3 & 127;
                    bh.field_c = var8.b((byte) 90);
                    tf.field_l = var8.c((byte) -89);
                    if ((wb.field_d ^ -1) == -3) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    pc.field_X = 0;
                    gb.field_b = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    pc.field_X = var8.j(98203176);
                    gb.field_b = var8.a((byte) -30);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var8.b((byte) 90) != 1) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4 = stackIn_9_0;
                    l.field_f = var8.g(2);
                    if (var4 != 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    vk.field_v = l.field_f;
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    vk.field_v = var8.g(2);
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (param1 <= -52) {
                        statePc = 14;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return null;
                }
                case 14: {
                    if (-2 == (wb.field_d ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    if (4 == wb.field_d) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    int discarded$2 = var8.j(98203176);
                    String discarded$3 = var8.g(2);
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    if (param0) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    vj.field_a = hi.a(80, -111, (mg) (Object) var8);
                    n.field_c = null;
                    statePc = 27;
                    continue stateLoop;
                }
                case 20: {
                    var5 = var8.j(98203176);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var9 = aa.field_d.b(-11244, var5);
                        vj.field_a = var9.e(-50);
                        if (vk.field_v.equals((Object) (Object) gb.field_h)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = var9.field_o;
                        stackIn_24_0 = stackOut_22_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = null;
                        stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        n.field_c = stackIn_24_0;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    pe.a((byte) -13, (Throwable) (Object) var6, "CC1");
                    n.field_c = null;
                    vj.field_a = null;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    return new og(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    oe() {
    }

    final static qj a(int param0, String param1, int param2) {
        if (param2 != -3) {
            field_q = null;
        }
        qj var3 = new qj(false);
        var3.field_e = param1;
        var3.field_b = param0;
        return var3;
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
