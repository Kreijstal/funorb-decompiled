/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf extends ll {
    int[] field_D;
    static String field_w;
    static int field_y;
    static boolean field_A;
    static String[] field_C;
    private String[] field_z;
    static q[] field_v;
    private int[][] field_B;
    static String field_x;
    private int[] field_E;

    public static void e(byte param0) {
        if (param0 < 83) {
            nf.d(-70);
        }
        field_w = null;
        field_C = null;
        field_v = null;
        field_x = null;
    }

    final static void d(int param0) {
        int var1 = 0;
        int var2 = DungeonAssault.field_K;
        o.field_o.b(-92);
        for (var1 = 0; var1 < 32; var1++) {
            id.field_b[var1] = 0L;
        }
        for (var1 = 0; (var1 ^ -1) > -33; var1++) {
            jf.field_g[var1] = 0L;
        }
        nk.field_Kb = param0;
    }

    final String c(byte param0) {
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        StringBuilder var6 = new StringBuilder(80);
        StringBuilder var2 = var6;
        if (((nf) this).field_z == null) {
            return "";
        }
        if (param0 >= -65) {
            Object var5 = null;
            String discarded$0 = nf.a((CharSequence[]) null, (byte) 85);
        }
        StringBuilder discarded$1 = var6.append(((nf) this).field_z[0]);
        for (var3 = 1; ((nf) this).field_z.length > var3; var3++) {
            StringBuilder discarded$2 = var2.append("...");
            StringBuilder discarded$3 = var6.append(((nf) this).field_z[var3]);
        }
        return var2.toString();
    }

    final void a(ec param0, int param1) {
        int var3 = 0;
        int var4 = DungeonAssault.field_K;
        if (param1 != -1) {
            return;
        }
        while (true) {
            var3 = param0.c(true);
            if (var3 == 0) {
                break;
            }
            this.a(param0, 32768, var3);
        }
    }

    final void d(byte param0) {
        int var2 = 0;
        int var3 = DungeonAssault.field_K;
        if (param0 > -4) {
            field_w = null;
        }
        if (((nf) this).field_D != null) {
            for (var2 = 0; var2 < ((nf) this).field_D.length; var2++) {
                ((nf) this).field_D[var2] = mp.a(((nf) this).field_D[var2], 32768);
            }
        }
    }

    final static int[] a(wm param0, int param1, byte param2) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = DungeonAssault.field_K;
          var3 = 0;
          if (-1 != (param1 % 7 ^ -1)) {
            if (param0.a(-(param1 / 7) + (-1 + param1), (byte) 103)) {
              var3++;
              ia.field_S[var3] = -1 + param1;
              if (param1 <= 6) {
                break L0;
              } else {
                if (!param0.a(param1 - -35, (byte) 121)) {
                  break L0;
                } else {
                  var3++;
                  ia.field_S[var3] = -7 + param1;
                  break L0;
                }
              }
            } else {
              if (param1 <= 6) {
                break L0;
              } else {
                if (!param0.a(param1 - -35, (byte) 121)) {
                  break L0;
                } else {
                  var3++;
                  ia.field_S[var3] = -7 + param1;
                  break L0;
                }
              }
            }
          } else {
            if (param1 <= 6) {
              break L0;
            } else {
              if (!param0.a(param1 - -35, (byte) 121)) {
                break L0;
              } else {
                var3++;
                ia.field_S[var3] = -7 + param1;
                break L0;
              }
            }
          }
        }
        L1: {
          if (param1 % 7 == 6) {
            break L1;
          } else {
            if (param0.a(param1 + -(param1 / 7), (byte) 86)) {
              var3++;
              ia.field_S[var3] = 1 + param1;
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (42 <= param1) {
            break L2;
          } else {
            if (param0.a(param1 - -42, (byte) 86)) {
              var3++;
              ia.field_S[var3] = param1 + 7;
              break L2;
            } else {
              break L2;
            }
          }
        }
        var4 = new int[var3];
        var6 = 51 / ((58 - param2) / 62);
        var5 = 0;
        L3: while (true) {
          if (var3 <= var5) {
            return var4;
          } else {
            var4[var5] = ia.field_S[var5];
            var5++;
            continue L3;
          }
        }
    }

    private final void a(ec param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        ad var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = DungeonAssault.field_K;
          if (param2 == -2) {
            ((nf) this).field_z = ih.a(97, '<', param0.d(-117));
            break L0;
          } else {
            if (-3 == param2) {
              var4 = param0.c(true);
              ((nf) this).field_D = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  ((nf) this).field_D[var5] = param0.k(0);
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (-4 != (param2 ^ -1)) {
                if (param2 != 4) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var4 = param0.c(true);
                ((nf) this).field_E = new int[var4];
                ((nf) this).field_B = new int[var4][];
                var5 = 0;
                L2: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    var6 = param0.k(0);
                    var7 = qd.a(96, var6);
                    if (var7 != null) {
                      ((nf) this).field_E[var5] = var6;
                      ((nf) this).field_B[var5] = new int[var7.field_a];
                      var8 = 0;
                      L3: while (true) {
                        if (var8 < var7.field_a) {
                          ((nf) this).field_B[var5][var8] = param0.k(0);
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
              }
            }
          }
        }
        L4: {
          if (param1 == 32768) {
            break L4;
          } else {
            ((nf) this).d((byte) 59);
            break L4;
          }
        }
    }

    final static void a(int param0, boolean param1, String param2) {
        int var3 = 0;
        he.field_s = false;
        cd.field_b = false;
        if (a.field_n != null) {
            if (!a.field_n.field_T) {
            } else {
                if (param0 == 8) {
                    param0 = 2;
                    if (qc.field_t) {
                        param2 = d.field_b;
                    } else {
                        param2 = fk.field_s;
                    }
                    wo.field_e.a(-12349, co.field_C);
                }
                var3 = 1;
                if (10 == param0) {
                    rp.a((byte) -61);
                    var3 = 0;
                }
                if (!(var3 == 0)) {
                    if (!(!he.field_s)) {
                        param2 = jk.a(new String[1], oi.field_G, 30496);
                    }
                    if (jd.field_l) {
                        param2 = kk.field_t;
                    }
                    a.field_n.a(26889, param2, param0);
                }
                if (-257 != param0) {
                    if (-11 != param0) {
                        if (!qc.field_t) {
                            wo.field_e.i(22377);
                        }
                    }
                }
            }
        }
        if (!param1) {
            field_y = 105;
        }
    }

    nf() {
    }

    final static String a(CharSequence[] param0, byte param1) {
        int var2 = 116 / ((param1 - -62) / 53);
        return ef.a(0, 39, param0, param0.length);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new String[]{"Raiding", "Raiding a Dungeon.<br><br>At the centre of each dungeon is the <%highlight>hoard room</col>, where your rival Dragon sleeps upon his treasures. The dungeon can be entered at any of the four corner tiles.<br><br><%command>Select one of the highlighted entrances to begin your assault.</col>"};
        field_w = "<col=FF0000>Lethal</col>, even if abilities would prevent death.";
        field_x = "Sneak";
        field_y = -1;
    }
}
