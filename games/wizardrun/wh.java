/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wh implements Iterator {
    static int[][] field_m;
    static String field_c;
    private gj field_i;
    static String[] field_l;
    static String field_b;
    static String[] field_e;
    static o field_d;
    private wl field_h;
    private int field_f;
    static int field_g;
    static rc field_j;
    static c field_k;
    private wl field_a;

    public static void a(int param0) {
        field_k = null;
        field_c = null;
        field_b = null;
        field_l = null;
        field_d = null;
        field_e = null;
        if (param0 != 339) {
            return;
        }
        field_m = null;
        field_j = null;
    }

    private final void a(byte param0) {
        ((wh) this).field_f = 1;
        if (param0 > -41) {
            wh.b((byte) -23);
        }
        ((wh) this).field_h = null;
        ((wh) this).field_a = ((wh) this).field_i.field_c[0].field_b;
    }

    public final void remove() {
        if (!(((wh) this).field_h != null)) {
            throw new IllegalStateException();
        }
        ((wh) this).field_h.a(false);
        ((wh) this).field_h = null;
    }

    final static byte[] a(byte param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = wizardrun.field_H;
        var2 = param1.length();
        var3 = new byte[var2];
        var4 = 0;
        L0: while (true) {
          if (var4 >= var2) {
            L1: {
              if (param0 == -111) {
                break L1;
              } else {
                wh.a(-75);
                break L1;
              }
            }
            return var3;
          } else {
            L2: {
              L3: {
                L4: {
                  var5 = param1.charAt(var4);
                  if (0 >= var5) {
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
                if (8364 == var5) {
                  var3[var4] = (byte)-128;
                  break L2;
                } else {
                  if (var5 == 8218) {
                    var3[var4] = (byte)-126;
                    break L2;
                  } else {
                    if (402 != var5) {
                      if (var5 != 8222) {
                        if (var5 != 8230) {
                          if (var5 == 8224) {
                            var3[var4] = (byte)-122;
                            break L2;
                          } else {
                            if (var5 == 8225) {
                              var3[var4] = (byte)-121;
                              break L2;
                            } else {
                              if (var5 != 710) {
                                if (var5 == 8240) {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                } else {
                                  if (var5 != 352) {
                                    if (var5 == 8249) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (var5 == 338) {
                                        var3[var4] = (byte)-116;
                                        break L2;
                                      } else {
                                        if (var5 == 381) {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        } else {
                                          if (8216 == var5) {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          } else {
                                            if (var5 != 8217) {
                                              if (var5 == 8220) {
                                                var3[var4] = (byte)-109;
                                                break L2;
                                              } else {
                                                if (var5 == 8221) {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                } else {
                                                  if (var5 == 8226) {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  } else {
                                                    if (8211 == var5) {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    } else {
                                                      if (8212 != var5) {
                                                        if (var5 != 732) {
                                                          if (var5 == 8482) {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          } else {
                                                            if (353 != var5) {
                                                              if (8250 == var5) {
                                                                var3[var4] = (byte)-101;
                                                                break L2;
                                                              } else {
                                                                if (339 != var5) {
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
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-102;
                                                              break L2;
                                                            }
                                                          }
                                                        } else {
                                                          var3[var4] = (byte)-104;
                                                          break L2;
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  }
                                }
                              } else {
                                var3[var4] = (byte)-120;
                                break L2;
                              }
                            }
                          }
                        } else {
                          var3[var4] = (byte)-123;
                          break L2;
                        }
                      } else {
                        var3[var4] = (byte)-124;
                        break L2;
                      }
                    } else {
                      var3[var4] = (byte)-125;
                      break L2;
                    }
                  }
                }
              }
              var3[var4] = (byte)var5;
              break L2;
            }
            var4++;
            continue L0;
          }
        }
    }

    final static void b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 < -28) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_d = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (null != tc.field_m) {
                        statePc = 4;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var1 = (Object) (Object) tc.field_m;
                    // monitorenter tc.field_m
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        tc.field_m = null;
                        // monitorexit var1
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var2;
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final Object next() {
        wl var1 = null;
        int var2 = wizardrun.field_H;
        if (!(((wh) this).field_i.field_c[-1 + ((wh) this).field_f] == ((wh) this).field_a)) {
            var1 = ((wh) this).field_a;
            ((wh) this).field_h = var1;
            ((wh) this).field_a = var1.field_b;
            return (Object) (Object) var1;
        }
        do {
            if (((wh) this).field_i.field_d <= ((wh) this).field_f) {
                return null;
            }
            ((wh) this).field_f = ((wh) this).field_f + 1;
            var1 = ((wh) this).field_i.field_c[((wh) this).field_f].field_b;
        } while (var1 == ((wh) this).field_i.field_c[((wh) this).field_f - 1]);
        ((wh) this).field_a = var1.field_b;
        ((wh) this).field_h = var1;
        return (Object) (Object) var1;
    }

    public final boolean hasNext() {
        int var2 = 0;
        var2 = wizardrun.field_H;
        if (((wh) this).field_a == ((wh) this).field_i.field_c[-1 + ((wh) this).field_f]) {
          L0: while (true) {
            if (((wh) this).field_i.field_d <= ((wh) this).field_f) {
              return false;
            } else {
              ((wh) this).field_f = ((wh) this).field_f + 1;
              if (((wh) this).field_i.field_c[((wh) this).field_f].field_b != ((wh) this).field_i.field_c[((wh) this).field_f - 1]) {
                ((wh) this).field_a = ((wh) this).field_i.field_c[((wh) this).field_f - 1].field_b;
                return true;
              } else {
                ((wh) this).field_a = ((wh) this).field_i.field_c[((wh) this).field_f - 1];
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    wh(gj param0) {
        ((wh) this).field_h = null;
        ((wh) this).field_i = param0;
        this.a((byte) -67);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new String[]{"All scores", "My scores", "Best each"};
        field_c = "This password contains your email address, and would be easy to guess";
        field_e = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_b = "Play free version";
    }
}
