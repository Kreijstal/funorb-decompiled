/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bd extends ij {
    static dl[] field_n;
    static String field_l;
    static volatile long field_m;

    final static void a(byte param0, boolean param1) {
        int var3 = 0;
        uo.field_o = uo.field_o + 1;
        int var2 = rc.field_a.size();
        if ((jo.field_o ^ -1) == -2) {
            if (-1 == (mo.field_l ^ -1)) {
                var2 = 15;
                if (!(var2 <= uo.field_o)) {
                    fl.field_g = fp.field_a;
                    sb.field_F = b.field_a;
                    sm.field_e = we.field_h;
                    nh.field_F = je.field_j;
                    ll.a(-105, true, param1);
                    ue.field_c = true;
                    return;
                }
                uh.field_n = true;
                if (param0 != 35) {
                    return;
                }
                go.field_i = true;
                uo.field_o = uo.field_o - 1;
                return;
            }
            var3 = ke.field_b[jo.field_o] + 1;
            if (var2 <= var3) {
                if (!(var2 <= uo.field_o)) {
                    fl.field_g = fp.field_a;
                    sb.field_F = b.field_a;
                    sm.field_e = we.field_h;
                    nh.field_F = je.field_j;
                    ll.a(-105, true, param1);
                    ue.field_c = true;
                    return;
                }
                uh.field_n = true;
                if (param0 != 35) {
                    return;
                }
                go.field_i = true;
                uo.field_o = uo.field_o - 1;
                return;
            }
            var2 = var3;
        }
        if (!(var2 <= uo.field_o)) {
            fl.field_g = fp.field_a;
            sb.field_F = b.field_a;
            sm.field_e = we.field_h;
            nh.field_F = je.field_j;
            ll.a(-105, true, param1);
            ue.field_c = true;
            return;
        }
        uh.field_n = true;
        if (param0 != 35) {
            return;
        }
        go.field_i = true;
        uo.field_o = uo.field_o - 1;
    }

    public static void e(int param0) {
        if (param0 != 7279) {
            int discarded$0 = bd.a(102, (byte) -53);
            field_n = null;
            field_l = null;
            return;
        }
        field_n = null;
        field_l = null;
    }

    final static void a(db param0, byte[] param1, wj[] param2, int param3) {
        ga.field_L = param0;
        io.field_I[16] = mh.field_j;
        if (param3 != 8) {
          bd.a((byte) -64, false);
          io.field_I[17] = ti.field_j;
          cc.a(8438015, (java.applet.Applet) (Object) fe.field_g, (byte) -121, 2121856, io.field_I, 192);
          return;
        } else {
          io.field_I[17] = ti.field_j;
          cc.a(8438015, (java.applet.Applet) (Object) fe.field_g, (byte) -121, 2121856, io.field_I, 192);
          return;
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (param0 != 0) {
          if (0 < param0) {
            L0: {
              var2 = 1;
              if (-65536 <= (param0 ^ -1)) {
                break L0;
              } else {
                var2 += 16;
                param0 = param0 >> 16;
                break L0;
              }
            }
            L1: {
              if (param0 <= 255) {
                break L1;
              } else {
                var2 += 8;
                param0 = param0 >> 8;
                break L1;
              }
            }
            L2: {
              if (param0 <= 15) {
                break L2;
              } else {
                param0 = param0 >> 4;
                var2 += 4;
                break L2;
              }
            }
            L3: {
              if (param0 <= 3) {
                break L3;
              } else {
                var2 += 2;
                param0 = param0 >> 2;
                break L3;
              }
            }
            L4: {
              if (param0 > 1) {
                param0 = param0 >> 1;
                var2++;
                break L4;
              } else {
                break L4;
              }
            }
            return var2;
          } else {
            if (param1 != 62) {
              return 93;
            } else {
              L5: {
                var2 = 2;
                if ((param0 ^ -1) <= 65535) {
                  break L5;
                } else {
                  var2 += 16;
                  param0 = param0 >> 16;
                  break L5;
                }
              }
              L6: {
                if (param0 >= -256) {
                  break L6;
                } else {
                  var2 += 8;
                  param0 = param0 >> 8;
                  break L6;
                }
              }
              L7: {
                if (-16 <= param0) {
                  break L7;
                } else {
                  var2 += 4;
                  param0 = param0 >> 4;
                  break L7;
                }
              }
              L8: {
                if (param0 < -4) {
                  var2 += 2;
                  param0 = param0 >> 2;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (-2 > param0) {
                  param0 = param0 >> 1;
                  var2++;
                  break L9;
                } else {
                  break L9;
                }
              }
              return var2;
            }
          }
        } else {
          return 0;
        }
    }

    bd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "This is a bomb.<br><br>Bombs blow up when<br><br>- you drop them;<br>- they get crushed;<br>- another bomb explodes<br>  nearby.<br><br>Use them to clear the<br>way. Stand back!";
        field_m = 0L;
    }
}
