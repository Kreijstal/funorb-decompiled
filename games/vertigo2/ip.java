/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ip {
    static cr field_a;

    final static void a(byte param0, String param1, int param2) {
        Object var4 = null;
        if (param0 > -64) {
          var4 = null;
          ip.a((byte) 87, (String) null, -2);
          t.field_f = no.field_c;
          lp.field_C = param2;
          return;
        } else {
          t.field_f = no.field_c;
          lp.field_C = param2;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
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
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int[] var39 = null;
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        int var46 = 0;
        int var47 = 0;
        int stackIn_6_0 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var47 = Vertigo2.field_L ? 1 : 0;
        var8 = 0;
        var9 = param7;
        var10 = 0;
        var11 = -param2 + param5;
        var12 = param7 + -param2;
        var13 = param5 * param5;
        var14 = param7 * param7;
        var15 = var11 * var11;
        var16 = var12 * var12;
        var17 = var14 << 147562049;
        var18 = var13 << -1423419167;
        var19 = var16 << 1114816961;
        var20 = var15 << -1802343487;
        var21 = param7 << 2077945729;
        var22 = var12 << -405059487;
        var23 = var17 + (-var21 + 1) * var13;
        var24 = -((var21 + -1) * var18) + var14;
        var25 = var19 + var15 * (-var22 + 1);
        var26 = var16 - var20 * (-1 + var22);
        var27 = var13 << -1074955454;
        if (param3 == -45) {
          var28 = var14 << 1218266338;
          var29 = var15 << 1644484354;
          var30 = var16 << -435138142;
          var31 = 3 * var17;
          var32 = var18 * (-3 + var21);
          var33 = 3 * var19;
          var34 = (-3 + var22) * var20;
          var35 = var28;
          var36 = var27 * (param7 + -1);
          var37 = var30;
          var38 = var29 * (var12 + -1);
          var39 = vl.field_e[param6];
          ki.a(param3 + -41, -param5 + param1, var39, param1 + -var11, param0);
          ki.a(-103, -var11 + param1, var39, param1 - -var11, param4);
          ki.a(-103, param1 + var11, var39, param1 - -param5, param0);
          L0: while (true) {
            if ((var9 ^ -1) >= -1) {
              return;
            } else {
              L1: {
                if (var9 > var12) {
                  stackOut_30_0 = 0;
                  stackIn_31_0 = stackOut_30_0;
                  break L1;
                } else {
                  stackOut_29_0 = 1;
                  stackIn_31_0 = stackOut_29_0;
                  break L1;
                }
              }
              L2: {
                var40 = stackIn_31_0;
                if ((var23 ^ -1) > -1) {
                  L3: while (true) {
                    if (var23 >= 0) {
                      break L2;
                    } else {
                      var24 = var24 + var35;
                      var23 = var23 + var31;
                      var8++;
                      var31 = var31 + var28;
                      var35 = var35 + var28;
                      continue L3;
                    }
                  }
                } else {
                  break L2;
                }
              }
              L4: {
                if (var40 != 0) {
                  L5: {
                    if (var25 < 0) {
                      L6: while (true) {
                        if (var25 >= 0) {
                          break L5;
                        } else {
                          var26 = var26 + var37;
                          var25 = var25 + var33;
                          var33 = var33 + var30;
                          var10++;
                          var37 = var37 + var30;
                          continue L6;
                        }
                      }
                    } else {
                      break L5;
                    }
                  }
                  L7: {
                    if ((var26 ^ -1) > -1) {
                      var25 = var25 + var33;
                      var26 = var26 + var37;
                      var33 = var33 + var30;
                      var37 = var37 + var30;
                      var10++;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var25 = var25 + -var38;
                  var26 = var26 + -var34;
                  var34 = var34 - var29;
                  var38 = var38 - var29;
                  break L4;
                } else {
                  break L4;
                }
              }
              L8: {
                if (-1 >= (var24 ^ -1)) {
                  break L8;
                } else {
                  var23 = var23 + var31;
                  var24 = var24 + var35;
                  var35 = var35 + var28;
                  var8++;
                  var31 = var31 + var28;
                  break L8;
                }
              }
              var23 = var23 + -var36;
              var24 = var24 + -var32;
              var36 = var36 - var27;
              var32 = var32 - var27;
              var9--;
              var41 = -var9 + param6;
              var42 = var9 + param6;
              var43 = param1 + var8;
              var44 = param1 - var8;
              if (var40 != 0) {
                var45 = param1 - -var10;
                var46 = -var10 + param1;
                ki.a(-95, var44, vl.field_e[var41], var46, param0);
                ki.a(-118, var46, vl.field_e[var41], var45, param4);
                ki.a(param3 + -60, var45, vl.field_e[var41], var43, param0);
                ki.a(-103, var44, vl.field_e[var42], var46, param0);
                ki.a(-77, var46, vl.field_e[var42], var45, param4);
                ki.a(-79, var45, vl.field_e[var42], var43, param0);
                continue L0;
              } else {
                ki.a(param3 ^ 88, var44, vl.field_e[var41], var43, param0);
                ki.a(-103, var44, vl.field_e[var42], var43, param0);
                continue L0;
              }
            }
          }
        } else {
          field_a = null;
          var28 = var14 << 1218266338;
          var29 = var15 << 1644484354;
          var30 = var16 << -435138142;
          var31 = 3 * var17;
          var32 = var18 * (-3 + var21);
          var33 = 3 * var19;
          var34 = (-3 + var22) * var20;
          var35 = var28;
          var36 = var27 * (param7 + -1);
          var37 = var30;
          var38 = var29 * (var12 + -1);
          var39 = vl.field_e[param6];
          ki.a(param3 + -41, -param5 + param1, var39, param1 + -var11, param0);
          ki.a(-103, -var11 + param1, var39, param1 - -var11, param4);
          ki.a(-103, param1 + var11, var39, param1 - -param5, param0);
          L9: while (true) {
            if ((var9 ^ -1) >= -1) {
              return;
            } else {
              L10: {
                if (var9 > var12) {
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  break L10;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L10;
                }
              }
              L11: {
                var40 = stackIn_6_0;
                if ((var23 ^ -1) > -1) {
                  L12: while (true) {
                    if (var23 >= 0) {
                      break L11;
                    } else {
                      var24 = var24 + var35;
                      var23 = var23 + var31;
                      var8++;
                      var31 = var31 + var28;
                      var35 = var35 + var28;
                      continue L12;
                    }
                  }
                } else {
                  break L11;
                }
              }
              L13: {
                if (var40 != 0) {
                  L14: {
                    if (var25 < 0) {
                      L15: while (true) {
                        if (var25 >= 0) {
                          break L14;
                        } else {
                          var26 = var26 + var37;
                          var25 = var25 + var33;
                          var33 = var33 + var30;
                          var10++;
                          var37 = var37 + var30;
                          continue L15;
                        }
                      }
                    } else {
                      break L14;
                    }
                  }
                  L16: {
                    if ((var26 ^ -1) > -1) {
                      var25 = var25 + var33;
                      var26 = var26 + var37;
                      var33 = var33 + var30;
                      var37 = var37 + var30;
                      var10++;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  var25 = var25 + -var38;
                  var26 = var26 + -var34;
                  var34 = var34 - var29;
                  var38 = var38 - var29;
                  break L13;
                } else {
                  break L13;
                }
              }
              L17: {
                if (-1 >= (var24 ^ -1)) {
                  break L17;
                } else {
                  var23 = var23 + var31;
                  var24 = var24 + var35;
                  var35 = var35 + var28;
                  var8++;
                  var31 = var31 + var28;
                  break L17;
                }
              }
              var23 = var23 + -var36;
              var24 = var24 + -var32;
              var36 = var36 - var27;
              var32 = var32 - var27;
              var9--;
              var41 = -var9 + param6;
              var42 = var9 + param6;
              var43 = param1 + var8;
              var44 = param1 - var8;
              if (var40 != 0) {
                var45 = param1 - -var10;
                var46 = -var10 + param1;
                ki.a(-95, var44, vl.field_e[var41], var46, param0);
                ki.a(-118, var46, vl.field_e[var41], var45, param4);
                ki.a(param3 + -60, var45, vl.field_e[var41], var43, param0);
                ki.a(-103, var44, vl.field_e[var42], var46, param0);
                ki.a(-77, var46, vl.field_e[var42], var45, param4);
                ki.a(-79, var45, vl.field_e[var42], var43, param0);
                continue L9;
              } else {
                ki.a(param3 ^ 88, var44, vl.field_e[var41], var43, param0);
                ki.a(-103, var44, vl.field_e[var42], var43, param0);
                continue L9;
              }
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -1423419167) {
            ip.a(-81);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
    }
}
