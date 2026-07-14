/*
 * Decompiled by CFR-JS 0.4.0.
 */
class mh extends bk {
    private String field_k;
    static String[] field_i;
    static String field_j;
    static int field_g;
    private long field_h;
    static String field_f;
    static String field_e;

    ul a(boolean param0) {
        if (!param0) {
            mh.b((byte) -16);
        }
        return p.field_b;
    }

    public static void b(byte param0) {
        field_f = null;
        field_i = null;
        field_j = null;
        if (param0 != 51) {
            field_i = null;
        }
        field_e = null;
    }

    final static String a(CharSequence[] param0, byte param1, int param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Virogrid.field_F ? 1 : 0;
        if (param3 == -1) {
          return "";
        } else {
          if (-2 == param3) {
            var10 = param0[param2];
            var4_ref = var10;
            if (var4_ref != null) {
              return ((Object) (Object) var10).toString();
            } else {
              return "null";
            }
          } else {
            var4 = param3 + param2;
            var5 = 0;
            var6_int = param2;
            L0: while (true) {
              if (var4 <= var6_int) {
                L1: {
                  var6 = new StringBuilder(var5);
                  if (param1 > 3) {
                    break L1;
                  } else {
                    mh.a(-16L, (byte) -125);
                    break L1;
                  }
                }
                var7 = param2;
                L2: while (true) {
                  if (var7 >= var4) {
                    return var6.toString();
                  } else {
                    var8 = param0[var7];
                    if (var8 != null) {
                      StringBuilder discarded$2 = var6.append(var8);
                      var7++;
                      continue L2;
                    } else {
                      StringBuilder discarded$3 = var6.append("null");
                      var7++;
                      continue L2;
                    }
                  }
                }
              } else {
                var7_ref_CharSequence = param0[var6_int];
                if (var7_ref_CharSequence == null) {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                } else {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        }
    }

    final void a(boolean param0, jc param1) {
        param1.a((byte) 87, ((mh) this).field_h);
        param1.c(((mh) this).field_k, (byte) 60);
        if (param0) {
            mh.a(-122L, (byte) -22);
        }
    }

    final static void a(long param0, byte param1) {
        InterruptedException var3 = null;
        Object var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        Thread.sleep(param0);
                        if (param1 == -88) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var4 = null;
                        String discarded$1 = mh.a((CharSequence[]) null, (byte) 99, -73, 66);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var3 = (InterruptedException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    mh(long param0, String param1) {
        ((mh) this).field_k = param1;
        ((mh) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"None", "Easy", "Normal", "Hard"};
        field_f = "<%0> has resigned and left.";
        field_e = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_j = "Create your own free Jagex account";
    }
}
