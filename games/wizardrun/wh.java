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
        field_m = (int[][]) null;
        field_j = null;
    }

    private final void a(byte param0) {
        this.field_f = 1;
        if (param0 > -41) {
            wh.b((byte) -23);
        }
        this.field_h = null;
        this.field_a = this.field_i.field_c[0].field_b;
    }

    public final void remove() {
        if (!(this.field_h != null)) {
            throw new IllegalStateException();
        }
        this.field_h.a(false);
        this.field_h = null;
    }

    final static byte[] a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        byte[] stackIn_69_0 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_68_0 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            var2_int = param1.length();
            var3 = new byte[var2_int];
            var4 = 0;
            L1: while (true) {
              if (var4 >= var2_int) {
                L2: {
                  if (param0 == -111) {
                    break L2;
                  } else {
                    wh.a(-75);
                    break L2;
                  }
                }
                stackOut_68_0 = (byte[]) (var3);
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var5 = param1.charAt(var4);
                      if (0 >= var5) {
                        break L5;
                      } else {
                        if (var5 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var5 < 160) {
                        break L6;
                      } else {
                        if (255 >= var5) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (8364 == var5) {
                      var3[var4] = (byte)-128;
                      break L3;
                    } else {
                      if (var5 == 8218) {
                        var3[var4] = (byte)-126;
                        break L3;
                      } else {
                        if (402 != var5) {
                          if (var5 != 8222) {
                            if (var5 != 8230) {
                              if (var5 == 8224) {
                                var3[var4] = (byte)-122;
                                break L3;
                              } else {
                                if (var5 == 8225) {
                                  var3[var4] = (byte)-121;
                                  break L3;
                                } else {
                                  if (var5 != 710) {
                                    if (var5 == 8240) {
                                      var3[var4] = (byte)-119;
                                      break L3;
                                    } else {
                                      if (var5 != 352) {
                                        if (var5 == 8249) {
                                          var3[var4] = (byte)-117;
                                          break L3;
                                        } else {
                                          if (var5 == 338) {
                                            var3[var4] = (byte)-116;
                                            break L3;
                                          } else {
                                            if (var5 == 381) {
                                              var3[var4] = (byte)-114;
                                              break L3;
                                            } else {
                                              if (8216 == var5) {
                                                var3[var4] = (byte)-111;
                                                break L3;
                                              } else {
                                                if (var5 != 8217) {
                                                  if (var5 == 8220) {
                                                    var3[var4] = (byte)-109;
                                                    break L3;
                                                  } else {
                                                    if (var5 == 8221) {
                                                      var3[var4] = (byte)-108;
                                                      break L3;
                                                    } else {
                                                      if (var5 == 8226) {
                                                        var3[var4] = (byte)-107;
                                                        break L3;
                                                      } else {
                                                        if (8211 == var5) {
                                                          var3[var4] = (byte)-106;
                                                          break L3;
                                                        } else {
                                                          if (8212 != var5) {
                                                            if (var5 != 732) {
                                                              if (var5 == 8482) {
                                                                var3[var4] = (byte)-103;
                                                                break L3;
                                                              } else {
                                                                if (353 != var5) {
                                                                  if (8250 == var5) {
                                                                    var3[var4] = (byte)-101;
                                                                    break L3;
                                                                  } else {
                                                                    if (339 != var5) {
                                                                      if (382 == var5) {
                                                                        var3[var4] = (byte)-98;
                                                                        break L3;
                                                                      } else {
                                                                        if (var5 == 376) {
                                                                          var3[var4] = (byte)-97;
                                                                          break L3;
                                                                        } else {
                                                                          var3[var4] = (byte)63;
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    } else {
                                                                      var3[var4] = (byte)-100;
                                                                      break L3;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-102;
                                                                  break L3;
                                                                }
                                                              }
                                                            } else {
                                                              var3[var4] = (byte)-104;
                                                              break L3;
                                                            }
                                                          } else {
                                                            var3[var4] = (byte)-105;
                                                            break L3;
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-110;
                                                  break L3;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte)-118;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-120;
                                    break L3;
                                  }
                                }
                              }
                            } else {
                              var3[var4] = (byte)-123;
                              break L3;
                            }
                          } else {
                            var3[var4] = (byte)-124;
                            break L3;
                          }
                        } else {
                          var3[var4] = (byte)-125;
                          break L3;
                        }
                      }
                    }
                  }
                  var3[var4] = (byte)var5;
                  break L3;
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) (var2);
            stackOut_70_1 = new StringBuilder().append("wh.D(").append(param0).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) ((Object) stackIn_71_0);
              stackOut_71_1 = (StringBuilder) ((Object) stackIn_71_1);
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
        return stackIn_69_0;
    }

    final static void b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param0 < -28) {
            break L0;
          } else {
            field_d = (o) null;
            break L0;
          }
        }
        L1: {
          if (null != tc.field_m) {
            var1 = tc.field_m;
            synchronized (var1) {
              L2: {
                tc.field_m = null;
                break L2;
              }
            }
            break L1;
          } else {
            break L1;
          }
        }
    }

    public final Object next() {
        int fieldTemp$0 = 0;
        wl var1 = null;
        int var2 = wizardrun.field_H;
        if (!(this.field_i.field_c[-1 + this.field_f] == this.field_a)) {
            var1 = this.field_a;
            this.field_h = var1;
            this.field_a = var1.field_b;
            return var1;
        }
        do {
            if (this.field_i.field_d <= this.field_f) {
                return null;
            }
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            var1 = this.field_i.field_c[fieldTemp$0].field_b;
        } while (var1 == this.field_i.field_c[this.field_f - 1]);
        this.field_a = var1.field_b;
        this.field_h = var1;
        return var1;
    }

    public final boolean hasNext() {
        int fieldTemp$8 = 0;
        int var2 = 0;
        var2 = wizardrun.field_H;
        if (this.field_a == this.field_i.field_c[-1 + this.field_f]) {
          L0: while (true) {
            if (this.field_i.field_d <= this.field_f) {
              return false;
            } else {
              fieldTemp$8 = this.field_f;
              this.field_f = this.field_f + 1;
              if (this.field_i.field_c[fieldTemp$8].field_b != this.field_i.field_c[this.field_f - 1]) {
                this.field_a = this.field_i.field_c[this.field_f - 1].field_b;
                return true;
              } else {
                this.field_a = this.field_i.field_c[this.field_f - 1];
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    wh(gj param0) {
        this.field_h = null;
        try {
            this.field_i = param0;
            this.a((byte) -67);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "wh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_l = new String[]{"All scores", "My scores", "Best each"};
        field_c = "This password contains your email address, and would be easy to guess";
        field_e = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_b = "Play free version";
    }
}
