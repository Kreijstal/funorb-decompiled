/*
 * Decompiled by CFR-JS 0.4.0.
 */
class bd extends ij {
    static dl[] field_n;
    static String field_l;
    static volatile long field_m;

    final static void a(byte param0, boolean param1) {
        int var2;
        int var3;
        uo.field_o = uo.field_o + 1;
        var2 = rc.field_a.size();
        if (jo.field_o == 1) {
          if (mo.field_l == 0) {
            var2 = 15;
          } else {
            var3 = ke.field_b[jo.field_o] + 1;
            if (var2 <= var3) {
              if (var2 > uo.field_o) {
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
        }
        if (var2 > uo.field_o) {
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
          bd.a(102, (byte) -53);
          field_n = null;
          field_l = null;
          return;
        }
        field_n = null;
        field_l = null;
    }

    final static void a(db param0, byte[] param1, wj[] param2, int param3) {
        try {
          ga.field_L = param0;
          io.field_I[16] = mh.field_j;
          if (param3 != 8) {
            bd.a((byte) -64, false);
          }
          io.field_I[17] = ti.field_j;
          cc.a(8438015, fe.field_g, (byte) -121, 2121856, io.field_I, 192);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "bd.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int var2;
        int var2Lifetime1;
        if (param0 == 0) {
          return 0;
        }
        if (0 < param0) {
          var2 = 1;
          if (param0 > 65535) {
            var2 += 16;
            param0 = param0 >> 16;
          }
          if (param0 > 255) {
            var2 += 8;
            param0 = param0 >> 8;
          }
          if (param0 > 15) {
            param0 = param0 >> 4;
            var2 += 4;
          }
          if (param0 > 3) {
            var2 += 2;
            param0 = param0 >> 2;
          }
          if (param0 > 1) {
            param0 = param0 >> 1;
            var2++;
          }
          return var2;
        }
        if (param1 != 62) {
          return 93;
        }
        var2Lifetime1 = 2;
        if (param0 < -65536) {
          var2Lifetime1 += 16;
          param0 = param0 >> 16;
        }
        if (param0 < -256) {
          var2Lifetime1 += 8;
          param0 = param0 >> 8;
        }
        if (-16 > param0) {
          var2Lifetime1 += 4;
          param0 = param0 >> 4;
        }
        if (param0 < -4) {
          var2Lifetime1 += 2;
          param0 = param0 >> 2;
        }
        if (-2 > param0) {
          param0 = param0 >> 1;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    bd() {
    }

    static {
        field_l = "This is a bomb.<br><br>Bombs blow up when<br><br>- you drop them;<br>- they get crushed;<br>- another bomb explodes<br>  nearby.<br><br>Use them to clear the<br>way. Stand back!";
        field_m = 0L;
    }
}
