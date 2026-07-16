/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ci {
    static int field_b;
    static String field_d;
    static String[] field_a;
    static String field_c;

    public static void c(int param0) {
        if (param0 != -1) {
          field_c = null;
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final int a(long param0, int param1) {
        long var4 = 0L;
        if (param1 == 1) {
          var4 = ((ci) this).b(30393);
          if ((var4 ^ -1L) < -1L) {
            jj.a((byte) -114, var4);
            return ((ci) this).a(true, param0);
          } else {
            return ((ci) this).a(true, param0);
          }
        } else {
          return 38;
        }
    }

    abstract void a(byte param0);

    abstract int a(boolean param0, long param1);

    final static String a(String param0, char param1, String param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        StringBuilder var12 = null;
        StringBuilder var13 = null;
        var11 = stellarshard.field_B;
        var4 = param0.length();
        var5 = param2.length();
        var6 = var4;
        var7 = var5 - 1;
        if (var7 != 0) {
          var8 = 0;
          L0: while (true) {
            var8 = param0.indexOf((int) param1, var8);
            if ((var8 ^ -1) <= -1) {
              var6 = var6 + var7;
              var8++;
              continue L0;
            } else {
              var13 = new StringBuilder(var6);
              if (param3 != 2619) {
                return null;
              } else {
                var9 = 0;
                L1: while (true) {
                  var10 = param0.indexOf((int) param1, var9);
                  if (-1 < (var10 ^ -1)) {
                    StringBuilder discarded$6 = var13.append(param0.substring(var9));
                    return var13.toString();
                  } else {
                    StringBuilder discarded$7 = var13.append(param0.substring(var9, var10));
                    var9 = 1 + var10;
                    StringBuilder discarded$8 = var13.append(param2);
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          var12 = new StringBuilder(var6);
          if (param3 != 2619) {
            return null;
          } else {
            var9 = 0;
            L2: while (true) {
              var10 = param0.indexOf((int) param1, var9);
              if (-1 < (var10 ^ -1)) {
                StringBuilder discarded$9 = var12.append(param0.substring(var9));
                return var12.toString();
              } else {
                StringBuilder discarded$10 = var12.append(param0.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$11 = var12.append(param2);
                continue L2;
              }
            }
          }
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Object var5 = null;
        Throwable decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        var1 = (Object) (Object) pk.field_e;
        synchronized (var1) {
          L0: {
            L1: {
              if (param0 > 30) {
                break L1;
              } else {
                var5 = null;
                String discarded$2 = ci.a((String) null, 'ￛ', (String) null, -48);
                break L1;
              }
            }
            L2: {
              ce.field_e = ce.field_e + 1;
              di.field_a = q.field_c;
              if (-1 >= (se.field_H ^ -1)) {
                L3: while (true) {
                  if ((se.field_H ^ -1) == (vd.field_e ^ -1)) {
                    break L2;
                  } else {
                    var2 = ob.field_c[vd.field_e];
                    vd.field_e = 1 + vd.field_e & 127;
                    if (-1 < (var2 ^ -1)) {
                      si.field_jb[var2 ^ -1] = false;
                      continue L3;
                    } else {
                      si.field_jb[var2] = true;
                      continue L3;
                    }
                  }
                }
              } else {
                var2 = 0;
                L4: while (true) {
                  if (-113 >= (var2 ^ -1)) {
                    se.field_H = vd.field_e;
                    break L2;
                  } else {
                    si.field_jb[var2] = false;
                    var2++;
                    continue L4;
                  }
                }
              }
            }
            q.field_c = l.field_h;
            break L0;
          }
        }
    }

    abstract long b(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Homes in";
        field_c = "Updates will sent to the email address you've given";
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
