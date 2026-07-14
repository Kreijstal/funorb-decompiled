/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve {
    static boolean field_c;
    static ci field_a;
    static int field_b;

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
            field_a = null;
        }
    }

    final static String a(int param0, CharSequence[] param1, int param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        var9 = Terraphoenix.field_V;
        if (param2 != 0) {
          if (param2 == 1) {
            var10 = param1[param3];
            var4_ref = var10;
            if (var4_ref == null) {
              return "null";
            } else {
              return ((Object) (Object) var10).toString();
            }
          } else {
            var4 = param3 + param2;
            var5 = 0;
            var6_int = param3;
            L0: while (true) {
              if (var4 <= var6_int) {
                var6 = new StringBuilder(var5);
                if (param0 == -10537) {
                  var7 = param3;
                  L1: while (true) {
                    if (var7 >= var4) {
                      return var6.toString();
                    } else {
                      var8 = param1[var7];
                      if (var8 != null) {
                        StringBuilder discarded$2 = var6.append(var8);
                        var7++;
                        continue L1;
                      } else {
                        StringBuilder discarded$3 = var6.append("null");
                        var7++;
                        continue L1;
                      }
                    }
                  }
                } else {
                  return null;
                }
              } else {
                var7_ref_CharSequence = param1[var6_int];
                if (var7_ref_CharSequence == null) {
                  var5 += 4;
                  var6_int++;
                  continue L0;
                } else {
                  var5 = var5 + var7_ref_CharSequence.length();
                  var6_int++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return "";
        }
    }

    final static void a(int param0, int param1) {
        wf.field_l = (59 & param1) >> 2143030436;
        if (2 < wf.field_l) {
            wf.field_l = 2;
        }
        di.field_e = 3 & param1 >> -430683646;
        if (!(param0 >= di.field_e)) {
            di.field_e = 2;
        }
        lb.field_f = param1 & 3;
        if (!(-3 <= (lb.field_f ^ -1))) {
            lb.field_f = 2;
        }
    }

    final static void a(ci param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
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
        L0: {
          var18 = Terraphoenix.field_V;
          param2 = param2 + param3;
          param4 = param4 + param0.field_p;
          param3 = param3 - (param0.field_u + -15);
          param3 = param3 + param0.field_v;
          var5 = l.field_k * param3 + param4;
          var6 = 0;
          var7 = param4;
          var8 = param3;
          var9 = param0.field_t;
          var10 = param0.field_r;
          var11 = l.field_k + -var10;
          if (l.field_d <= param3) {
            break L0;
          } else {
            var13 = l.field_d - param3;
            var5 = var5 + l.field_k * var13;
            var9 = var9 - var13;
            var8 = var8 + var13;
            param3 = l.field_d;
            var6 = var6 + var10 * var13;
            break L0;
          }
        }
        if (param1 == -5353) {
          L1: {
            var12 = 0;
            if (param4 >= l.field_b) {
              break L1;
            } else {
              var13 = l.field_b + -param4;
              var7 = var7 + var13;
              var6 = var6 + var13;
              param4 = l.field_b;
              var12 = var12 + var13;
              var5 = var5 + var13;
              var11 = var11 + var13;
              var10 = var10 - var13;
              break L1;
            }
          }
          L2: {
            if (param3 + var9 > l.field_c) {
              var9 = var9 - (var9 + (param3 + -l.field_c));
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (l.field_f >= param4 - -var10) {
              break L3;
            } else {
              var13 = var10 + (param4 - l.field_f);
              var10 = var10 - var13;
              var11 = var11 + var13;
              var12 = var12 + var13;
              break L3;
            }
          }
          L4: {
            if (0 >= var10) {
              break L4;
            } else {
              if ((var9 ^ -1) < -1) {
                var13 = var7;
                var15 = -(var10 >> -1458551678);
                var10 = -(3 & var10);
                var16 = -var9;
                L5: while (true) {
                  if (var16 >= 0) {
                    return;
                  } else {
                    var17 = var15;
                    L6: while (true) {
                      if (0 <= var17) {
                        var7 = var13;
                        var17 = var10;
                        L7: while (true) {
                          if (var17 >= 0) {
                            L8: {
                              var8++;
                              var5 = var5 + var11;
                              if (var8 < -15 + (param3 + param0.field_t)) {
                                break L8;
                              } else {
                                param2++;
                                break L8;
                              }
                            }
                            var6 = var6 + var12;
                            var16++;
                            continue L5;
                          } else {
                            var6++;
                            var14 = param0.field_z[var6];
                            if (var14 == 0) {
                              var5++;
                              var17++;
                              continue L7;
                            } else {
                              var5++;
                              l.field_i[var5] = var14;
                              var17++;
                              continue L7;
                            }
                          }
                        }
                      } else {
                        L9: {
                          L10: {
                            var6++;
                            var14 = param0.field_z[var6];
                            if (-1 == (var14 ^ -1)) {
                              break L10;
                            } else {
                              if (gd.field_a[var7][var8] <= param2) {
                                var7++;
                                gd.field_a[var7][var8] = param2;
                                var5++;
                                l.field_i[var5] = var14;
                                break L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                          var7++;
                          var5++;
                          break L9;
                        }
                        L11: {
                          L12: {
                            var6++;
                            var14 = param0.field_z[var6];
                            if (0 == var14) {
                              break L12;
                            } else {
                              if (param2 >= gd.field_a[var7][var8]) {
                                var7++;
                                gd.field_a[var7][var8] = param2;
                                var5++;
                                l.field_i[var5] = var14;
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          var7++;
                          var5++;
                          break L11;
                        }
                        L13: {
                          L14: {
                            var6++;
                            var14 = param0.field_z[var6];
                            if (0 == var14) {
                              break L14;
                            } else {
                              if (param2 < gd.field_a[var7][var8]) {
                                break L14;
                              } else {
                                var7++;
                                gd.field_a[var7][var8] = param2;
                                var5++;
                                l.field_i[var5] = var14;
                                break L13;
                              }
                            }
                          }
                          var5++;
                          var7++;
                          break L13;
                        }
                        var6++;
                        var14 = param0.field_z[var6];
                        if (0 != var14) {
                          if (param2 >= gd.field_a[var7][var8]) {
                            var7++;
                            gd.field_a[var7][var8] = param2;
                            var5++;
                            l.field_i[var5] = var14;
                            var17++;
                            continue L6;
                          } else {
                            var7++;
                            var5++;
                            var17++;
                            continue L6;
                          }
                        } else {
                          var7++;
                          var5++;
                          var17++;
                          continue L6;
                        }
                      }
                    }
                  }
                }
              } else {
                break L4;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
    }
}
