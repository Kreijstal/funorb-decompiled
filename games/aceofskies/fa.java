/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fa {
    static int field_a;
    static rb field_c;
    static eh field_b;

    final static bo a(ha param0, boolean param1) {
        mq var2 = null;
        bo var3 = null;
        if (ns.field_a != param0) {
          L0: {
            if (param1) {
              break L0;
            } else {
              java.awt.Canvas discarded$2 = fa.a(72);
              break L0;
            }
          }
          L1: {
            L2: {
              var2 = (mq) ca.field_i.a((byte) 106, (long)((ha) param0).field_c);
              if (var2 == null) {
                break L2;
              } else {
                if (((mq) var2).field_f == param0) {
                  var3 = ((mq) var2).field_j;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (var2 == null) {
                break L3;
              } else {
                var2.c(-124);
                break L3;
              }
            }
            var3 = new bo(param0);
            ca.field_i.a(123, (long)((ha) param0).field_c, (wf) (Object) new mq(param0, var3));
            break L1;
          }
          un.field_f = (bo) var3;
          ns.field_a = param0;
          return var3;
        } else {
          return un.field_f;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_b = (eh) null;
        }
        field_b = null;
        field_c = null;
    }

    final static byte[] a(CharSequence param0, int param1) {
        int var2 = 0;
        byte[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = AceOfSkies.field_G ? 1 : 0;
          var2 = ((CharSequence) param0).length();
          if (param1 == 8482) {
            break L0;
          } else {
            field_a = -8;
            break L0;
          }
        }
        var3 = new byte[var2];
        var4 = 0;
        L1: while (true) {
          if (var4 >= var2) {
            return var3;
          } else {
            L2: {
              L3: {
                L4: {
                  var5 = ((CharSequence) param0).charAt(var4);
                  if (var5 <= 0) {
                    break L4;
                  } else {
                    if (128 > var5) {
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
                if (var5 != 8364) {
                  if (var5 != 8218) {
                    if (var5 != 402) {
                      if (var5 == 8222) {
                        var3[var4] = (byte)-124;
                        break L2;
                      } else {
                        if (var5 == 8230) {
                          var3[var4] = (byte)-123;
                          break L2;
                        } else {
                          if (var5 != 8224) {
                            if (var5 != 8225) {
                              if (710 == var5) {
                                var3[var4] = (byte)-120;
                                break L2;
                              } else {
                                if (var5 != 8240) {
                                  if (var5 == 352) {
                                    var3[var4] = (byte)-118;
                                    break L2;
                                  } else {
                                    if (8249 == var5) {
                                      var3[var4] = (byte)-117;
                                      break L2;
                                    } else {
                                      if (var5 == 338) {
                                        var3[var4] = (byte)-116;
                                        break L2;
                                      } else {
                                        if (381 != var5) {
                                          if (var5 == 8216) {
                                            var3[var4] = (byte)-111;
                                            break L2;
                                          } else {
                                            if (var5 == 8217) {
                                              var3[var4] = (byte)-110;
                                              break L2;
                                            } else {
                                              if (8220 == var5) {
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
                                                      if (var5 != 8212) {
                                                        if (var5 != 732) {
                                                          if (var5 == 8482) {
                                                            var3[var4] = (byte)-103;
                                                            break L2;
                                                          } else {
                                                            if (var5 == 353) {
                                                              var3[var4] = (byte)-102;
                                                              break L2;
                                                            } else {
                                                              if (8250 == var5) {
                                                                var3[var4] = (byte)-101;
                                                                break L2;
                                                              } else {
                                                                if (339 != var5) {
                                                                  if (var5 == 382) {
                                                                    var3[var4] = (byte)-98;
                                                                    break L2;
                                                                  } else {
                                                                    if (376 != var5) {
                                                                      var3[var4] = (byte)63;
                                                                      break L2;
                                                                    } else {
                                                                      var3[var4] = (byte)-97;
                                                                      break L2;
                                                                    }
                                                                  }
                                                                } else {
                                                                  var3[var4] = (byte)-100;
                                                                  break L2;
                                                                }
                                                              }
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
                                            }
                                          }
                                        } else {
                                          var3[var4] = (byte)-114;
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  var3[var4] = (byte)-119;
                                  break L2;
                                }
                              }
                            } else {
                              var3[var4] = (byte)-121;
                              break L2;
                            }
                          } else {
                            var3[var4] = (byte)-122;
                            break L2;
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
                } else {
                  var3[var4] = (byte)-128;
                  break L2;
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

    final static java.awt.Canvas a(int param0) {
        if (param0 != -8213) {
            fa.a(false);
        }
        return (java.awt.Canvas) (jf.field_a == null ? ci.field_f : jf.field_a);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_c = new rb(256);
    }
}
