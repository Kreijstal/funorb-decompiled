/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hf {
    static String field_a;
    static double[] field_b;

    final static String a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        StringBuilder var11 = null;
        var9 = Torquing.field_u;
        if (param0 != null) {
          var2 = 0;
          var3 = param0.length();
          L0: while (true) {
            if (var3 > var2) {
              if (ra.a(param0.charAt(var2), 252)) {
                var2++;
                continue L0;
              } else {
                L1: while (true) {
                  L2: {
                    if (var3 <= var2) {
                      break L2;
                    } else {
                      if (!ra.a(param0.charAt(var3 - 1), 252)) {
                        break L2;
                      } else {
                        var3--;
                        continue L1;
                      }
                    }
                  }
                  var4 = var3 - var2;
                  if (-2 >= (var4 ^ -1)) {
                    if (12 >= var4) {
                      var11 = new StringBuilder(var4);
                      if (param1 > 97) {
                        var6 = var2;
                        L3: while (true) {
                          if (var3 <= var6) {
                            if (0 == var11.length()) {
                              return null;
                            } else {
                              return var11.toString();
                            }
                          } else {
                            var7 = param0.charAt(var6);
                            if (!ik.a((char) var7, (byte) -46)) {
                              var6++;
                              var6++;
                              continue L3;
                            } else {
                              var8 = ga.a((byte) 63, (char) var7);
                              if (var8 != 0) {
                                StringBuilder discarded$4 = var11.append(var8);
                                var6++;
                                continue L3;
                              } else {
                                var6++;
                                continue L3;
                              }
                            }
                          }
                        }
                      } else {
                        field_b = null;
                        var6 = var2;
                        L4: while (true) {
                          if (var3 <= var6) {
                            if (0 == var11.length()) {
                              return null;
                            } else {
                              return var11.toString();
                            }
                          } else {
                            var7 = param0.charAt(var6);
                            if (!ik.a((char) var7, (byte) -46)) {
                              var6++;
                              var6++;
                              continue L4;
                            } else {
                              var8 = ga.a((byte) 63, (char) var7);
                              if (var8 != 0) {
                                StringBuilder discarded$5 = var11.append(var8);
                                var6++;
                                continue L4;
                              } else {
                                var6++;
                                continue L4;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      return null;
                    }
                  } else {
                    return null;
                  }
                }
              }
            } else {
              L5: while (true) {
                L6: {
                  if (var3 <= var2) {
                    break L6;
                  } else {
                    if (!ra.a(param0.charAt(var3 - 1), 252)) {
                      break L6;
                    } else {
                      var3--;
                      continue L5;
                    }
                  }
                }
                var4 = var3 - var2;
                if (-2 >= (var4 ^ -1)) {
                  if (12 >= var4) {
                    var10 = new StringBuilder(var4);
                    if (param1 > 97) {
                      L7: {
                        var6 = var2;
                        if (var3 <= var6) {
                          break L7;
                        } else {
                          L8: {
                            var7 = param0.charAt(var6);
                            if (!ik.a((char) var7, (byte) -46)) {
                              var6++;
                              break L8;
                            } else {
                              L9: {
                                var8 = ga.a((byte) 63, (char) var7);
                                if (var8 == 0) {
                                  var6++;
                                  break L9;
                                } else {
                                  StringBuilder discarded$6 = var10.append(var8);
                                  break L9;
                                }
                              }
                              var6++;
                              break L8;
                            }
                          }
                          var6++;
                          var6++;
                          var6++;
                          var6++;
                          break L7;
                        }
                      }
                      if (0 == var10.length()) {
                        return null;
                      } else {
                        return var10.toString();
                      }
                    } else {
                      L10: {
                        field_b = null;
                        var6 = var2;
                        if (var3 <= var6) {
                          break L10;
                        } else {
                          L11: {
                            var7 = param0.charAt(var6);
                            if (!ik.a((char) var7, (byte) -46)) {
                              var6++;
                              break L11;
                            } else {
                              L12: {
                                var8 = ga.a((byte) 63, (char) var7);
                                if (var8 == 0) {
                                  var6++;
                                  break L12;
                                } else {
                                  StringBuilder discarded$7 = var10.append(var8);
                                  break L12;
                                }
                              }
                              var6++;
                              break L11;
                            }
                          }
                          var6++;
                          var6++;
                          var6++;
                          var6++;
                          break L10;
                        }
                      }
                      if (0 == var10.length()) {
                        return null;
                      } else {
                        return var10.toString();
                      }
                    }
                  } else {
                    return null;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 12) {
          var2 = null;
          String discarded$2 = hf.a((CharSequence) null, 79);
          field_b = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new double[13];
    }
}
