/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rq extends qt {
    static dp field_D;
    static String field_B;
    static uo field_E;
    static java.awt.Frame field_A;

    public static void a(boolean param0) {
        field_D = null;
        if (!param0) {
          field_A = null;
          field_E = null;
          field_A = null;
          field_B = null;
          return;
        } else {
          field_E = null;
          field_A = null;
          field_B = null;
          return;
        }
    }

    final void a(int param0, boolean param1) {
        super.a(param0, param1);
        uo var3 = pb.field_C;
        int var4 = 20 - -((rq) this).field_j;
        int var5 = ((rq) this).field_j + 360;
        int var6 = ((hu) (Object) var3).field_p + ((hu) (Object) var3).field_G;
        int var7 = ((hu) (Object) var3).c(vp.field_p, -var4 + var5, var6);
        on.a(-12 + var4, 155, -var4 + (var5 + 24), 12 + var7, 6, 0, 128);
        int discarded$0 = ((hu) (Object) var3).a(vp.field_p, var4, 160, -var4 + var5, 1000, 16777215, -1, 0, 0, var6);
    }

    final static double a(int param0, int param1, byte param2, int param3, ea param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        double var17 = 0.0;
        double var19 = 0.0;
        int var21 = 0;
        int var22 = 0;
        L0: {
          var22 = Kickabout.field_G;
          var13 = go.a(param4, param0, 0, ra.field_F);
          var14 = go.a(param4, param0, 0, tf.field_g);
          var15 = go.a(param4, param0, 0, gm.field_fb);
          var16 = go.a(param4, param0, 0, ao.field_i);
          var19 = 0.0;
          jr.field_Mb = -1;
          if (param2 == -99) {
            break L0;
          } else {
            rq.a((byte) -36, 37L);
            break L0;
          }
        }
        L1: {
          var21 = param7;
          if (param1 <= var21) {
            break L1;
          } else {
            L2: {
              L3: {
                L4: {
                  var9 = var13 - -ll.a(ra.field_F, param2 ^ -4, param0, param4, var21);
                  var10 = ll.a(tf.field_g, 111, param0, param4, var21) + var14;
                  var11 = var15 + ll.a(gm.field_fb, 121, param0, param4, var21);
                  var12 = var16 - -ll.a(ao.field_i, 110, param0, param4, var21);
                  if (var12 == 0) {
                    var21++;
                    break L4;
                  } else {
                    var17 = ((double)var10 * (double)var10 + (double)var9 * (double)var9 + (double)var11 * (double)var11) / (double)var12;
                    var12 = -var12 + param6;
                    var9 = param5 - var9;
                    var11 = -var11 + param3;
                    var10 = param8 - var10;
                    if (-1 == (var12 ^ -1)) {
                      break L4;
                    } else {
                      var17 = var17 + ((double)var11 * (double)var11 + ((double)var9 * (double)var9 + (double)var10 * (double)var10)) / (double)var12;
                      if (var17 <= var19) {
                        break L3;
                      } else {
                        var19 = var17;
                        jr.field_Mb = var21;
                        break L2;
                      }
                    }
                  }
                }
                var21++;
                break L3;
              }
              var21++;
              break L2;
            }
            var21++;
            var21++;
            var21++;
            var21++;
            var21++;
            break L1;
          }
        }
        return var19;
    }

    rq() {
    }

    final static void a(byte param0, long param1) {
        InterruptedException var3 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        Thread.sleep(param1);
                        if (param0 == -93) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        field_E = null;
                        return;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    var3 = (InterruptedException) (Object) caughtException;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "The <%0> have begun";
    }
}
