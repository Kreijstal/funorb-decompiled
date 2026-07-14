/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends mb {
    static byte[][] field_h;
    static int[] field_k;
    static String field_j;
    static String field_i;
    private java.nio.ByteBuffer field_l;

    public static void f(int param0) {
        field_k = null;
        if (param0 < 117) {
            field_j = null;
        }
        field_j = null;
        field_h = null;
        field_i = null;
    }

    final static byte[] a(int param0, CharSequence param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        L0: {
          if (param0 <= -34) {
            break L0;
          } else {
            var6 = null;
            hi.a((java.awt.Component) null, -120);
            break L0;
          }
        }
        var2 = param1.length();
        var3 = new byte[var2];
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
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
                    if (var5 <= 255) {
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
                  if (var5 == 8218) {
                    var3[var4] = (byte)-126;
                    break L2;
                  } else {
                    if (var5 == 402) {
                      var3[var4] = (byte)-125;
                      break L2;
                    } else {
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
                              if (var5 == 710) {
                                var3[var4] = (byte)-120;
                                break L2;
                              } else {
                                if (var5 == 8240) {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                } else {
                                  if (var5 != 352) {
                                    if (var5 == 8249) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (var5 != 338) {
                                        if (var5 == 381) {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        } else {
                                          if (var5 == 8216) {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          } else {
                                            if (var5 != 8217) {
                                              if (var5 != 8220) {
                                                if (var5 != 8221) {
                                                  if (8226 != var5) {
                                                    if (var5 == 8211) {
                                                      var3[var4] = (byte)-106;
                                                      break L2;
                                                    } else {
                                                      if (var5 != 8212) {
                                                        if (732 == var5) {
                                                          var3[var4] = (byte)-104;
                                                          break L2;
                                                        } else {
                                                          if (var5 == 8482) {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          } else {
                                                            if (var5 != 353) {
                                                              if (var5 == 8250) {
                                                                var3[var4] = (byte)-101;
                                                                break L2;
                                                              } else {
                                                                if (var5 != 339) {
                                                                  if (var5 != 382) {
                                                                    if (var5 == 376) {
                                                                      var3[var4] = (byte)-97;
                                                                      break L2;
                                                                    } else {
                                                                      var3[var4] = (byte)63;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    var3[var4] = (byte)-98;
                                                                    break L2;
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
                                                        }
                                                      } else {
                                                        var3[var4] = (byte)-105;
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    var3[var4] = (byte)-107;
                                                    break L2;
                                                  }
                                                } else {
                                                  var3[var4] = (byte)-108;
                                                  break L2;
                                                }
                                              } else {
                                                var3[var4] = (byte)-109;
                                                break L2;
                                              }
                                            } else {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            }
                                          }
                                        }
                                      } else {
                                        var3[var4] = (byte)-116;
                                        break L2;
                                      }
                                    }
                                  } else {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  }
                                }
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
                    }
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

    final static void g(int param0) {
        L0: {
          f.field_c = uc.a(true, new double[4][][]);
          f.field_a = uc.a(true, new double[4][][]);
          if (param0 < -127) {
            break L0;
          } else {
            field_j = null;
            break L0;
          }
        }
    }

    final static boolean e(int param0) {
        if (param0 != -11071) {
            field_k = null;
        }
        return nk.field_m.a(true);
    }

    final static void a(java.awt.Component param0, int param1) {
        if (param1 != -14762) {
            return;
        }
        param0.addMouseListener((java.awt.event.MouseListener) (Object) wp.field_g);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) wp.field_g);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) wp.field_g);
    }

    hi() {
    }

    final void a(byte[] param0, byte param1) {
        if (param1 != 2) {
            boolean discarded$0 = hi.e(-82);
        }
        ((hi) this).field_l = java.nio.ByteBuffer.allocateDirect(param0.length);
        java.nio.Buffer discarded$1 = ((hi) this).field_l.position(0);
        java.nio.ByteBuffer discarded$2 = ((hi) this).field_l.put(param0);
    }

    final static void a(int param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, param1);
        var2.a(param0, false);
        var2.a(0, false);
    }

    final static wc a(boolean param0) {
        if (!param0) {
            return null;
        }
        if (aa.field_c == wd.field_Lb) {
            throw new IllegalStateException();
        }
        if (!(wd.field_Lb != td.field_f)) {
            wd.field_Lb = aa.field_c;
            return sf.field_B;
        }
        return null;
    }

    final static kl a(int param0, int param1, int param2, di param3, di param4) {
        if (!vj.a(param1, param4, param2, (byte) 121)) {
            return null;
        }
        int var5 = 41 / ((param0 - -73) / 41);
        return ta.a(16908, param3.a(105, param2, param1));
    }

    final byte[] a(int param0) {
        byte[] var3 = new byte[((hi) this).field_l.capacity()];
        byte[] var2 = var3;
        java.nio.Buffer discarded$5 = ((hi) this).field_l.position(0);
        if (param0 <= 0) {
            ((hi) this).field_l = null;
        }
        java.nio.ByteBuffer discarded$6 = ((hi) this).field_l.get(var3);
        return var3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "<col=9999ff>Blues</col>";
        field_i = "Close";
    }
}
