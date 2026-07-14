/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends r {
    static int field_u;
    static String field_t;

    final static void a(boolean param0, le param1, java.awt.Frame param2) {
        vi var3 = null;
        int var4 = 0;
        var4 = Main.field_T;
        L0: while (true) {
          var3 = param1.a((byte) -39, param2);
          L1: while (true) {
            if (((vi) var3).field_a != 0) {
              if ((((vi) var3).field_a ^ -1) == -2) {
                param2.setVisible(param0);
                param2.dispose();
                return;
              } else {
                wk.a((byte) -90, 100L);
                continue L0;
              }
            } else {
              wk.a((byte) -114, 10L);
              continue L1;
            }
          }
        }
    }

    private rl(ee param0, int param1) {
        super(param0, param1);
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    rl(int param0) {
        this(j.field_C, param0);
    }

    public static void c(byte param0) {
        if (param0 > -65) {
            aa var2 = (aa) null;
            boolean discarded$0 = rl.a((byte) -120, (aa) null, (aa) null);
        }
        field_t = null;
    }

    final static String a(CharSequence[] param0, int param1, int param2, boolean param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Main.field_T;
        if (0 != param2) {
          if (param2 != 1) {
            L0: {
              var4 = param1 + param2;
              var5 = 0;
              if (param3) {
                break L0;
              } else {
                field_u = -12;
                break L0;
              }
            }
            var6_int = param1;
            L1: while (true) {
              if (var6_int >= var4) {
                var6 = new StringBuilder(var5);
                var7 = param1;
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
                var7_ref = param0[var6_int];
                if (var7_ref == null) {
                  var5 += 4;
                  var6_int++;
                  continue L1;
                } else {
                  var5 = var5 + ((CharSequence) var7_ref).length();
                  var6_int++;
                  continue L1;
                }
              }
            }
          } else {
            var10 = param0[param1];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          }
        } else {
          return "";
        }
    }

    final static boolean a(byte param0, aa param1, aa param2) {
        int var4 = Main.field_T;
        int var3 = -((aa) param1).field_eb + ((aa) param2).field_eb;
        if (param0 <= 123) {
            field_u = -23;
        }
        if (bc.field_b == ((aa) param2).field_cb) {
            // wide iinc 3 -200
        } else {
            if (((aa) param2).field_cb == null) {
                // wide iinc 3 200
            }
        }
        if (bc.field_b != ((aa) param1).field_cb) {
            // ifnonnull L118
            // wide iinc 3 -200
        } else {
            // wide iinc 3 200
        }
        return 0 < var3 ? true : false;
    }

    final String b(int param0, lk param1) {
        int var3 = 64 % ((-48 - param0) / 42);
        return vf.a(4, ((lk) param1).field_r.length(), '*');
    }

    final static void a(boolean param0) {
        int var1 = qf.m(-32749);
        if (param0) {
            field_u = -103;
        }
        int var2 = v.g((byte) -111);
        ij.field_f.a((byte) -115, qe.field_E - dh.field_k, var2 + (dh.field_k << -1698290335), cb.field_i + -eg.field_d, var1 - -(eg.field_d << 145322753));
        sj.a((byte) -100);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "Invalid password.";
        field_u = 0;
    }
}
