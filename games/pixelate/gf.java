/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class gf {
    static String field_f;
    static String field_e;
    static int[] field_g;
    static String field_c;
    static String field_d;
    static long[] field_a;
    static boolean field_b;

    public static void c(int param0) {
        field_f = null;
        field_g = null;
        if (param0 != -8871) {
          field_d = null;
          field_d = null;
          field_c = null;
          field_a = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_c = null;
          field_a = null;
          field_e = null;
          return;
        }
    }

    final static void a(String param0, boolean param1, int param2, String param3) {
        if (param2 != 32) {
            return;
        }
        kd.field_a = param0;
        h.field_U = param3;
        ko.a(param1, rl.field_e, -26027);
    }

    final static void a(int param0) {
        fa var1 = null;
        fa var2 = null;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param0 == -29949) {
          ig.a(-56);
          var1 = po.field_b.c(1504642273);
          L0: while (true) {
            if (!(var1 instanceof ln)) {
              return;
            } else {
              L1: {
                var2 = var1.field_a;
                if (((ln) (Object) var1).field_o.h()) {
                  var1.c(2779);
                  break L1;
                } else {
                  break L1;
                }
              }
              var1 = var2;
              continue L0;
            }
          }
        } else {
          field_g = null;
          ig.a(-56);
          var1 = po.field_b.c(1504642273);
          L2: while (true) {
            if (!(var1 instanceof ln)) {
              return;
            } else {
              L3: {
                var2 = var1.field_a;
                if (((ln) (Object) var1).field_o.h()) {
                  var1.c(2779);
                  break L3;
                } else {
                  break L3;
                }
              }
              var1 = var2;
              continue L2;
            }
          }
        }
    }

    final static boolean a(fm param0, int param1, fm param2, fm param3) {
        int var4 = 0;
        int stackIn_12_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        if (param2.b(-3)) {
          if (param2.a("commonui", -1)) {
            if (param0.b(-3)) {
              if (!param0.a("commonui", -1)) {
                return false;
              } else {
                L0: {
                  L1: {
                    var4 = -3 / ((-26 - param1) / 51);
                    if (!param3.b(-3)) {
                      break L1;
                    } else {
                      if (!param3.a("button.gif", -1)) {
                        break L1;
                      } else {
                        stackOut_10_0 = 1;
                        stackIn_12_0 = stackOut_10_0;
                        break L0;
                      }
                    }
                  }
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                }
                return stackIn_12_0 != 0;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    abstract void a(byte[] param0, boolean param1);

    abstract byte[] b(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new long[32];
        field_c = "End of free game";
        field_d = "Only show private chat from my friends and opponents";
        field_f = "This game option is not available in rated games.";
        field_b = false;
        field_e = "Inviting <%0>";
    }
}
