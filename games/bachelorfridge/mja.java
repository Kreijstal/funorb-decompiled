/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mja extends td {
    static String field_r;
    static sna field_q;
    static String field_p;
    static byte[] field_s;
    static sna field_t;

    final ii a(op param0, int param1) {
        oo var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        L0: {
          var6 = BachelorFridge.field_y;
          if (param1 == 3) {
            break L0;
          } else {
            field_t = null;
            break L0;
          }
        }
        L1: {
          var7 = ((mja) this).field_h.a(69, param0);
          var4 = new oo(((mja) this).field_g, new nq(var7), ((mja) this).field_i);
          if (2 == ((mja) this).field_i) {
            var5 = 0;
            L2: while (true) {
              if (var7.field_x <= var5) {
                break L1;
              } else {
                ar.a(var7.field_J, 31546, var5, false, param0, var4);
                ar.a(var7.field_J + -1, 31546, var5, false, param0, var4);
                ar.a(var7.field_J + 1, param1 + 31543, var5, false, param0, var4);
                var5++;
                continue L2;
              }
            }
          } else {
            if ((((mja) this).field_i ^ -1) != -5) {
              if (1 == ((mja) this).field_i) {
                var5 = 0;
                L3: while (true) {
                  if (var5 >= var7.field_J) {
                    break L1;
                  } else {
                    ar.a(var5, 31546, var7.field_x, false, param0, var4);
                    ar.a(var5, 31546, -1 + var7.field_x, false, param0, var4);
                    ar.a(var5, 31546, var7.field_x + 1, false, param0, var4);
                    var5++;
                    continue L3;
                  }
                }
              } else {
                if (((mja) this).field_i == 3) {
                  var5 = 1 + var7.field_J;
                  L4: while (true) {
                    if (var5 >= param0.field_B) {
                      break L1;
                    } else {
                      ar.a(var5, 31546, var7.field_x, false, param0, var4);
                      ar.a(var5, 31546, var7.field_x - 1, false, param0, var4);
                      ar.a(var5, 31546, 1 + var7.field_x, false, param0, var4);
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L1;
                }
              }
            } else {
              var5 = 1 + var7.field_x;
              L5: while (true) {
                if (param0.field_z <= var5) {
                  break L1;
                } else {
                  ar.a(var7.field_J, 31546, var5, false, param0, var4);
                  ar.a(-1 + var7.field_J, 31546, var5, false, param0, var4);
                  ar.a(var7.field_J + 1, 31546, var5, false, param0, var4);
                  var5++;
                  continue L5;
                }
              }
            }
          }
        }
        return (ii) (Object) var4;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 3) {
            field_r = null;
        }
        tca.field_f = param1;
        gaa.field_k = param0;
        mm.field_z = param3;
        hc.field_D = param4;
    }

    mja(int param0, aga param1, int param2) {
        super(param0, param1);
        ((mja) this).field_i = param2;
    }

    public static void b(int param0) {
        field_q = null;
        field_r = null;
        int var1 = 25 / ((16 - param0) / 44);
        field_t = null;
        field_s = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Accept";
        field_p = "Arrow keys or right click drag to move the camera.  <br><col=BBFF00> Next</col>";
    }
}
