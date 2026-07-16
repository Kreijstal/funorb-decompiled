/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cq extends am {
    private int field_x;
    private int field_s;
    static int field_u;
    private int[] field_z;
    static t field_w;
    static int[] field_y;
    private int field_v;
    private int field_t;

    final void a(fj param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = Torquing.field_u;
          if (param1 == 35) {
            break L0;
          } else {
            ((cq) this).field_x = -23;
            break L0;
          }
        }
        L1: {
          var5 = param2;
          if (-1 == (var5 ^ -1)) {
            ((cq) this).field_s = param0.i(7088);
            break L1;
          } else {
            if (var5 != 1) {
              if (2 == var5) {
                ((cq) this).field_t = param0.i(7088);
                break L1;
              } else {
                if (-4 != (var5 ^ -1)) {
                  if (var5 == 4) {
                    var4 = param0.e((byte) 62);
                    ((cq) this).field_z[0] = ie.a(var4 << -1608898396, 267386880);
                    ((cq) this).field_z[1] = ie.a(4080, var4 >> 734328804);
                    ((cq) this).field_z[2] = ie.a(255, var4) >> -698708980;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  ((cq) this).field_v = param0.i(7088);
                  break L1;
                }
              }
            } else {
              ((cq) this).field_x = param0.i(7088);
              break L1;
            }
          }
        }
    }

    public static void b(int param0) {
        if (param0 != -1339901236) {
            return;
        }
        field_y = null;
        field_w = null;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            Object var3 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  var2 = new java.net.URL(param1.getCodeBase(), "subscribe.ws");
                  param1.getAppletContext().showDocument(og.a(var2, param1, (byte) -122), "_top");
                  if (param0) {
                    break L1;
                  } else {
                    var3 = null;
                    cq.a(false, (java.applet.Applet) null);
                    break L1;
                  }
                }
                break L0;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2_ref = (Exception) (Object) decompiledCaughtException;
                var2_ref.printStackTrace();
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int[][] a(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var17 = null;
        int[][] var19 = null;
        int[] var21 = null;
        int[] var24 = null;
        int[] var25 = null;
        int[][] var27 = null;
        int[] var29 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[][] var35 = null;
        int[] var37 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[][] var42 = null;
        int[][] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        L0: {
          var16 = Torquing.field_u;
          if (param0 == -29116) {
            break L0;
          } else {
            field_w = null;
            break L0;
          }
        }
        L1: {
          var43 = ((cq) this).field_r.a(15142, param1);
          var35 = var43;
          var27 = var35;
          var19 = var27;
          var17 = var19;
          var3 = var17;
          if (((cq) this).field_r.field_b) {
            var42 = ((cq) this).c(24066, param1, 0);
            var44 = var42[0];
            var46 = var42[1];
            var47 = var42[2];
            var45 = var43[0];
            var37 = var45;
            var29 = var37;
            var21 = var29;
            var8 = var21;
            var48 = var43[1];
            var40 = var48;
            var32 = var40;
            var24 = var32;
            var9 = var24;
            var49 = var43[2];
            var41 = var49;
            var33 = var41;
            var25 = var33;
            var10 = var25;
            var11 = 0;
            L2: while (true) {
              if (var11 >= ci.field_c) {
                break L1;
              } else {
                L3: {
                  var13 = var44[var11];
                  var12 = var13 + -((cq) this).field_z[0];
                  if (0 <= var12) {
                    break L3;
                  } else {
                    var12 = -var12;
                    break L3;
                  }
                }
                if (((cq) this).field_s < var12) {
                  var45 = var43[0];
                  var46 = var42[1];
                  var48 = var43[1];
                  var45[var11] = var13;
                  var9[var11] = var46[var11];
                  var10[var11] = var47[var11];
                  var11++;
                  continue L2;
                } else {
                  L4: {
                    var45 = var43[0];
                    var46 = var42[1];
                    var48 = var43[1];
                    var14 = var46[var11];
                    var12 = var14 - ((cq) this).field_z[1];
                    if (var12 < 0) {
                      var12 = -var12;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (((cq) this).field_s >= var12) {
                    L5: {
                      var15 = var47[var11];
                      var12 = -((cq) this).field_z[2] + var15;
                      if (-1 >= (var12 ^ -1)) {
                        break L5;
                      } else {
                        var12 = -var12;
                        break L5;
                      }
                    }
                    if (((cq) this).field_s >= var12) {
                      var8[var11] = ((cq) this).field_v * var13 >> -537926708;
                      var9[var11] = var14 * ((cq) this).field_t >> -1339901236;
                      var10[var11] = ((cq) this).field_x * var15 >> 1015642764;
                      var11++;
                      continue L2;
                    } else {
                      var45[var11] = var13;
                      var48[var11] = var14;
                      var49[var11] = var15;
                      var11++;
                      continue L2;
                    }
                  } else {
                    var45[var11] = var13;
                    var48[var11] = var14;
                    var10[var11] = var47[var11];
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            break L1;
          }
        }
        return var3;
    }

    final static int a(int param0, int param1, byte param2) {
        int var4 = Torquing.field_u;
        if (param2 <= 119) {
            return -88;
        }
        int var3 = 0;
        while (param1 > 0) {
            var3 = 1 & param0 | var3 << -526281919;
            param0 = param0 >>> 1;
            param1--;
        }
        return var3;
    }

    public cq() {
        super(1, false);
        ((cq) this).field_s = 409;
        ((cq) this).field_x = 4096;
        ((cq) this).field_z = new int[3];
        ((cq) this).field_v = 4096;
        ((cq) this).field_t = 4096;
    }

    static {
    }
}
