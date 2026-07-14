/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te extends tc {
    static je field_p;
    static String field_m;
    static int field_n;
    static int field_l;
    int field_o;
    tc field_k;
    aa field_q;

    final static void a(int param0, long param1, byte param2) {
        bv var4 = null;
        int var5 = 0;
        var4 = vl.field_n;
        if (param2 < 88) {
          String discarded$1 = te.b(-87, -88);
          var4.h(32161, param0);
          var4.field_q = var4.field_q + 1;
          var5 = var4.field_q;
          var4.b(1, 7);
          var4.a(param1, 38359632);
          var4.e(-var5 + var4.field_q, 5930);
          return;
        } else {
          var4.h(32161, param0);
          var4.field_q = var4.field_q + 1;
          var5 = var4.field_q;
          var4.b(1, 7);
          var4.a(param1, 38359632);
          var4.e(-var5 + var4.field_q, 5930);
          return;
        }
    }

    final static String b(int param0, int param1) {
        ic var2 = null;
        int var3 = 0;
        ic var5 = null;
        ic var6 = null;
        ic var7 = null;
        ic var8 = null;
        if (param0 == 128) {
          var8 = rd.field_j;
          var7 = var8;
          if (var7 == null) {
            return "No game in progress.";
          } else {
            L0: {
              var3 = var7.field_h;
              if (0 > var3) {
                break L0;
              } else {
                if (var3 >= var7.field_xb.field_Eb.length) {
                  break L0;
                } else {
                  L1: {
                    if (-1 > param1) {
                      break L1;
                    } else {
                      if (var7.field_xb.field_W <= param1) {
                        break L1;
                      } else {
                        var8.field_xb.field_Eb[var3].field_a = param1;
                        return "Done.";
                      }
                    }
                  }
                  return "Invalid owner; use -1 to " + var7.field_xb.field_W;
                }
              }
            }
            return "Please select a tile before using this.";
          }
        } else {
          field_l = 113;
          var6 = rd.field_j;
          var5 = var6;
          var2 = var5;
          if (var5 == null) {
            return "No game in progress.";
          } else {
            var3 = var5.field_h;
            if (0 <= var3) {
              if (var3 < var5.field_xb.field_Eb.length) {
                if (-1 <= param1) {
                  if (var5.field_xb.field_W <= param1) {
                    return "Invalid owner; use -1 to " + var5.field_xb.field_W;
                  } else {
                    var6.field_xb.field_Eb[var3].field_a = param1;
                    return "Done.";
                  }
                } else {
                  return "Invalid owner; use -1 to " + var5.field_xb.field_W;
                }
              } else {
                return "Please select a tile before using this.";
              }
            } else {
              return "Please select a tile before using this.";
            }
          }
        }
    }

    public static void a(byte param0) {
        field_m = null;
        field_p = null;
        if (param0 >= -33) {
            Object var2 = null;
            te.a(54, (bj) null, -6);
        }
    }

    final static void a(int param0, bj param1, int param2) {
        bv var3 = null;
        var3 = vl.field_n;
        var3.h(32161, param0);
        var3.b(1, param1.field_n);
        var3.b(true, param1.field_m);
        if (param2 != -17006) {
          te.a(102, 77L, (byte) -50);
          return;
        } else {
          return;
        }
    }

    te(aa param0, tc param1) {
        ((te) this).field_q = param0;
        ((te) this).field_o = param0.l();
        ((te) this).field_k = param1;
        ((te) this).field_q.i(128 + bp.field_e * ((te) this).field_o >> -483647512);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = 256;
        field_m = "To server list";
        field_l = 640;
    }
}
