/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh implements cj {
    static ci field_b;
    static int[] field_c;
    private int field_f;
    static int field_d;
    private int field_a;
    private pk field_e;

    final static gd a(boolean param0) {
        String var1 = null;
        var1 = pb.a((byte) -47);
        if (param0) {
          if (var1 != null) {
            if (-1 < (var1.indexOf('@') ^ -1)) {
              return new gd(pb.a((byte) -47), dd.f((byte) 105));
            } else {
              var1 = "";
              return new gd(pb.a((byte) -47), dd.f((byte) 105));
            }
          } else {
            return new gd(pb.a((byte) -47), dd.f((byte) 105));
          }
        } else {
          gd discarded$1 = qh.a(false);
          if (var1 == null) {
            return new gd(pb.a((byte) -47), dd.f((byte) 105));
          } else {
            L0: {
              if (-1 >= (var1.indexOf('@') ^ -1)) {
                var1 = "";
                break L0;
              } else {
                break L0;
              }
            }
            return new gd(pb.a((byte) -47), dd.f((byte) 105));
          }
        }
    }

    public final void a(int param0, gl param1, int param2, int param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_6_0 = 0;
        int stackIn_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var11 = Terraphoenix.field_V;
        if (param3 == -24381) {
          L0: {
            if (param1.field_s) {
              stackOut_36_0 = 3249872;
              stackIn_38_0 = stackOut_36_0;
              break L0;
            } else {
              if (!param1.d(-110)) {
                stackOut_37_0 = 2188450;
                stackIn_38_0 = stackOut_37_0;
                break L0;
              } else {
                var6 = 3249872;
                int discarded$3 = ((qh) this).field_e.a("<u=" + Integer.toString(var6, 16) + ">" + param1.field_o + "</u>", param2 - -param1.field_w, param1.field_u + param0, param1.field_p, param1.field_n, var6, -1, ((qh) this).field_a, ((qh) this).field_f, ((qh) this).field_e.field_p + ((qh) this).field_e.field_s);
                if (param1.d(param3 ^ 24395)) {
                  L1: {
                    var7 = ((qh) this).field_e.b(param1.field_o);
                    var8 = ((qh) this).field_e.field_p + ((qh) this).field_e.field_s;
                    var9 = param2 - -param1.field_w;
                    if (2 == ((qh) this).field_a) {
                      var9 = var9 + (param1.field_p - var7);
                      break L1;
                    } else {
                      if ((((qh) this).field_a ^ -1) == -2) {
                        var9 = var9 + (param1.field_p - var7 >> 2004225281);
                        break L1;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var10 = param0 - -param1.field_u;
                  if (-3 != (((qh) this).field_f ^ -1)) {
                    if (1 != ((qh) this).field_f) {
                      ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
                      return;
                    } else {
                      var10 = var10 + (param1.field_n - var8 >> -431592895);
                      ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
                      return;
                    }
                  } else {
                    var10 = var10 + (param1.field_n - var8);
                    ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
                    return;
                  }
                } else {
                  return;
                }
              }
            }
          }
          var6 = stackIn_38_0;
          int discarded$4 = ((qh) this).field_e.a("<u=" + Integer.toString(var6, 16) + ">" + param1.field_o + "</u>", param2 - -param1.field_w, param1.field_u + param0, param1.field_p, param1.field_n, var6, -1, ((qh) this).field_a, ((qh) this).field_f, ((qh) this).field_e.field_p + ((qh) this).field_e.field_s);
          if (param1.d(param3 ^ 24395)) {
            var7 = ((qh) this).field_e.b(param1.field_o);
            var8 = ((qh) this).field_e.field_p + ((qh) this).field_e.field_s;
            var9 = param2 - -param1.field_w;
            if (2 == ((qh) this).field_a) {
              var9 = var9 + (param1.field_p - var7);
              var10 = param0 - -param1.field_u;
              if (-3 != (((qh) this).field_f ^ -1)) {
                if (1 != ((qh) this).field_f) {
                  ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
                  return;
                } else {
                  var10 = var10 + (param1.field_n - var8 >> -431592895);
                  ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
                  return;
                }
              } else {
                var10 = var10 + (param1.field_n - var8);
                ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
                return;
              }
            } else {
              if (((qh) this).field_a == -2) {
                var9 = var9 + (param1.field_p - var7 >> 2004225281);
                var10 = param0 - -param1.field_u;
                if (-3 != (((qh) this).field_f ^ -1)) {
                  if (1 != ((qh) this).field_f) {
                    ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
                    return;
                  } else {
                    var10 = var10 + (param1.field_n - var8 >> -431592895);
                    ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
                    return;
                  }
                } else {
                  var10 = var10 + (param1.field_n - var8);
                  ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
                  return;
                }
              } else {
                var10 = param0 - -param1.field_u;
                if (-3 != ((qh) this).field_f) {
                  if (1 != ((qh) this).field_f) {
                    ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
                    return;
                  } else {
                    var10 = var10 + (param1.field_n - var8 >> -431592895);
                    ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
                    return;
                  }
                } else {
                  var10 = var10 + (param1.field_n - var8);
                  ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
                  return;
                }
              }
            }
          } else {
            return;
          }
        } else {
          L2: {
            L3: {
              ((qh) this).field_a = -110;
              if (param1.field_s) {
                break L3;
              } else {
                if (!param1.d(-110)) {
                  stackOut_5_0 = 2188450;
                  stackIn_6_0 = stackOut_5_0;
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            stackOut_4_0 = 3249872;
            stackIn_6_0 = stackOut_4_0;
            break L2;
          }
          L4: {
            var6 = stackIn_6_0;
            int discarded$5 = ((qh) this).field_e.a("<u=" + Integer.toString(var6, 16) + ">" + param1.field_o + "</u>", param2 - -param1.field_w, param1.field_u + param0, param1.field_p, param1.field_n, var6, -1, ((qh) this).field_a, ((qh) this).field_f, ((qh) this).field_e.field_p + ((qh) this).field_e.field_s);
            if (param1.d(param3 ^ 24395)) {
              L5: {
                var7 = ((qh) this).field_e.b(param1.field_o);
                var8 = ((qh) this).field_e.field_p + ((qh) this).field_e.field_s;
                var9 = param2 - -param1.field_w;
                if (2 == ((qh) this).field_a) {
                  var9 = var9 + (param1.field_p - var7);
                  break L5;
                } else {
                  if ((((qh) this).field_a ^ -1) == -2) {
                    var9 = var9 + (param1.field_p - var7 >> 2004225281);
                    break L5;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                var10 = param0 - -param1.field_u;
                if (-3 == (((qh) this).field_f ^ -1)) {
                  var10 = var10 + (param1.field_n - var8);
                  break L6;
                } else {
                  if (1 == ((qh) this).field_f) {
                    var10 = var10 + (param1.field_n - var8 >> -431592895);
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              ed.a(4 + var7, var8, 2 + var10, 52, -2 + var9);
              break L4;
            } else {
              break L4;
            }
          }
          return;
        }
    }

    public qh() {
        ((qh) this).field_e = qk.field_e;
        ((qh) this).field_a = 1;
        ((qh) this).field_f = 1;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        if (param0 != -25) {
            gd discarded$0 = qh.a(true);
        }
    }

    qh(pk param0, int param1, int param2) {
        ((qh) this).field_a = param1;
        ((qh) this).field_f = param2;
        ((qh) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[16384];
    }
}
