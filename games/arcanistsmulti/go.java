/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class go {
    static ll[] field_j;
    static String field_f;
    static String field_h;
    String field_e;
    static dj field_k;
    int field_b;
    static kc field_d;
    static am field_c;
    static int field_i;
    static int field_g;
    static String field_a;

    abstract java.net.Socket b(byte param0) throws IOException;

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_f = null;
        field_a = null;
        field_d = null;
        field_h = null;
        field_k = null;
        field_c = null;
        field_j = null;
    }

    final java.net.Socket a(byte param0) throws IOException {
        int var2 = 62 / ((37 - param0) / 52);
        return new java.net.Socket(((go) this).field_e, ((go) this).field_b);
    }

    final static byte[] a(CharSequence param0, byte param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = ArcanistsMulti.field_G ? 1 : 0;
          if (param1 == -82) {
            break L0;
          } else {
            go.a(true);
            break L0;
          }
        }
        var2 = param0.length();
        var3 = new byte[var2];
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            return var3;
          } else {
            L2: {
              L3: {
                L4: {
                  var5 = param0.charAt(var4);
                  if (var5 <= 0) {
                    break L4;
                  } else {
                    if (var5 < 128) {
                      break L3;
                    } else {
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var5 < 160) {
                    break L5;
                  } else {
                    if (255 >= var5) {
                      break L3;
                    } else {
                      break L5;
                    }
                  }
                }
                if (var5 == 8364) {
                  var3[var4] = (byte)-128;
                  break L2;
                } else {
                  if (var5 != 8218) {
                    if (402 != var5) {
                      if (var5 == 8222) {
                        var3[var4] = (byte)-124;
                        break L2;
                      } else {
                        if (var5 == 8230) {
                          var3[var4] = (byte)-123;
                          break L2;
                        } else {
                          if (var5 == 8224) {
                            var3[var4] = (byte)-122;
                            break L2;
                          } else {
                            if (8225 != var5) {
                              if (var5 == 710) {
                                var3[var4] = (byte)-120;
                                break L2;
                              } else {
                                if (8240 == var5) {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                } else {
                                  if (var5 == 352) {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  } else {
                                    if (8249 != var5) {
                                      if (var5 != 338) {
                                        if (var5 == 381) {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        } else {
                                          if (var5 != 8216) {
                                            if (var5 != 8217) {
                                              if (8220 != var5) {
                                                if (var5 == 8221) {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                } else {
                                                  if (var5 == 8226) {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  } else {
                                                    if (var5 == 8211) {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    } else {
                                                      if (8212 == var5) {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      } else {
                                                        if (var5 != 732) {
                                                          if (var5 != 8482) {
                                                            if (var5 == 353) {
                                                              var3[var4] = (byte)-102;
                                                              break L2;
                                                            } else {
                                                              if (var5 != 8250) {
                                                                if (var5 != 339) {
                                                                  if (382 == var5) {
                                                                    var3[var4] = (byte)-98;
                                                                    break L2;
                                                                  } else {
                                                                    if (var5 == 376) {
                                                                      var3[var4] = (byte)-97;
                                                                      break L2;
                                                                    } else {
                                                                      var3[var4] = (byte)63;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-100;
                                                                  break L2;
                                                                }
                                                              } else {
                                                                var3[var4] = (byte)-101;
                                                                break L2;
                                                              }
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-104;
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var3[var4] = (byte)-109;
                                                break L2;
                                              }
                                            } else {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            }
                                          } else {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte)-116;
                                        break L2;
                                      }
                                    } else {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    }
                                  }
                                }
                              }
                            } else {
                              var3[var4] = (byte)-121;
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      var3[var4] = (byte)-125;
                      break L2;
                    }
                  } else {
                    var3[var4] = (byte)-126;
                    break L2;
                  }
                }
              }
              var3[var4] = (byte)var5;
              break L2;
            }
            var4++;
            continue L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "<shad><col=<%0>>OVERLIGHT</col></shad>";
        field_h = "Reading Arcane Book";
        field_c = new am();
        field_g = 0;
        field_a = "Only show game chat from my friends";
    }
}
