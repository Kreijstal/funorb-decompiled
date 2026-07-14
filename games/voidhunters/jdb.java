/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jdb implements dja {
    static String field_a;

    public final tv a(byte param0) {
        int var2 = -11 / ((-64 - param0) / 50);
        return (tv) (Object) new cf();
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            Object var2 = null;
            jdb.a(-105, (byte) 0, 18, (ds) null, 3);
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        Object var29 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var28 = VoidHunters.field_G;
          if (-1 <= param7) {
            break L0;
          } else {
            if (bd.a(param7, (byte) -95)) {
              break L0;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        L1: {
          if (-1 >= param6) {
            break L1;
          } else {
            if (bd.a(param6, (byte) -95)) {
              break L1;
            } else {
              throw new IllegalArgumentException("");
            }
          }
        }
        if ((param5 ^ -1) == -32994) {
          L2: {
            if (param2 == 29175) {
              break L2;
            } else {
              var29 = null;
              jdb.a(-98, (byte) 61, -25, (ds) null, -48);
              break L2;
            }
          }
          L3: {
            var8 = 0;
            if (param7 >= param6) {
              stackOut_12_0 = param6;
              stackIn_13_0 = stackOut_12_0;
              break L3;
            } else {
              stackOut_11_0 = param7;
              stackIn_13_0 = stackOut_11_0;
              break L3;
            }
          }
          var9 = stackIn_13_0;
          var10 = param7 >> -66846175;
          var11 = param6 >> -273607167;
          var12 = param0;
          var13 = new int[var10 * var11];
          L4: while (true) {
            jaggl.OpenGL.glTexImage2Di(param4, var8, param3, param7, param6, 0, param5, param1, var12, 0);
            if (-2 > (var9 ^ -1)) {
              var15 = 0;
              var24 = 0;
              var25 = var24 - -param7;
              var14 = var13;
              var26 = 0;
              L5: while (true) {
                if (var26 >= var11) {
                  var13 = var12;
                  param6 = var11;
                  param7 = var10;
                  var12 = var14;
                  var11 = var11 >> 1;
                  var10 = var10 >> 1;
                  var8++;
                  var9 = var9 >> 1;
                  continue L4;
                } else {
                  var27 = 0;
                  L6: while (true) {
                    if (var10 <= var27) {
                      var24 = var24 + param7;
                      var25 = var25 + param7;
                      var26++;
                      continue L5;
                    } else {
                      var24++;
                      var16 = var12[var24];
                      var24++;
                      var17 = var12[var24];
                      var25++;
                      var18 = var12[var25];
                      var22 = var16 & 255;
                      var21 = (65332 & var16) >> 22046440;
                      var20 = var16 >> -982856080 & 255;
                      var23 = 255 & var16 >> 586259768;
                      var25++;
                      var19 = var12[var25];
                      var21 = var21 + ((var17 & 65394) >> -956582744);
                      var23 = var23 + (255 & var17 >> -1462772520);
                      var22 = var22 + (255 & var17);
                      var20 = var20 + ((var17 & 16763127) >> 792757296);
                      var20 = var20 + (255 & var18 >> -775701552);
                      var23 = var23 + (255 & var18 >> 1003568984);
                      var22 = var22 + (255 & var18);
                      var21 = var21 + (var18 >> 1110595624 & 255);
                      var20 = var20 + ((var19 & 16752225) >> -1214169072);
                      var23 = var23 + (var19 >> -1088638600 & 255);
                      var21 = var21 + (255 & var19 >> 1979607016);
                      var22 = var22 + (var19 & 255);
                      var15++;
                      var13[var15] = knb.a(dla.a(var22 >> 1711715138, 255), knb.a(dla.a(var21, 1020) << 1460677958, knb.a(dla.a(16711680, var20 << 1474318), dla.a(-16777216, var23 << 905053302))));
                      var27++;
                      continue L6;
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          throw new IllegalArgumentException("");
        }
    }

    final static void a(int param0, byte param1, int param2, ds param3, int param4) {
        if (param1 != -48) {
            field_a = null;
        }
        param3.c(param1 ^ -48, 12);
        param3.a(17, true);
        param3.a(param2, true);
        param3.a(param4, true);
        param3.c(0, param0);
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return null;
        }
        return (tv[]) (Object) new cf[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Apply";
    }
}
