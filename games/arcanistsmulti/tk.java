/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tk extends tf {
    private int[] field_t;
    static String field_o;
    static qb[] field_x;
    static String field_p;
    static boolean[] field_q;
    static String field_w;
    static String field_m;
    static String field_s;
    private int[][] field_v;
    private String[] field_n;
    int[] field_u;
    static String field_r;

    private final void a(int param0, wk param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        aj var7 = null;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          if (param2 == -2) {
            ((tk) this).field_n = eh.a(false, '<', param1.l(-1));
            break L0;
          } else {
            if (-3 != param2) {
              if (-4 != (param2 ^ -1)) {
                if (-5 == (param2 ^ -1)) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var4 = param1.e((byte) 62);
                ((tk) this).field_t = new int[var4];
                ((tk) this).field_v = new int[var4][];
                var5 = 0;
                L1: while (true) {
                  if (var5 >= var4) {
                    break L0;
                  } else {
                    var6 = param1.n(param0 + -94);
                    var7 = no.a(var6, 0);
                    if (var7 != null) {
                      ((tk) this).field_t[var5] = var6;
                      ((tk) this).field_v[var5] = new int[var7.field_e];
                      var8 = 0;
                      L2: while (true) {
                        if (var8 < var7.field_e) {
                          ((tk) this).field_v[var5][var8] = param1.n(-98);
                          var8++;
                          continue L2;
                        } else {
                          var5++;
                          continue L1;
                        }
                      }
                    } else {
                      var5++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              var4 = param1.e((byte) 120);
              ((tk) this).field_u = new int[var4];
              var5 = 0;
              L3: while (true) {
                if (var5 >= var4) {
                  break L0;
                } else {
                  ((tk) this).field_u[var5] = param1.n(-98);
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
        L4: {
          if (param0 == -4) {
            break L4;
          } else {
            var10 = null;
            this.a(5, (wk) null, -90);
            break L4;
          }
        }
    }

    final void a(wk param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (param1 == -22034) {
          L0: while (true) {
            var3 = param0.e((byte) -92);
            if (-1 != (var3 ^ -1)) {
              this.a(-4, param0, var3);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final static boolean f(byte param0) {
        if (param0 > -94) {
            field_p = null;
        }
        return null != wd.field_a ? true : false;
    }

    final static int a(int param0, int param1) {
        if (param0 != -4) {
            Object var3 = null;
            int discarded$0 = tk.a(true, 5, (String) null, (String) null, 9, (String) null, (byte) 92);
        }
        if (param1 < 0) {
            if (param1 >= -65536) {
                return -sn.field_H[-param1 >> -993026875];
            }
            return sn.field_H[134217728 / -param1] + -2048;
        }
        if (65536 >= param1) {
            return sn.field_H[param1 >> -1016755547];
        }
        return -sn.field_H[134217728 / param1] + 2048;
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(null == ((tk) this).field_u)) {
            for (var2 = 0; ((tk) this).field_u.length > var2; var2++) {
                ((tk) this).field_u[var2] = fj.b(((tk) this).field_u[var2], 32768);
            }
        }
        if (param0 > -122) {
            field_o = null;
        }
    }

    final String c(boolean param0) {
        int var3 = 0;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (!param0) {
            return null;
        }
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (null == ((tk) this).field_n) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((tk) this).field_n[0]);
        for (var3 = 1; var3 < ((tk) this).field_n.length; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((tk) this).field_n[var3]);
        }
        return var2.toString();
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        Object var6 = null;
        CharSequence var7 = null;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            tk.c(-48);
            break L0;
          }
        }
        L1: {
          if (tc.field_A == null) {
            break L1;
          } else {
            var3 = tc.field_A.b(false, param1);
            if (var3 == 0) {
              break L1;
            } else {
              L2: {
                if (var3 != 2) {
                  break L2;
                } else {
                  if (tc.field_A.field_rb == null) {
                    break L2;
                  } else {
                    if (!tc.field_A.field_rb.equals((Object) (Object) "")) {
                      L3: {
                        if (tc.field_A.field_rb.charAt(0) != 91) {
                          var7 = (CharSequence) (Object) tc.field_A.field_rb;
                          var4 = gk.a(var7, param0 ^ -13);
                          break L3;
                        } else {
                          var4 = tc.field_A.field_rb;
                          break L3;
                        }
                      }
                      L4: {
                        var5 = null;
                        if (vd.field_h == 0) {
                          var5 = bo.a(var4, (byte) -26, param2);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      L5: {
                        if (1 == vd.field_h) {
                          var5 = oe.a(var4, 29140, param2);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      L6: {
                        if (-3 == (vd.field_h ^ -1)) {
                          var5 = eh.a((byte) -48, param2, var4);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        if ((vd.field_h ^ -1) != -4) {
                          break L7;
                        } else {
                          var5 = hf.a(var4, var4, param2, param0 ^ 10068666);
                          break L7;
                        }
                      }
                      L8: {
                        if (var5 == null) {
                          break L8;
                        } else {
                          var6 = null;
                          ao.a(0, (byte) 126, var5, var4, 2, (String) null);
                          break L8;
                        }
                      }
                      tc.field_A = null;
                      vd.field_h = -1;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              tc.field_A = null;
              vd.field_h = -1;
              break L1;
            }
          }
        }
    }

    final static int a(boolean param0, int param1, String param2, String param3, int param4, String param5, byte param6) {
        if (param6 != -110) {
            return -107;
        }
        hc var7 = new hc(param2);
        hc var8 = new hc(param5);
        return cj.a(param0, (byte) -91, param1, var8, param4, var7, param3);
    }

    public static void c(int param0) {
        field_p = null;
        field_s = null;
        if (param0 != -1016755547) {
            field_q = null;
        }
        field_w = null;
        field_m = null;
        field_o = null;
        field_r = null;
        field_x = null;
        field_q = null;
    }

    tk() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = "Unit cap has been reached";
        field_m = "When the armageddon counter reaches zero, powerful spells will erupt all over the landscape, making it a very dangerous place to be.";
        field_o = "You must be a member to earn wands.";
        field_s = " charges left";
        field_w = "Nature spells focus on trapping enemies and controlling the battlefield.";
        field_r = "Frost spells focus on high damage attacks and the summoning of powerful minions.";
    }
}
