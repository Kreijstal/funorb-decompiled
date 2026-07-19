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
        RuntimeException var3 = null;
        oo var4 = null;
        int var5 = 0;
        int var6 = 0;
        aga var7 = null;
        oo stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        oo stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var6 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 == 3) {
                break L1;
              } else {
                field_t = (sna) null;
                break L1;
              }
            }
            L2: {
              var7 = this.field_h.a(69, param0);
              var4 = new oo(this.field_g, new nq(var7), this.field_i);
              if (2 == this.field_i) {
                var5 = 0;
                L3: while (true) {
                  if (var7.field_x <= var5) {
                    break L2;
                  } else {
                    ar.a(var7.field_J, 31546, var5, false, param0, var4);
                    ar.a(var7.field_J + -1, 31546, var5, false, param0, var4);
                    ar.a(var7.field_J + 1, param1 + 31543, var5, false, param0, var4);
                    var5++;
                    continue L3;
                  }
                }
              } else {
                if ((this.field_i ^ -1) != -5) {
                  if (1 == this.field_i) {
                    var5 = 0;
                    L4: while (true) {
                      if (var5 >= var7.field_J) {
                        break L2;
                      } else {
                        ar.a(var5, 31546, var7.field_x, false, param0, var4);
                        ar.a(var5, 31546, -1 + var7.field_x, false, param0, var4);
                        ar.a(var5, 31546, var7.field_x + 1, false, param0, var4);
                        var5++;
                        continue L4;
                      }
                    }
                  } else {
                    if (this.field_i == 3) {
                      var5 = 1 + var7.field_J;
                      L5: while (true) {
                        if (var5 >= param0.field_B) {
                          break L2;
                        } else {
                          ar.a(var5, 31546, var7.field_x, false, param0, var4);
                          ar.a(var5, 31546, var7.field_x - 1, false, param0, var4);
                          ar.a(var5, 31546, 1 + var7.field_x, false, param0, var4);
                          var5++;
                          continue L5;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                } else {
                  var5 = 1 + var7.field_x;
                  L6: while (true) {
                    if (param0.field_z <= var5) {
                      break L2;
                    } else {
                      ar.a(var7.field_J, 31546, var5, false, param0, var4);
                      ar.a(-1 + var7.field_J, 31546, var5, false, param0, var4);
                      ar.a(var7.field_J + 1, 31546, var5, false, param0, var4);
                      var5++;
                      continue L6;
                    }
                  }
                }
              }
            }
            stackOut_20_0 = (oo) (var4);
            stackIn_21_0 = stackOut_20_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var3);
            stackOut_22_1 = new StringBuilder().append("mja.A(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param1 + ')');
        }
        return (ii) ((Object) stackIn_21_0);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 != 3) {
            field_r = (String) null;
        }
        tca.field_f = param1;
        gaa.field_k = param0;
        mm.field_z = param3;
        hc.field_D = param4;
    }

    mja(int param0, aga param1, int param2) {
        super(param0, param1);
        try {
            this.field_i = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "mja.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
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
        field_r = "Accept";
        field_p = "Arrow keys or right click drag to move the camera.  <br><col=BBFF00> Next</col>";
    }
}
