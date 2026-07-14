/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vu {
    ha field_c;
    static int field_f;
    sn field_d;
    private mj field_e;
    long field_a;
    java.awt.Canvas field_b;
    static of field_g;

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        StringBuilder var9 = null;
        StringBuilder var10 = null;
        if (param1 != null) {
          var2 = 0;
          var3 = ((CharSequence) param1).length();
          L0: while (true) {
            if (var3 > var2) {
              if (za.a((byte) 117, ((CharSequence) param1).charAt(var2))) {
                var2++;
                continue L0;
              } else {
                L1: while (true) {
                  L2: {
                    if (var2 >= var3) {
                      break L2;
                    } else {
                      if (!za.a((byte) 117, ((CharSequence) param1).charAt(var3 + -1))) {
                        break L2;
                      } else {
                        var3--;
                        continue L1;
                      }
                    }
                  }
                  var4 = -var2 + var3;
                  if ((var4 ^ -1) <= -2) {
                    if ((var4 ^ -1) >= -13) {
                      if (param0 >= 122) {
                        L3: {
                          var10 = new StringBuilder(var4);
                          var6 = var2;
                          if (var3 <= var6) {
                            break L3;
                          } else {
                            L4: {
                              L5: {
                                var7 = ((CharSequence) param1).charAt(var6);
                                if (!jk.a((char) var7, -26024)) {
                                  var6++;
                                  break L5;
                                } else {
                                  var8 = rr.a((char) var7, (byte) -70);
                                  if (var8 == 0) {
                                    var6++;
                                    break L4;
                                  } else {
                                    StringBuilder discarded$2 = var10.append(var8);
                                    var6++;
                                    break L5;
                                  }
                                }
                              }
                              var6++;
                              break L4;
                            }
                            var6++;
                            var6++;
                            var6++;
                            var6++;
                            break L3;
                          }
                        }
                        if (var10.length() == 0) {
                          return null;
                        } else {
                          return var10.toString();
                        }
                      } else {
                        return (String) null;
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
              L6: while (true) {
                L7: {
                  if (var2 >= var3) {
                    break L7;
                  } else {
                    if (!za.a((byte) 117, ((CharSequence) param1).charAt(var3 + -1))) {
                      break L7;
                    } else {
                      var3--;
                      continue L6;
                    }
                  }
                }
                var4 = -var2 + var3;
                if ((var4 ^ -1) <= -2) {
                  if ((var4 ^ -1) >= -13) {
                    if (param0 >= 122) {
                      L8: {
                        var9 = new StringBuilder(var4);
                        var6 = var2;
                        if (var3 <= var6) {
                          break L8;
                        } else {
                          L9: {
                            L10: {
                              var7 = ((CharSequence) param1).charAt(var6);
                              if (!jk.a((char) var7, -26024)) {
                                var6++;
                                break L10;
                              } else {
                                var8 = rr.a((char) var7, (byte) -70);
                                if (var8 == 0) {
                                  var6++;
                                  break L9;
                                } else {
                                  StringBuilder discarded$3 = var9.append(var8);
                                  var6++;
                                  break L10;
                                }
                              }
                            }
                            var6++;
                            break L9;
                          }
                          var6++;
                          var6++;
                          var6++;
                          var6++;
                          break L8;
                        }
                      }
                      if (var9.length() == 0) {
                        return null;
                      } else {
                        return var9.toString();
                      }
                    } else {
                      return (String) null;
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

    final mj a(byte param0) {
        if (param0 != 38) {
          return (mj) null;
        } else {
          L0: {
            if (((vu) this).field_e == null) {
              ((vu) this).field_e = new mj();
              break L0;
            } else {
              break L0;
            }
          }
          ((vu) this).field_e.a((vu) this, false);
          return ((vu) this).field_e;
        }
    }

    final static int a(CharSequence param0, byte param1, char param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        var4 = -83 / ((-59 - param1) / 54);
        var3 = 0;
        var5 = ((CharSequence) param0).length();
        var6 = 0;
        L0: while (true) {
          if (var5 <= var6) {
            return var3;
          } else {
            if (((CharSequence) param0).charAt(var6) != param2) {
              var6++;
              var6++;
              continue L0;
            } else {
              var3++;
              var6++;
              continue L0;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
            return;
        }
        field_g = (of) null;
    }

    vu(ha param0, sn param1, java.awt.Canvas param2) {
        ((vu) this).field_b = param2;
        ((vu) this).field_d = param1;
        ((vu) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_g = new of();
    }
}
