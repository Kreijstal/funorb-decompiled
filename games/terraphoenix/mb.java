/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends vh {
    private int[] field_v;
    int[] field_r;
    private String[] field_t;
    static uh field_s;
    static String[] field_p;
    static String field_u;
    private int[][] field_q;

    final static java.awt.Canvas d(int param0) {
        if (param0 <= 59) {
            field_u = null;
        }
        return (java.awt.Canvas) (null == a.field_b ? ae.field_G : a.field_b);
    }

    final void c(int param0) {
        int var2 = 0;
        int var3 = Terraphoenix.field_V;
        if (param0 >= -9) {
            ((mb) this).field_t = null;
        }
        if (((mb) this).field_r != null) {
            for (var2 = 0; ((mb) this).field_r.length > var2; var2++) {
                ((mb) this).field_r[var2] = ei.b(((mb) this).field_r[var2], 32768);
            }
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            return;
        }
        field_p = null;
        field_u = null;
        field_s = null;
    }

    final static boolean b(int param0, int param1) {
        if (!(param0 != -1)) {
            return true;
        }
        int var2 = 24 / ((param1 - 21) / 53);
        return -1 != (Terraphoenix.field_O & 1 << param0 ^ -1) ? true : false;
    }

    final static void a(int param0, pk param1, int param2, int param3, ci[] param4, int param5, ci[] param6, byte param7, int param8, int param9, int param10, int param11, int param12, ci[] param13, int param14, int param15, pk param16, int param17, int param18, int param19, int param20) {
        gj.a(new bm(param4), new bm(param13), 0, param3, param1, param11, param17, param12, param8, param20, param19, param9, param10, param5, new bm(param6), param18, param0, param16, param14, param2, param15);
        if (param7 != 77) {
            java.awt.Canvas discarded$0 = mb.d(-5);
        }
    }

    final void a(dh param0, boolean param1) {
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        while (true) {
            var3 = param0.a(-16384);
            if (var3 == 0) {
                break;
            }
            this.a(param0, (byte) 126, var3);
        }
        if (!param1) {
            ((mb) this).field_v = null;
        }
    }

    final String a(boolean param0) {
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (((mb) this).field_t == null) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((mb) this).field_t[0]);
        for (var3 = 1; ((mb) this).field_t.length > var3; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((mb) this).field_t[var3]);
        }
        if (param0) {
            ((mb) this).field_t = null;
        }
        return var2.toString();
    }

    private final void a(dh param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        rh var7 = null;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = Terraphoenix.field_V;
          if (-2 != (param2 ^ -1)) {
            if (param2 == 2) {
              var4 = param0.a(-16384);
              ((mb) this).field_r = new int[var4];
              var5 = 0;
              L1: while (true) {
                if (var4 <= var5) {
                  break L0;
                } else {
                  ((mb) this).field_r[var5] = param0.i(-25578);
                  var5++;
                  continue L1;
                }
              }
            } else {
              if (3 != param2) {
                if (4 != param2) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var4 = param0.a(-16384);
                ((mb) this).field_q = new int[var4][];
                ((mb) this).field_v = new int[var4];
                var5 = 0;
                L2: while (true) {
                  if (var4 <= var5) {
                    break L0;
                  } else {
                    var6 = param0.i(-25578);
                    var7 = di.a((byte) 33, var6);
                    if (var7 != null) {
                      ((mb) this).field_v[var5] = var6;
                      ((mb) this).field_q[var5] = new int[var7.field_a];
                      var8 = 0;
                      L3: while (true) {
                        if (var7.field_a > var8) {
                          ((mb) this).field_q[var5][var8] = param0.i(-25578);
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
          } else {
            ((mb) this).field_t = nc.a(14352, param0.e(-1), '<');
            break L0;
          }
        }
        L4: {
          if (param1 > 111) {
            break L4;
          } else {
            boolean discarded$1 = mb.b(13, 47);
            break L4;
          }
        }
    }

    mb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new String[]{"Research screen", "<col=fcfe7f>RESEARCH GROUP<br></col>A flashing icon denotes unresearched items.", "<col=fcfe7f>GROUP LIST<br></col>A blue highlight shows unresearched topics.", "Data and description of the current topic.", "<col=fcfe7f>RESEARCH STATUS<br></col>Click here to research a new topic if available.", "Exit to mission select screen.", "Here you can research new items of equipment to help your soldiers.  After certain missions, research points will be earned and you will be taken here to select the new topic. After researching topics you should then go to the equipment screen and manufacture the new items for your squad."};
        field_u = "2500pts";
    }
}
