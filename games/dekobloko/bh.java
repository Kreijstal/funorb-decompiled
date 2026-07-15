/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bh {
    static String field_h;
    static String field_c;
    static ck[][] field_d;
    static String field_j;
    static String field_f;
    bh field_a;
    bh field_b;
    static int field_m;
    static String[] field_e;
    static int field_g;
    long field_i;
    static um field_l;
    static int field_k;

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 <= 34) {
          field_l = null;
          if (((bh) this).field_a != null) {
            return true;
          } else {
            return false;
          }
        } else {
          L0: {
            if (((bh) this).field_a == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static void a(int param0, int param1) {
        fa var2 = null;
        bh var2_ref = null;
        int var3 = 0;
        fa var4 = null;
        var3 = client.field_A ? 1 : 0;
        if (param1 <= -116) {
          fa dupTemp$1 = (fa) (Object) sa.field_C.c((byte) -114);
          var4 = dupTemp$1;
          var2 = dupTemp$1;
          L0: while (true) {
            if (var4 == null) {
              var2_ref = c.field_r.c((byte) 99);
              L1: while (true) {
                if (var2_ref != null) {
                  ad.a(-1, param0);
                  var2_ref = c.field_r.d(true);
                  if (var3 == 0) {
                    continue L1;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              w.a(124, param0, var4);
              var2 = (fa) (Object) sa.field_C.d(true);
              if (var3 == 0) {
                continue L0;
              } else {
                if (var2 == null) {
                  return;
                } else {
                  ad.a(-1, param0);
                  var2_ref = c.field_r.d(true);
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final void b(byte param0) {
        if (((bh) this).field_a == null) {
          return;
        } else {
          ((bh) this).field_a.field_b = ((bh) this).field_b;
          ((bh) this).field_b.field_a = ((bh) this).field_a;
          if (param0 < 100) {
            field_k = -105;
            ((bh) this).field_a = null;
            ((bh) this).field_b = null;
            return;
          } else {
            ((bh) this).field_a = null;
            ((bh) this).field_b = null;
            return;
          }
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            try {
                if (param0 > -98) {
                    Object var3 = null;
                    bh.a(-55, (java.applet.Applet) null);
                }
                var2 = new java.net.URL(param1.getCodeBase(), "tosupport.ws");
                param1.getAppletContext().showDocument(gn.a(var2, -1, param1), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        field_h = null;
        if (param0 != 25189) {
          bh.b(-88);
          field_l = null;
          field_e = null;
          field_j = null;
          field_f = null;
          return;
        } else {
          field_l = null;
          field_e = null;
          field_j = null;
          field_f = null;
          return;
        }
    }

    final static int a(int param0, boolean param1, CharSequence param2) {
        if (param1) {
            field_h = null;
            return s.a(true, 4, param0, param2);
        }
        return s.a(true, 4, param0, param2);
    }

    final static String a(int param0, String param1, String param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        String stackIn_7_0 = null;
        String stackIn_8_0 = null;
        String stackOut_6_0 = null;
        L0: {
          var5 = client.field_A ? 1 : 0;
          if (param0 == 0) {
            var4 = param1.indexOf(param3);
            break L0;
          } else {
            field_k = -96;
            var4 = param1.indexOf(param3);
            break L0;
          }
        }
        L1: while (true) {
          if (0 != (var4 ^ -1)) {
            param1 = param1.substring(0, var4) + param2 + param1.substring(param3.length() + var4);
            stackOut_6_0 = (String) param1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_7_0 = stackOut_6_0;
            if (var5 == 0) {
              var4 = ((String) (Object) stackIn_8_0).indexOf(param3, param2.length() + var4);
              continue L1;
            } else {
              return stackIn_7_0;
            }
          } else {
            return param1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "This is <%0>'s RuneScape clan if they have one.";
        field_j = "RuneScape clan";
        field_d = new ck[8][];
        field_f = "Your friend list is full. Max of 100 for free users, and 200 for members.";
        field_e = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_g = 0;
        field_c = "You can ask to join this game";
        field_k = -1;
        field_l = new um();
    }
}
